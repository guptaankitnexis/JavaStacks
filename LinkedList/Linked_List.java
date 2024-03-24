// package LinkedList;

class Node{
    int data;
    Node next;
//    constructor
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
    Node (int data,Node next){
        this.data=data;
        this.next=next;
    }
}

public class Linked_List {
    private static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    private static Node convertArrayToLL(int []arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    private  static int LengthOfLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    private static int checkIfPresent(Node head,int val){
        Node temp = head;
        while(temp != null) {
            if (temp.data == val) {
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
    private static Node deleteHead(Node head){
        if(head == null){
            return head;
        }
        head=head.next;
        return head;
    }
    private static Node deleteTail(Node head){
        // if head is empty or head has only one element So we return null
        if(head==null || head.next==null){
            return null;
        }
        Node temp= head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next=null;
        return head;
    }

    private static Node deleteAtK(Node head,int k){
        if(head==null){
            return head;
        }
        if(k==1){
            head=head.next;
            return head;
        }
        Node temp = head;
        Node prev= null;
        int count = 0;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    private static Node deleteAtEl(Node head,int value){
        if(head==null){
            return head;
        }
        if(head.data==value){
            head=head.next;
            return head;
        }
        Node temp = head;
        Node prev= null;
        while(temp!=null){
            if(temp.data==value){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    private static Node insertAtHead(Node head, int ele){
        Node temp= new Node(ele);
        temp.next=head;
        return temp;
    }
    private static Node insertAtTail(Node head, int ele){
        if(head==null){
            return new Node(ele);
        }
        Node newNode= new Node(ele);
        Node temp = head;
        while(temp.next != null){
           temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    private static Node insertAtK(Node head,int val,int k){
        if(head==null){
            if(k==1){
                return new Node(val);
            }
            else{
                return null;
            }
        }
        if(k==1){
            return new Node(val,head);
        }

        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            if(count == k-1){
                Node y= new Node(val,temp.next);
                temp.next=y;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    private static Node insertAtElement(Node head,int val,int ele){
        if(head==null){
            return null;
        }
        Node temp = head;
        if(temp.data==val){
            return new Node(ele,head);
        }
        while(temp.next != null){
            if(temp.next.data==val){
                Node y= new Node(ele,temp.next);
                temp.next=y;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    public static void main(String []args){
        int[] arr = {15,2,3,4,5,6,7,8,9};
//        Node y = new Node(arr[0]);
//        System.out.println(y.data);

        Node head = convertArrayToLL(arr);
//        System.out.println(head.data);


//        System.out.println(LengthOfLL(head));
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println("hi");
//        System.out.println(checkIfPresent(head,7));
        Node justTemp = insertAtElement(head,2,17);
//        Node justTemp = new Node (21,head);
        printLL(justTemp);

    }
}
