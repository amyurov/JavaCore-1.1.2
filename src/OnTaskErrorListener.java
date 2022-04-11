@FunctionalInterface
public interface OnTaskErrorListener<V> {

    void onError(V result);
}
