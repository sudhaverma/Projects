package com.projects.Tree;


public class MaxDepthInTree {

	public static void main(String args[])
	{
		MaxDepthInTree m=new MaxDepthInTree();
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(15);
		bst.insert(7);
		bst.insert(50);
		bst.insert(60);
		int res=m.findMaxDepth(bst.root);
		int min=m.findMin(bst.root);
		System.out.println("Min is"+min);
		System.out.println("Max depth is"+res);
	}

	private int findMin(TreeNode root) {
		//finding minimum in a binary tree
	
		while(root.left!=null)
		{
			root=root.left;
		}
		return root.getData();
	}

	private int findMaxDepth(TreeNode root) {
	
		if(root==null)
		{
		return 0;
		}
		else
		{
			int ldepth=findMaxDepth(root.left);	
   		  int rdepth=findMaxDepth(root.right);
			
		
		if(ldepth>rdepth) 
			return ldepth+1;
		else
			return rdepth+1;
	}
	}
}
