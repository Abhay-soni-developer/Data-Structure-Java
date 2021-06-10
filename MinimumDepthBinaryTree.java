package recursion;

import java.util.Deque;
import java.util.LinkedList;

public class MinimumDepthBinaryTree {
    public int minDepth(TreeNode root) {
        if(root==null) {
            return 0;
        }
        
        Deque<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        int level=1;
        while(!dq.isEmpty()) {
        	int totalNodeInThisLevel=dq.size();
        	while(totalNodeInThisLevel--!=0) {
        		root=dq.poll();
        		if(root.left==null && root.right==null) {
            		return level; 
            	}
        		if(root.left!=null)
        			dq.add(root.left);
        		
        		if(root.right!=null)
        			dq.add(root.right);
        	}
        	level++;
        }
        return 0;
    }
}
