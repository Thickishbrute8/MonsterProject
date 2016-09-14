package monster.controller;

import monster.model.MarshmallowMonster; 

public class MonsterController
{
private MarshmallowMonster firstMonster;

public MonsterController()
{
	firstMonster = new MarshmallowMonster("Jimbo",
			342.324,
			123,
			false,
			2234,
			213
			);
}
	public void start()
	{ 
	System.out.println("here is my monster: " + firstMonster);
	}

}

