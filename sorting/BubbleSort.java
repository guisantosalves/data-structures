package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numeros = new int[] { 2, 4, 7, 3, 8, 1, 9, 1, 0, 6 };
        int n;
        
        System.out.println("normal: ");
        BubbleSort.printing(numeros);

        // switching value
        // int aux = numeros[2];
        // numeros[2] = numeros[1];
        // numeros[1] = aux;
        do {
            n = 0;
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j + 1]; // receive next
                    numeros[j + 1] = numeros[j]; // next -> current
                    numeros[j] = aux; // current -> next
                    n++;
                }
            }
            // looping until there are switches.
        } while (n > 0);

        System.out.println("bubble sorted: ");
        BubbleSort.printing(numeros);
    }

    public static void printing(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println("\n");
    }
}
