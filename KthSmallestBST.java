package recursion;

import java.util.Collections;
import java.util.Stack;

public class KthSmallestBST {

	public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        
        while (root!=null || stack.size()>0) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            
            k--;
            root=stack.pop();
            if(k==0) {
            	return root.val;
            }
            root=root.right;
        } 
        return -1;
	}
}
