import java.util.Scanner;
public class Main
{
    public static int regnum = 0;
    public static int regpin = 0;
    public static void main(String[] args) 
        {Scanner input = new Scanner(System.in);
        Menu();
        }
    public static void Menu(){
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Enter Choice:"); choice = input.nextInt();
        if(choice <= 0) {System.out.println("Please enter a number between 1-3");Menu();}
        if(choice >= 4) {System.out.println("Please enter a number between 1-3");Menu();}
        if(choice == 1){Reg();}
        if(choice == 2){Login();}
        if(choice == 3){Exit();}}
    public static void Reg(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a new Account number");
        regnum = input.nextInt();
        System.out.println("Enter a new Pin number");
        regpin = input.nextInt();
        System.out.println("Account Registered Successfuly!");
        Menu();
    }
    public static void Login(){
        Scanner input = new Scanner(System.in);
        int Acc = 0;
        int Pin = 0;
        System.out.println("Enter Account Number:");
        Acc = input.nextInt();
        if (Acc == regnum) {System.out.println("Enter Pin");
        Pin = input.nextInt();
        if (Pin == regpin) {System.out.println("Login Successful");Atm();}
        else {System.out.println("Wrong Pin number");Menu();}
        }
        else {System.out.println("Wrong Account number");Menu();}
    }
    
    
    
    public static int Money = 0;   
    public static void Atm() {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Logout");
        int sel;
        int dep;
        int draw;
        sel = input.nextInt();
        if (sel <= 0) {System.out.println("Please enter a number between 1-4");Atm();}
        if (sel >= 5) {System.out.println("Please enter a number between 1-4");Atm();}
        if (sel == 1) {System.out.println("Your Balance is: $"+Money);Atm();}
        if (sel == 2) {System.out.println("How Much Withdraw? $");
        draw = input.nextInt();
        if (draw>Money) {System.out.println("Not enough Money");Atm();}
        Money=(Money-draw);
        System.out.println("You withdraw: $"+draw); System.out.println("Your balance is now $"+Money);
        Atm();}
        if (sel == 3) {System.out.println("How Much Deposit? $");
        dep = input.nextInt();
        Money=(Money+dep);
        System.out.println("You deposit: $"+dep); System.out.println("Your balance is now $"+Money);
        Atm();}
        if (sel == 4) {System.out.println("Thank you");Menu();}
        }
    public static void Exit(){System.out.println("Goodbye!");}
    }
