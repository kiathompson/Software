package sprint1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class Member {
	
	private String firstName;
	private String lastName;
	private String screenName;
	private String emailAddress;
	private LocalDateTime dateCreated;
	LinkedHashMap <Group, Membership> memberships = new LinkedHashMap<>();
	
	public Member(String firstName, String lastName, String screenName, String emailAddress, LocalDateTime dateCreated) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.screenName = screenName;
		this.emailAddress = emailAddress;
		this.dateCreated = dateCreated;		
	}
	public String getEmailAddress() {return emailAddress;}
	
	public LocalDateTime getDateCreated() {return dateCreated;}
	
	public String getFirstName() {return firstName;}
	
	public String getLastName() {return lastName;}
	
	public String getScreenName() {return screenName;}
	
	public void joinGroup(Group group, LocalDateTime datejoined) {
		Membership memShip = new Membership(group, this, datejoined);
		memShip.addToGroup();
		memberships.put(group, memShip);	
	}
	
	public int getNumGroups() {return memberships.size();}
	
	public Group getGroup(String groupID) {
		Collection <Group> groups = memberships.keySet();
		Group group = null;
		for(Group g: groups) {
			if(g.getTitle().equals(groupID)) {
				group = g;
			}
		}
		
		return group;
	}
	
	public List<Group> getGroups() {
		Collection <Group> group = memberships.keySet();
		List<Group> groups = new ArrayList<>();
		
		for(Group g: group) {
			groups.add(g);
		}
		
		return groups;	
	}
	
	public void addQuestion(Group group, Question question, LocalDateTime date) {
		Membership m = memberships.get(group);
		question.setMembership(m);
		m.addQuestion(question);
	}
	
	public LocalDateTime getDateJoined(Group group) {	
		Membership m = memberships.get(group);
		return m.getDateJoined();
	}
	
	public void addAnswer(Group group, Question question, Answer answer, LocalDateTime date) {
		Membership m = memberships.get(group);
		answer.setMembership(m);
		question.addAnswer(answer);
		m.addAnswer(answer);
	}
	
	public List<Question> getQuestions(Group group){
		Membership m = memberships.get(group);
		return m.getMemQuestions();
	}
	
	public List<Answer> getAnswers(Group group){
		Membership m = memberships.get(group);
		return m.getMemAnswers();
	}      
	

	
	
		
	

}
