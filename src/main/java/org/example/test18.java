package org.example;
//【程序18】
//题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
// 有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
//1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，   则表明此数不是素数，反之是素数。
public class test18 {
    public static void main(String[] args) {
        char[] teamA = {'a', 'b', 'c'};
        char[] teamB = {'x', 'y', 'z'};

        // 问题：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
        // 已抽签决定比赛名单。有人向队员打听比赛的名单。
        // a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
        // 遍历甲队成员
        for (char a : teamA) {
            // 遍历乙队成员
            for (char b : teamB) {
                // 遍历乙队成员
                for (char c : teamB) {
                    // 判断a不和x比，c不和x、z比
                    if (a != 'a' || b != 'x' || c != 'x' && c != 'z') {
                        System.out.println("甲队：" + a + " vs 乙队：" + b + ", " + c);
                    }
                }
            }
        }
    }
}
