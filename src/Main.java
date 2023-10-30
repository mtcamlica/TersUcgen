import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int basamakSayisi;
        System.out.print("Ters ücgenin yüksekliği kaç basamak olsun? ");
        Scanner input = new Scanner(System.in);
        basamakSayisi = input.nextInt();

        for(int i=basamakSayisi; i>=1; i--) {
            for (int k=1; k<=(basamakSayisi-i); k++) {
                System.out.print(" ");
            }
            for (int j=1; j<= (2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
