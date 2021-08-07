import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to AntiSoc.");
        System.out.println("You are here due to many reasons.");
        System.out.println("One of these reasons is because you don't understand how to interact With Others.");
        System.out.println("Here, I can help you with that...");
        System.out.println("How Many Times Have You Interacted Today?");
        Scanner myNum = new Scanner(System.in);
        String Socint= myNum.nextLine();
        int num = myNum.nextInt();
        int y=25;
        if(num<y){
            System.out.print("You still need some work.");
        } 
        else if (num>y) {
            System.out.print("Great, You are becoming more sociable!");
        }
        System.out.print("How have you interacted?");
        String text="type here";
        switch(text) {
            case "Well":
                System.out.println("Great!");
                break;
            case "Good":
                System.out.println("well, you still need some work");
                break;
            case "Poorly":
                System.out.println("You need major work done!");
        System.out.print("Thanks for your input!");
    }
}