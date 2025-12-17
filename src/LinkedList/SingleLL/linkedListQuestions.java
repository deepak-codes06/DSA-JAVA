package LinkedList.SingleLL;

public class linkedListQuestions {

    private Node head;
    private Node tail;
    private int size;


    // Detects the start pont of the cycle;
    public Node detectCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node newVariable = head;
                while (newVariable != slow ){
                    slow = slow.next;
                    newVariable = newVariable.next;
                }
                return newVariable;
            }
        }
        return null;
    }

    // for Merging the two sorted lists
    public static linkedListQuestions merge(linkedListQuestions first, linkedListQuestions second){
        Node f = first.head;
        Node s = second.head;

        linkedListQuestions ans = new linkedListQuestions();

        while(f!=null && s!=null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    //Method for remove duplicates from an linked list
    public void remove(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
            tail = node;
            tail.next = null;
        }
    }

    // Method for insert value at the last of the liked list
    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        linkedListQuestions.Node node = new linkedListQuestions.Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    // Method for insert value at the beginning of the liked list
    public void insertFirst(int val){
        linkedListQuestions.Node node  = new linkedListQuestions.Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    // method for displaying the linked list
    public void display(){
        linkedListQuestions.Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //main method
    public static void main(String[] args){
        linkedListQuestions first = new linkedListQuestions();
        linkedListQuestions second = new linkedListQuestions();


        first.insertLast(1);
        first.insertLast(5);
        first.insertLast(9);
        first.insertLast(10);

        second.insertLast(88);
        second.insertLast(96);
        second.insertLast(111);

        linkedListQuestions ans = linkedListQuestions.merge(first,second);
        ans.display();


    }
}
