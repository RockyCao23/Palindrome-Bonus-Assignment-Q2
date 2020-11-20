import java.util.Scanner;
public class Main {

    public static void palindrome(String p){
        String a = "";
        String b = "";
        String c = "";
        String d = "";
        String str = "";
        str = p.toLowerCase();

        for (int j = 0; j < str.length();j++){
           if (Character.isLetter(str.charAt(j))){
               c = str.substring(j,j+1);
               d = d + c;
           }

        }
        //System.out.println(d);

        for (int i = str.length()-1; i >= 0; i--){
            if (Character.isLetter(str.charAt(i))) {
                a = str.substring(i, i+1);
                b = b + a;
            }

        }
        //System.out.println(b);

        if (d.equals(b)){
            System.out.println("\"" + p + "\"" + " is a palindrome!");
        }else System.out.println("\"" + p + "\"" + " is not a palindrome!");

    }

    public static void main(String[] args) {
        System.out.println("Enter a word to check if it is a palindrome!\nEnter your word:");
        Scanner scan = new Scanner(System.in);
        palindrome(scan.nextLine());
    }
}

