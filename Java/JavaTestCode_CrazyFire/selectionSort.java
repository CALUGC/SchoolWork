import java.util.Scanner;

public class selectionSort{
	public static void main( String[] args ){
		Scanner input = new Scanner(System.in);

		int inputNum, _min, temp;
		int[] arr = new int[20000];
		while(true){
			inputNum = input.nextInt();
			if( inputNum <= 0 ){
				break;
			}
			for( int i = 0; i < inputNum; i++ ){
				arr[i] = input.nextInt();
			}
			for( int i = 0; i < inputNum; i++ ){
				_min = i;
				for( int j = i; j < inputNum; j++ ){
					if( arr[_min] >= arr[j] ){
						_min = j;
					}
				}
				temp = arr[i];
				arr[i] = arr[_min];
				arr[_min] = temp;
			}
			
			for( int i = 0; i < inputNum; i++ ){
				System.out.printf("%d ", arr[i]);
			}
			System.out.printf("\n");
		}
	}
}