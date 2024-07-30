public class deletion {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void insertFirst(int value){
        ListNode newNode= new ListNode(value);
        newNode.next= head;
        head=newNode;
    }

    public ListNode deleteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp= head;
        head=head.next;
        temp.next=null;
        return temp;

    }

    public void deleteLast(){
       if(head==null || head.next==null){
       return head;
       }
        ListNode curr=head;
        ListNode prev=null;
        while(curr.next!=null){
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        return curr;
    } 

    public void display(){
        ListNode current= head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }System.out.println("null");
    }

    public static void main(String[] args){
        deletion sll=new deletion();
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(9);
        sll.insertFirst(30);
        sll.display();
        sll.deleteFirst();
        sll.deleteLast();
        sll.display();
    }

}
