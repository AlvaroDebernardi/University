public class DynamicDispatching {
    public static void main(String[] args) {
        System.out.println("From Java Programm");
        A instance = new B();
        instance.hello();

        A i2 = new A();
        instance = i2;
        instance.hello();
    }
}

class A {
    public void hello() {
        System.out.println("hello from A!");
    }
}

class B extends A {
    public void hello() {
        System.out.println("hello from B!");
    }
}

