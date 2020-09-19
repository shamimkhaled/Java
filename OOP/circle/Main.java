package circle;

public class Main {

    public static void main(String[] args) {
        CircleComparable cm1 = new CircleComparable(6);
        CircleComparable cm2 = new CircleComparable(5);
        System.out.println(cm1.toString());
        System.out.println(cm1.compareTo(cm2));// 1
        System.out.println(max(cm1,cm2));// radius=6.0  area=113.09733 perimeter=37.69911
        System.out.println(equals(cm1,cm2));// false
        System.out.println();
        CircleComparable[] cm = new CircleComparable[3];
        cm[0] = new CircleComparable(8);// 8 201.061 50.265
        cm[1] = new CircleComparable(9);// 9.0 254.469 56.548
        cm[2] = new CircleComparable(7);// 7.0 153.938 45.982
        for (Circle cm3 : cm) {
            System.out.println(cm3);
        }

    }

    public static CircleComparable max(CircleComparable obj1, CircleComparable obj2) {
        switch (obj1.compareTo(obj2)) {
            case 1:
                return obj1;
            case -1:
                return obj2;
            default:
                return obj1;
        }
    }
    
    public static boolean equals(CircleComparable obj3, CircleComparable obj4) {
        return obj3.getArea() == obj4.getArea();
}
}