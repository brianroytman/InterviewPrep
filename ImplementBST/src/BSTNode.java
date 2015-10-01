import java.util.Scanner;

public class BSTNode {
	
	BSTNode left;
	BSTNode right;
	int data;
	
	//constructor w/ no parameters
	public BSTNode() {
		left = null;
		right = null;
		data = 0;
	}
	
	//constructor with int parameter
	public BSTNode(int n) {
		left = null;
		right = null;
		data = n;
	}
	
	//get left node
	public BSTNode getLeftNode() {
		return left;
	}
	
	//set left node
	public void setLeftNode(BSTNode leftN) {
		left = leftN;
	}
	
	//get right node
	public BSTNode getRightNode() {
		return right;
	}
	
	//set right node
	public void setRightNode(BSTNode rightN) {
		right = rightN;
	}
	
	//get data
	public int getData() {
		return data;
	}
	
	//set data
	public void setData(int n) {
		data = n;
	}
	

}


