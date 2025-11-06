
import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {

        final double PI = 3.14159;


        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");


        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = input.nextDouble();


        input.close();


        double daireAlani = PI * r * r;


        double daireCevresi = 2 * PI * r;


        double daireCapi = 2 * r;


        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);


        double kureYuzeyAlani = 4 * PI * r * r;



        System.out.println("\nSONUCLAR:");
        System.out.println("----------");




        System.out.printf("%-25s : %.2f cm^2\n", "Daire Alani", daireAlani);
        System.out.printf("%-25s : %.2f cm\n", "Daire Cevresi", daireCevresi);
        System.out.printf("%-25s : %.2f cm\n", "Daire Capi", daireCapi);
        System.out.printf("%-25s : %.2f cm^3\n", "Kure Hacmi", kureHacmi);
        System.out.printf("%-25s : %.2f cm^2\n", "Kure Yuzey Alani", kureYuzeyAlani);
    }
}
