public class BuscaBinaria {
    public static void main(String[] args) {
        int[] numeros = {
                1, 6, 13, 77, 100, 101, 200, 305, 666, 890, 1000, 10000, 90000
        };

        int posisao = busca(numeros, 0, numeros.length - 1, 666);
        System.out.println("Posição: " + posisao);
    }

    public static int busca(int[] arr, int inicio, int fim, int objetivo) {

        if (inicio > fim)
            return -1;

        int meio = inicio / 2 + fim / 2;
        System.out.println(meio);

        int atual = arr[meio];
            
        if (atual > objetivo)
            return busca(arr, inicio, meio - 1, objetivo); // search below because it is greater than objective
        if(atual < objetivo)
            return busca(arr, inicio, meio + 1, objetivo); // search above because it is less than objective
        return meio;
    }
}