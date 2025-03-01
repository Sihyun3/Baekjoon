import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int cnt = Integer.parseInt(split[0]);
        int goal = Integer.parseInt(split[1]);
        
        int[] cardList = new int[cnt];
        for(int i = 0; i < cnt; i++){
            int card = scanner.nextInt();
            cardList[i] = card;
        }
        
        int answer = 0;
        outerLoop:
        for (int i = 0; i < cardList.length; i++) {
            for (int j = i+1; j < cardList.length; j++) {
                for (int k = j+1; k < cardList.length; k++) {
                    
                    int tmp = cardList[i] + cardList[j]
                            + cardList[k];
                    if (tmp == goal) {
                        answer = tmp;
                        break outerLoop;
                    } else if (tmp > answer && tmp < goal) {
                        answer = tmp;
                    }
                }
            }
        }
        System.out.println(answer);
        scanner.close();
    }
}