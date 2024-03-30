import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

    public static void Arrays_2 (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы массива, разделенные пробелами:");
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        
        System.out.println("Введите число, которое нужно удалить:");
        int numberToRemove = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToRemove) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Такого числа нет в массиве");
        } 
        else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] == numberToRemove) {
                    continue;
                }
                newArr[j++] = arr[i];
            }
            System.out.println("Новый массив без указанного числа:");
            System.out.println(Arrays.toString(newArr));
        }
    }
}
