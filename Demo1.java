package day5;

import java.util.Scanner;

class Node
{
	int data;
	Node prev;
	Node next;
	Node(int val)
	{
		this.data=val;
		this.prev=null;
		this.next=null;
	}
}

class Double
{
	Node head;
	
	public void insertend(int x)
	{
		Node n1=new Node(x);
		if(head==null)
		{
			head=n1;
			return;
		}
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=n1;
		n1.prev=curr;
	}
	
	public void insertfirst(int x)
	{
		Node n1=new Node(x);
		n1.next=head;
		head.prev=n1;
		head=n1;		
	}
	public void insertmid(int index,int value)
	{
		Node n1=new Node(value);
		int i=1;
		Node curr=head;
		while(i<index)
		{
			curr=curr.next;
			i++;
		}
		n1.prev=curr;
		n1.next=curr.next;
		curr.next=n1;
	}
	public void insertlast(int x)
	{
		Node n1=new Node (x);
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=n1;
		n1.prev=curr;
	} 
	public void delelast()
	{
		Node temp=null;
		Node curr=head;
		while(curr.next!=null)
		{
			temp=curr;
			curr=curr.next;
		}
		temp.next=null;
	}
	public void delefirst() {
		head=head.next;
		head.prev=null;
	}
	public void delemid(int index)
	{
		Node temp=null;
		Node curr=head;
		int i=1;
		while(i<index)
		{
			temp=curr;
			curr=curr.next;
			i++;
		}
		curr.next=temp;
		curr.prev.next=temp;
		
		
	}
	public void reverse()
	{
		
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		while(curr!=null)
		{
			System.out.println(curr.data+" ");
		curr=curr.prev;
		}

	}
	public void  display()
	{
		if(head==null)
		{
			System.out.println("is empty");
			return;
		}
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" ");
			curr=curr.next;
		}
	}

}


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d1=new Double();
		Scanner scanner=new Scanner(System.in);
		int value=scanner.nextInt();
		for(int i=0;i<value;i++)
		{int b=scanner.nextInt();
		d1.insertend(b);
		}
		d1.display();
		d1.insertfirst(23);  
		d1.display();
		d1.insertmid(2,200);
		d1.display();
	d1.delelast();
		d1.delefirst();
		d1.delemid(2);
		d1.insertlast(67);
		d1.display();
		d1.reverse();
		d1.display();
		

	}

}

