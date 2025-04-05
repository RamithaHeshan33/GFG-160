import java.util.Arrays;

public class Day02 {
    void pushZerosToEnd(int[] arr) {
        int a = 0;
        int b = 1;

        while(b < arr.length) {
            if(arr[a] != 0 && arr[b] != 0) {
                a++;
            }
            if (arr[a] == 0 && arr[b] != 0) {
                arr[a] = arr[b];
                arr[b] = 0;
                a++;
            }
            b++;
        }
    }

    public static void main(String[] args) {
        Day02 obj = new Day02();
        int[] arr = {1,0,0,7,5,3,0,9};

        System.out.println(Arrays.toString(arr));
        obj.pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
