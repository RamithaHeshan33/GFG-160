public class MIN {
    public int getMinimum(int[] arr) {
        if (arr == null || arr.length < 3) {
            return -1;
        }

        int MIN = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (MIN > arr[i]) {
                MIN = arr[i];
            }
        }

        if (MIN == Integer.MAX_VALUE) {
            return -1;
        } else {
            return MIN;
        }
    }

    public static void main(String[] args) {
        MIN obj = new MIN();
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        System.out.println(obj.getMinimum(arr));
    }
}
