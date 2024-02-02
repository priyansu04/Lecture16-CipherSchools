package Encapsulation;

import accessmodifiers1.A;

class demo {
    private int a = 5;
    private int b = 10;
    private int c = 15;
    private int d = 25;

    public int getA()//getter
    {
        System.out.println("Value of A read");
        return this.a;
    }

    public int getB() {
        System.out.println("Value of B read");
        return this.b;
    }

    public void setA(int a) {
        if (a>100){
            this.a = a;
            System.out.println("Value of A changed to :" +a);
        }
        else {
            System.out.println("Cannot set - value outside limits");
        }

    }

    public void setB(int b) {
        this.b = b;
    }
}
public class EncapStudy  {
    public static void main(String[]args){
        demo d = new demo();
//        System.out.println(a); not visible because private.
        System.out.println(d.getA());
        d.setA(100);
        System.out.println(d.getA());
    }
}
