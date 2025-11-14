package warmup.loops02;

public class NegativeNumbers {
    static int noOfNegativeNumbers(int[] arr){
        int count = 0;
        int n = arr.length;
        for(int i = 0 ; i<n ; i++){
            if(arr[i]<0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,2,-3,4,5,-6,7};
        int[] arr2 = {1,2,3,4,5,6};

        System.out.println(noOfNegativeNumbers(arr));
        System.out.println(noOfNegativeNumbers(arr2));
    }

}
