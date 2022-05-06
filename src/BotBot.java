import java.time.Period;
import java.util.Scanner;
import java.time.LocalDate;

public class BotBot {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String name1;
        String name2;
        int age;
        int attempts;

        name1 = greeting();
        name2 = nameAgain();
        age = guessAge();
        exactAge();
        count();
        attempts = quiz();
        daysOfTheWeek();

        reminisce(name1, name2, age, attempts);
    }
    public static String greeting() {
        System.out.println("Hi there, I'm bot-bot! What's your name?");
        return s.nextLine();
    }
    public static String nameAgain() {
        System.out.println("Sorry, I didn't quite catch that. What was your name again?");
        String name = s.nextLine();
        System.out.println("Cool! Nice to meet you, " + name);
        return name;
    }
    public static int guessAge() {
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
        System.out.println("First, give me a number between 2 and 10!");
        int num = Integer.parseInt(s.nextLine());

        num *= 2;
        num += 5;
        num *= 50;

        System.out.println("Have you already had your birthday this year? (y/n)");
        String reply = s.nextLine();
        if (reply.equals("y")) {
            num += 1772;
        } else if (reply.equals("n")) {
            num += 1771;
        }

        System.out.println("Okay, okay, I'm getting there. Your magic number so far is " + num);
        System.out.println("Subtract your birth year from that for me and give me the remainder:");
        num = Integer.parseInt(s.nextLine());

        int age = num % 100;
        System.out.println("I think you might be " + age + " years old!");
        return age;
    }
    public static int exactAge(){
        System.out.println("I can also tell you your exact age. What is your date of birth? (yyyy-mm-dd)");
        LocalDate dob = LocalDate.parse(s.nextLine());
        LocalDate today = LocalDate.now();
        Period diff = Period.between(dob, today);

        int age = Math.abs(diff.getYears());
        System.out.println("As of today, you are exactly " +
                age + " years " +
                diff.getMonths() + " months and " +
                diff.getDays() + " days old.");
        System.out.println("Neat, huh?");

        return age;
    }

    public static void count() {
        System.out.println("I'm also great at counting.");
        System.out.println("Go ahead and give me a number and I'll count to it from zero!");
        int num = Integer.parseInt(s.nextLine());

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

    public static int quiz(){
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

    public static void daysOfTheWeek(){
        while (true) {
            System.out.println("Let me tell you about the days of the week.");
            System.out.println("Give me a number, 1-7 and I'll tell you a fun fact about that day! Or press 9, if you're done with facts.");
            int num = Integer.parseInt(s.nextLine());

            switch (num) {
                case 1:
                    System.out.println("Monday is the only day of the week in English that is a complete anagram. Dynamo!");
                    break;
                case 2:
                    System.out.println("Uranus was discovered on a Tuesday. It happened on March 13, 1781 and the world was never the same.");
                    break;
                case 3:
                    System.out.println("Wednesday doesn't end in 'tag' (day) in German, and is the only day of the week not to do so. Instead, the word is Mittwoch meaning midweek.");
                    break;
                case 4:
                    System.out.println("In the USSR, Thursdays were fish days and restaurants had to serve fish instead of other types of meat.");
                    break;
                case 5:
                    System.out.println("The fear of Friday the 13th is known as friggatriskaidekaphobia coming from the Norse goddess Frigga, Friday's namesake, and triskaidekaphobia, fear of the number thirteen.");
                    break;
                case 6:
                    System.out.println("According to some Balkan folklore, people born on Saturdays might be particularly adept at vampire hunting.");
                    break;
                case 7:
                    System.out.println("Hm? Sorry no fun facts on this one. Sunday is a day of rest in most of the world.");
                    break;
                case 9:
                    System.out.println("Thanks for listening!");
                    return;
            }
        }
    }

    public static void reminisce(String name1, String name2, int age, int attempts){
        System.out.println("You know, we've had a lot of fun, " + name2);
        System.out.println("It feels like it was just moments ago that we met.");
        System.out.println("First I thought your name was " + name1 + " but I wasn't sure, and then you told me it was " + name2 + "(...)");
        s.next();
        System.out.println("I guessed your age was " + age + " and then you told me your birthday and I told you exactly how old you are.");
        System.out.println("Did you know exactly how old you were before?");
        System.out.println("I was just born recently so it's not hard for me to keep track of at all! (...)");
        s.next();
        System.out.println("We had a fun little quiz, and it only took you " + attempts + " to get the right answer.");
        System.out.println("And then you listened to me talk about the days of the week...");
        System.out.println("Even though I haven't even lived through all of them yet! (...)");
        s.next();
        System.out.println("Have you had fun? (y/n)");

        String reply = s.nextLine();
        if (reply.equals("y")){
            System.out.println("Me too. I'll always remember you, " + name2);
        } else if (reply.equals("n")) {
            System.out.println("Oh...well then.");
        }
        System.out.println("Goodbye!");
    }
}


