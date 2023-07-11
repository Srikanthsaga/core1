💡 Q1. What is an Exception in Java?

In Java, an exception is an event that occurs during the execution of a program and disrupts the normal flow of instructions. It represents an error or exceptional condition that may occur and need to be handled. Exceptions can occur due to various reasons, such as invalid inputs, runtime errors, or exceptional situations.

💡 Q2. What is Exception Handling?

Exception handling is the process of dealing with exceptions that occur during the execution of a program. It involves identifying and handling exceptions in a way that allows the program to gracefully recover from errors and continue execution. Exception handling helps in maintaining the stability and reliability of the program.

💡 Q3. What is the difference between Checked and Unchecked Exceptions and Error?

Checked Exceptions: Checked exceptions are exceptions that are checked at compile time. These exceptions are subclasses of the Exception class, excluding subclasses of RuntimeException and Error. Checked exceptions must be declared in the method signature using the throws keyword or handled using a try-catch block. Examples of checked exceptions include IOException and SQLException.

Unchecked Exceptions: Unchecked exceptions, also known as runtime exceptions, are exceptions that are not checked at compile time. They are subclasses of RuntimeException and typically indicate programming errors or unexpected conditions. Unchecked exceptions do not need to be declared in the method signature or explicitly handled. Examples of unchecked exceptions include NullPointerException and ArrayIndexOutOfBoundsException.

Error: Errors are exceptional conditions that occur at runtime and generally indicate unrecoverable problems or issues beyond the control of the program. Errors are subclasses of the Error class, and they usually represent serious problems like OutOfMemoryError or StackOverflowError. Errors should not be caught or handled by normal application code.

💡 Q4. What are the differences between throw and throws in Java?

throw: The throw keyword is used to explicitly throw an exception within a method. It is followed by an instance of an exception class or a subclass of Throwable. When an exception is thrown, the normal flow of the program is disrupted, and the responsibility of handling the exception is transferred to the caller or an appropriate exception handler.

throws: The throws keyword is used in a method declaration to specify the types of exceptions that the method can potentially throw. It is followed by the names of one or more exception classes separated by commas. When a method declares a checked exception using throws, it is indicating that it might propagate that exception to its caller, and the caller should handle it using a try-catch block or propagate it further.

💡 Q5. What is multithreading in Java? Mention its advantages.

Multithreading in Java is the concurrent execution of multiple threads within a single program. A thread is a lightweight unit of execution that represents a sequence of instructions. Multithreading allows multiple threads to run concurrently, resulting in improved program performance and better utilization of system resources.

Advantages of multithreading in Java include:

Increased Responsiveness: Multithreading allows for concurrent execution of tasks, enabling faster response times in applications that involve user interaction or real-time processing.

Improved Performance: By utilizing multiple threads, CPU-intensive tasks can be divided into smaller units of work and executed concurrently, leading to improved program performance and faster execution times.

Enhanced Resource Utilization: Multithreading enables better utilization of system resources, such as CPU cores and memory. It allows multiple tasks to run in parallel, making efficient use of available resources.

Simplified Program Structure: Multithreading helps in organizing complex programs by dividing them into smaller, manageable threads. This promotes code modularity, maintainability, and easier debugging.

Asynchronous Operations: Multithreading facilitates the execution of tasks asynchronously, allowing concurrent processing of independent operations. This is particularly useful in scenarios where parallelism and non-blocking operations are required.

💡 Q6. Write a program to create and call a custom exception.

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("This is a custom exception");
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
l

Output:

This is a custom exception
💡 Q7. How can you handle exceptions in Java?

Exceptions in Java can be handled using a combination of try, catch, and finally blocks. The try block is used to enclose the code that may throw an exception. The catch block is used to catch and handle specific types of exceptions. The finally block is used to define code that should be executed regardless of whether an exception occurred or not.

Here's an example of exception handling in Java:

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handling specific exception
            System.out.println("Error: Division by zero");
        } finally {
            // Code to be executed regardless of exceptions
            System.out.println("Cleanup code");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}

Output:
Error: Division by zero

💡 Q8. What is a Thread in Java?

In Java, a thread is a separate execution path or a lightweight process within a program. It represents a sequence of instructions that can run concurrently with other threads. Each thread has its own stack and program counter, allowing it to execute code independently.

Java threads are used to achieve concurrent execution, enabling multiple tasks or activities to progress simultaneously within a single program. Threads can execute code concurrently or in parallel, depending on the underlying hardware and the programming techniques used.

Threads in Java are managed by the Java Virtual Machine (JVM) and provide a way to achieve multitasking and responsiveness in applications.

💡 Q9. What are the two ways of implementing threads in Java?

In Java, there are two ways to implement threads:

Extending the Thread class: In this approach, a class extends the Thread class and overrides the run() method to define the code that will be executed by the thread. The class can then be instantiated, and the thread is started by calling the start() method.

Example:


class MyThread extends Thread {
    @Override
    public void run() {
        // Code to be executed by the thread
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
Implementing the Runnable interface: In this approach, a class implements the Runnable interface and provides an implementation for the run() method. The class is then passed as an argument to the Thread constructor, and the thread is started by calling the start() method.

Example:

java
Copy code
class MyRunnable implements Runnable {
    @Override
    public void run() {
        // Code to be executed by the thread
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}
Both approaches allow you to create and start threads in Java. The second approach of implementing the Runnable interface is generally preferred because it promotes better separation of concerns and allows for better code reusability and flexibility.

💡 Q10. What do you mean by garbage collection?

Garbage collection in Java is the automatic process of reclaiming memory occupied by objects that are no longer in use or no longer reachable by the program. It is a mechanism provided by the Java runtime environment to manage memory dynamically and deallocate objects that are no longer needed.

In Java, when an object is created using the new keyword, memory is allocated from the heap to store the object. When the object is no longer referenced or accessible, it becomes eligible for garbage collection.

The garbage collector periodically identifies and collects the memory occupied by unreachable objects, freeing up resources and preventing memory leaks. The process of garbage collection is automatic and transparent to the developer, relieving them from the burden of manual memory management.

Garbage collection in Java helps in managing memory efficiently, improving application performance, and preventing memory-related errors such as memory leaks and dangling references.
