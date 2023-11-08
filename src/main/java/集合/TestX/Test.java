
package 集合.TestX;
 
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Test {
	
	static LinkedList<QuestionInfo> list = new LinkedList<QuestionInfo>();
	QuestionInfo question = new QuestionInfo();
	Scanner input = new Scanner(System.in);
	int count = 0;//记录删除的试题个数，避免添加时试题编号重复
	
	/**
	 * 查询所有试题
	 */
	
	public void showQuestion(){
		Iterator<QuestionInfo> it = list.iterator();
		while(it.hasNext()){
			QuestionInfo ques = it.next();
			System.out.println(ques.getQuestionId() + ques.getQuestion());
			System.out.println(ques.getOptionA());
			System.out.println(ques.getOptionB());
			System.out.println(ques.getOptionC());
			System.out.println(ques.getOptionD());
			System.out.println("答案：" + ques.getAnswer());
		}
	}
	
	/**
	 * 添加试题
	 */
	
	public void add(){
		System.out.println(list.size());
		System.out.print("请输入科目：（1.Java  2.C#  3.JSP）");
		String sub = input.next();
		System.out.print("请输入新的题干：");
		String qu = input.next();
		System.out.print("请输入新的选项A：");
		String optionA = input.next();
		System.out.print("请输入新的选项B：");
		String optionB = input.next();
		System.out.print("请输入新的选项C：");
		String optionC = input.next();
		System.out.print("请输入新的选项D：");
		String optionD = input.next();
		System.out.print("请输入新的答案：");
		String ans = input.next();
		list.add(new QuestionInfo(list.size() + 1 + count, qu, optionA, optionB, optionC, optionD, sub, ans));
		showQuestion();
		System.out.println("添加不成功");
		
	}
	
	/**
	 * 根据科目搜索试题
	 */
	
	public void search(){
		System.out.print("请输入科目：（1.Java  2.C#  3.JSP）");
		int choose = input.nextInt();
		Iterator<QuestionInfo> it = list.iterator();
		switch(choose){
		case 1:
			while(it.hasNext()){
				QuestionInfo ques = it.next();
				if("Java".equals(ques.getSubject())){
					System.out.println(ques.getQuestionId() + ques.getQuestion());
					System.out.println(ques.getOptionA());
					System.out.println(ques.getOptionB());
					System.out.println(ques.getOptionC());
					System.out.println(ques.getOptionD());
					System.out.println("答案：" + ques.getAnswer());
				}
			}
			break;
		case 2:
			while(it.hasNext()){
				QuestionInfo ques = it.next();
				if("C#".equals(ques.getSubject())){
					System.out.println(ques.getQuestionId() + ques.getQuestion());
					System.out.println(ques.getOptionA());
					System.out.println(ques.getOptionB());
					System.out.println(ques.getOptionC());
					System.out.println(ques.getOptionD());
					System.out.println("答案：" + ques.getAnswer());
				}
			}
			break;
		case 3:
			while(it.hasNext()){
				QuestionInfo ques = it.next();
				if("JSP".equals(ques.getSubject())){
					System.out.println(ques.getQuestionId() + ques.getQuestion());
					System.out.println(ques.getOptionA());
					System.out.println(ques.getOptionB());
					System.out.println(ques.getOptionC());
					System.out.println(ques.getOptionD());
					System.out.println("答案：" + ques.getAnswer());
				}
			}
			break;
		default:
			System.out.println("请输入提示数字！");
			break;
		}
	}
	
	/**
	 * 按模糊字搜索
	 */
	
	public void searchBySome(){
		System.out.print("请输入题干：");
		String mainBody = input.next();
		Iterator<QuestionInfo> it = list.iterator();
		while(it.hasNext()){
			QuestionInfo ques = it.next();
			if(ques.getQuestion().indexOf(mainBody) != -1){
				System.out.println(ques.getQuestionId() + ques.getQuestion());
				System.out.println(ques.getOptionA());
				System.out.println(ques.getOptionB());
				System.out.println(ques.getOptionC());
				System.out.println(ques.getOptionD());
				System.out.println("答案：" + ques.getAnswer());
			}
			
		}
	}
	
	/**
	 * 删除试题
	 * @param choose
	 * @return
	 */
	
	public boolean delete(int choose){
		boolean isSuccess = false;
		//System.out.println(list.size());
		if(choose <= 0 || choose > list.size()){
			System.out.println("对不起，没有要删除的编号！请重新输入");
		}else{
			list.remove(choose - 1);
			count++;
			isSuccess = true;
			System.out.println("删除成功");
		}
		showQuestion();
		return isSuccess;
	}
	
	public void chooseMenu(int choose){
		Test test = new Test();
		switch(choose){
		case 1:
			test.showQuestion();
			break;
		case 2:
			test.search();
			break;
		case 3:
			test.searchBySome();
			break;
		case 4:
			test.add();
			break;
		case 5:
			boolean isSuccess = false;
			do{
				System.out.println("请输入需要删除的试题编号");
				choose = input.nextInt();
				isSuccess = test.delete(choose);
			}while(!isSuccess);
			
			break;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		list.add(new QuestionInfo(1 , "在Java中，以下合法的变量名是（）。" , "\t选项A：_Sum" , "\t选项B：var%" , "\t选项C：9var" , "\t选项D：My name" , "Java" , "A"));
		list.add(new QuestionInfo(2 , "以下关于Java类和对象描述正确的是（）。" , "\t选项A：一个类只能有一个对象" , "\t选项B：对象是类的具体实例" , "\t选项C：对象是对现实世界中客观事物的抽象" , "\t选项D：使用class关键字定义一个对象" , "Java" , "B"));
		list.add(new QuestionInfo(3 , "在WinForms中，消息框的返回值为（）类型。" , "\t选项A：MessageBox" , "\t选项B：DialogResult" , "\t选项C：Yes" , "\t选项D：No" , "JSP" , "B"));
		list.add(new QuestionInfo(4 , "在C#中，以下非法的变量名是（）。" , "\t选项A：$avg" , "\t选项B：count_1" , "\t选项C：num%" , "\t选项D：3name" , "C#" , "C"));
		Test test = new Test();
		int choose = 0;
		do{
			System.out.print("请选择操作（1.列出所有试题  2.按科目查询  3.按题干模糊查询  4.添加试题  5.删除试题  6.退出系统）：");
			choose = input.nextInt();
			test.chooseMenu(choose);
		}while(choose != 6);
		if(choose == 6){
			System.out.println("谢谢使用，欢迎下次光临！");
		}
	}
 
}