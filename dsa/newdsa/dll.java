public class dll {

   private Node head;
   private Node tail;
   
   public void insertFirst(int val){
      Node node = new Node(val);
      node.next=head;
      node.prev=null;
      if(head!=null){
          head.prev=node;
        }else{
            tail=node;
        }
        head=node;
    }
    public void display(){
        Node temp = head;
        Node last =  null;
        System.out.println("order");
        System.out.print("null -> head" + "-> ");
        while(temp!=null){
            System.out.print( temp.val+"-> ");
            last = temp;
            temp=temp.next;
        }
        System.out.println("tail -> null");
        System.out.println("reverse order");
        System.out.print("null -> TAIL"+"-> ");

        while(last!=null){
            System.out.print(+last.val+"-> ");
            last=last.prev;
            
        }
        System.out.println("HEAD -> null" );
        System.out.println("end");
    }
    
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        if(head==null){
            node.prev = null;
            head = node;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

        // if(head==null){
        //     head=node;
        //     tail=node;
        // }else{

        //     tail.next=node;
        //     node.prev=tail;
        //     tail=node;
            
        // }
    }
            
   public void insertion(int val , int index){
    if(index < 0 ){
        throw new IndexOutOfBoundsException("index out of bound");
    }

    if(index==0){
        insertFirst( val);
        return;
    }

    Node node = new Node(val);
    Node temp = head;
    for(int i=1;i<index;i++){
        if(temp==null){
            throw new IndexOutOfBoundsException("index out of bound");
        }
        temp = temp.next;
    }
    
    if(temp.next==null){
        insertLast(val);
        return;
    }
    node.next = temp.next;
    temp.next.prev = node;
    temp.next = node;
    node.prev = temp;
   }



          


    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}
