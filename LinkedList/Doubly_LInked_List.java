//package LinkedList;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
}


public class Doubly_LInked_List {
    private static void print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    private static Node ArrayToDLL(int arr[]){
        Node head= new Node(arr[0]);
        Node prev= head;
        for(int i =1;i<arr.length;i++){
            Node temp=new Node(arr[i],null,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    private static Node deleteHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        head=head.next;
        head.prev=null;
        return head;
    }
    private static Node deleteTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node tail = head;
        while (tail.next != null){
            tail=tail.next;
        }
        tail.prev.next=null;
        tail.prev=null;
        return head;
    }
    private static Node deleteAtK(Node head,int k){
        if(head==null ){
            return null;
        }
        Node temp =head;
        int count= 0;
        while (temp != null){
            count++;
            if(count==k){
                break;
            }
            temp=temp.next;
        }
        Node front = temp.next;
        Node back = temp.prev;
        if(front == null && back==null){
            return null;
        }
        else if(back == null){
            return deleteHead(head);
        }
        else if(front == null){
            return deleteTail(head);
        }
        back.next=front;
        front.prev=back;
        temp.next=null;
        temp.prev=null;
        return head;
    }
    private static void deleteNode(Node temp){
        Node front = temp.next;
        Node back = temp.prev;
        // tail case
        if(front==null){
            back.next=null;
            temp.prev=null;
            return;
        }
        back.next=front;
        front.prev=back;
        temp.next=null;
        temp.prev=null;
    }
    private static Node insertHead(Node head,int val){
        Node temp = new Node(val, head,null);
        head.prev=temp;
        return temp;
    }
    private static Node insertTail(Node head,int val){
        if(head.next==null){
            return insertHead(head,val);
        }
        Node tail = head;
        while (tail.next!=null){
            tail= tail.next;
        }
        Node back = tail.prev;
        Node temp = new Node(val, tail,back);
        back.next=temp;
        tail.prev=temp;
        return head;
    }
    private static Node insertAtK(Node head,int val,int k){
        if(head==null ){
            return null;
        }
        Node temp =head;
        int count= 0;
        while (temp != null){
            count++;
            if(count==k){
                break;
            }
            temp=temp.next;
        }
        Node back = temp.prev;
        if(back == null ){
            return insertHead(temp,val);
        }
        Node newNode = new Node(val,temp,back);
        back.next=newNode;
        temp.prev=newNode;
        return head;
    }
    private static void insertNode(Node temp,int val){
        Node back = temp.prev;
        Node newNode = new Node(val,temp,back);
        back.next=newNode;
        temp.prev=newNode;
    }

    public static void main(String args[]){
        int arr[]={11,21,52,84,91,32,61,25,42,10,100};
        Node head= ArrayToDLL(arr);
        insertNode(head.next.next,11);
        print(head);
    }
}
