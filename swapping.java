import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
         a = sc.nextInt();
         System.out.println("enter the 2nd number");
        b = sc.nextInt();
        System.out.println("enter the 3rd number");
        c = sc.nextInt();
        System.out.println("number before swapping");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("After swapping");
        a= a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println(a +"\n"+b+"\n"+c);
        System.out.println(b);
        System.out.println(c);
    }
}
