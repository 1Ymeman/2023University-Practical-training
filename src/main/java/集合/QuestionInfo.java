package 集合;

public class QuestionInfo {
    private int questionId;
    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String subject;
    private String answer;

    // 构造方法
    public QuestionInfo(int questionId, String question, String optionA, String optionB, String optionC, String optionD, String subject, String answer) {
        this.questionId = questionId;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.subject = subject;
        this.answer = answer;
    }

    // getter和setter方法
    // ...
}