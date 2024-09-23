public class ArraysPractice {
    public static void main(String[] args) {
        int[] array = new int[8];
        array[0] = 34;
        array[array.length-1] = 117;
        for(int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        String[] array2 = {"Hej", "med", "dig"};
        for(String word : array2) {
            System.out.print(word + " ");
        }
        System.out.println();
        Double[] array3 = {3.4, 2.5, 1.2, 6.7};
        System.out.println(array3[2]);
        System.out.println(array3[4]);
    }
}
