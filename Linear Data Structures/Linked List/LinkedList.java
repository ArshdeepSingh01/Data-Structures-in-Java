public class LinkedList {
    //Node representation of a Linked List
    class Node{
         int data;
         Node next;
        //Constructor
         Node(int d){
             this.data = d;
             this.next = null;
         }
     }

     //Head and Tail of the Linked List
     public Node head;
     public Node tail;

     //Method to add a new node to the list
     public void nodeAdd(int data){
         Node new_node = new Node(data);
         //if list is empty then head and tail will point to new node
         if(head==null){
             head = new_node;
         }
         else{
             tail.next = new_node;
         }
         tail = new_node;
     }

    //Method to display nodes in the the Linked List
     public void listDisplay(){
         //Current node will point towards the head
         Node current = head;
         if(head==null){
             System.out.println("List don't have any element");
             return;
         }

         System.out.println("Linked list nodes : ");
         while(current != null){
             //printing each node by incrementing the pointer
             System.out.println(current.data + " ");
             current=current.next;
         }
         System.out.println();
     }

     public static void main(String[] args){
         LinkedList list = new LinkedList();
         //Adding nodes to the Linked List
         list.nodeAdd(11);
         list.nodeAdd(22);
         list.nodeAdd(33);
         list.nodeAdd(44);
         list.nodeAdd(55);

         list.listDisplay();
     }
}