package Que4;
import java.util.Scanner;
public class question4 {
	static int r;
	static int c;
	//Sum Column Method
	static void column_sum(int arr[][]) {
		
		for(int i = 0; i<c; i++) {
			int col_sum=0;
			int x = i;
			for(int j = 0; j<r; j++) {
				col_sum += arr[j][i];
			}
			x++;
			System.out.println("Sum of "+x+" Column : " +col_sum);
		}	
	}
	
	//Sum Row Method
	static void row_sum(int arr[][]) {
		for(int i = 0; i<r; i++) {
			int row_sum=0;
			int y=i;
			for(int j = 0; j<c; j++) {
				row_sum += arr[i][j];
			}
			y++;
			System.out.println("Sum of "+y+" Row :" +row_sum);
		}
	}
	public static void main(String[] args)
	{
			Scanner sc = new Scanner(System.in);
			int i, j;
			try {
				System.out.println("Enter Row Size : ");
				r = sc.nextInt();
				System.out.println("Enter Column Size : ");
				c = sc.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int[][] arr = new int[r][c];
			// Get the matrix elements
			int x = 1;
			
			//Array Initialization
			System.out.println("Enter Array Value : ");
			for (i = 0; i < r; i++) {
				for (j = 0; j < c; j++) {
					int a = sc.nextInt();
					arr[i][j] = a;
				}
			}
	
			System.out.println("Array");
			
			//Array
			for(i = 0; i<r ;i++) {
				for(j = 0; j < c; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			column_sum(arr);
			row_sum(arr);
			
		}

}
