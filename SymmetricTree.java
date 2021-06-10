package recursion;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return true;
		}
		
		TreeNode ptr=root.left, cpt=ptr.right;

		return traverseAndCompare(ptr, cpt);
	}
	
	public boolean traverseAndCompare(TreeNode ptr, TreeNode cpt) {
		
		if(ptr==null || cpt==null) {
			if(ptr!=cpt) return false; 
		}
		else if(ptr.val!=cpt.val) {
			return false;
		}
		
		if(!traverseAndCompare(ptr.left, cpt.right)) return false;
		if(!traverseAndCompare(ptr.right, cpt.left)) return false;
		
		return true;
	}

}
