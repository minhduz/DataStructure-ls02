import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scanner.nextInt();
        System.out.print("Enter B: ");
        int b = scanner.nextInt();
        long sum = 0;
        int count = 0;
        int start = (a % 2 == 0) ? a : (a + 1);
        int end = (b % 2 == 0) ? b : (b - 1);
        //Lặp
//        for (int i = start;i<=b;i+=2){
//            sum+=i;
//            count++;
//        }
        //Gauss's sum Equation
        count = (end - start) / 2 + 1;
        sum = count * (((long) end + start)) / 2;

        System.out.println(sum);
        System.out.println(count);

        int sumRecursion = sumRecursion(start, end);
        System.out.println("sum recursion: " + sumRecursion);
    }


    public static int sumRecursion(int start, int end) {
        if (start == end) {
            return end;
        } else {
            return start + sumRecursion(start + 2, end);
        }
    }

    public static int sumRecursionReverse(int start, int end) {
        if (start == end) {
            return start;
        } else {
            return sumRecursionReverse(start, end - 2) + end;
        }
    }
}