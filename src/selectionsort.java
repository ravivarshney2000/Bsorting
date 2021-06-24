import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        System.out.println("unsorted --> " + Arrays.toString(arr));
        selectionsort obj = new selectionsort();
        obj.selectionSort(arr);
        System.out.println("sorted --> " + Arrays.toString(arr));
    }
    public void selectionSort(int[] arr){
        //step 1
        int sortedIndex = arr.length;
        int maximumElement;
        int maximumElementIndex;
        //step 2
        for (int i = 0; i < arr.length ; i++) {
            //step 3
            maximumElement = arr[0];
            maximumElementIndex = 0;
            for (int j = 0; j < sortedIndex; j++) {
                if(maximumElement < arr[j]){
                    maximumElement = arr[j];
                    maximumElementIndex = j;
                }
            }

            //step 4 swap
            --sortedIndex;
            int temp = arr[maximumElementIndex];
            arr[maximumElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
        }
    }

}
