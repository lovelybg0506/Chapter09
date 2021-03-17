package part01.sec02.exam09;

import java.util.Scanner;

class SungJuk {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private int rank;

	SungJuk(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.tot = kor + eng;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getTot() {
		return tot;
	}

	public int getRank() {
		return rank;
	}

	public void clearRank() {
		rank = 1;
	}

	public void plusRank() {
		rank++;
	}

	void disp() {
		System.out.println(name + "님의 총점은 " + tot + "점이고, 순위는 " + rank + "등 입니다.");
	}

}

public class Problem_03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("학생 수 입력: ");
		int inwon = in.nextInt();

		SungJuk sj[] = new SungJuk[inwon];

		for (int i = 0; i < sj.length; i++) {
			System.out.print(i + 1 + "번째 학생의 이름 : ");
			String name = in.next();
			System.out.print(i + 1 + "번째 학생의 국어점수 : ");
			int kor = in.nextInt();
			System.out.print(i + 1 + "번째 학생의 영어점수 : ");
			int eng = in.nextInt();

			sj[i] = new SungJuk(name, kor, eng);
//			int tot = kor + eng;
//			sj[i].setTot(tot);
//			sj[i].getTot();
		}

		for (int i = 0; i < sj.length; i++) {
			sj[i].clearRank();
			for (int j = 0; j < sj.length; j++) {
				if(sj[i].getTot()<sj[j].getTot()) {
					sj[i].plusRank();
				}
			}
		}
		for (int i = 0; i < sj.length; i++) {
			sj[i].disp();

		}
	}
}
