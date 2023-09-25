import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int[] Array1 = new int[5];

        Array1[0] = 8;
        Array1[1] = 4;
        Array1[2] = 6;
        Array1[3] = 3;
        Array1[4] = 9;

        System.out.println(Array1[0]+" "+Array1[1]+" "+Array1[2]+" "+Array1[3]+" "+Array1[4]);
        System.out.println(Array1.length);
        double medelvärde1 = (Array1[0]+Array1[1]+Array1[2]+Array1[3]+Array1[4])/Array1.length;
        System.out.println("Medelvärded av array1 är "+medelvärde1);
    }
}
