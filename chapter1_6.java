import java.util.Scanner;

public class chapter1_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("(x1, y1), (x2, y2)의 좌표 입력 >> ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int refX1 = 10, refY1 = 10, refX2 = 200, refY2 = 300;

        if (x1 >= refX1 && y1 >= refY1 && x2 <= refX2 && y2 <= refY2) {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ") 사각형은 (" + refX1 + ", " + refY1 + ") (" + refX2 + ", " + refY2 + ") 사각형에 포함된다");
        } else {
            System.out.println("(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + ") 사각형은 (" + refX1 + ", " + refY1 + ") (" + refX2 + ", " + refY2 + ") 사각형에 포함되지 않는다");
        }
    }
}
