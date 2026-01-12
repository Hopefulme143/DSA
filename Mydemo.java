package day5;

class Node
{
	int data;
	Node  next;
	Node(int val)
	{
		this.data=val;
		this .next=null;
	}
	
}
class Circle{
	Node head;
	public void insert(int val)
	{
		Node n1=new Node(val);
		if(head==null)
		{
			head=n1;
			n1.next=head;
			return;
		}
		Node curr=head;
		while(curr.next!=head)
		{
			curr=curr.next;
		}
		curr.next=n1;
		n1.next=curr;
		}
	public  void print()
	{
		if(head==null)
		{
			System.out.println("empty");
			return;
		}
		Node curr=head;
		do {
			System.out.println(curr.data+" ");
			curr=curr.next;
		}while(curr.next!=head);
	}
}
public class Mydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		c1.insert(12);
		c1.insert(20);

	}

}
