package com.learn.java.challenges;

public interface IntNumber {
void ins(int item);
int delt();

}

class HackerEarth implements IntNumber
{
	private int stack[];
	private int pos;
	
	HackerEarth(int size)
	{
		stack=new int[size];
		pos=-1;
	}

	@Override
	public void ins(int item) {
		// TODO Auto-generated method stub
		if(pos==stack.length-1)
		{
			System.out.println("Overflow");
		}
		else
		{
			stack[++pos]=item;
		}
	}

	@Override
	public int delt() {
		// TODO Auto-generated method stub
		if(pos<0)
		{
			System.out.println("Underflow");
			return 0;
		}else
		{
			return stack[pos--];
		}
		
	}
	
}

