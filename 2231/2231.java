import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String in = scanner.nextLine();
        int digits = String.valueOf(in).length();
        int input = Integer.parseInt(in);
        int result = 0;

        for(int i = (input - (digits * 9)); i < input; i++){
            int sum = 0;
            int num = i;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == input){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}