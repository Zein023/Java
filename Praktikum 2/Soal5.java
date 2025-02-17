import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String A,B;
     
     A = scan.next();
     B = scan.next();

     System.out.println(A.length() + B.length());

     if (A.compareTo(B) > 0){
        System.out.println("yes");
     }else{
        System.out.println("no");
     }

     String capA = Character.toUpperCase(A.charAt(0)) + A.substring(1);
     String capB = Character.toUpperCase(B.charAt(0)) + B.substring(1);
     System.out.println(capA + " " + capB);
    }
}
