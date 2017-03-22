package com.sunshine.util;

import java.util.List;

import com.sunshine.model.ServCategory;

/**
 * 服务分类的二级菜单树
 * @author 云和数据-王辉
 *
 */
public class ServiceCategoryTree {
	private ServCategory treeNode;
	private List<ServCategory> childNode;
	public ServCategory getTreeNode() {
		return treeNode;
	}
	public void setTreeNode(ServCategory treeNode) {
		this.treeNode = treeNode;
	}
	public List<ServCategory> getChildNode() {
		return childNode;
	}
	public void setChildNode(List<ServCategory> childNode) {
		this.childNode = childNode;
	}
	
}
