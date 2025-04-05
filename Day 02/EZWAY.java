public class EZWAY {
    void pushZerosToEnd(int[] arr) {
        int a = 0;
        int b = 1;

        while (b < arr.length) {
            if (arr[a] != 0 && arr[b] != 0) {
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

    public static void main(String args[]) {
        EZWAY obj = new EZWAY();
        int[] arr = {1, 0, 5, 2, 0, 8};

        System.out.print("Input: arr[] = ");
        printArray(arr);

        obj.pushZerosToEnd(arr);

        System.out.print("Output: ");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
