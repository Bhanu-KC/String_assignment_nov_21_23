import java.util.Scanner;

public class Count {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Any String");
            String name = sc.next().toLowerCase();
            int name_length = name.length();
            int count_consonant = 0;
            int count_vowel = 0;
            for (int i = 0; i < name_length; i++) {
                char a = name.charAt(i);
                if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
                    count_vowel = count_vowel+1;
                }
                else {
                    count_consonant = count_consonant+1;
                }
            }
            System.out.println("Vowel count = "+count_vowel);
            System.out.println("Consonant count = "+count_consonant);
        }
    }
