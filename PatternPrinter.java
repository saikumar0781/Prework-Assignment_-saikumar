import java.util.Scanner;

class PatternPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        patternPrinter(n);
    }

    static void patternPrinter(int n) {
        int l = 0;
        int c = 0;
        int count = 0;
        if (n == 0) {
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                l = n;
                count = n - i;
                c = count;
                for (int j = 0; j < n; j++) {
                    c = count;
                    while (c > 0) {
                        System.out.print(l);
                        c--;
                    }
                    l--;
                }
                System.out.println();
            }
        }
    }
}