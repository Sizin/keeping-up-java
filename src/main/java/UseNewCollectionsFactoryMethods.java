import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UseNewCollectionsFactoryMethods {

    /**
     * Créer une liste de 5 élèments
     */
    public static void oldCreateList() {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("JavaFX");
        list.add("Spring");
        list.add("Hibernate");
        list.add("JSP");
        for(String l : list){
            System.out.println(l);
        }
    }

    /***
     * Factory methods are special type of static methods that are used to create unmodifiable instances of collections.
     * It means we can use these methods to create list, set and map of small number of elements.
     *
     * It is unmodifiable, so adding new element will throw java.lang.UnsupportedOperationException
     *
     * Each interface has it's own factory methods, we are listing all the methods.
     */
    public static void newCreateList() {
        List<String> list = List.of("Java","JavaFX","Spring","Hibernate","JSP");
    }

    /***
     * Java Set interface provides a Set.of() static factory method which is used to create immutable set.
     * The set instance created by this method has the following characteristics.
     *
     *     It is immutable
     *     No null elements
     *     It is serializable if all elements are serializable.
     *     No duplicate elements.
     *     The iteration order of set elements is unspecified and is subject to change.
     *
     * Signature : static <E> Set<E> of(E... elements)
     */
    public static void newCreateSet() {
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
    }

    /***
     * In Java 9, Map includes Map.of() and Map.ofEntries() static factory methods that provide a convenient way to creae immutable maps.
     *
     * Map created by these methods has the following characteristics.
     *
     *     It is immutable
     *     It does not allow null keys and values
     *     It is serializable if all keys and values are serializable
     *     It rejects duplicate keys at creation time
     *     The iteration order of mappings is unspecified and is subject to change.
     */
    public static void newCreateMap() {
        Map<Integer,String> map = Map.of(101,"JavaFX",102,"Hibernate",103,"Spring MVC");
    }

    /***
     * In Java 9, apart from static Map.of() methods, Map interface includes one more static method Map.ofEntries().
     * This method is used to create a map of Map.Entry instances.
     *
     * In the following example, we are creating map instance with the help of multiple map.entry instances.
     */
    public static void newMapMethodOfEntries() {
        // Creating Map Entry
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
        // Creating Map using map entries
        Map<Integer, String> map = Map.ofEntries(e1,e2);
        // Iterating Map
        for(Map.Entry<Integer, String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }



}
