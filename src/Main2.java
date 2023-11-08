public class Main2 {
    public static void main(String[] args) {
        int[] pole = {8, 9, 15, 16, 7};
        System.out.println(getPrvek(pole, 2)); // 15
        System.out.println(getIndex(pole, 16)); // 3
    }

    public static int getPrvek(int[] pole, int i) {
        return pole[i];
    }

    public static int getIndex(int[] pole, int prvek) {
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] == prvek) return i;
        }
        return -1;
    }
}
