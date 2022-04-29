public class Example1 {

    public static void main(String[] args) {
//        method(1);
        Number val = 40;
        method((Integer) val);

    }


    static void method(Object val) {
        System.out.println("void");
    }

    static void method(Integer val) {
        System.out.println("Val");
    }

    static void method(int val) {
        System.out.println("Val");
		System.out.println("Hello world");
    }

    static void method1() {

    }

}
// hello from parent repos
