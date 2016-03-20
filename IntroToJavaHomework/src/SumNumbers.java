/**
 * Created by Admin on 3/19/2016.
 */
import java.io.InputStream;
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = num;
        for (int i = 0; i < num; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
