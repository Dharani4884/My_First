package alpha;

public class methods  {

	public static void main(String[] args) {
	int n=20;
	int sum=0;
	int count=0;
	int sum1=0;
	int count1=0;
	System.out.println("Even numbers from 1 to " + n + " are:");
	for (int i=0; i <=n; i++)
		if (i % 2==0) {
	System.out.println("Even number is :" + i);	
	sum=sum+i;
	count=count+i;
		}
		
else
	{
	System.out.println("odd number is :" + i);	
	sum=sum+i;
	count=count+i;
		
	}
System.out.println("total sum of even values :" + sum);	
System.out.println("total count of even no :" + sum);	
System.out.println("total sum of odd values :" + sum);	
System.out.println("total count of even no :" + sum);	
}
}
