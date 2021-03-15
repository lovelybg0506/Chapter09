package part01.sec02.exam01;

class Avg{
	String name;
	int avg;
	
	public String average(int kor,int eng) {
		avg=(kor+eng)/2;
		
		return name+" - "+avg;
	}
}

public class AvgTest_01 {

	public static void main(String[] args) {
			Avg student1=new Avg();
			Avg student2=new Avg();
			
			student1.name="김철수";
			student2.name="김영희";
			
			String st1_avg=student1.average(100, 90);
			System.out.println("국어 영어 평균은:"+st1_avg);
			
			String st2_avg=student2.average(50, 40);
			System.out.println("국어 영어 평균은:"+st2_avg);
			
			
	}

}
