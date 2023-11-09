package IO文件.Test_V1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//格式模版保存在文本文件pet.template中，内容如下:
//---
//其中iname}、{sex、hobby是需要替换的内容
//现在要求按照模板格式保存宠物数据到文本文件即把(name}、{sex、obby)替换为具体的宠物信息，
//该如何实现呢?使用字符流读写文件java写出
//请确保在运行代码之前已经创建了 pet.template 文件，并将模板内容填入其中。
// 代码中的 name 、 sex 、 hobby 变量是需要替换的具体宠物信息。
// 运行代码后，将会生成一个名为 pet.txt 的文件，其中包含替换后的宠物数据
//1.new File()
//这是一种比较暴力的方法，三个txt文件的路径如下：
//File file = new File("src/test1.txt");
//File file = new File("src/test/test2.txt");
//File file = new File("test3.txt");

public class Main {
    public static void main(String[] args) {
        String templatePath = "src\\main\\java\\IO文件\\Test_V1\\pet.template";
        String outputPath = "src\\main\\java\\IO文件\\Test_V1\\pet.txt";
        String name = "Tom";
        String sex = "Male";
        String hobby = "Playing with toys";

        try {
            // 读取模板文件
            FileReader fileReader = new FileReader(templatePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // 创建输出文件
            FileWriter fileWriter = new FileWriter(outputPath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // 替换模板中的占位符
                line = line.replace("{name}", name)
                        .replace("{sex}", sex)
                        .replace("{hobby}", hobby);

                // 写入输出文件
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            // 关闭资源
            bufferedReader.close();
            bufferedWriter.close();

            System.out.println("宠物数据已成功保存到文本文件。");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}