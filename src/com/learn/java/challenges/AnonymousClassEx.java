package com.learn.java.challenges;

class Pizza
{
	public void pizza()
	{
		System.out.println("pizza");
	}
}
public class AnonymousClassEx {
	static Pizza pizza=new Pizza() {
		public void pizza() {
			System.out.println("anonymous pizza");
		}
	};
	public static void main(String[] args) {
try {
	pizza.pizza();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
