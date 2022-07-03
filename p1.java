
import java.util.Scanner;

class FirstLetterPrinter {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
}
static String firstLetterPrinter(String str) {
    String arr[]= str.split(" ");
    String abc="";
    for(int i=0;i<arr.length;i++)
    {
        abc=abc+arr[i].charAt(0);
    }
    return abc;

 }
}