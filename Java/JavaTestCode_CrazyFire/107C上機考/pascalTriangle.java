import java.util.Scanner;

public class pascalTriangle{
	static int[][] arr = new int[1000][1000];

	public static void zeroLoop(){
		for( int i = 0; i < 1000; i++ ){
			for( int j = 0; j < 1000; j++ ){
				arr[i][j] = 0;
			}
		}
	}

	public static void pascal_T(){
		for( int i = 0; i < 500; i++ ){
			for( int j = 0; j <= i; j++ ){
				if( j == 0 ){
					arr[i][j] = 1;
				}
				else{
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				}
			}
		}
	}

	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		zeroLoop();
		pascal_T();
		
		while ( input.hasNext() ){
			int floor = input.nextInt();
			int one = input.nextInt();

			System.out.printf("%d\n", arr[floor][one]);
		}
	}
}