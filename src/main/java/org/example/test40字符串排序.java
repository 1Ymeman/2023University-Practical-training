package org.example;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
//题目：字符串排序。
public class test40字符串排序 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // 读入字符串个数
        int n = in.nextInt();

        // 用ArrayList存储字符串
        List<String> list = new ArrayList<>();

        // 逐个读入字符串
        for(int i=0; i < n; i++) {
            list.add(in.next());
        }

        // 排序
        Collections.sort(list);

        for(String str : list) {
            System.out.println(str);
        }


    }
}