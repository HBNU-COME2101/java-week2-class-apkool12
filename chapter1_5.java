import java.util.Scanner;

public class chapter1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요 >> ");
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요.");
            return;
        }

        int red = age / 10;
        int blue = (age % 10) / 5;
        int yellow = age % 5;
        int totalCandles = red + blue + yellow;

        System.out.println("빨간 초 " + red + "개, 파란 초 " + blue + "개, 노란 초 " + yellow + "개. 총 " + totalCandles + "개가 필요합니다.");
    }
}
