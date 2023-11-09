package Top50算法练习;

//【程序49】
//题目：计算字符串中子串出现的次数
public class test49 {
//这个程序包含一个 countSubstrings 方法，该方法接受两个字符串参数：要搜索的字符串 (inputString) 和要计算出现次数的子串 (targetSubstring)。
// 方法使用 indexOf 函数来查找子串在输入字符串中的位置，并在找到每个匹配项时增加计数。
// 最后，返回子串出现的总次数。
        public static void main(String[] args) {
            String inputString = "Hello, Hello World! Hello, World!";

            String targetSubstring = "Hello"; // 子串
            int count = countSubstrings(inputString, targetSubstring);

            System.out.println("子串 \"" + targetSubstring + "\" 在字符串中出现的次数为: " + count);
        }

        public static int countSubstrings(String inputString, String targetSubstring) {
            int count = 0;
            int lastIndex = 0;

            while (lastIndex != -1) {
                lastIndex = inputString.indexOf(targetSubstring, lastIndex);

                if (lastIndex != -1) {
                    count++;
                    lastIndex += targetSubstring.length();
                }
            }

            return count;
        }


}
