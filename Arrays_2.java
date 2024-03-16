import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Arrays_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new Random();

        System.out.println(Arrays.toString(arr));

        System.out.print("Введите ваше число: ");
        int number = sc.nextInt();

        int count = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (number != arr[i])
            {
                count++;
            }
            else
            {
                count2++;
            }
        }
        if (count2 == 0){
            System.out.println("Ваше число не входит в массив");
        }

        int[] Arr = new int[count];

        for (int i = 0, j = 0; i < arr.length; i++)
        {
            if (number != arr[i])
            {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(Arr));
    }
}
