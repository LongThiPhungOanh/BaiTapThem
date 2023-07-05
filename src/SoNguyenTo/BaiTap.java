package SoNguyenTo;
import java.util.Scanner;
public class BaiTap {
    public static void main(String[] args) {
        Scanner numbercount = new Scanner(System.in);
        System.out.println("Nhập số");
        int count = numbercount.nextInt();
        if (count > 2) {
            for (int i = 2; i < count; i++) {
                boolean flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    System.out.println(i);
                }
            }
        } if (count < 2){
            System.out.println("Nhập lại");
        }
    }
}