import java.util.Scanner;

public class task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        double[] array = new double[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        double average = sum / size;

        System.out.println("Среднее арифметическое элементов массива: " + average);

        System.out.println("Массив, где каждый элемент умножен на среднее арифметическое:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] * average);
        }
    }
}