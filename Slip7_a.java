//Design a class for Bank. Bank Class should support following operations;
//a. Deposit a certain amount into an account
//b. Withdraw a certain amount from an account
//c. Return a Balance value specifying the amount with details


class Bank {
    String name;
    double balance;

    Bank(String name){
        this.name = name;
        this.balance = 0.0;
    }

    void deposit(int amount){
        balance += amount;
        System.out.println(amount + " deposit successfully!");
    }

    void withdraw(int amount){
        if(amount < balance) {
            balance -= amount;
            System.out.println(amount + " withdraw successfully!");
        } else {
            System.out.println("insufficient balance!");
        }
    }

    void checkbal(){
        System.out.println("Ac Holder Name: "+name);
        System.out.println("Current Balance: "+balance);
    }
}


public class Slip7_a {
    public static void main(String[] args) {
        Bank account = new Bank("dipu");
        account.checkbal();
        account.deposit(1000);
        account.withdraw(50);
        account.checkbal();
    }
}
