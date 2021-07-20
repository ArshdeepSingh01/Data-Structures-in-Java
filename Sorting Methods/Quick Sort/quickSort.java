public class quickSort {
    public static int partition(int[] arr, int beg , int end){
        int pivot = arr[end];
        int pIndex = beg-1;
        for(int i = beg; i< end; i++){
            if(arr[i]<= pivot){
                pIndex++;
                //Swap arr[pIndex] and arr[i]
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp;
            }
        }
        //Swap arr[pIndex+1] and arr[end](pivot)
        int temp = arr[pIndex+1];
        arr[pIndex+1] = arr[end];
        arr[end] = temp;

        return pIndex+1;
    }
    public static void sort(int[] arr, int beg , int end){
        if(beg<end){
            int pi = partition(arr,beg,end);
            sort(arr, beg , pi-1);
            sort(arr,pi+1, end);
        }
    }
    //Driver code
    public static void main(String[] args) {
        int[] arr = {2,30 ,45,68,70,5,6};
        System.out.println("Array before sorting : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
        int n = arr.length;
        sort(arr,0,n-1);
        System.out.println();
        System.out.println("Array after sorting : ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
