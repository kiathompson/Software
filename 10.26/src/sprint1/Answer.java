package sprint1;
import java.time.LocalDateTime;

public class Answer extends Post{


	private Question question;
	//records text for answer for input Questions, and records date
	public Answer(Question q, String text, LocalDateTime date){	
		super(text,date);
		question = q;
	}
	public Question getQuestion() { return question;}
	
	void setQuestion() {
		
	}

	public String toString() {
		return "";
	}

}
