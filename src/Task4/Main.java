package Task4;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Increment();
        }

        System.out.println("Количество созданных объектов: " + Increment.getCount());
    }
}