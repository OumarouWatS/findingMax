import java.util.*;

public class classWorkFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		double theMax;
		
		try (Scanner sc = new Scanner(System.in))
		{
		System.out.println("enter how many numbers to get the maximum value out of:");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter "+n+" numbers");
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
		theMax=findingMax(a,n);
		}
		System.out.println("The maximum value is:"+theMax);
		}
		
		public static double findingMax(int a[],int n)
		{
		int theMax=a[0];
		for(int i=1;i<n;i++){
			if(a[i] >= theMax) {
				theMax = a[i];
			}
		}
		return theMax;
		}


	}

