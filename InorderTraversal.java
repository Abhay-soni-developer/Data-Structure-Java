package recursion;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
    
//	public List<Integer> inorderTraversal(TreeNode root) {
//		List<Integer> list = new LinkedList<>();
//		traverseInorder(root, list);
//		return list;
//    }
//
//	
//	public static void traverseInorder(TreeNode root, List<Integer> list) {
//		if(root.left!=null) {
//			traverseInorder(root.left, list);
//		}
//		
//		list.add(root.val);
//		
//		if(root.right!=null) {
//			traverseInorder(root.right, list);
//		}
//		
//	}
	
	
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new LinkedList<>();
		Stack<TreeNode> stk = new Stack<>();

		while (root != null || !stk.isEmpty()) {
			while (root != null) {
				stk.add(root);
				root = root.left;
			}

			root = stk.pop();
			list.add(root.val);
			root = root.right;
		}

		return list;

	}
}
