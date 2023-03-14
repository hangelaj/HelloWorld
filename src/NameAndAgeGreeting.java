import java.util.Scanner;
public class NameAndAgeGreeting {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("What is your name? ");
        String name = reader.nextLine();
        // read a line from the users keyboard
        System.out.println(" How old are you? ");
        int age= Integer.parseInt(reader.nextLine());
        // reads a string var from keyboard and tranfare is to an
        System.out.println("you name is:" + name + "and you are"+ age + " years old, nice to meet you!" );
    }
}
