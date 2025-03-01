import java.util.LinkedList;
import java.util.Stack;

import javax.swing.text.html.parser.Element;

public class PalindromeLL {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // public static Node head;

    // public static void add(int data){
    //     Node node = new Node(data);

    //     if(head == null){
    //         head = node;
    //     }

    //     node.next = head;
    //     head = node;
    // }

    public static boolean isPalindrome(LinkedList<Integer> list){

        Stack<Integer> stack = new Stack<>();
        
        for(Integer ele : list){
            stack.push(ele);
        }

        for(Integer ele : list){
            // if(ele != stack.pop()){
            //     return false;
            // }

            if(!ele.equals(stack.pop())){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(1, 2);
        list.add(2, 3);
        list.add(3, 2);
        list.add(4, 1);

        boolean condition = isPalindrome(list);
        System.out.println(condition);

    } 
}