package com.in.linkedlist.singly;


public class SingleLinkList {
	public static Node head;

	// constructor
	public SingleLinkList() {
		head = new Node(0);
	}
	public boolean isEmtpy() {

		if (head.next == null)
			return true;
		else
			return false;
	}
	public void insertFirst(int d) {
		// create new node
		Node temp = new Node(d);
		// reference new node's next to null
		temp.next = null;
		// assign head's next to new node's data
		head.next = temp;
	}
	public void appendTail(int d) {
		// take a node current and set it to head
		Node current = head;
		// loop while not at end of list
		while (current.next != null) {
			// set current to current.next
			current = current.next;
		}
		// create new node, set data value, link field to null
		Node temp = new Node(d);
		// temp.d = 14;
		temp.next = null;
		// set current.next to new node
		current.next = temp;
	}
	public void insertItem(int d){
		/*pseudocode to insert item in list…
  			create new record, assigning values to its key and data field(s)
  			set previous and current pointers to head
  			if list empty (i.e. current.next is null)
      			append to dummy record                        … case (i)
  			else
       			loop while not at list end AND new key > current record key
                 previous = current       … move down the list
                 current = current.next
       		endloop
       			if new key > current record key
                 current.next = temp               … case (ii)
       			else
                 temp.next = current
                 previous.next = temp             … case (iii)
       		endif
  		endif*/
		Node previous,current,temp;
		temp=new Node(d);
		current=head;
		previous=head;
		while((current.next!=null)&& (d>current.data)){
			previous=current;
			current=current.next;
		}
		if(d<current.data){
			temp.next=current;
			previous.next=temp;
		}
		else
			current.next=temp;
	}
	public void outputListContentsAndCounts() {
		// start at head
		int count = 0;
		Node current = head;
		// write out each node's data ending upto link's value null
		while (current.next != null) {
			System.out.println(current.data);
			current = current.next;
			count++;
		}
		System.out.println(+count + "nodes");
	}
	public void searchList(int d) {
		// set current at head's next
		Node current = head.next;
		boolean found = false;
		// loop while not end of list and item not yet found
		while ((current.next != null) && (found == false)) {
			if (current.data == d) {
				System.out.println(current.data + "found");
				found = true;
				// set current to current.next
				current = current.next;
			}
			if (!found)
				System.out.println("item not present in list");
		}

	}
	public void deleteFirst() {
		Node temp = head;
		// remove reference of head's next from temp
		head.next=null;
		// set first node as head
		head=head;
	}
	public void deleteItem(int d){
		// set previous to value of head
		Node previous=head;
		// set current to head.next
		Node current=head.next;
		boolean found =false;
		// loop while found is false and not at end of list
		while ((!found)&&(current.next!=null)){
			if(current.data==d){
				// bypass the item by adjusting the link
				previous.next=current.next;
				System.out.println(current.data + "deleted");
				found=true;
			}
			else 
				previous=current;
				current=current.next;
		}
		if(!found){
			System.out.println("item wasn't found in list");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
