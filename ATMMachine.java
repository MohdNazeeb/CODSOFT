//ATM MAchine
import java.util.*;
class Account{
    float balance;
}
class ATMop extends Account {
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Account> map=new HashMap<>();
    ATMop(){
        System.out.println("Welcome To Our ATM");
        op();
    }
    public void op(){
        System.out.println("Enter your pincode:");
        int pincode=sc.nextInt();
        if(map.containsKey(pincode)==true){
            Account obj=map.get(pincode);
            menu(obj);
        }
        else{
            System.out.println("Please create account first");
            System.out.println("Set your pincode");
            int pin=sc.nextInt();
            Account obj=new Account();
            map.put(pin, obj);
            menu(obj);
        }
    }
    public void useAgain(Account obj){
        System.out.println("If you want to use again press 1 else 0");
        int n=sc.nextInt();

        if(n==1){
            menu(obj);
        }
        else if(n==0){
            System.out.println("Thank you for using our ATM");
        }
        else{
            System.out.println("Invalid choice");
        }
    }
    public void withdraw(Account obj){
        System.out.println("Please enter amount:");
        int amount=sc.nextInt();
        if(amount>obj.balance){
            System.out.println("Insufficient balance");
        }else{
        obj.balance=obj.balance-amount;
        System.out.println("Please collect cash");
        }
        useAgain(obj);
    }    
    public void deposit(Account obj){
        System.out.println("Please enter amount");
        int amount=sc.nextInt();
        obj.balance=obj.balance+amount;
        System.out.println("Amount deposited succesfully");
        useAgain(obj);
    }
    public void checkBalance(Account obj){
        System.out.println("Your balance:"+obj.balance);
        useAgain(obj);
    }
    public void menu(Account obj){
        System.out.println("1. To Check Balance");
        System.out.println("2. To Deposit Money ");
        System.out.println("3. To Withdraw Cash");
        System.out.println("4. Check Another Account");
        System.out.println("5. Exit");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        if(choice==1){
            checkBalance(obj);
        }else if(choice==2){
            deposit(obj);
        }else if(choice==3){
            withdraw(obj);
        }else if(choice==4){
            op();   
        }else if(choice==5){
            System.out.println("Thank You For Using Our ATM");
        }else{
            System.out.println("Invalid choice");
            menu(obj);
        }
    }
}
class ATMmachine{
    public static void main(String[] args) {
        ATMop obj=new ATMop();

    }
}
