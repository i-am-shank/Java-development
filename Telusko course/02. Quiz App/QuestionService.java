import java.util.Scanner;

public class QuestionService {
  Question[] questions = new Question[5];

  public QuestionService() {
    questions[0] = new Question(1, "What is the most common programming language ?", "Java", "C++", "Python", "C#", "Java");
    questions[1] = new Question(2, "Which programming language has fastest execution ?", "Java", "C++", "Python", "C#", "C++");
    questions[2] = new Question(3, "Which programming language is used in .NET framework ?", "Java", "C++", "Python", "C#", "C#");
    questions[3] = new Question(4, "Which programming language has inbuild Machine Learning libraries ?", "Java", "C++", "Python", "C#", "Python");
    questions[4] = new Question(5, "Which programming language is used in Springboot framework ?", "Java", "C++", "Python", "C#", "Java");
  }

  public void playQuiz() {
    int score = 0;

    for(Question q: questions) {
      // Print question-statement & options
      System.out.println(q);

      // Take user input
      Scanner sc = new Scanner(System.in);
      String userAnswer = sc.nextLine();
      String answer = q.getAnswer();

      // Match the answer
      if(userAnswer.equals(answer)) {
        System.out.println("CORRECT !!");
        score++;
      }
      else {
        System.out.println("INCORRECT :(");
      }

      // Print the answer
      System.out.println("=========== Correct answer : [" + answer + "] ===========" + "\n");
    }

    // Print score
    System.out.println("Your score is : " + score + " / 5");
  }
}
