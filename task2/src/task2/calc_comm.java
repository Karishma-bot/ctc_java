package task2;

public class calc_comm {
	int percentage,com;
	public void calc(commision c)
	{
		if(c.getSales_amt()>=100000)
		{
			percentage=(c.getSales_amt()/100)*10;
			com=c.setSales_amt(percentage);
			System.out.println("the commion amt is:"+com);
			
		}
		else if(50000<=c.getSales_amt() && c.getSales_amt()<100000)
		{
			percentage=(c.getSales_amt()/100)*5;
			com=c.setSales_amt(percentage);
			System.out.println("the commion amt is:"+com);
		}
		else if(30000<=c.getSales_amt() && c.getSales_amt()<50000)
		{
			percentage=(c.getSales_amt()/100)*3;
			com=c.setSales_amt(percentage);
			System.out.println("the commion amt is:"+com);
		}
		else {
			com=c.setSales_amt(0);
			System.out.println("the commion amt is: no commision");
		}
	}
}
