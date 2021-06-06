package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class TreeRightSideView {

    public List<Integer> rightSideView(TreeNode ptr) {
       List<Integer> list = new LinkedList<>();
       
       if(ptr==null) {
           return list;
       }
       
       Deque<TreeNode> deque = new LinkedList<>();
       deque.add(ptr);
      
       
       while(!deque.isEmpty()) {
       	list.add(deque.peekFirst().val);
       	int len = deque.size();
       	int i=1;
           
       	while(i<=len) {
       		
       		ptr=deque.remove();
       		
       		if(ptr.right!=null) {
           		deque.add(ptr.right);
           	}
           	
           	if(ptr.left!=null) {
           		deque.add(ptr.left);
           	}
           	
           	i++;
       	}
       }
       
       return list;
   }

}
