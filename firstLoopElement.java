public class firstLoopElement {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public ListNode containsLoop(){
        ListNode fastptr= head;
        ListNode slowptr= head;

        while(fastptr!=null && fastptr.next!=null){
            fastptr=fastptr.next.next;
            slowptr=slowptr.next;
            if(slowptr==fastptr){
                return getStartingNode(slowptr);
            }
        }
        return null;
    }

    public ListNode getStartingNode(ListNode slowptr){
        ListNode temp= head;
        while(temp!=slowptr){
            temp=temp.next;
            slowptr=slowptr.next;
        }
        return temp;
    }

    public void createloopinLL(){
        ListNode first= new ListNode(1);
        ListNode second= new ListNode(2);
        ListNode third= new ListNode(3);
        ListNode fourth= new ListNode(4);
        ListNode fifth= new ListNode(5);
        ListNode sixth= new ListNode(6);
        head=first;
        first.next=second;
        second.next= third;
        third.next= fourth;
        fourth.next=fifth;
        fifth.next= sixth;
        sixth.next= third;    
    }

    public static void main(String[] args) {
        firstLoopElement sll = new firstLoopElement();
        sll.createloopinLL();
        System.out.println(sll.containsLoop().data);
    }
    
}
