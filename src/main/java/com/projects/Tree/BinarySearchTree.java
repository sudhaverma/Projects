package com.projects.Tree;


public class BinarySearchTree {

	TreeNode root=null;
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
		bst.printNodes(bst.root);
		System.out.println("Root is->"+bst.root.getData());
	}
	
	
	public void printNodes(TreeNode root) {
		//Printing all nodes of tree
		if (root == null)
			return;
		printNodes(root.getLeft());
		System.out.println(root.getData());
		printNodes(root.getRight());	
	}
	private TreeNode insertNode(TreeNode root,int data) {
		if(root==null)
		{
			root=new TreeNode(data);
			if(this.root==null)
			{
				this.root=root;
			}
		}
		if(root.data<data)
		{
			root.right=insertNode(root.right,data);
		}
		else if(root.data>data)
		{
			root.left=insertNode(root.left,data);
		}
		return root;
		
		
		
	}
	public void insert(int data) {
		 insertNode(this.root,data);
	}
}
