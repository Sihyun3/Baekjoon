import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        Stack answer = new Stack();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < cnt; i++) {
            String tmp = br.readLine();
            String[] split = tmp.split(" ");
            switch (Integer.parseInt(split[0])) {
                case 1:
                    answer.push(Integer.parseInt(split[1]));
                    break;
                case 2:
                    if (answer.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(answer.pop()).append("\n");
                    }
                    break;
                case 3:
                    sb.append(answer.size()).append("\n");
                    break;
                case 4:
                    if (answer.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                case 5:
                    if (answer.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(answer.lastElement()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());

    }
}

class Stack {
    private ArrayList<Integer> stack;
    int size;
    public Stack() {
        stack = new ArrayList<>();
        size = 0;
    }

    public void push(int element) {
        stack.add(element);
        size ++;
    }

    public int pop() {
        size --;
        int element = stack.get(size);
        stack.remove(size);
        return element;
    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        if (size > 0) {
            return false;
        } else {
            return true;
        }
    }

    public int lastElement() {
        return stack.get(size -1);
    }
}