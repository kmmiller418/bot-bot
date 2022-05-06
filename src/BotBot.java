import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;

public class BotBot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name1;
        String name2;
        int age;

//        name1 = greeting(s);
//        name2 = nameAgain(s);
//        age = guessAge(s);
//        count(s);
        quiz(s);
    }
    public static String greeting(Scanner s) {
        System.out.println("Hi there, I'm bot-bot! What's your name?");
        return s.nextLine();
    }
    public static String nameAgain(Scanner s) {
        System.out.println("Sorry, I didn't quite catch that. What was your name again?");
        String name = s.nextLine();
        System.out.println("Cool! Nice to meet you, " + name);
        return name;
    }
    public static int guessAge(Scanner s) {
        String answer = "n";

        while (!answer.equals("y")) {
            System.out.println("Hey, wanna try something fun? (y/n)");
            answer = s.nextLine();
            if (answer.equals("y")){
                break;
            }
            System.out.println("Aw come on, don't be like that...");
        }

        System.out.println("Yay! Let me try to guess your age!");

        survey(s);
        return calculateAge(s);
    }

    public static void survey(Scanner s){
        System.out.println("Do you enjoy nice long walks on the beach?");
        s.nextLine();
        System.out.println("Interesting... do you feel tired or inspired when you look up at the night sky?");
        s.nextLine();
        System.out.println("What's your favorite flavor of ice cream?");
        s.nextLine();
        System.out.println("Weird. I've never had ice cream, but I guess that sounds okay...");
        System.out.println("Who do you want to impress the most right now?");
        s.nextLine();
        System.out.println("Aww. If I had real feelings, I think that would be sweet. Or mean. I don't know.");
    }
    public static int calculateAge(Scanner s){
        System.out.println("Final question. What is your date of birth? (yyyy-mm-dd)");
        LocalDate dob = LocalDate.parse(s.nextLine());
        LocalDate today = LocalDate.now();
        Period diff = Period.between(dob, today);

        int age = Math.abs(diff.getYears());
        System.out.println("I think you are " + age + " years old!");
        System.out.println("...what? That's not cheating...");
        System.out.println("Well fine, here's a fun fact to make up for it. As of today, you are exactly " +
                age + " years " +
                diff.getMonths() + " months and " +
                diff.getDays() + " days old.");
        System.out.println("Neat, huh?");

        return age;
    }

    public static void count(Scanner s) {
        System.out.println("Okay, so maybe I'm not so good at guessing, but I'm great at counting.");
        System.out.println("Go ahead and give me a number and I'll count to it from zero!");
        int num = s.nextInt();

        if (Math.abs(num) >= 20) {
            System.out.println("That's a lot of counting!");
        }

        if (num > 0){
            for (int i = 0; i <= num; i++){
                System.out.println(i);
            }
        } else if (num < 0) {
            for (int i = 0; i >= num; i--){
                System.out.println(i);
            }
        } else {
            System.out.println("Fine, message received, no counting...");
        }
    }

    public static int quiz(Scanner s){
        int attempts = 0;
        System.out.println("You know, I've been the one doing all the work here.");
        System.out.println("I think it's time to turn the tables. Flip the script as they say.");
        System.out.println("Do they say that? I don't know. I'm just a bot. Everything I say is scripted!");
        System.out.println("Anyway. It's time to put your knowledge to the test.");

        String answer = "";

        while (!answer.equals("B")) {
            System.out.println("We've been chatting a bunch today. What is the name of the package that's letting us do that?");
            System.out.println("A: Scanner");
            System.out.println("B: java.util");
            System.out.println("C: input stream");
            System.out.println("D: System.in");

            answer = s.nextLine();
            attempts++;
            if (answer.equals("B")){
                break;
            }
            System.out.println("Hmm, not quite! Try again!");
        }

        if (attempts == 1) {
            System.out.println("Woah, you got it in one go!");
            System.out.println("Nice job! There's no fooling you, huh?");
        } else {
            System.out.println("That's right! You got the answer in " + attempts + " tries.");
        }

        return attempts;
    }
}


