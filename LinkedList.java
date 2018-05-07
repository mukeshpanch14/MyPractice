class LinkedList{
  static class Node{
    int data;
    Node next;
    Node(int d){
      data=d;
      next=null;
    }
  }
  Node head;
  
  void PrintList(){
    Node node=head;
    while(node!=null){
      System.out.print(node.data+" ");
      node=node.next;
    }
    System.out.println();
  }
  
  void PushItem(int a){
    Node node=new Node(a);
    Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=node;
    node.next=null;
  }
  //Efficient Approach for finding nth node  from the end
  int NthNodeFromEnd(int pos){
    Node ptemp=head;
    Node pnthnode=head;
    int count=1;
    while(count<pos){
      ptemp=ptemp.next;
      count++;
    }
    
    while(ptemp.next!=null){
      pnthnode=pnthnode.next;
      ptemp=ptemp.next;
    }
    
    return pnthnode.data;
  }
  
  public static void main(String args[]){
    LinkedList list=new LinkedList();
    list.head=new Node(1);
    
    for(int i=2;i<6;i++){
      list.PushItem(i);
    }
    
    list.PrintList();
    System.out.println(list.NthNodeFromEnd(3));
  }
}