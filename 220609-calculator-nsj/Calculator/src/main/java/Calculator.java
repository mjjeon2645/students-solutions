// Calculator
// - 계산할 식을 입력 받는다.
// - 식은 (숫자 연산자 숫자) 형태로 입력한다.
// - 입력받은 식을 계산해주는 compute 메서드를 작성한다.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator application = new Calculator();
        application.run();
    }

    private void run() {
        // 입력
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input Expression : ");

        String expression = scanner.nextLine();

        // 처리
        int result = compute(expression);

        // 출력
        System.out.println("Result : " + result);
    }

    private int compute(String expression) {

        return 0;
    }
}
