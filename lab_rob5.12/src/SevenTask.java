public class SevenTask {
    public static void main(String[] args) {
        int array[][] = new int[7][7];
        int sum[] = new int[7];
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) Math.round(Math.random() * 6);
                System.out.print(array[i][j] + " ");
                sum[i] = sum[i] + array[i][j]; // рахую суму чисел у стрічці масиву
            }
            System.out.println();
        }
        for (int i = 0, j = 0; i < sum.length; i++){
            if (sum[i] >= j){
                n = i;
                j = sum[i];
            }
        }
        System.out.println("Індекс стрічки сума значень усіх елементів якої є найбільшою дорівнює: " + n + "!");

    }
}
