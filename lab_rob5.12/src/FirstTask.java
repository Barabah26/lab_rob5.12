public class FirstTask {
    public static void main(String[] args) {
        int array [] = new int [50];
        for (int i = 1, j = 0; i <= 99; i += 2, j++) {
            array [j] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
