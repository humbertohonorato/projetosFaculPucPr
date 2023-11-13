public class Main {
    public static void main(String[] args) {

        System.out.println("Array antes da ordenação:");
        int[] array = {3,6,8,1,4,9,0};
        Sort.printArray(array);

        System.out.println("Array depois da ordenação com bolha:");
        Sort.bubbleSort(array);
        Sort.printArray(array);

        System.out.println("Array antes da ordenação:");
        int[] array2 = {3,6,8,1,4,9,0};
        Sort.printArray(array2);

        System.out.println("Array depois da ordenação com seleção:");
        Sort.selectionSort(array2);
        Sort.printArray(array2);
    }
}