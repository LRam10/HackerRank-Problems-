/*
 //Luis Ramirez
 Tree Traversal 
 */
package treetraversal;
import java.util.*;
public class TreeTraversal {

 static class Node<T> {
    T value;
    Node<T> left;
    Node<T> right;
		 
    Node(T value) {
    this.value = value;
    }
		 
void visit() {
    System.out.print(this.value + " ");
	}
}
		 
static enum ORDER {
	PREORDER, LEVELORDER , INORDER, POSTORDER
}
		 
static void traverse(Node<?> node, ORDER order) {
    if (node == null) {
	return;
	}
switch (order) {
    case PREORDER:
        node.visit();
	traverse(node.left, order);
	traverse(node.right, order);
	break;
	case INORDER:
	traverse(node.left, order);
	node.visit();
	traverse(node.right, order);
	break;
    case POSTORDER:
	traverse(node.left, order);
	traverse(node.right, order);
	node.visit();
	break;
    case LEVELORDER:
	Queue<Node<?>> queue = new LinkedList<>();
	queue.add(node);
	while(!queue.isEmpty()){
		Node<?> next = queue.remove();
		next.visit();
		if(next.left!=null)
			queue.add(next.left);
		if(next.right!=null)
			queue.add(next.right);
		}
	}
}	
		 
public static void main(String[] args) {
		 
	Node<Integer> n1 = new Node<>(50);
	Node<Integer> n2 = new Node<>(70);
	Node<Integer> n3 = new Node<>(10);
	Node<Integer> n4 = new Node<>(40);
	Node<Integer> n5 = new Node<>(20);
        Node<Integer> n6 = new Node<>(30);
        Node<Integer> n7 = new Node<>(60);
        Node<Integer> n8 = new Node<>(90);
        Node<Integer> n9 = new Node<>(80);
        Node<Integer> n10 = new Node<>(100);
        
				
		 
	n1.left = n2;
	n1.right = n3;	
         n2.left = n4;
	n2.right = n5;
        n5.left = n6;
        n3.left=n7;
        n3.right= n8;
        n8.left=n9;
        n8.right=n10;
				                
    System.out.println("The preorder traverse:"); 
    traverse(n1, ORDER.PREORDER);
    System.out.println(); 
    System.out.println("The level-order traverse:"); 
    traverse(n1, ORDER.LEVELORDER);
    System.out.println(); 
    System.out.println("The Inorder traverse:");
        traverse(n1, ORDER.INORDER);
    System.out.println();
        System.out.println("The Post traverse:");
    traverse(n1, ORDER.POSTORDER);
        System.out.println();
		        
		 
	}
}
	



