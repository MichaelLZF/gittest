package advanced;

import java.util.Scanner;

public class Main1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a+b;
		if(sum<0){
			System.out.print("-");
		}
		sum = Math.abs(sum);
		//格式化输出
		System.out.printf("%,d",sum);
	}

}
