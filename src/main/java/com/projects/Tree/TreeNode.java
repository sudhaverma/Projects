package com.projects.Tree;

public class TreeNode {

	int data;
	TreeNode left;
	TreeNode right;
	public TreeNode(int d)
	{
		this.data=d;
		left=null;
		right=null;
	}
	public TreeNode()

	{
		
	}
	//Public getter and setter methods
	public int getData()
	{
		return this.data;
	}
	public TreeNode getLeft()
     {
		return this.left;
		}
	public TreeNode getRight()
    {
		return this.right;
		}
	public void setData(int d)
	{
		this.data=d;
	}
	public void setRight(TreeNode r)
	{
		this.right=r;
	}
	public void setLeft(TreeNode l)
	{
		this.left=l;
	}
	
}
