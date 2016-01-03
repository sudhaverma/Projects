package com.projects.Tree;
/**
 * This finds the minimum element and maximum element in binary search tree
 * @author sudha
 *
 */
public class MinMaxInBST {

	/*
	 * this methods finds the minimum element in the Binary search tree
	 */
	public int findMin(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		while(root.left!=null)
		{
			root=root.left;
		}
		return root.data;
		
	}
	/*
	 * this methods finds the maximum element in the Binary search tree
	 */
	public int findMax(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		while(root.right!=null)
		{
			root=root.right;
		}
		return root.data;
		
	}
	TreeNode root = null;
	public static void main(String args[])
	{
	
	BinarySearchTree bst=new BinarySearchTree();
	bst.insert(10);
	bst.insert(20);
	bst.insert(15);
	bst.insert(7);
	bst.insert(50);
	bst.insert(60);
	bst.insert(20);
	MinMaxInBST m = new MinMaxInBST();
	System.out.println("Minimum element in binary tree is"+ m.findMin(bst.root));
	System.out.println("Maximum element in binary tree is"+ m.findMax(bst.root));
	}
	

}
