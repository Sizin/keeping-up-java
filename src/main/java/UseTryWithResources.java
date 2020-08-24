import util.MyAutoCloseable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UseTryWithResources {

    public void useOldTryWithResources() throws FileNotFoundException {
        // In Java 7, try-with-resources has a limitation that requires resource to declare locally within its block.
        // we can't put resource declared outside the try-with-resource.
        try (FileOutputStream fileStream = new FileOutputStream("sample-text.txt");) { // Resource Declared within resource block
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        } catch (Exception e) { // Handles checked Exception from  new FileOutputStream
            System.out.println(e);
        }
    }

    public void useNewTryWithResources() throws FileNotFoundException {
        // In Java 9, if the resource is referenced by a final or effectively final variable,
        // a try-with-resources statement can manage a resource without a new variable being declared:
        // This doesn't work in java 9<
        FileOutputStream fileStream = new FileOutputStream("sample-text.txt"); //  Resource declared outside the resource block
        try (fileStream) {
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
