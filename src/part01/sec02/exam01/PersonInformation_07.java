package part01.sec02.exam01;

public class PersonInformation_07 {
	private String name="gemini";
	private int age=10;
	private String socialNumber="991223-1234321";
	
	public static void main(String[] args) {
		PersonInformation_07 gemini=new PersonInformation_07();
		gemini.age=20;
		gemini.printInformation();
	}

	public void printInformation() {
		System.out.println(name+":"+age+":"+socialNumber);
	}
	
}
