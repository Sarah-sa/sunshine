package com.sunshine.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import com.sunshine.model.Module;

/**
 * 目录树的工具类<br>
 * 提供一下方法：<br>
 * ① 构建目录树<br>
 * ② 合并目录树<br>
 * ③ 合并森林
 * 
 * @author 云和数据-王辉
 *
 */
public final class ModuleTreeUtil {

	/**
	 * 构建目录森林<br>
	 * 所有的孤儿节点不会被包含在森林中
	 * 
	 * @param modules
	 *            目录节点的集合
	 * @return 根据目录集合构建的目录森林
	 */
	public static Set<ModuleTree> buildModuleForest(Set<Module> modules) {

		// 1. 实例化森林集合
		Set<ModuleTree> forest = new HashSet<>();

		// 2. 实例化缓存map集合
		Map<String, ModuleTree> idTreeMap = new HashMap<>();
		ModuleTree tree;
		String treeId;

		// 3. 遍历目录集合，逐个构建目录树
		for (Module module : modules) {

			// 3.1. 获取当前目录的主键
			treeId = module.getId();

			// 3.2. 判断缓存map里是否已经存在该主键，若存在，说明该目录已经添加过，执行下一次循环
			if (idTreeMap.get(treeId) != null)
				continue;

			// 3.3. 构建一颗目录树
			tree = new ModuleTree(module);

			// 3.4. 将目录树加入到缓存map里，以备索引
			idTreeMap.put(treeId, tree);

			// 3.5. 判断是否为根节点，若是，添加到森林里
			if (treeId.equals(module.getPid()))
				forest.add(tree);
		}

		String parentId;

		// 4. 遍历缓存map集合，构建父子关系
		for (Entry<String, ModuleTree> entry : idTreeMap.entrySet()) {

			// 4.1 获取缓存map中的目录树
			tree = entry.getValue();

			// 4.2 获取该目录树的父节点id
			parentId = tree.getTreeNode().getPid();

			// 4.3 若当前树不是根节点树
			if (parentId == null || !parentId.equals(entry.getKey())) {

				// 4.3.1 判断当前树的父节点树是否村子，若存在构建父子关系
				if (idTreeMap.get(parentId) != null)
					idTreeMap.get(parentId).addChildTree(tree);
			}
		}

		return forest;
	}

	/**
	 * 合并两个森林为一个森林
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static Set<ModuleTree> mergeTree(Set<ModuleTree> f1, Set<ModuleTree> f2) {
		
		//1. 创建一个新的森林
		Set<ModuleTree> newForest = new TreeSet<>();
		ModuleTree newTree;
		
		//2. 遍历第一个森林
		for(ModuleTree t1 : f1) {
			newTree = null;
			//2.1 遍历第二个森林，查找和第一个森林多种当前查看的树同根的另一棵树
			for(ModuleTree t2 : f2) {
				
				//2.1.2 若找到，合并为一颗树，并将第二个森林中的子树删除且结束内层循环
				if (t1.getTreeNode().getId().equals(t2.getTreeNode().getId())) {
					newTree = mergeToOne(t1, t2);
					f2.remove(t2);
					break;
				}
			}
			//2.2 若没找到同根的树，将第一个森林中当前查看的书加入到新的森林
			if(newTree == null)
				newTree = t1;
			newForest.add(newTree);
		}
		
		//3. 将第二个森林中剩余的树全部加到新的森林中
		newForest.addAll(f2);

		//4. 返回重新构建的森林
		return newForest;
	}

	/**
	 * 将两颗同根的树合并为一颗树
	 * @param t1
	 * @param t2
	 * @return
	 */
	private static ModuleTree mergeToOne(ModuleTree t1, ModuleTree t2) {
		
		//1. 创建一颗新的树
		ModuleTree newTree = new ModuleTree(t1.getTreeNode());

		//2. 遍历第一棵树的所有子树，在第二颗树的子树中找同根的树
		for (ModuleTree childTree : t1.getChildNodes()) {
			ModuleTree childTree2 = t2.getChildByName(childTree.getTreeNode().getId());
			//2.1 若没找到同根的树，直接将第一棵树的子树加入到新的树中
			if (childTree2 == null)
				newTree.addChildTree(childTree);
			//2.2 若找到，合并另可同根的子树，将产生的新子树加入到新树中，并删除第二颗树中对应的子树
			else {
				newTree.addChildTree(mergeToOne(childTree, childTree2));
				t2.removeChildTree(childTree2);
			}
		}
		
		//3. 将第二课树中剩余的子树全部添加到新的树中
		newTree.addAll(t2.getChildNodes());
		
		return newTree;
	}

	/**
	 * 私有化构造方法，避免被实例化
	 */
	private ModuleTreeUtil() {
	}
}
