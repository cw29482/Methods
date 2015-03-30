import java.util.Scanner;


public class MethodProg1 {
	public static void main(String [] args) {
		output(h(input()));
		output(f(input())+f2(input2()));
		output(g(input())+g2(input2())+g3(input2()));
	
	}
	
	
	public static double h(double x) {
		return Math.pow(x, 10);	
	}
	
	public static int f(int x) {
		return x;
	}
	
	public static int f2(int y) {
		return y;
	}
	
	public static double g(double x) {
		return Math.sqrt(x);
	}
	
	public static double g2(double y) {
		return Math.abs(y);
	}
	
	public static double g3(double z) {
		return Math.pow(z, 10);
	}
	public static void output(double x) {
		System.out.println(x);
	}
	
	public static void output2(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}
	
	public static int input() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number.");
		return keyboard.nextInt();
	}
	
	public static int input2() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter another number.");
		return keyboard.nextInt();
	}
	
}