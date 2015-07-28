package me.eduard.java;


public class Teste
{
	
	
	public Teste(){
		
		Interface1_8.addStatic();
		
		
	}
	
	
	public interface Interface1_8{ 
		
		static void addStatic() {
			
		}
		
		default void add() {
			
		}
		
	}
	public interface Interface1_7{
		void add();
				

	}
	public class ClasseInterface1_8 implements Interface1_8{
		
		
		public void add() {
		
			Interface1_8.super.add();
		}
		
		
		public ClasseInterface1_8(){

			add();
			Interface1_8.addStatic();
			
		}
		
		
	}
	public class ClasseInterface1_7 implements Interface1_7{

		public void add() {
		
			// TODO Auto-generated method stub
			
		}

		public ClasseInterface1_7(){
			add();
		}

	}
	
	
	
	
	
	
	
	
	
	
	

}
