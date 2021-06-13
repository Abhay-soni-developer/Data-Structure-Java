package recursion;

import java.util.Stack;

public class ValidateBinarySearchTree {
	
	public static void main(String[] args) {
		System.out.println(-2147483648<2147483647);
	}

//	public boolean isValidBST(TreeNode root) {
//		Stack<TreeNode> stk = new Stack<>();
//		int lastTraversed = Integer.MIN_VALUE;
//
//		while (root != null || !stk.isEmpty()) {
//			while (root != null) {
//				stk.add(root);
//				root = root.left;
//			}
//
//			root = stk.pop();
//			
//			if (lastTraversed < root.val) {
//				lastTraversed = root.val;
//			} else {
//				return false;
//			}
//			
//			root = root.right;
//		}
//
//		return true;
//	}
	
	
    public boolean isValidBST(TreeNode root) 
    {
        int last_val = Integer.MIN_VALUE;
        Stack<TreeNode> st =  new Stack<TreeNode>();
        boolean flag = false;
        while(root != null || !st.isEmpty())
        {
            while(root != null)
            {
                st.add(root);
                root = root.left;
            }
            
            root = st.pop();
           
            if(root.val <= last_val && flag)
            {
                return false;
            }
            else
            {
                last_val = root.val;
                root = root.right;
                flag = true;
            }
        }
        return true;
    }
}
