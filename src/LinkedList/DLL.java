package LinkedList;

public class DLL {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if(head != null){
            head.previous = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.previous;
        }
        System.out.println("START");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;

        if(head == null){
            node.previous = null;
            head = node;
            return;
        }
       while(last.next != null){
            last = last.next;
        }
       last.next = node;
       node.previous = last;


    }

    private class Node{
        private int value;
        private Node next;
        private Node previous;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next, Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }
}
