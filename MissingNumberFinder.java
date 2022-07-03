import java.util.Scanner;

class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size - 1];
        for (int i = 0; i < size - 1; i++)
            arr[i] = in.nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }

    static int missingNumberFinder(int array[], int n) {
        int a = 0;
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            boolean b = true;
            c = i;
            if (array[i] != i + 1) {
                b = false;
                a = i;
                break;
            }
        }
        if (c == n - 2) {
            return n;
        } else
            return a + 1;
    }
}