public class BuscaBinaria {
    public static void main(String[] args) {

    }

    private void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private int buscaBinaria(int[] array, int target, int tam) {
        int sup = tam - 1;
        int inf = 0;
        while (inf <= sup) {
            int meio = (inf + sup) / 2;

            if (array[meio] == target)
                return meio;

            if (array[meio] < target)
                inf = meio - 1;

            else
                sup = meio + 1;

        }
        return -1;
    }
}