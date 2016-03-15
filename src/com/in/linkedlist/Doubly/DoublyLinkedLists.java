package com.in.linkedlist.Doubly;

public class DoublyLinkedLists {
	public static Dnode head,end;
	public DoublyLinkedLists(){
		head=new Dnode(0);
		end=new Dnode(0);
	}
	public void insertItem(int d){
		Dnode current,previous;
		Dnode temp=new Dnode(d);
		current=head;
		previous=head;
		while((current.next!=null)&&(d>current.data)){
			previous=current;
			current=current.next;
		}
		if(d<current.data){
			temp.next=current;
			current.back=temp;
			previous.next=temp;
			temp.back=previous;
		}
		else
			end=temp;
		current.next=temp;
		temp.back=current;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
