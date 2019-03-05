import java.util.Scanner;
public class Telemarketer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Follow the instructions in JuniorProblem.pdf
		 * Use the following values to test your program and record your results
		 * 1) 8,6,6,7 Answer
		 * 2) 7,6,6,8 Answer
		 * 3) 9,5,6,9 Answer
		 * 4) 3,4,5,6 Answer
		 * 5) 0,8,8,0 Answer
		 * 6) 8,5,5,9 Ignore
		 * 7) 9,1,1,9 Ignore
		 * 8) 9,9,9,9 Ignore
		 * 9) 9,1,2,8 Answer
		 * 10) 8,7,4,8 Answer
		 * 11) 8,2,2,7 Answer
		 * 12) 1,3,3,9 Answer
		 * 13) 1,0,2,6 Answer
		 */
		int num1=0;
		int num2=0;
		int num3=0;
		int num4=0;
		Scanner in=new Scanner(System.in);
		System.out.println("num1:");
		num1=in.nextInt();
		System.out.println("num2:");
		num2=in.nextInt();
		System.out.println("num3:");
		num3=in.nextInt();
		System.out.println("num4:");
		num4=in.nextInt();
		System.out.println("Phone call");
		if (num1==8||num1==9) { 
			if (num2==num3) {
				if (num4==8||num4==9) {
					System.out.println("Ignore");
				}else {
					System.out.println("Answer");
				}
			}else {
				System.out.println("Answer");
			}
		} else {
			System.out.println("Answer");
		}




	}
}
