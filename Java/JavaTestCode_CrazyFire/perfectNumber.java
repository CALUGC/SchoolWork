import java.util.Scanner;

public class perfectNumber{
	public static int perfectNum( int input ){
		int sum = 0;
		for( int i = 1; i < input; i++ ){
			if( input % i == 0 ){
				sum += i;
			}
		}
		if( sum == input ){
			return sum;
		}
		else{
			return 0;
		}
	}

	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		int getinput = input.nextInt();

		for( int i = 1 ; i <= getinput; i++ ){
			if( perfectNum(i) == 0 ){
				continue;
			}
			else{
				System.out.println( perfectNum(i) );
			}
		}
	}
}