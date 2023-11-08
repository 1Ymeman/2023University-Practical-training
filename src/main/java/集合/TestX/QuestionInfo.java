package 集合.TestX;


public class QuestionInfo {
	private int questionId;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	private String subject;
	private String answer;
 
	public QuestionInfo(int questionId, String question, String optionA,String optionB, String optionC, String optionD, String subject,String answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.subject = subject;
		this.answer = answer;
	}
	
	public QuestionInfo() {
		super();
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptiona(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionb(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionc(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptiond(String optionD) {
		this.optionD = optionD;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}

