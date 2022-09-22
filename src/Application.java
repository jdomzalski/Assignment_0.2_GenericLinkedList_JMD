/**
 * This is our Application class where we will test the project
 */



public class Application {
	public static void main(String[] args) {
		
		/**
		 * Code below was provided to us through Professor Johnson
		 */	
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData(1);
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData(2);
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		/**
		 * Creating a new LinkedList that is parameterized with type String and adding nodes to the list
		 */
		LinkedList<String> myGenericList = new LinkedList<String>();
		Node bNode = new Node();
		bNode.setData("Hello");
		myGenericList.addNode(bNode);
		bNode = new Node();
		bNode.setData("My name is Josh!");
		myGenericList.addNode(bNode);
		myGenericList.addNode(bNode);
		
		/**
		 * Using a do while loop to print the list
		 */
		Node gentempnode = myGenericList.getList();
		do
		{
			System.out.println(gentempnode.getData());
			gentempnode = gentempnode.getNextNode();
		}while (gentempnode != null);
		
		
		

	}//end main

}//end class



