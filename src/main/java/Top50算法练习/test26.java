package Top50算法练习;
import java.util.Scanner;
//【程序26】
//题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续   判断第二个字母。
//1.程序分析：用情况语句比较好，如果第一个字母一样，则判断用情况语句或if语句判断第二个字母。
public class test26 {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("请输入星期几的第一个字母（大写）：");
            char firstLetter = scanner.next().charAt(0);
            scanner.close();

            String dayOfWeek = determineDayOfWeek(firstLetter);
            if (dayOfWeek != null) {
                System.out.println("这个字母表示星期" + dayOfWeek);
            } else {
                System.out.println("无效输入");
            }
        }

        public static String determineDayOfWeek(char firstLetter) {
            switch (firstLetter) {
                case 'M':
                    return "一";
                case 'T':
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("请输入星期几的第二个字母（大写）：");
                    char secondLetter = scanner.next().charAt(0);
                    scanner.close();

                    if (secondLetter == 'U') {
                        return "二";
                    } else if (secondLetter == 'H') {
                        return "四";
                    } else {
                        return null;
                    }
                case 'W':
                    return "三";
                case 'F':
                    return "五";
                case 'S':
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("请输入星期几的第二个字母（大写）：");
                    char secondLetter2 = scanner2.next().charAt(0);
                    scanner2.close();

                    if (secondLetter2 == 'A') {
                        return "六";
                    } else if (secondLetter2 == 'U') {
                        return "日";
                    } else {
                        return null;
                    }
                default:
                    return null;
            }
        }


}
