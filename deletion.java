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

    public  ListNode deleteLast(){
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

    public void deletePos(int pos){
        if(pos==1){
            head=head.next;
        }
        else{
            ListNode prev=head;
            int count=1;
            while (count<pos-1) {
                prev=prev.next;
                count++;
            }
            ListNode current= prev.next;
            prev.next=current.next;
        }
    }

    public void display(){
        ListNode current= head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }System.out.println("null");
    }

    public void removeDuplicatesSortedList(){
        if(head==null){
            return;
        }
        ListNode current= head;
        while(current!=null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
    }

    public static void main(String[] args){
        deletion sll=new deletion();
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(9);
        sll.insertFirst(30);
        sll.insertFirst(33);
        sll.insertFirst(67);
        sll.insertFirst(2);
        sll.insertFirst(3);
        sll.insertFirst(6);
        sll.display();
        sll.deleteFirst();
        sll.deleteLast();
        sll.display();
        sll.deletePos(2);
        sll.display();
    }

}
