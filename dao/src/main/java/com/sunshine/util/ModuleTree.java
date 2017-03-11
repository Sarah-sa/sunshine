package com.sunshine.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.sunshine.exception.NoRootModuleException;
import com.sunshine.model.Module;

/**
 * 该目录代表一颗目录树
 * 
 * @author 云和数据-王辉
 *
 */
public class ModuleTree implements Comparable<ModuleTree> {

	/**
	 * 当前目录树的子数集合
	 */
	private Set<ModuleTree> childNodes;

	/**
	 * 该map用于根据id索引子树
	 */
	private Map<String, ModuleTree> namedChildrenMap;

	/**
	 * 当前目录树的根节点
	 */
	private Module treeNode;

	/**
	 * 目录树构造器，接受一个根节点作为参数<br>
	 * 若根节点为空，抛出 NoRootModuleException 异常
	 * 
	 * @param treeNode
	 *            目录树的根节点
	 * @throws NoRootModuleException
	 *             根节点为空的异常
	 */
	public ModuleTree(Module treeNode) {
		if (treeNode == null)
			throw new NoRootModuleException("Root Node Lost!");
		this.treeNode = treeNode;
		childNodes = new TreeSet<>();
		namedChildrenMap = new HashMap<>();
	}

	public ModuleTree(Set<ModuleTree> childNodes, Module treeNode) {
		this(treeNode);
		this.childNodes = childNodes;
	}

	/**
	 * 向子树集合中添加一颗目录树,并添加子树的名字索引
	 * 
	 * @param child
	 *            要添加到子树集中的目录树
	 * @return 是否添加成功
	 */
	public boolean addChildTree(ModuleTree child) {
		boolean success = childNodes.add(child);
		if (success)
			namedChildrenMap.put(child.getTreeNode().getId(), child);

		return success;
	}

	/**
	 * 批量添加子树
	 * 
	 * @param childs
	 */
	public void addAll(Collection<ModuleTree> childs) {
		for (ModuleTree moduleTree : childs) {
			addChildTree(moduleTree);
		}
	}

	/**
	 * 删除制定的子树，并从名字索引中除名
	 * 
	 * @param child
	 * @return
	 */
	public boolean removeChildTree(ModuleTree child) {
		boolean success = childNodes.remove(child);
		if (success)
			namedChildrenMap.remove(child.getTreeNode().getId());
		return success;
	}

	/**
	 * 根据子树根节点id获取子树
	 * 
	 * @param childName
	 *            子树根节点id
	 * @return 该树中对应的子树
	 */
	public ModuleTree getChildByName(String childName) {
		return namedChildrenMap.get(childName);
	}

	public Set<ModuleTree> getChildNodes() {
		return childNodes;
	}

	/**
	 * 设置子树森林，并添加id索引
	 * 
	 * @param childNodes
	 */
	public void setChildNodes(Set<ModuleTree> childNodes) {
		this.childNodes = childNodes;
		namedChildrenMap = new HashMap<>();
		for (ModuleTree moduleTree : childNodes) {
			namedChildrenMap.put(moduleTree.getTreeNode().getId(), moduleTree);
		}
	}

	public Module getTreeNode() {
		return treeNode;
	}

	public void setTreeNode(Module treeNode) {
		this.treeNode = treeNode;
	}

	@Override
	public String toString() {
		return "ModuleTree [childNodes=" + childNodes + ", treeNode=" + treeNode + "]";
	}

	@Override
	public int compareTo(ModuleTree tree) {
		if (tree == null)
			return 1;
		return treeNode.compareTo(tree.getTreeNode());
	}

}
