public class bubbleSortOptimized {

    static void bubbleSortOptimized(int[] arr){
        int temp;
        for(int i = 0 ; i < arr.length -1 ; i++){
            boolean is_sorted = true;
            //To skip the already sorted largest elements
            for(int j = 1 ; j < arr.length-1-i ;j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    is_sorted = false;
                }
            }
            if(is_sorted)
                return;
        }
    }
    public static void main(String[] args){
        int[] arr = {11,5,45,77,55,63};
        System.out.println("Array before sorting : ");
        //Enhanced for loop for printing Array
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        //Calling the Bubble Sort method
        bubbleSortOptimized(arr);
        System.out.println("Array after sorting : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
