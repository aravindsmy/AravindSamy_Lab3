/**
 * 
 */
package com.greatlearning.question2;

import java.util.HashSet;

/**
 * @author Aravindsamy
 *
 */
public class FindPairBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindPairBST findPairBST = new FindPairBST();
		Node root = null;

		root = findPairBST.insert(root, 40);
		root = findPairBST.insert(root, 20);
		root = findPairBST.insert(root, 60);
		root = findPairBST.insert(root, 10);
		root = findPairBST.insert(root, 30);
		root = findPairBST.insert(root, 50);
		root = findPairBST.insert(root, 70);

		int inputsum = 130;

		findPairBST.findPairwithGivenSum(root, inputsum);

	}

	static class Node {

		int data;
		Node left, right;
	}

	static Node addNode(int data) {
		Node tempNode = new Node();

		tempNode.data = data;
		tempNode.left = null;
		tempNode.right = null;

		return tempNode;
	}

	public Node insert(Node root, int key) {

		if (root == null)
			return addNode(key);

		if (key < root.data) {
			root.left = insert(root.left, key);
		} else {
			root.right = insert(root.right, key);
		}
		return root;
	}

	public boolean findpair(Node root, int sum, HashSet<Integer> set) {

		if (root == null) {
			return false;
		}

		if (findpair(root.left, sum, set)) {
			return true;
		}

		if (set.contains(sum - root.data)) {
			System.out.println(
					"\n Pair is found for the sum " + sum + " : (" + (sum - root.data) + ", " + root.data + ")");
			return true;
		} else {
			set.add(root.data);
		}
		return findpair(root.right, sum, set);

	}

	public void findPairwithGivenSum(Node root, int sum) {
		HashSet<Integer> hSet = new HashSet<Integer>();

		if (!findpair(root, sum, hSet)) {

			System.out.println("print nodes are not found");
		}

	}

}
