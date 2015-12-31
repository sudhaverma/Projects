package com.projects.Tree;



public class InsertionInBST {

	static Node root=null;
	static class Node{
		int data;
		Node left;
		Node right;
		public Node(int d,Node left,Node right)
		{
			data=d;
			this.left=left;
			this.right=right;
		}
		public Node(int data)
		{
			this.data=data;
		}
		
	}
	public static void main(String args[])
	{
		InsertionInBST ins=new InsertionInBST();
		root=ins.insertTree(root,15);
		root=ins.insertTree(root,2);
		root=ins.insertTree(root,20);
		root=ins.insertTree(root,1);
		root=ins.insertTree(root,20);
		boolean res=ins.search(root,1);
		if(res)
		{
			System.out.println("Number found");
		}
		else{
			System.out.println("Number not found");
		}
		
	}
	private boolean search(Node root,int data) {
		// Searching numbers in BST
		if(root==null)
		{
			return false;
		}
		else if(data==root.data)
		{
			return true;
		}
		else if(data<= root.data)
		{
			return search(root.left,data);
		}
		else {
			return search(root.right,data);
		}
	
	}
	protected Node insertTree(Node root,int data) {
		// inserting node in tree
		if(root==null)
		{
			root=getNewNode(data);
		}
		else if(data<root.data)
		{
			root.left=insertTree(root.left,data);
		}
		else
		{
			root.right=insertTree(root.right,data);
		}
		
		return root;
	}
	private Node getNewNode(int data) {
		// creates a new Node
		Node newNode=new Node(data);
		newNode.data=data;
		newNode.left=null;
		newNode.right=null;
		return newNode;
	}

}
