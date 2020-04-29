package com.klab.datastructure.linkedlist;

public class Runner {

	public static void main(String[] args) {
		/*SinglyLinkedList<MountainRoute> l = new SinglyLinkedList<>();
		MountainRoute mr1 = new MountainRoute("Area1");
		MountainRoute mr2 = new MountainRoute("Area2");
		MountainRoute mr3 = new MountainRoute("Area3");
		l.add(mr1);
		l.add(mr2);
		l.add(mr3);
		l.printNodes();*/
		
		DoublyLinkedList<MountainRoute> dl = new DoublyLinkedList<>();
		MountainRoute mr4 = new MountainRoute("Area1");
		MountainRoute mr5 = new MountainRoute("Area2");
		MountainRoute mr6 = new MountainRoute("Area3");
		MountainRoute mr7 = new MountainRoute("Area4");
		
		dl.add(mr4);
		dl.add(mr5);
		dl.add(mr6);
		dl.add(mr7);
		
		//dl.printNodes();
		//System.out.println(dl.getSize());
		
		MountainRoute mr8 = new MountainRoute("Area5");
		dl.add(mr8);
		//System.out.println(dl.getSize());
		//dl.printNodes();
		
		MountainRoute mr9 = new MountainRoute("Area6");
		dl.addBigginigOfTheNode(mr9);
		//System.out.println(dl.getSize());
		//dl.printNodes();
		
		MountainRoute mr10 = new MountainRoute("Area7");
		dl.addEndOfTheNode(mr10);
		//System.out.println(dl.getSize());
		//dl.printNodes();
		
		MountainRoute mr11 = new MountainRoute("Area8");
		dl.addElementSpecificPosition(1, mr11);
		//System.out.println(dl.getSize());
		//dl.printNodes();
		
		MountainRoute mr12 = new MountainRoute("Area9");
		dl.addElementSpecificPosition(0, mr12);
		//System.out.println(dl.getSize());
		//dl.printNodes();
		
		MountainRoute mr13 = new MountainRoute("Area10");
		dl.addElementSpecificPosition(9, mr13);
		System.out.println(dl.getSize());
		dl.printNodes();
		
		
		

	}

}
