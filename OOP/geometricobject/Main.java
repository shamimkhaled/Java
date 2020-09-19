package geometricobject;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Octagon octa1 = new Octagon("Yellow", true, date, 5);
        System.out.println(octa1.toString());
        Octagon octa2 = (Octagon) octa1.clone();
        System.out.println(octa2);
        int result = octa1.compareTo(octa2);
        switch (result) {
            case 1:
                System.out.println("Octagone is the greater than clone ");
                break;
            case -1:
                System.out.println("Octagone is the less than clone ");
                break;
            default:
                System.out.println("Octagone is the equal clone ");
                break;
        }

    }
}

/*                          *Output*
            Yellow true Sat Dec 22 01:07:59 BDT 2018 5.0
            72.71067811865474 40.0
            Yellow true Sat Dec 22 01:07:59 BDT 2018 5.0
            72.71067811865474 40.0
            Octagone is the equal clone 
*/
