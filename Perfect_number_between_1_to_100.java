package Self_Prep;

public class Perfect_number_between_1_to_100 {

	public static void main(String[] args) {
		
		for(int i=2;i<100;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			System.out.print((sum==i)? i+" is a perfect number\n":"");
		}

	}

}
