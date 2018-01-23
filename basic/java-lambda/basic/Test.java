public interface Test {
    public void getSome();
    public default void display() {
        System.out.print("Test test test");
    }
}