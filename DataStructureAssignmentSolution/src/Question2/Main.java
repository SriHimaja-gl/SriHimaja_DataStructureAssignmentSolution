package Question2;

import Question2.Binary2Skewed.Node;

public class Main 
{
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Binary2Skewed tree = new Binary2Skewed();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		
		int ascending = 0;
		Binary2Skewed binary2Skewed = new Binary2Skewed();
		binary2Skewed.B2S(Binary2Skewed.node, ascending);
		
		Binary2Skewed.RightSkewed(Binary2Skewed.headNode);
	
	}
}


