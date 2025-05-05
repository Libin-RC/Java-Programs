package Self_Prep;

public class SecondSmallestPerfect {

	public static void main(String[] args) {
		int sum=0,firstSmall=Integer.MAX_VALUE,secondSmall=Integer.MAX_VALUE;
        for(int i=1;i<100000;i++ )
        {	
        	sum=0;
        	for(int j=1;j<i;j++)
        	{
        		if(i%j==0)
        		{
        			sum=sum+j;
        		}
        	}
        	if(sum==i) {
        		//System.out.println(sum);
        		if(firstSmall>i) {
					secondSmall=firstSmall;
					 firstSmall=i;
				}
				if(i<secondSmall) {
					secondSmall=i;
				}
        	}
        }
        System.out.println(secondSmall);
	}

}
