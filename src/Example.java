public class Example {
    static int i=5;
    private int speed;
    void addI(){
        speed+=1;
    }
     static void method(){
         System.out.println(i);
    }
    static void methodTwo(int i,float f,boolean b, Object o,String s){
        System.out.println(i);
        System.out.println(f);
        System.out.println(b);
        System.out.println(o);
        System.out.println(s);
    }
    static void methodThree(int... j){
        for (int k:j) {
            System.out.println(k);
        }
    }
    static Object methodFour(){
        return new Object();
    }
}

class OtherExampleClass  extends Example{
    public static void main(String[] args) {
        Example.method();
        Example.methodTwo(1237, 123.123f,true,new Object(),"Hello world !!!");
        Example.methodThree(2,3,4,125,52,3,6,624,2,34,43,1,235,6523,123);
        System.out.println(Example.methodFour());
    }
}