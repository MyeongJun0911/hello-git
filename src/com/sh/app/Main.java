package com.sh.app;

import com.sh.animal.Bird;
import com.sh.animal.Cat;
import com.sh.animal.Dog;
import com.sh.animal.Snake;
import com.sh.animal.Tiger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
		
		new Dog().bark();
		new Cat().jump();
		new Tiger().attack();
		new Bird().fly();
		new Snake().crwal();
		
	}
	
	public void test() {
		System.out.println("Main#test");
	}

}
