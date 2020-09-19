
package productsinfo;

public class Products {
    private int productId;
    private String productName;
    private double productPrice;
    private static int count = 0;
    Products(){
        this.productId = -1;
        this.productName = "NULL";
        this.productPrice = 0.0;
        count++;
    }
    Products(int productId, String productName, double productPrice){
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        count++;
    }
    public String toString(){
        return "Product Details:\nproductId: "+this.productId+" productName: "+this.productName+
                " productPrice: "+this.productPrice;
    }
    public double toComparePrice(Products P){
        if(this.productPrice > P.productPrice){
            return 1;
        }
        else if(this.productPrice == P.productPrice){
            return 0;
        }
        else{
            return -1;
        }
    }
    public double getPrice(){
        return this.productPrice;
    }
    public  boolean isExpression(){
        if(this.productPrice > 1000 ){
            return true;
        } else {
            return false;
        }
    } 
    public static int getCount(){
        return count;
    }
    
}
