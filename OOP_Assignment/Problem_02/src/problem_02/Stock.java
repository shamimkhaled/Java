
package problem_02;

public class Stock {
   
	private String symbol;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	Stock(){
		
	}
	
	Stock (String symbol,String name){
		this.symbol = symbol;
		this.name = name;
		
	}
	
        public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public double getChangePercent() {
		
		double changePrices = ((this.previousClosingPrice - this.currentPrice)/this.previousClosingPrice)*100;		
		return changePrices;
	}
}
