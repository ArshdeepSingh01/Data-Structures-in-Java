public class bubbleSort {

    static void bubbleSort(int[] arr){
        int temp;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = 1 ; j < n-1; j++){
                if(arr[j-1]>arr[j]){
                    //Swapping the elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {11,5,45,77,55,63};
        System.out.println("Array before sorting : ");
        //Enhanced for loop for printing Array
        for (int j : arr) {
            System.out.println(j + " ");
        }
        //Calling the Bubble Sort method
        bubbleSort(arr);
        System.out.println("Array after sorting : ");
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }
}
