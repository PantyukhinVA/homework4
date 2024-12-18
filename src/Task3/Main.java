package Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите первое число:");
            var num1 = scanner.nextDouble();
            System.out.println("Введите второе число:");
            var num2 = scanner.nextDouble();

            if (num1 == 0 || num2 == 0) {
                throw new IllegalArgumentException("Введены некорректные данные");
            }

            System.out.println("Сложение: " + Calculator.add(num1, num2));
            System.out.println("Вычитание: " + Calculator.sub(num1, num2));
            System.out.println("Умножение: " + Calculator.mul(num1, num2));
            System.out.println("Деление: " + Calculator.div(num1, num2));
            System.out.println("30% от 90: " + Calculator.percentage(90, 30));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные");
        }
    }
}
