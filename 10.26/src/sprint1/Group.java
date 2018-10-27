package sprint1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Group {
	
	private LocalDateTime dateCreated;
	private String title;
	private String description;
	List<Member> members = new ArrayList<>();
	private List<Question> questions = new ArrayList<>();
	private List<Answer> answers = new ArrayList<>();
	private LinkedHashMap<Question,Answer> posts = new LinkedHashMap<>();
	
	public Group(String title, String description, LocalDateTime dateCreated) {
		this.title = title;
		this.description = description;
		this.dateCreated = dateCreated;
	}
	
	public LocalDateTime getDateCreated() {return dateCreated;}
	
	public String getTitle() {return title;}
	
	public String getDescription() {return description;}
	
	public int getNumMembers() {return members.size();}
	
	public Member getMember(String emailAddress) {
		Member member = null;
		for(Member m : members){
			if(m.getEmailAddress().equals(emailAddress)) {
				member = m;
			}
			else
				System.out.println("Member not found!");
		}
		return member;
	}
	
	public List<Member> getMembers(){
		return members;
	}
	
	public List<Question> getQuestions(){
	
		return questions;
	}
	
	public List<Answer> getAnswers(){
		return answers;
	}
	
	
	
	
	
	void addQuestion(Question q) {
		questions.add(q);
	}
	
	void addAnswer(Answer a) {
		answers.add(a);
	}
}
