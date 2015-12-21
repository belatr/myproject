package com.tom;

public class Student {
	private float english;
	private float chinese;
	private float math;
	static int pass = 60;
	public Student(float english, float chinese, float math){
		this.math=math;
		this.chinese=chinese;
		this.english=english;
	}
	public Student(){
		
	}
	
	public Student(int english) {
		//this.english = english;
		this(0, 0, english);
	}
	
	public float getAverage1(){
		float avg =(chinese + english + math)/3;
		return avg;
	};
	
	public void print(){
		System.out.print(math+"\t"+chinese+"\t"+english+"\t"+getAverage1());
	}
	
	protected int getEnglish(){
		return english;
	}
	
	public static void main(String[] args) {
		Student stu1 = new Student(60, 44,  70);
		Student stu2 = new Student(35, 77, 66);
		
		Student.pass = 55;
		stu1.print();
		stu2.print();
		stu1.english = 55;
		System.out.println(Math.max(5, 8));
		System.out.println(Math.random());
		int n = Integer.parseInt("5");
		String s = String.valueOf(n);
//		System.out.println(stu.getAverage());
		//研究生
		GraduaStudent gstu = new GraduaStudent(55, 77, 66, 67);
		gstu.print();			
	}


}
