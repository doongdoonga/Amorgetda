package org.Amorgetda.day07.oop;

class StaticSample {
	public int num;
	public static int input;
	
	public void sampleMethod() {}
	
	public void goodMethod() {}

	public static void originMethod() {
		input = 2024;
	}
}



public class Exam_Static {

	public static void main(String[] args) {
		StaticSample.input = 1023;
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
//		StaticSaple smp = new StaticSample();
//		smp.num = 5=7;
//		smp.sampleMethod();
//		smp.goodMethod();

		
	}

}
