public class FourTask {
    public static void main(String[] args) {
        int array1[] = new int[10];
        int array2[] = new int[10];
        int sum[] = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);
            array2[i] = (int) Math.round(Math.random() * 10);
            sum[i] = array1[i] + array2[i];
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + " ");
        }
        System.out.println();
        for (int k = 0; k < sum.length; k++) {
            System.out.print(sum[k] + " ");
        }



    }
}
