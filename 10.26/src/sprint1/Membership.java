package sprint1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Membership {
	Group group;
	Member member;
	private LocalDateTime dateJoined;
	private int points;
	private List <Question> questions = new ArrayList<>();;
	private List <Answer> answers = new ArrayList<>();

	Membership(Group group, Member member, LocalDateTime ldt){
		this.group = group;
		this.member = member;
		this.dateJoined = ldt;
	}
	
	void addToGroup() {
		group.members.add(member);
	}
	
	Member getMember() {
		return member;
	}
	
	Group getGroup() {
		return group;
	}
	
	void setMembership() {
		
		for(Question q: questions) {
			q.setMembership(this);
		}
		
		for(Answer a: answers) {
			a.setMembership(this);
		}
	}
	
	void setDateJoined(LocalDateTime dateJoined) {
		this.dateJoined = dateJoined;
	}
	
	LocalDateTime getDateJoined() {
		return dateJoined;
	}
	
	void addQuestion(Question q) {
		questions.add(q);
		group.addQuestion(q);
	}
	
	void addAnswer(Answer a) {
		answers.add(a);
		group.addAnswer(a);
	}
	
	List<Question> getMemQuestions(){
		return questions;
	}
	
	List<Answer> getMemAnswers(){
		return answers;
	}
}
