public interface EventManager {
    boolean addListener(Listener listener);
    boolean deleteListener(Listener listener);
    void notice();
}
