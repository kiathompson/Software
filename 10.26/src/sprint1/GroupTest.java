package sprint1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GroupTest {

	public static void main(String args[]) {
		
		LocalDateTime groupDate = LocalDateTime.now();
		LocalDateTime groupDate2 = LocalDateTime.now();
		LocalDateTime groupDate3 = LocalDateTime.now(); 
//****************************************************************************************		
		//Creating Groups
		Group yoga = new Group("Yoga", "Stretching", groupDate);
		Group soulCycle = new Group("Soul Cycle", "fast pace", groupDate2);
		Group kickBoxing = new Group("Kick Boxing", "Intermediate", groupDate3);
		
		ArrayList<Group> groups = new ArrayList<>();
		groups.add(yoga);
		groups.add(soulCycle);
		groups.add(kickBoxing);
		
		for(Group g: groups) {
			System.out.println("Group Name: " + g.getTitle() + "\nGroup Description: " + g.getDescription() 
			+"\nDate Group was Created: " + g.getDateCreated());
			System.out.println();
		}
//***********************************************************************************************
		//Creating Members to add to Groups
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime date2 = LocalDateTime.now();
		LocalDateTime date3 = LocalDateTime.now();
		
		Member member1 = new Member("Kianna", "Thompson","kiathompson","kiathompson@valdosta.edu",date);
		Member member2 = new Member("Jordan", "Thompson","jorthompson","jorthompson@valdosta.edu",date2);
		Member member3 = new Member("Payton", "Thompson", "paythompson", "paythompson@valdosta.edu", date3);
	
		//Joining Specified Group
		member1.joinGroup(yoga, groupDate);
		member1.joinGroup(soulCycle, groupDate2);
		
		member2.joinGroup(soulCycle, groupDate2);
		
		member3.joinGroup(yoga, groupDate);
		member3.joinGroup(soulCycle, groupDate2);
		member3.joinGroup(kickBoxing, groupDate3);
//********************************************************************************************************		
	//Getting the Number of members in each group
		for(Group gr : groups) {
			System.out.println("Group : " + gr.getTitle() + "\n # of Members: " + gr.getNumMembers());
		}
//*********************************************************************************************************
		//Come back to getMember
		
//********************************************************************************************************
		// Getting Members in a group
		List <Member> yogaMembers = yoga.getMembers();
		System.out.println();
		System.out.println("Yoga Member List");
		for(Member m: yogaMembers) {
			System.out.println("Member Name: "+ m.getFirstName() + " " + m.getLastName());
		}
//*********************************************************************************************************
		//Retrieving and displaying questions asked to this group
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
		
		member1.addQuestion(yoga, q1, questionDate);
		member1.addQuestion(yoga, q2, questionDate2);
		member1.addQuestion(yoga, q3, questionDate3);
		
		List<Question> questions = yoga.getQuestions();
		
		System.out.println();
		System.out.println("Questions asked for Yoga");
		for(Question q : questions) {
			System.out.println(q.getText());
		}
	//************************************************************************************************************
		
	}
}
