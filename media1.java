import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);

        double n1 = s.nextDouble();
        double n2 = s.nextDouble();
        double media = (n1 * 3.5 + n2 * 7.5) / 11;
        System.out.printf("MEDIA = %.5f%n",media);

    }
}