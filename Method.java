package week4;

public class Method {

    static void myMethod(){
        System.out.println("hello this method test");

    }
    static void myMethod2(String fname,int age,int paynumber ){
        System.out.println(fname + " is " + age+ " " + paynumber);
    }

    public static void main(String[] args) {
        myMethod();
        myMethod2("Sharma",40,1245);
    }
}
