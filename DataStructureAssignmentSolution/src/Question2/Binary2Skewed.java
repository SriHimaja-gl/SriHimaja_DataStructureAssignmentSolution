package Question2;

public class Binary2Skewed 
{
	public static Node node;
	public static Node prevNode = null;
	public static Node headNode = null;
	public static class Node 
	{
		int value;
		public Node right;
		public Node left;;
		
		public Node(int item)
		{
			super();
			value = item;
			left = right = null;
		}
	}
	
	public static void B2S(Node root, int ascending) {
		if(root == null) {
			return;
		}
		
		if(ascending > 0) {
			B2S(root.right,ascending);
		}else {
			B2S(root.left, ascending);
		}
		
		Node rightNode = root.right;
		Node leftNode = root.left;
		
		if(headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		}else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		
		if(ascending > 0) {
			B2S(leftNode, ascending);
		}else {
			B2S(rightNode, ascending);
		}
		
	}
	public static void RightSkewed(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		RightSkewed(root.right);
	}
}
