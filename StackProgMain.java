//Q3:Java program to implement two stacks in a single array.

import java.util.*;
class StackProg{
	int a[];
	int size;
	int top1;
	int top2;

StackProg(int size){
	this.size=size;
	a=new int[size];
	
	top1=size/2+1;
	top2=size/2;
}

public void push1(int val){
	if(top1>0){
		top1--;
		a[top1]=val;
	}
	else
		System.out.println("Stack full"+"by Value :"+ val);
}

public void push2(int val){
	if(top2<size -1)
	{
		top2++;
		a[top2]=val;
	}
	else{
		System.out.println("Stack fulled"+"By value:	"+val);
	}
}
public int pop1(){
	if(top1 <=size/2)
	{
		int temp=a[top1];
		top1++;
		return temp;
	}
	else
		System.out.println("Stack underflow");
	return 0;
}

public int pop2(){
	if(top2>=size/2+1)
	{
		int temp=a[top2];
		top2--;
		return temp;
	}
	else
		System.out.println("Stack underflow");
	return 0;
}

}

public class StackProgMain{
	public static void main(String args[]){
		StackProg sp=new StackProg(10);
		sp.push1(5);
		sp.push2(10);
		sp.push2(15);
		sp.push1(11);
		sp.push2(7);
		sp.push2(40);
		
		System.out.println("Popped element from stack1 is:	"+"=>>"+ sp.pop1());
		
		System.out.println("Popped element from stack2 is:	"+"=>>"+ sp.pop2());
	}
}