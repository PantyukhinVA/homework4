package task4;

public class Increment {
    private static int count = 0;

    public Increment() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}
