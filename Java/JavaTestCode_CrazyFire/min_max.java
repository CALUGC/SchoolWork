import java.util.Scanner;

public class min_max{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);
		
		int max = -10000, min = 10000;

		for( int i = 0; i < 3; i++ ){
			int getinput = input.nextInt();
			
			// if( getinput > max ){
			// 	max = getinput;
			// }
			// if( getinput < min ){
			// 	min = getinput;
			// }

			max = Math.max( max, getinput );
			min = Math.min( min, getinput );
		}

		System.out.println(max);
		System.out.println(min);
	}
}