package recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DeleteNodeBST {

	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null)
			return root;

		if (root.val == key) {
			if (root.left != null && root.right != null) {
				TreeNode n1 = findAndRemoveNextInOrderNode(root.right);
                n1.left=root.left;
                return n1;
			} else if (root.left != null) {
				return root.left;
			} else if (root.right != null) {
				return root.right;
			} else {
                return null;
			}
		}

		if (root.left != null && root.val >= key) {
			TreeNode node = deleteNode(root.left, key);
			root.left=node;
		} else if (root.right != null && root.val <= key) {
			TreeNode node = deleteNode(root.right, key);
			root.right=node;
		}

		return root;
	}

	public static TreeNode findAndRemoveNextInOrderNode(TreeNode node) {
		if(node.left!=null) {
			TreeNode n1 = findAndRemoveNextInOrderNode(node.left);
			if(n1==node.left) {
				if(n1.right!=null) {
					node.left=n1.right;
					n1.right=null;
				}else {
					node.left=null;
				}
				return n1;
			}
			return n1;
		}else {
			return node;
		}
	}
}
