
import java.util.Scanner;

public class QuestionService 
{
    Question[] questions = new Question[5];
    String selection[] =  new String[5];
    public QuestionService(){
        questions[0] = new Question("What is the capital of India?", 1, "Mumbai", "Delhi", "Kolkata", "Chennai", "Delhi");
        questions[1] = new Question("What is the capital of USA?", 2, "New York", "Washington DC", "Los Angeles", "Chicago", "Washington DC");
        questions[2] = new Question("What is the capital of UK?", 3, "Manchester", "Birmingham", "London", "Liverpool", "London");
        questions[3] = new Question("What is the capital of Australia?", 4, "Sydney", "Melbourne", "Canberra", "Perth", "Canberra");
        questions[4] = new Question("What is the capital of Japan?", 5, "Tokyo", "Osaka", "Kyoto", "Hiroshima", "Tokyo");

    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions){
            System.out.println(q);
            Scanner input = new Scanner(System.in);
            selection[i++]=input.nextLine();
        }
    

        for(String s : selection){
        System.out.println(s);
        }
    }
    public void getScore(){
        int score = 0 ;
        for(int i = 0 ; i<questions.length; i++){
            if((questions[i].getAnswer().toLowerCase()).equals(selection[i].toLowerCase())){
                score++;
            }
        }
        System.out.println("Your score is : "+score);
    }
}
