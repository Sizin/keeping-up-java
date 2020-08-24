import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UseNewApiStream {

    /**
     * takeWhile garde chaque element qui valide son prédicat.
     * Elle s'arrête dès qu'un element ne valide pas le prédicat.
     * Retourne un Stream des element qui matches.
     * Les autres elements du stream ne sont pas gardés
     */
    public static void useTakeWhileMethod() {
        List<Integer> list
                = Stream.of(1,2,10,4,5,6,7,8,9,3)
                .takeWhile(i -> i < 6).collect(Collectors.toList());
        System.out.println(list); // [1, 2]
    }

    public static void useDropWhileMethod() {
        List<Integer> list
                = Stream.of(1,2,3,4,5,6,7,3,9,10)
                .dropWhile(i -> i < 3).collect(Collectors.toList());
        System.out.println(list); // [6, 7, 8, 9, 10]
    }
}
