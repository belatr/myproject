package com.ibm;

import java.util.Scanner;

public class Person {
	float weight;
	float height;
	public Person(float weight,float height){
		this.weight=weight;
		this.height=height;
	}
	
	public String advice(){
		float bmi = bmi();
		String msg;
		if(bmi<16){
			msg ="多吃點";
		}else if(bmi>25){
			msg ="少吃點";
		}else{
			msg ="正常";
		}
		return msg;
	}
	
	public float bmi(){
		float bmi = weight/(height*height);
		bmi = ((int)(bmi*100)) /100.0f;
		return bmi;
	}
	
	public void sayHello(){
		System.out.println("HELLO");
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入體重");
		String line = scanner.nextLine();
		System.out.println(line);
		System.out.print("請輸入身高");
		line = scanner.nextLine();
		System.out.println(line);
		
		Person p = new Person(65.5f, 1.7f);
		p.sayHello();
		System.out.println(mgs);
	}
}
