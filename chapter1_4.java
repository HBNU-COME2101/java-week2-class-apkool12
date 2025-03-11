import java.util.Scanner;

public class chapter1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("여행지 >> ");
        String destination = sc.nextLine();

        System.out.print("인원수 >> ");
        int people = sc.nextInt();

        System.out.print("숙박일 >> ");
        int nights = sc.nextInt();

        System.out.print("1인당 항공료 >> ");
        int airfarePerPerson = sc.nextInt();

        System.out.print("1방 숙박비 >> ");
        int roomCost = sc.nextInt();
        int rooms = (people + 1) / 2;
        int totalCost = (people * airfarePerPerson) + (rooms * roomCost * nights);
        System.out.println(people + "명의 " + destination + " " + nights + "박 " + (nights + 1) + "일 여행에는 " + rooms + "개 필요하며 경비는 " + totalCost + " 원입니다.");
    }
}	
