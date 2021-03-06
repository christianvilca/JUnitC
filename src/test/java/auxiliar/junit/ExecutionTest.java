package auxiliar.junit;

import org.junit.Test;
//import org.junit.FixMethodOrder;
//import org.junit.runners.MethodSorters;

// Especifica ciertos ordenes de metodos
//@FixMethodOrder(MethodSorters.DEFAULT)
//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ExecutionTest {

	// Es peligroso poner static en test, pero no siempre
	private static int staticMember = 7;
	
	private int instanceMember;
	
	public ExecutionTest() {
		instanceMember = 555;
		System.out.println("New object: " + this);
	}
	
	@Test
	public void test5(){
		System.out.println("5> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("5< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	@Test
	public void test4(){
		System.out.println("4> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("4< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	@Test
	public void test3(){
		System.out.println("3> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("3< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	@Test
	public void test2(){
		System.out.println("2> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("2< instance: " + instanceMember + " and static: " + staticMember);
	}
	
	@Test
	public void test1(){
		System.out.println("1> instance: " + instanceMember + " and static: " + staticMember);
		staticMember++;
		instanceMember++;
		System.out.println("1< instance: " + instanceMember + " and static: " + staticMember);
	}
	
}
