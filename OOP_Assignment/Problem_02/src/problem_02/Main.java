
package problem_02;

public class Main {
    	public static void main(String[] args) {
		Stock stock = new Stock ("ORCL","Oracle Corporation");
		stock.setPreviousClosingPrice(34.5);
                stock.setCurrentPrice(34.35);		
		double percent = stock.getChangePercent();
                percent = (percent*100)/100;
		System.out.printf("Price-change percentage:: %.2f",percent);
                System.out.print("%\n");
	}
}
