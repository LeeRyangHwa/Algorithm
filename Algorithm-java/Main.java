package StackNQueue;

public class Main {
	//스택 큐 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList list = new LinkedList();
//		
//		list.add(100);
//		list.add(200);
//		list.add(300);
//		list.add(100);
//		System.out.println(list.isCyclic());

		NodeEx numbers = new NodeEx();
		numbers.addFirst(30);
		numbers.addFirst(20);
		numbers.addFirst(10);
		
		numbers.addLast(20);
		numbers.addLast(300);
		System.out.println(numbers.node(3));
		numbers.remove(3);
		System.out.println(numbers.node(3));
		
		
	}

}
