import java.util.Scanner;

public class palindromicNum{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		int changeNum = 0;
		int workNum = 0;
		while( input.hasNext() ){
			changeNum = 0;
			int inputNum = input.nextInt();
			workNum = inputNum;
			
			while( workNum > 0 ){
				changeNum *= 10;
				changeNum += workNum % 10;
				workNum /= 10;
			}
			if( changeNum == inputNum ){
				System.out.printf("%d is a palindromic number\n", changeNum);
			}
			else{
				System.out.printf("%d is not a palindromic number\n", changeNum);
			}
		}
	}
}