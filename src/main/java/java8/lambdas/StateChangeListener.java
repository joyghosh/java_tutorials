package java8.lambdas;

public interface StateChangeListener {
    public void onStateChange(Thread.State oldState, Thread.State newState);
}
