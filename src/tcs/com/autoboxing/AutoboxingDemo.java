package tcs.com.autoboxing;

public class AutoboxingDemo {
	public static void main(String[] args) {
		int a =5;
		Integer ref = a;
		int b = ref;
		System.out.println(a == ref);
		System.out.println(a == b);
	}
}
