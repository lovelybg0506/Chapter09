package part01.sec01.exam01;

public class Singleton_04 {

	/*       filed               참조변수명     *//*    자기자신 객체생성   */
	private static Singleton_04 singleton = new Singleton_04();
	
	/*     생성자                       */
	private Singleton_04() {
		
	}
	
	static Singleton_04 getInstance() {
		return singleton;
	}
}
