import java.util.Scanner;

public class determinant{
	public static double deterWork( double m[][], int size ){
		double det = 0;
		double[][] submatrix = new double[1000][1000];
		if( size == 2 ){
			return ((m[0][0] * m[1][1]) - (m[1][0] * m[0][1]));
		}
		else{
			for( int x = 0; x < size; x++ ){
				int subi = 0;
				for( int i = 1; i < size; i++ ){
					int subj = 0;
					for( int j = 0; j < size; j++ ){
						if( j == x ){
							continue;
						}
						submatrix[subi][subj] = m[i][j];
						subj++;
					}
					subi++;
				}
				det += (Math.pow( -1, x ) * m[0][x] * deterWork( submatrix, size - 1));
			}
		}
		return det;
	}
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		double[][] matrix = new double[1000][1000];

		int matrixSize = input.nextInt();
		for( int i = 0; i < matrixSize; i++ ){
			for( int j = 0; j < matrixSize; j++ ){
				matrix[i][j] = input.nextDouble();
			}
		}

		System.out.printf("%.3f\n", deterWork(matrix, matrixSize));
	}
}