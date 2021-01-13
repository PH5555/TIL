package Study;

import java.util.Scanner;

public class codeUp_4011 {
	public static void main(String[] args) {
		String[] arr = new String[2];
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		arr = s.split("-");
		
		int gender = arr[1].charAt(0) - '0';
		System.out.print(result(gender, arr[0]));
	}
	
	public static String result(int gender, String year) {
		
		String result = "";
		
		switch(gender) {
		case 1 : result = "19" + year.substring(0, 2) + "/" + year.substring(2, 4) + "/" + year.substring(4, 6) + " M";
				 break;
		case 2 : result = "19" + year.substring(0, 2) + "/" + year.substring(2, 4) + "/" + year.substring(4, 6) + " F";
				 break;
		case 3 : result = "20" + year.substring(0, 2) + "/" + year.substring(2, 4) + "/" + year.substring(4, 6) + " M";
				 break;
		case 4 : result = "20" + year.substring(0, 2) + "/" + year.substring(2, 4) + "/" + year.substring(4, 6) + " F";
				 break;
		}
		
		return result;
	}
}
