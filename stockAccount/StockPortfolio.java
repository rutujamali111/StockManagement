package stockAccount;

public class StockPortfolio extends Portfolio
{
	
	 public void stockReport() 
	 {

		 System.out.println("_________________STOCK REPORT_______________");
		 for (int i = 0; i < stockName.size(); i++) 
		 {
			 int total = (numberOfShares.get(i) * sharePrice.get(i));
			 System.out.println("Stock name= " + stockName.get(i) + "\nValue of each share= " + sharePrice.get(i)
			 + "\nTotal value of share= " + total);
			 System.out.println(" ");

		 }
	 }	 
}
