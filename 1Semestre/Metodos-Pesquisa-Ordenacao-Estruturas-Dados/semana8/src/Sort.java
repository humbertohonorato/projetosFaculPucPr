public class Sort {

    // Bubble Sort - Algoritmo de ordenação por bolha de forma recursiva
    private static void recursiveBubbleSort(int[] array, int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
            }
        }
        recursiveBubbleSort(array, n-1);
    }

    public static void bubbleSort(int[] array) {
        recursiveBubbleSort(array, array.length);
    }

    // Selection Sort - Algoritmo de ordenação por seleção
    public static int[] selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca os elementos de posição
            swap(array, i, minIndex);
        }
        return array;
    }

    // Troca dois elementos de posição no array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Imprime o array na tela
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
