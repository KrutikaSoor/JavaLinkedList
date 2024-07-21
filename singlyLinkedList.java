public class singlyLinkedList{
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

public void length(){
    int count=0;
    ListNode current=head;
    while(current!=null){
        count++;
        current=current.next;
    }
    System.out.println(count);
}
    public static void main(String[] args){
        singlyLinkedList sll = new singlyLinkedList();
        sll.head=new ListNode(0);
        ListNode second= new ListNode(11);
        ListNode third=new ListNode(12);
        ListNode fourth =new ListNode(30);

        sll.head.next= second;
        second.next=third;
        third.next= fourth;

        sll.display();
        sll.length();
    }
}