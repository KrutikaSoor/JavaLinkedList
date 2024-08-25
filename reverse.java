public class reverse {

    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current= head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }System.out.println("null");
    }
    public ListNode reversesll(ListNode head){
        if(head==null){
            return head;
        }
        ListNode previous=null;
        ListNode nex = null;
        ListNode current=head;
        while(current!=null){
            nex= current.next;
            current.next=previous;
            previous=current;
            current=nex;
        }
        return previous;

    }

    public static void main(String[] args){
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(9);
        ListNode third = new ListNode(7);
        ListNode fourth = new ListNode(2);

        head.next= second;
        second.next= third;
        third.next= fourth;

        reverse sll= new reverse();
        sll.head=head;
        System.out.println("Original List");
        sll.display();
        System.out.println("Reverse List");
        sll.head=sll.reversesll(head);
        sll.display();

    }

}
