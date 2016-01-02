/**
 * Checks whether the given binary tree is a binary search tree or not
 * @author sudha
 */
package com.projects.Tree;

public class IsBinarySearchTree {

	public static void main(String args[])
	{
		IsBinarySearchTree b= new IsBinarySearchTree();
		BinarySearchTree bst=new BinarySearchTree();
		boolean res=b.isBST(bst.root);
		if(res)
		{
			System.out.println("Is BST");
		}
		else
		{
			System.out.println("Not BST");
		}
	}

	private boolean isBST(TreeNode root) {
		
		return isBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}

	private boolean isBSTUtil(TreeNode root, int minValue, int maxValue) {
	//checks whether a Binary tree is a binary search tree or not
		if(root==null)
			return true;
		if(root.getData()<maxValue && root.getData()>minValue)
			return true;
		else
			return isBSTUtil(root.left,minValue,root.getData()) && isBSTUtil(root.right,root.getData(),maxValue);
	}
}
