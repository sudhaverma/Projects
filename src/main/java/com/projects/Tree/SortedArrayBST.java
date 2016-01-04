package com.projects.Tree;
/**
 * This class converts a given sorted array in a Binary search tree
 * @author sudha
 *
 */

public class SortedArrayBST extends BinarySearchTree{

	public static void main(String args[])
	{
		int[] arr={2,3,4,5,6,7,8,9};
		SortedArrayBST st=new SortedArrayBST();
		TreeNode root=st.sortedArrayToBST(arr);
		st.inOrderTraversal(root);
	}

	private void inOrderTraversal(TreeNode root) {
		// prints element in in-order traversal in  a BST
			if(root==null)
				return;
			inOrderTraversal(root.left);
			System.out.println(root.data+"\t");
			inOrderTraversal(root.right);
			
	}

	private TreeNode sortedArrayToBST(int[] arr) {
		if(arr.length == 0)
			return null;
		
		return sortedArrayToBST(arr,0,arr.length-1);
		
	}

	private TreeNode sortedArrayToBST(int[] arr, int start, int end) {
		// creates a BST from the given sorted array
		if(start>end)
			return null;
		int mid=(start+end)/2;
		TreeNode root=new TreeNode(arr[mid]);
		root.left = sortedArrayToBST(arr,start,mid-1);
		root.right = sortedArrayToBST(arr,mid+1,end);
		return root;
	}
	
}