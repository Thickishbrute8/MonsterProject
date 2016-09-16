package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
public class MonsterController
{
	private Scanner keyboardInput;
	private MarshmallowMonster firstMonster;

	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Jimbo", 4 ,2 , false , 2 , 0 );
		 keyboardInput = new Scanner(System.in);
	}
		public void start()
		{ 
		System.out.println("here is my monster: " + firstMonster);
		System.out.println("My monster has this many eyes: " + firstMonster.getEyeCount());
//		if(firstMonster.getEyeCount() > 3)
//		{
//			System.out.println("Thats a lot of eyes!!!!! - Scary");
//		}
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase ("yes"))		{
			System.out.println("what do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		else
		{
			System.out.println("Fine, dont change my name!!! >:(");
		}
		System.out.println(firstMonster);
		}
	}