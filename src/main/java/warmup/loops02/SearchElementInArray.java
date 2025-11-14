package warmup.loops02;

public class SearchElementInArray {
    static int searchElement(int[] arr, int x){
        int n = arr.length;
        // looping through the array
        for(int i = 0 ; i<n ; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,54,24,43,5,7,9};
        int search1 = searchElement(arr1, 5);
        System.out.println("index is: " + search1);

        int search2 = searchElement(arr1, 8);
        System.out.println("index is: " + search2);
    }
}
