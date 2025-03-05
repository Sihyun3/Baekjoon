import java.util.*;

class Main {
    public static void main(String[] args) {
        int answer = 0;
        Scanner scanner = new Scanner(System.in);
        String numberList = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String input = scanner.nextLine();

        String[] split = input.split(" ");

        int numberSystem = Integer.parseInt(split[1]);
        String number = split[0];

        for (int i = number.length() - 1; i >= 0; i--) {
            answer += Math.pow(numberSystem, number.length() - 1  - i) * numberList.indexOf(number.charAt(i));
        }

        System.out.println(answer);
        scanner.close();
    }
}