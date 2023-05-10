public class Main {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(1);
        for (int i = 0; i < 10; i++) {
            stack.push(i * 10);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}