
package productsinfo;

public class Main {
    public static void main(String[] args) {
        Products p1 = new Products(12, "Rice", 62);
        Products p2 = new Products(14, "Noodles", 90);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p1.toComparePrice(p2));
        System.out.println();
        System.out.println("first product price: "+p1.getPrice());
        System.out.println("second product price: "+p2.getPrice());
        System.out.println();
        System.out.println(p2.isExpression());
        System.out.println();
        Products []p3 = new Products[5];
        for (int i = 0; i < 5; i++) {
            p3[i] = new Products(i*1+17, "Rice", (120+Math.random()*880));
            System.out.println(p3[i].toString());
        }
        System.out.println("Number of Products: "+Products.getCount());
    }
    
}
