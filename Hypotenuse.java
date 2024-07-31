import java.util.Scanner;
public class main{
    public static void main(String[] args){
        int a,b;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        float c = (float)Math.sqrt(a*a + b*b);
        System.out.printf("%.2f",c);
    }
}