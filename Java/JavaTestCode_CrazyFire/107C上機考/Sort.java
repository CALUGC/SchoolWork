import java.util.Scanner;

public class Sort{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		int[] arr = new int[15];
		int temp = 0;

		for( int i = 0; i < 10; i++ ){
			arr[i] = input.nextInt();
		}

		for( int i = 0 ; i < 10; i++ ){
			for( int j = 0; j < 10 - 1 - i; j++ ){
				if( arr[j] > arr[j + 1] ){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for( int i = 0; i < 10; i++ ){
			System.out.printf("%d ", arr[i]);
		}
		System.out.printf("\n");
	}
}