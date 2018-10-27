package sprint1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MemberTest {
	
	public static void main(String args[]) {
		
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime date2 = LocalDateTime.now();
		LocalDateTime date3 = LocalDateTime.now();
		
		//Creates Members
		Member member1 = new Member("Kianna", "Thompson","kiathompson","kiathompson@valdosta.edu",date);
		Member member2 = new Member("Jordan", "Thompson","jorthompson","jorthompson@valdosta.edu",date2);
		Member member3 = new Member("Payton", "Thompson", "paythompson", "paythompson@valdosta.edu", date3);
		
		//Retireves Member's Email, first & last name, screenName, and the dateCreated 
		System.out.println("Member 1 : " + member1.getFirstName() + " "  + member1.getLastName() + " " + 
		"\nEmail Address: " + member1.getEmailAddress()+ 
		"\nScreen Name: " + member1.getScreenName() );
		System.out.println();
		
		System.out.println("Member 2 : " + member2.getFirstName() + " "  + member2.getLastName() + " " + 
				"\nEmail Address: " + member2.getEmailAddress()+ 
				"\nScreen Name: " + member2.getScreenName() );
		System.out.println();
		
		System.out.println("Member 3 : " + member3.getFirstName() + " "  + member3.getLastName() + " " + 
				"\nEmail Address: " + member3.getEmailAddress()+ 
				"\nScreen Name: " + member3.getScreenName() );
		
		//*************************************************************************************************		
		LocalDateTime groupDate = LocalDateTime.now();
		LocalDateTime groupDate2 = LocalDateTime.now();
		LocalDateTime groupDate3 = LocalDateTime.now();
		
		Group yoga = new Group("Yoga", "Stretching", groupDate);
		Group soulCycle = new Group("Soul Cycle", "fast pace", groupDate2);
		Group kickBoxing = new Group("Kick Boxing", "Intermediate", groupDate3);
		
		//***********************************************************************************************
		//Joining Specified Group
		member1.joinGroup(yoga, groupDate);
		member1.joinGroup(soulCycle, groupDate2);
		
		member2.joinGroup(soulCycle, groupDate2);
		
		member3.joinGroup(yoga, groupDate);
		member3.joinGroup(soulCycle, groupDate2);
		member3.joinGroup(kickBoxing, groupDate3);
		
		//Showing the number of groups each member is apart of 
		System.out.println();
		System.out.println("# of Groups Member1 is in: " +member1.getNumGroups());
		System.out.println("# of Groups Member2 is in: " +member2.getNumGroups());
		System.out.println("# of Groups Member3 is in: " +member3.getNumGroups());
		
		//Lists all the Groups that member is apart of
		System.out.println();
		System.out.println("Member 1 is apart of: ");
		List<Group>mem1Groups = new ArrayList<>();
		mem1Groups = member1.getGroups();
		for(Group gr : mem1Groups) {
			System.out.print(gr.getTitle()+ ", ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Member 2 is apart of: ");
		List<Group>mem2Groups = new ArrayList<>();
		mem2Groups = member2.getGroups();
		for(Group gr : mem2Groups) {
			System.out.print(gr.getTitle()+ ", ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Member 3 is apart of: ");
		List<Group>mem3Groups = new ArrayList<>();
		mem3Groups = member3.getGroups();
		
		for(Group gr : mem3Groups) {
			System.out.print(gr.getTitle()+ ", ");
		}
		
	//***********************************************************************************
		LocalDateTime questionDate = LocalDateTime.now();
		LocalDateTime questionDate2 = LocalDateTime.now();
		LocalDateTime questionDate3 = LocalDateTime.now();
		
		LocalDateTime answerDate1 = LocalDateTime.now();
		LocalDateTime answerDate2 = LocalDateTime.now();
		LocalDateTime answerDate3 = LocalDateTime.now();
		
		Question q1 = new Question("Class Time", "What time does the class start?", questionDate);
		Question q2 = new Question("Materials", "Do i need to bring anything to class?", questionDate2);
		Question q3 = new Question("Class Level", "What is the level of this class?", questionDate3);
		
		Answer a1 = new Answer(q1, " The class starts at 3:00 PM", answerDate1);
		Answer a2 = new Answer(q2, "You need to bring your own mat", answerDate2);
		Answer a3 = new Answer(q3, "This is an Itermediate class", answerDate3);
	//*******************************************************************************************************
		//Adding questions asked by the member
		member1.addQuestion(yoga, q1, questionDate);
		member1.addQuestion(yoga, q2, questionDate2);
		member1.addQuestion(yoga, q3, questionDate3);
	//*******************************************************************************************************
		//Adding answers that are answered by the member
		/*member2.addAnswer(yoga, q1, a1, answerDate1);
		member2.addAnswer(yoga, q2, a2, answerDate2);
		member2.addAnswer(yoga, q3, a3, answerDate3);*/
	//******************************************************************************************************
		//Getting the date joined by each member	
		System.out.println();
		System.out.println();
		
		System.out.println("Member1 joined Yoga: " + member1.getDateJoined(yoga));
		System.out.println("Member1 joined SoulCycle: " + member1.getDateJoined(soulCycle));
		
		System.out.println();
		System.out.println("Member2 joined SoulCycle: " + member2.getDateJoined(soulCycle));
		System.out.println();
		
		System.out.println("Member3 joined Yoga: " + member3.getDateJoined(yoga));
		System.out.println("Member3 joined SoulCycle: " + member3.getDateJoined(soulCycle));
		System.out.println("Member3 joined kick boxing: " + member3.getDateJoined(kickBoxing));
	//********************************************************************************************************	
		//Getting Questions Member 1 has asked and displaying them
		List<Question> questions = new ArrayList<>();
		questions = member1.getQuestions(yoga);
		System.out.println();
		System.out.println("Questions Member1 asked: ");
		for(Question q : questions) {
			System.out.println(q.getText());
		}
		
		List<Answer> answers = new ArrayList<>();
		answers = member2.getAnswers(yoga);
		System.out.println();
		System.out.println("Answers Member2 answered: ");
		for(Answer a : answers) {
			System.out.println(a.getText());
		}
		
		
		
	}

}
