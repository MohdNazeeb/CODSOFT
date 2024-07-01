import java.util.*;
class Game{
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();
    public int inputNumber;
    public int numberofguess=0;
    public int number;
    Game(){
        number=rand.nextInt(100);
    }
    void inputNumber(){
        System.out.println("Guess a number between 0 to 100");
        inputNumber=sc.nextInt();
        numberofguess++;
    }
    boolean checkNumber(){
        if(inputNumber==number){
            System.out.println("You guess the right number, Congrats");
            return true;
        }else if(inputNumber>number){
            System.out.println("Too high");
        }else if(inputNumber<number){
            System.out.println("Too low");
        }else{
            System.out.println("Invalid number");
        }
        return false;
    }

}
public class NumberGame{
    public static void main(String[] args) {
        Game g=new Game();
        while(g.numberofguess<11||(g.inputNumber==g.number)){
        g.inputNumber();
        boolean b=g.checkNumber();
        if(b){
            if(g.numberofguess==1){
                System.out.println("Your Score:10");
            }else if(g.numberofguess==2){
                System.out.println("Your Score: 9");
            }else if(g.numberofguess==3){
                System.out.println("Your Score: 8");
            }else if(g.numberofguess==4){
                System.out.println("Your Score: 7");
            }else if(g.numberofguess==5){
                System.out.println("Your Score: 6");
            }else if(g.numberofguess==6){
                System.out.println("Your Score: 5");
            }else if(g.numberofguess==7){
                System.out.println("Your Score: 4");
            }else if(g.numberofguess==8){
                System.out.println("Your Score: 3");
            }else if(g.numberofguess==9){
                System.out.println("Your Score :2");
            }else if(g.numberofguess==10){
                System.out.println("Your Score: 1");
            }
            break;
        }
        }
    }
}
