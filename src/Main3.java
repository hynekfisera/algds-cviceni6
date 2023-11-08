public class Main3 {
    public static void main(String[] args) {
        int[] pole = {1, 2, 3};
        pole = pridejDoPole(pole, 4);
        for (int prvek :
                pole) {
            System.out.println(prvek);
        }
    }

    public static int[] pridejDoPole(int[] pole, int novyPrvek) {
        int[] novePole = new int[pole.length + 1];
        for (int i = 0; i < pole.length; i++) {
            novePole[i] = pole[i];
        }
        novePole[novePole.length - 1] = novyPrvek;
        return novePole;
    }
}
