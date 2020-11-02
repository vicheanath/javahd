class A {
    static int x,y;
    static int sum(){
        return x + y;
    }
}

public class EME5{
    public static void main(String[] args) {
        A ob = new A();
        ob.x = 11; ob.y = 23;
        System.out.println("x = "+ ob.x);
        System.out.println("y = " + ob.y);
        System.out.println("sum = " + ob.sum());
        A.x = 20; 
        A.y = 30;
        System.out.println("sum = " + A.sum());
        A ob2 = new A();
        System.out.println("x = " + ob2.x);
        System.out.println("y = " + ob2.y);
        System.out.println("sum = " + ob2.sum());
    }
}