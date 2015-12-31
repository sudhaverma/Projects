package com.projects.Tree;


public class PathSumBinarySearchTree {

	public static void main(String args[])
	{
		PathSumBinarySearchTree p=new PathSumBinarySearchTree();
	
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(15);
		bst.insert(7);
		bst.insert(50);
		bst.insert(60);
		boolean res=p.findSum(bst.root,17);
		if(res)
		{
			System.out.println(res);
		}
		else
		{
			System.out.println(res);
		}
		
	}

	private boolean findSum(TreeNode root, int sum) {
		if(root==null)
	 return sum==0;
	
		int subsum=sum-root.getData();
		
		return findSum(root.left,subsum)||(findSum(root.right,subsum));
	}
}
