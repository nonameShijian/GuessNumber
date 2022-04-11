import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1.生成答案数字
        int answer = (int) (Math.random() * 100 + 1);
        // 只能猜7次
        int chances = 7;
        // 2.接受猜测数字
        // 4.每接受一个数字都比较一次大小
        while(chances > 0) {
            System.out.println("你还有" + chances + "次机会");
            System.out.print("请输入1-100之间的整数:");
            int guess = scan.nextInt();
            System.out.println("你输入的是：" + guess);
            // 3.比较大小
            if (answer > guess) {
                System.out.println("你猜小了");
            } else if (answer < guess) {
                System.out.println("你猜大了");
            } else {
                System.out.println("你猜对了");
                break;
            }
            chances --;
        }
        if (chances == 0) {
            System.out.println("你没有机会了");
        }
    }
}