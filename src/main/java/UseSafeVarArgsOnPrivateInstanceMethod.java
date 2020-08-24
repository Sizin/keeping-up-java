import java.util.ArrayList;
import java.util.List;

public class UseSafeVarArgsOnPrivateInstanceMethod {

    /***
     * It is an annotation which applies on a method or constructor that takes varargs parameters.
     * It is used to ensure that the method does not perform unsafe operations on its varargs parameters.
     * It was included in Java7 and can only be applied on
     *
     *     Final methods
     *     Static methods
     *     Constructors
     *
     * From Java 9, it can also be used with private instance methods.
     */
    public static void useSafeVarArgs() {
        UseSafeVarArgsOnPrivateInstanceMethod p = new UseSafeVarArgsOnPrivateInstanceMethod();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablettezerre");
        p.display(list);
    }

    // Note: The @SafeVarargs annotation can be applied only to methods that cannot be overridden.
    // Applying to the other methods will throw a compile time error.
    @SafeVarargs
    private void display(List<String>... products) {
        for (List<String> product : products) {
            System.out.println(product);
        }
    }

}
