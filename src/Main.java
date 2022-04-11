public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener<String> listener = System.out::println;
        OnTaskErrorListener<String> errorListener = System.out::println;

        Worker worker = new Worker(listener, errorListener);
        worker.start();

    }
}
