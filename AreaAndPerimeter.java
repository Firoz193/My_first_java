package areaandperimeter;
import java.util.Scanner;
public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Width = ");
        double size1 = sc.nextDouble();
        System.out.print("Height = ");
        double size2 = sc.nextDouble();
        System.out.print("Area is "+size1+ "*" +size2+ " = ");
        System.out.printf("%.2f \n",+(size1*size2));
        System.out.print("Perimeter is 2*(" +size1+ " + " +size2+ ") = ");
        System.out.printf("%.2f \n",+2*(size1+size2));
    }  
}
