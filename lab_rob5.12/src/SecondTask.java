public class SecondTask {
    public static void main(String[] args) {
        int counter = 0;
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) Math.round(Math.random() * 9);
            //System.out.println(array[i]);

            array[1] = 0;
            array[3] = 0;
            array[5] = 0;
            array[7] = 0;
            array[9] = 0;
            array[11] = 0;
            array[13] = 0;
            array[15] = 0;
            array[17] = 0;
            array[19] = 0;
            System.out.print(array[i] + " ");

        }
    }
}
