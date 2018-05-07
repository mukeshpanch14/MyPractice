import java.util.*;

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

	void push(int item){
		Node node=new Node(item);

		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
		node.next=null;

	}

	//Bruteforce of Nth node from end 

	int nthend(int pos){
		int count=1;
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
			count++;
		}

		//System.out.println(count);
		Node tep=head;
		
		int i=0;
		int end=count-pos;
		while(i<end && tep.next!=null){
			tep=tep.next;
			i++;
		}

		return tep.data;
	}

	//Nth node from end using Hashmap
	int nthend_hash(int pos){
		int list_pos=1;
		Node temp=head;

		Map<Integer,Node> map=new HashMap<Integer,Node>();
		while(temp!=null){
			map.put(list_pos,temp);
			temp=temp.next;
			list_pos++;
		}

		//Length of HashMap
		int len=map.size();

		int nthen=len-pos+1;

		Node nthe=map.get(nthen);
		return nthe.data;
	}

	public static void main(String args[]){
		LinkedList list=new LinkedList();
		list.head=new Node(0);

		for(int i=1;i<6;i++){
			list.push(i);
		}
		list.PrintList();

		System.out.println(list.nthend(3));
		System.out.println(list.nthend_hash(3));
	}
}