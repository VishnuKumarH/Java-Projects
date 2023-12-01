import java.util.*;
public class nSmallestElements {

	public static void main(String[] args) {
		System.out.println("enter array limit");
		Scanner sc =new Scanner(System.in);
		int limit = sc.nextInt();
		System.out.println("enter array elements");
		int []arr = new int [limit];
		
		for(int i=0;i<limit;i++)
	{
			arr[i]=sc.nextInt();
			
	}
		System.out.println("array elements are");
			for(int i=0;i<limit;i++) {
				System.out.println(arr[i]);
			}
			System.out.println("enter n");
			int n =sc.nextInt();
			
			int []copyArr = arr.clone();
			
			Arrays.sort(copyArr);
			
			int [] arr2 =new int[n];
			for (int i=0;i<n;i++)
			{
				arr2[i] =copyArr[i];
			}
		for(int i =0;i<limit;i++)
		{
			for (int j=0;j<n;j++)
			{
				if (arr[i]==arr2[j]) {
					System.out.println(arr[i]);
					
				}
			}
		}

	}

}
