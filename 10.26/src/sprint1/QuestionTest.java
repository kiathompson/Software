package sprint1;

import java.time.LocalDateTime;
import java.util.List;

public class QuestionTest {
	
	public static void main(String args[]) {
		
		LocalDateTime questionDate = LocalDateTime.now();
		LocalDateTime questionDate2 = LocalDateTime.now();
		LocalDateTime questionDate3 = LocalDateTime.now();
		
		Question q1 = new Question("Class Time", "What time does the class start?", questionDate);
		Question q2 = new Question("Materials", "Do i need to bring anything to class?", questionDate2);
		Question q3 = new Question("Class Level", "What is the level of this class?", questionDate3);
		
		System.out.println("Questin Title for question : " + q1.getTitle() );
		
		LocalDateTime date = LocalDateTime.now();
		Member member1 = new Member("Kianna", "Thompson","kiathompson","kiathompson@valdosta.edu",date);
		LocalDateTime groupDate = LocalDateTime.now();
		
		Group yoga = new Group("Yoga", "Stretching", groupDate); 
		
		member1.addQuestion(yoga, q1, questionDate);
		member1.addQuestion(yoga, q2, questionDate2);
		member1.addQuestion(yoga, q3, questionDate3);
		
		List<Question> questions = yoga.getQuestions();
		
		System.out.println();
		System.out.println("Questions asked for Yoga");
		for(Question q : questions) {
			System.out.println(q.getText());
		}
	}

}
