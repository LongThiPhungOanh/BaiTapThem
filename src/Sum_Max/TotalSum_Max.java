package Sum_Max;

public class TotalSum_Max {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
            sum += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
              if (max < arr[i]){
                  max = arr[i];
              }
        }
        for (int test: arr) {
            System.out.println("phần tử trong mảng " +test);
        }
        System.out.println("số lớn nhất trong mảng" + max);
        System.out.println("tổng " + sum);
    }
}
