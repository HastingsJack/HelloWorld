public class IterateThroughArray {
    public static void main(String[] args) {
        Double[] array = {4.5, 25.3, 12.1, 34.0, 15.5};
        for(Double power : array) {
            System.out.print(Math.pow(power, 2.0) + " ");
        }
        System.out.println();
        System.out.println();

        Double min = array[0];
        Double max = array[array.length-1];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
            if(array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimum: " + min + " Maximum: " + max);
        System.out.println();
        for(int i = 0; i < array.length; i++) {
            if(array[i] == 12.1) {
                System.out.print("Hurra! Jeg fandt 12.1. Det stod på index " + i);
            }
        }
        System.out.println();
    }
}
