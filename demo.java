import java.util.*;
interface p1 {
    void multiplication(int a, int b);
    void addition(int a, int b);
}

class B implements p1{
    public void addition(int a, int b){
        System.err.println("Final value:"+(a+b));
    }
    public void multiplication(int a, int b){
        System.err.println("Final value:"+(a*b));
    }
}
public class demo {
    public static void main(String[] args) {
        B obj=new B();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for addition, 2 for multiplication");
        int n=sc.nextInt();
        System.err.println("Enter the two numbers on which you wanna perform your operation");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        switch (n) {
            case 1:
                obj.addition(n1,n2);
                break;
            case 2:
                obj.multiplication(n1, n2);
                break;
            default:
                System.out.println("You have entered a wrong choice, kindly check and update for the same");
                break;
        }
    }
}
