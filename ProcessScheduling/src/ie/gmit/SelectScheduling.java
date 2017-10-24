package ie.gmit;

import java.util.*;

public class SelectScheduling {
	
	
	
	public void userInput(){
		
		
		Scanner sn1 = new Scanner(System.in);
		Scanner sn2 = new Scanner(System.in);
		Scanner sn3 = new Scanner(System.in);
		
		//Asking user how much processes they wish to enter
		System.out.println("Please enter how many processes you wish to enter..");
		int processCount = sn1.nextInt();
		
		
		
		for(int i = 0; i < processCount; i++){
			
		
			System.out.println(processCount);
			
			System.out.println("=======================================================");
			System.out.println("Enter the process name and burst time for the process");
			System.out.println("=======================================================");
			
			//Entering process name
			System.out.println("Enter the process name: ");
			int processName = sn2.nextInt(); 
			
			//Entering Burst Time
			System.out.println("Enter the burst time for the process: " + processName);
			int burstTime = sn3.nextInt();
			
			//Displaying what has been entered(for testing)
			System.out.println("You have entered: " + processName + " - " + burstTime);
		}
		
		select();
		
		//closing scanners
		sn1.close();
		sn2.close();
		sn3.close();	
	}
	public void select(){
		
		Scanner sn = new Scanner(System.in);
		
		System.out.println("======================");
		System.out.println("Plese enter which Process Schedul you wish to use.");
		System.out.println("Press 1: Round Robin");
		System.out.println("Press 2: FCFS");
		System.out.println("Press 3: SJF");
		System.out.println("Press 4: Exit");
		System.out.println("======================");
		
		int option = sn.nextInt();
		
		switch (option) {
		case 1:
			System.out.println("You have selected Round Robin");
			break;
		case 2:
			System.out.println("You have selected FCFS");
			break;
		case 3:
			System.out.println("You have selected SJF");
			break;
		case 4:
			System.out.println("Goodbye");
			break;

		default:
			System.out.println("Invalid Option");
			break;
		}
		
		sn.close();
	}
	
}
