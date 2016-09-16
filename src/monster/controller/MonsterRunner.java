package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterRunner
{
	
	private MarshmallowMonster firstMonster;

	public MonsterRunner()
	{
		firstMonster = new MarshmallowMonster("Jimbo",
				4,
				2,
				false,
				2,
				0
				);
	}
		public void start()
		{ 
		System.out.println("here is my monster: " + firstMonster);
		System.out.println("My monster has this many eyes: " + firstMonster.getEyeCount());
		if(firstMonster.getEyeCount() > 3)
		{
			System.out.println("Thats a lot of eyes!!!!! - Scary")
		}
 		}
		

	}


