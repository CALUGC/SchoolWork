import java.util.Scanner;

public class matrixMult{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		int[][] matrixA = new int[2][2];
		int[][] matrixB = new int[2][2];
		int[][] matrixC = new int[2][2];

		for( int i = 0; i < 2; i++ ){
			for( int j = 0; j < 2; j++ ){
				matrixA[i][j] = input.nextInt();
			}
		}
		for( int i = 0; i < 2; i++ ){
			for( int j = 0; j < 2; j++ ){
				matrixB[i][j] = input.nextInt();
			}
		}
		for( int i = 0; i < 2; i++ ){
			for( int j = 0; j < 2; j++ ){
				matrixC[i][j] = 0;
			}
		}
		
		for( int i = 0; i < 2; i++ ){
			for( int j = 0; j < 2; j++ ){
				for( int k = 0; k < 2; k++ ){
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}

		for( int i = 0; i < 2; i++ ){
			for( int j = 0; j < 2; j++ ){
				System.out.printf("%d ",matrixC[i][j]);
			}
			System.out.printf("\n");
		}
	}
}
