import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessApiImprovments {
    /***
     * Java has improved its process API in Java 9 version that helps to manage and control operating system processes.
     *
     * In earlier versions, it was complex to manage and control operating system processes by using Java programming.
     * Now, new classes and interfaces are added to perform this task.
     *
     * New methods are added to the java.lang.Process class that are tabled below.
     */
    public static void monitorJvmProcess() {
        ProcessHandle currentProcess = ProcessHandle.current();     // Current processhandle
        ProcessHandle.Info currentProcessInfo = currentProcess.info();

        System.out.println("ProcessHandle arguments : " + currentProcessInfo.arguments());
        System.out.println("ProcessHandle command line : " + currentProcessInfo.commandLine());
        System.out.println("ProcessHandle start time : " + currentProcessInfo.startInstant());
        System.out.println("ProcessHandle CPU Usage : " + currentProcessInfo.totalCpuDuration());

        System.out.println("Process Id: "+currentProcess.pid());    // Process id
        System.out.println("Direct children: "+ currentProcess.children()); // Direct children of the process
        System.out.println("Class name: "+currentProcess.getClass());       // Class name
        System.out.println("All processes: "+ProcessHandle.allProcesses()); // All current processes
        System.out.println("Process info: "+currentProcess.info());         // Process info
        System.out.println("Is process alive: "+currentProcess.isAlive());
        System.out.println("Process's parent "+currentProcess.parent());  // Parent of the process

        ProcessHandle.current().children().forEach(procHandle -> {
            System.out.println("Child Process pid : " + procHandle.pid());
            System.out.println("Killing the process : " +  procHandle.destroy());
        });
    }

}
