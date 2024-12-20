package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите строку");

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();

            System.out.println(input.replaceAll("бяка", "вырезано цензурой"));
        }
    }
}
