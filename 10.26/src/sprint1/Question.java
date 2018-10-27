package sprint1;
import java.time.LocalDateTime;
import java.util.*;


public class Question extends Post{

	String title;
	List<Answer> answers = new ArrayList<>();

	public Question(String title, String text, LocalDateTime date) {
		super(text,date);
		setTitle(title);

	}

	public String getTitle() { return title;}
	
	public void setTitle(String title) { this.title=title;}

	//adds answer to question
	public void addAnswer(Answer answer) {
		answers.add(answer);
	}

	//returns a list of all answers to this question
	public List<Answer> getAnswers() {
		return answers;
	}

	//toString provides info about the quesiton
	/*public String toString() {

		for(int i = 0; i < answers.size(); i++)

			return "Title: " + title + "Answers: " + answers.get(i).text + ".";


	}*/

}