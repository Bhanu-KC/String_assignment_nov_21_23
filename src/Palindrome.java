import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        if (original.equals(reversed)){
            System.out.println("It is an Panlindrome: "+reversed);
        }
        else{
            System.out.println("It is not a panlindrome: "+reversed);
        }


    }
}

