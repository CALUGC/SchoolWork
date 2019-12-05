// import the Scanner library
import java.util.Scanner;

public class LCM{
	public static int GCDWork( int a, int b ){
		return b == 0 ? a : GCDWork( b, a % b );
	}

	public static int LCMWork( int a, int b ){
		return a * b / GCDWork( a, b );
	}

	public static void main( String[] args ){
		// create Scanner
		Scanner input = new Scanner( System.in );
		
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println( LCMWork( a, b ) );
	}
}