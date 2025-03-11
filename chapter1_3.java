import java.util.Scanner;

public class chapter1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("생일 입력 하세요 >>");
        int birth = sc.nextInt();
        
        int year = birth / 10000;
        int month = (birth % 10000) / 100;
        int day = birth % 100;
        
        System.out.println("년: " + year);
        System.out.println("월: " + month);
        System.out.println("일: " + day);
    }
}