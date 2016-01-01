package com.projects.Tree;
/*
 * To find the mirror image of the given binary tree by swapping its left and right child 
 */

public class MirrorBinaryTree {

	public static void main(String args[])
	{
		MirrorBinaryTree mt=new MirrorBinaryTree();
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(15);
		bst.insert(7);
		bst.insert(50);
		bst.insert(60);
		bst.printNodes(bst.root);
		mt.mirror(bst.root);
		System.out.println("Mirror image is ->");
		bst.printNodes(bst.root);
	}

	private void mirror(TreeNode root) {
		//swapping left and right children of each node in BST
		if(root==null)
			return;
		
		mirror(root.left);
		mirror(root.right);
		
		TreeNode temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		
	}
}
