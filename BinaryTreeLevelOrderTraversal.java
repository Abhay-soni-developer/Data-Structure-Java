package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class BinaryTreeLevelOrderTraversal {

	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        
       if(root==null) {
           return list;
       }
       
       Deque<TreeNode> deque = new LinkedList<>();
       deque.add(root);
        List<Integer> temp = new ArrayList<>();
        temp.add(root.val);
       
       while(!deque.isEmpty()) {
        list.add(temp);
       	temp = new ArrayList<>();
    
       	int len = deque.size();
           
       	while(len-->0) {
       		
       		root=deque.remove();
       	     	
           	if(root.left!=null) {
                temp.add(root.left.val);
           		deque.add(root.left);
           	}
            
       		if(root.right!=null) {
                temp.add(root.right.val);
           		deque.add(root.right);
           	}
            
       	}
                  	

       }
       
       return list;
	}
}
