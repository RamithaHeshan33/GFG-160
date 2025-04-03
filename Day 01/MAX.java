public class MAX {
    public int getMAX(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int MAX = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (MAX < arr[i]) {
                MAX = arr[i];
            }
        }

        if (MAX == Integer.MIN_VALUE) {
            return -1;
        } else {
            return MAX;
        }
    }

    public static void main(String args[]) {
        MAX obj = new MAX();
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        System.out.println(obj.getMAX(arr));
    }
}
