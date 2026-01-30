// 1. Classes & Objects

import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount();
        b1.userId = "Avan999@";
        System.out.println(b1.userId);
        b1.password = "Avani123@$";
        sc.close();
    }
}

class BankAccount {
    public String userId;
    private String password;
}