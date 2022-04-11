
public class Worker {
/*
    1. В классе Worker создаем поле callback
    типа OnTaskDoneListener
 */
    private final OnTaskDoneListener<String> callback;
    private final OnTaskErrorListener<String> errorCallback;

    public Worker(OnTaskDoneListener<String> callback, OnTaskErrorListener<String> errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i==33){
                errorCallback.onError("Task " + i + " ERROR");
                continue;
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}
