package BanPhim;
import java.util.Scanner;
import java.util.Scanner;

public class BanPhim {
    public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    System.out.println("nhập số lượng phần tử");
    int arrLength = number.nextInt();
    int[] arr = new int[arrLength];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            int index = number.nextInt();
            arr[i] = index;
        }
        for (int test: arr) {
            System.out.println(test);
        }
    }
}