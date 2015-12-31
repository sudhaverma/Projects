package com.projects.Tree;

//Counting of all leaf nodes in a binary tree

public class CountBinaryLeafNodes {

	//private TreeNode root=null;
	public static void main(String args[])
	{
		CountBinaryLeafNodes cbn=new CountBinaryLeafNodes();
		
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(15);
		bst.insert(7);
		bst.insert(50);
		bst.insert(60);
		int res=cbn.countSize(bst.root);
		System.out.println("Size is"+res);
	}

	private int countSize(TreeNode root) {
		if(root==null)
		return 0;
		
		if(root.getLeft()==null && root.getRight()==null)
		{
			return 1;
		}
		return countSize(root.getLeft())+countSize(root.getRight());
	}
}
