package Self_Prep;

public class Prime_number_between_1_to_100 {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int count=0;
			for(int j=1;j<i-1;j++)
			{
				if(i%j==0)count+=1;
			}
			System.out.print((count<2)? " "+i:"");
		}
	}

}
