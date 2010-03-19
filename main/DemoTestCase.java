package main;

import primitive_wrapers.ODouble;

public class DemoTestCase {
	public static void main(String[] args) {
		//double values[] = {1, 2, 3, 4, 5};
		//boolean flags[] = {true, true, true, true, true};
		//Suvat test = new Suvat(values, flags);
		
		//BasicSuvatTest(test);
		//ResolveTest(test);
		
		double sua[] = {2, 2, 2};
		print(Suvat.Equations.T.sua(sua));
		
	}
	
	static void print_all(Suvat test){
		ODouble var = new ODouble(0);	//stores the value from retrieve function
		char suvat[] = {'s', 'u', 'v', 'a', 't'};
		System.out.println("\n");
		
		//this for loops goes through the suvat variables and outputs them
		for(int i = 0; i < suvat.length; i++){
			if(test.retrieve(suvat[i], var)) print(suvat[i] + " = " + var.val);
			else { print(suvat[i] + " is not declared!"); }
		}
	}
	static void print(Object out){ System.out.println(out);}
	static void BasicSuvatTest(Suvat test){
		//Demonstrates basic usage of suvat class
		print("Test case \"BasicSuvatTest\"!");
		
		print_all(test);
		test.clear('a');
		test.clear('v');
		print_all(test);
		test.set(56.7, 'a');
		test.set(345.86, 's');
		print_all(test);
		
	}
	static void ResolveTest(Suvat test){
		print("Test case \"ResolveTest\"!");
		test.resolve();	//all are set to true
		test.clear('v');
		test.clear('u');
		test.resolve();	//'v' and 'u' unset
	}
}