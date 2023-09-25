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
        int[] Array2 = new int[5];

        Array2[0] = 18;
        Array2[1] = 14;
        Array2[2] = 16;
        Array2[3] = 13;
        Array2[4] = 19;

        int summa12 = Array1[0]+Array1[1]+Array1[2]+Array1[3]+Array1[4]+Array2[0]+Array2[1]+Array2[2]+Array2[3]+Array2[4];
        System.out.println("Summan av alla tal i array1 och array2 blir "+summa12);
        double medelvärde2 = (Array2[0]+Array2[1]+Array2[2]+Array2[3]+Array2[4])/Array2.length;
        System.out.println("Medelvärded av array2 är "+medelvärde2);

        int[] SummaArray = new int[5];
        SummaArray[0] = Array1[0] + Array2[0];
        SummaArray[01] = Array1[01] + Array2[01];
        SummaArray[02] = Array1[02] + Array2[02];
        SummaArray[03] = Array1[03] + Array2[03];
        SummaArray[04] = Array1[04] + Array2[04];
        
    }
}
