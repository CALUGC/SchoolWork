import java.util.Scanner;

public class determinant{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		int[][] matrix = new int [100][100];

		int matrixSize = input.nextInt();
		for( int i = 0; i < matrixSize; i++ ){
			for( int j = 0; j < matrixSize; j++ ){
				matrix[i][j] = input.nextInt();
			}
		}

		for( int i = 0; i < matrixSize; i++ ){
			for( int j = 0; j < matrixSize; j++ ){
			}
		}
	}
}