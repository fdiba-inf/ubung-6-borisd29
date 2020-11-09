package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean noSymbols = true;
        int digitCounter = 0;
        String password;
        System.out.print("Enter Password: ");

        while(noSymbols && digitCounter < 2){
            if(input.hasNext()) {
                password = input.next();
            }else{
                System.out.println("Shit");
                break;
            }
            if (password.length() <= 7) {
                continue;
            }

            for (int i = 0; i < password.length(); i++) {
                if(!Character.isLetterOrDigit(password.charAt(i))){
                    noSymbols = false;
                }
                if(Character.isDigit(password.charAt(i))){
                    digitCounter++;
                }
            }
        }
        System.out.println("Password valid!");
    }
}