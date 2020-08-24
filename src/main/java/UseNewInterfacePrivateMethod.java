public interface UseNewInterfacePrivateMethod {

    default void defaultMethod() {
        privateMethod();
        privateStaticMethod();
    }

    // private method inside the interface
    private void privateMethod() {
        System.out.println("Hello... I'm private method");
    }

    // Private static method inside interface
    private static void privateStaticMethod() {
        System.out.println("I'm private static method");
    }
}

class ImplementPrivateInterface implements UseNewInterfacePrivateMethod { }

