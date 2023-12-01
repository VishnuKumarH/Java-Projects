import java.util.Scanner;
public class LastCharacter {

	public static void main(String[] args) {
		System.out.println("enter limit");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		System.out.println("enter elements");
		
		char [] arr = new char[limit];
		for(int i=0;i<limit;i++) {
			arr[i]=sc.next().charAt(0);
		
		}for (int i=0;i<limit;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("enter n");
				int n=sc.nextInt();
		
		char result='\0';
		for (int i=0;i<limit;i++)
		{
			int count =0;
			for(int j=0;j<limit;j++)
			{
				if (arr[i]==arr[j])
				
					count++;
				}
				if (count==n) 
				{
					System.out.println(arr[i]+"is eligible");
					 result = arr[i];
				}
		}
				if(result!='\0')
					System.out.println(result);
				else
					System.out.println(-1);
			}
		}
	

	


