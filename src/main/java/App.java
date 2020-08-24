import java.io.FileNotFoundException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        /**
         *  Process API
         */
        ProcessApiImprovments.monitorJvmProcess();

        /***
         * New Version-String scheme containing version of Java
         */
        UseNewVersionStringScheme.useNewVersionScheme();

        /**
         *  Try with resources
         */
        UseTryWithResources utwr = new UseTryWithResources();
        utwr.useOldTryWithResources();

        /**
         *  Interface private methods
         */
        UseNewInterfacePrivateMethod privateInterface = new ImplementPrivateInterface();
        privateInterface.defaultMethod();

        /**
         *  Anonymous Inner Class Type Infering
         */
        UseNewAnonymousInnerClass.useInferingTypeForAnonymousClass();

        /**
         * @SafeVarargs for private instance method
         */
        UseSafeVarArgsOnPrivateInstanceMethod.useSafeVarArgs();

        /**
         * Collection Factory Methods : List.of(), Set.of(), Map.of(), Map.ofEntries()
         */
        UseNewCollectionsFactoryMethods.newCreateList();
        UseNewCollectionsFactoryMethods.newCreateSet();
        UseNewCollectionsFactoryMethods.newCreateMap();
        UseNewCollectionsFactoryMethods.newMapMethodOfEntries();

        /**
         *  Nouveau jshell : Launchable depuis terminal 'user$ jshell'
         *  Console où l'on peux executer du Java
         */

        /**
         * Nouveau jcontrol : Lanchable depuis terminal 'user$ jcontrol'
         * Pannel de Controle Java version graphique
         */

        /***
         * Amélioration Api Stream
         */
        UseNewApiStream.useTakeWhileMethod();
        UseNewApiStream.useDropWhileMethod();
    }
}
