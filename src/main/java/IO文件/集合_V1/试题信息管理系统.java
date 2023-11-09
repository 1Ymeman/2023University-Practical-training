package IO文件.集合_V1;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 试题信息管理系统 {
    public static void main(String[] args) {
        MySQL mysql = new MySQL();
        mysql.showMenu();
    }
}

class QuestionInfo{
    int questionId;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;

    public QuestionInfo() {

    }

    public QuestionInfo(int questionId, String subject) {
        this.questionId = questionId;
        this.subject = subject;
    }
    String subject;
    String answer;
    public void setQuestion(String question) {
        this.question = question;
    }
    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }
    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }
    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }
    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }



}
class MySQL{
    private static List<QuestionInfo> questionInfolist = new LinkedList<QuestionInfo>();
    Scanner sc = new Scanner(System.in);

    //重写构造方法
    public MySQL(){
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        try {
            //读取
            fis = new FileInputStream("src/main/java/IO文件/集合_V1/test.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);

            String str = "";
            int line_num = 1;
            StringBuffer sbf = new StringBuffer();
            QuestionInfo q = new QuestionInfo();
            while ((str = br.readLine()) != null) {
                sbf.append(str);
                if(line_num == 1){
                    q.questionId = Integer.parseInt(str);
                    line_num += 1;
                } else if (line_num == 2) {
                    q.question = str;
                    line_num += 1;
                } else if (line_num == 3) {
                    q.optionA = str;
                    line_num += 1;
                } else if (line_num == 4) {
                    q.optionB = str;
                    line_num += 1;
                } else if (line_num == 5) {
                    q.optionC = str;
                    line_num += 1;
                } else if (line_num == 6) {
                    q.optionD = str;
                    line_num += 1;
                }else if (line_num == 7) {
                    q.answer = str;
                    line_num += 1;
                }else if (line_num == 8) {
                    q.subject = str;
                    line_num += 1;
                    line_num = 1;
                    questionInfolist.add(q);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                br.close();
                isr.close();
                fis.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }


    public void showMenu(){
        int num;
        do{
            System.out.println("欢迎使用试题管理系统");
            System.out.println("请选择操作(1.列出所有试题 2.按科目查询 3.按题干模糊查询 4.添加试题 5.删除试题 6.退出系统)");
            num = sc.nextInt();
            if(num == 1){
                showQuestion();
            } else if (num == 2) {
                System.out.println("按科目查询,请输入科目(Java,C#,Jsp)");
                String subject = sc.next();
                showSubject(subject);
            }else if (num == 3) {
                System.out.println("按题干模糊查询,请输入题干:");
                String part = sc.next();
                showPart(part);
            }else if (num == 4) {
                System.out.println("添加试题");
                addQuestion();
            }else if (num == 5) {
                System.out.println("删除试题,请输入将要删除的试题的编号");
                int id = sc.nextInt();
                int length = questionInfolist.size();
                while(id>length){
                    System.out.println("对不起，没有该题编号，请重新输入");
                    System.out.println("删除试题,请输入将要删除的试题的编号");
                    id = sc.nextInt();
                }
                delQuestion(id);
            }else if (num == 6) {
                System.out.println("退出系统并保存");
                writerQuestion();
            }
        } while (num!=6);

    }
    public void showQuestion(){
        for(QuestionInfo q:questionInfolist){
            System.out.println(q.questionId+"、"+q.question);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);
            System.out.println("答案:"+q.answer);
        }
    }
    public void showSubject(String subject){
        for(QuestionInfo q:questionInfolist){
            if(q.subject.equals(subject)){
                System.out.println(q.questionId+"、"+q.question);
                System.out.println(q.optionA);
                System.out.println(q.optionB);
                System.out.println(q.optionC);
                System.out.println(q.optionD);
                System.out.println("答案:"+q.answer);
            }
        }
    }
    public void showPart(String part){
        for(QuestionInfo q:questionInfolist){
            if(q.question.contains(part)){
                System.out.println(q.questionId+"、"+q.question);
                System.out.println(q.optionA);
                System.out.println(q.optionB);
                System.out.println(q.optionC);
                System.out.println(q.optionD);
                System.out.println("答案:"+q.answer);
            }
        }
    }
    public void addQuestion(){
        System.out.println("请输入科目");
        String subject = sc.next();
        int id = questionInfolist.size();
        QuestionInfo q = new QuestionInfo(id+1,subject);

        System.out.println("请输入新的题干");
        String question = sc.next();
        q.setQuestion(question);

        System.out.println("请输入新的选项A");
        String optionA = sc.next();
        q.setOptionA(optionA);

        System.out.println("请输入新的选项B");
        String optionB = sc.next();
        q.setOptionB(optionB);

        System.out.println("请输入新的选项C");
        String optionC = sc.next();
        q.setOptionC(optionC);

        System.out.println("请输入新的选项D");
        String optionD = sc.next();
        q.setOptionD(optionD);

        System.out.println("请输入新的答案");
        String answer = sc.next();
        q.setAnswer(answer);

        questionInfolist.add(q);
        showQuestion();
    }
    public void delQuestion(int id){
        questionInfolist.remove(id-1);
        showQuestion();
    }
    public void writerQuestion(){
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try {
            //写入
            fos = new FileOutputStream("D:\\test.txt");
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);

            String str2;
            for(QuestionInfo q:questionInfolist){
                str2 = q.questionId + "\n";
                str2 += q.question + "\n";
                str2 += q.optionA + "\n";
                str2 += q.optionB + "\n";
                str2 += q.optionC + "\n";
                str2 += q.optionD + "\n";
                str2 += "答案:"+q.answer + "\n";
                str2 += "科目:"+q.subject + "\n";


                bw.write(str2);
                bw.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                osw.close();
                fos.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}





