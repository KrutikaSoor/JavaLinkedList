public class insertion {
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

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
           head = newNode;
           return;
        }
        ListNode current = head;
        while (null != current.next) {
           current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int value,int pos){
        ListNode node=new ListNode(value);
        if(pos==1){
            node.next=head;
            head=node;
        }else{
            ListNode prev= head;
            int count=1;
            while (count<pos-1) {
                prev=prev.next;
                count++;
            }ListNode current=prev.next;
            node.next=current;
            prev.next=node;

        }
    }

    public void display(){
        ListNode current= head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }System.out.println("null");
    }

    public static void main(String[] args){
        insertion sll=new insertion();
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(9);
        sll.insertFirst(30);
        sll.insertLast(20);
        sll.insertLast(10);
        sll.insertAtPosition(40, 4);
        sll.display();
    }
    
}
