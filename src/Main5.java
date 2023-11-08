public class Main5 {
    public static void main(String[] args) {
        int[] pole1 = {1, 2, 3};
        int[] pole2 = {4, 5, 6, 7};
        int[] spojenePole = spojPole(pole1, pole2);
        for (int prvek :
                spojenePole) {
            System.out.println(prvek);
        }
    }

    public static int[] spojPole(int[] pole1, int[] pole2) {
        int[] novePole = new int[pole1.length + pole2.length];
        for (int i = 0; i < pole1.length; i++) {
            novePole[i] = pole1[i];
        }
        for (int i = pole1.length; i < novePole.length; i++) {
            novePole[i] = pole2[i - pole1.length];
        }
        return novePole;
    }
}
