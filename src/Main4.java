public class Main4 {
    public static void main(String[] args) {
        int[] pole = {1, 2, 3, 4, 5};
        pole = odeberZPole(pole, 3);
        for (int prvek :
                pole) {
            System.out.println(prvek);
        }
    }

    public static int[] odeberZPole(int[] pole, int prvekKOdebrani) {
        int[] nove = new int[pole.length - 1];

        boolean uzJsmeToOdebrali = false;
        for (int i = 0; i < pole.length; i++) {
            if (prvekKOdebrani != pole[i]) {
                nove[uzJsmeToOdebrali ? i - 1 : i] = pole[i];
            } else {
                uzJsmeToOdebrali = true;
            }
        }

        return nove;
    }
}
