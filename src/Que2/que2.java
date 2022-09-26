package Que2;

import java.util.Scanner;

public class que2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		StringBuilder str = new StringBuilder();
		while(true) {
			a = sc.next();
			if(a.equals("XDONE"))
				break;
			else {
				str.append(a+" ");
			}
		}
		System.out.print(str);
	}

}
