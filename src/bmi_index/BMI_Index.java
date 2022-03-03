package bmi_index;

import java.util.Locale;

public class BMI_Index {
    public static void main(String[] args) {
        cim("");
        int tomeg = beker("");
        int magassag = beker("");
        double bmiIndex = bmi(tomeg, magassag);
        ertekeles();
    }

    static void cim(String szoveg) {
        System.out.println(szoveg);
    }

    static int beker(String kerdes) {
        System.out.print(kerdes);
        
        Scanner sc = new Scanner
        int szam = -1;
        boolean jo = false;
        while(!jo){
            szam =  sc.nextInt();
            jo = szam >= 100 && szam <= 200;
            if(!jo){
                System.out.println("Nem jó,q újra");
                System.out.println(kerdes);
            }
    }
        return 0;
    }

    static double bmi(int tomeg, int magassag) {
        return 0.0;
    }

    static void ertekeles(int tomeg, int magassag, double bmiIndex) {
        System.out.printf("Ön %d cm magas és %d kg tomegű," magassag, tomeg);
        System.out.printf(Locale.ENGLISH, " Így BMI indexe %");
        String testalkat = "túlsúlyos";
        System.out.printf("Tehát ön %s testalkatú\n", testalkat);
    }
    
}
