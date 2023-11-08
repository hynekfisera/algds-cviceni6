import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("zadej délku pole");
        int delka = input.nextInt();
        int[] pole = naplnPole(delka);
        for (int prvek :
                pole) {
            System.out.print(prvek);
        }
    }

    public static int[] naplnPole(int delka) {
        Scanner input = new Scanner(System.in);
        int[] pole = new int[delka];
        for (int i = 0; i < delka; i++) {
            System.out.println("zadej prvek na pozici " + i);
            int cislo = input.nextInt();
            pole[i] = cislo;
        }
        return pole;
    }
}