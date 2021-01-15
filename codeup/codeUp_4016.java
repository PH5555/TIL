package Study;

import java.util.Scanner;

public class Main {
	
	static int result;
	
	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] nums = new String[3];
		int[] num = new int[3];
		nums= str.split(" ");
		
		for(int i = 0; i < 3; i++) {
			num[i] = Integer.parseInt(nums[i]);
		}
		fun(num[0], num[1], num[2]);
		System.out.print(result);
	}
	
	static void fun(int a, int b, int c) {
		int d = f(a, b);
		int e = f(b, c);
		int f = f(a, c);
		
		if(d == e && e == f) {
			result =  d;
			return;
		} else {
			fun(d, e, f);
		}
	}
	
	static int f(int a, int b) {
		int max = max(a, b);
		int min = min(a, b);
		
		while(true) {
			if(max % min == 0) {
				return min;
			}else {
				int temp = max;
				max = min;
				min = temp % min;
			}
		}
	}
	
	static int min(int a, int b) {
		return a > b ? b : a;
	}

	static int max(int a, int b ) {
		return a > b ? a : b;
	}
}
