package com.tom;

public class GraduaStudent extends Student{

	int thesis;
	static int pass=70;
	public GraduaStudent(int math, int chinese, int english, int thesis) {
		super(math, chinese, english);
		this.thesis = thesis;
	}
	public GraduaStudent(int english, int thesis) {
		super(english);
		this.thesis = thesis;
	}
	
	
	@Override
	public void print(){
		System.out.print(math+"\t"+chinese+"\t"+english+"\t"+getAverage1());
		if (getAverage1()<pass)
			System.out.print("*");
		System.out.println("\t"+thesis+((thesis<70) ? "*" : ""));
	}
	@Override
	public float getAverage1() {
		// TODO Auto-generated method stub
		return super.getAverage1();
	}
	
}