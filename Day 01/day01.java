class day01 {
    public int getSecondMaximum(int[] arr) {

        if (arr == null || arr.length < 2) {
            return -1;
        }

        int MAX = Integer.MIN_VALUE;
        int SEC_MAX = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                SEC_MAX = MAX;
                MAX = arr[i];
            } else if (arr[i] > SEC_MAX && arr[i] != MAX) {
                SEC_MAX = arr[i];
            }
        }

        return SEC_MAX == Integer.MIN_VALUE ? -1 : SEC_MAX;
    }

    public static void main(String[] args) {
        day01 obj = new day01();
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(obj.getSecondMaximum(arr)); // Output: 4
    }
}
