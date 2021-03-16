package part01.sec02.exam08;

public class Imsi_08 {

	public static void main(String[] args) {
		Employer_06 emr=new Employer_06(3000);
		Employee_07 eme=new Employee_07(0);
		
		emr.payForWork(eme, 1000);
		emr.showMyMoney();
		eme.showMyMoney();
	}

}
