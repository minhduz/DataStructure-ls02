import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của tam giác: ");
        h = scanner.nextInt();
//        int distance,position;
//        for (int i = 1; i <= h; i++) {
//            for (int j = 0; j < h * 2; j++) {
//                distance = Math.abs(j - h);
//                position = i - distance;
//
//                if (position > 0) {
//                    System.out.print((i > 9) ? i % 10 : i);
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        for (int row = 1; row <= h; row++) {
            for (int i = 0; i < h-row; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < row; i++) {
                System.out.print(row%10 + " ");
            }
            System.out.println();
        }
    }
}
