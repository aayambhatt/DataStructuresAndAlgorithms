package warmup.loops02;

public class LargestNumber {
    static int findLargestNumber(int[] arr){
        int maxNum = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>maxNum){
                maxNum = arr[i];
            }
        }

        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,5,8,3,4,7};
        System.out.println(findLargestNumber(arr1));

        int[] arr2 = {22,3,4,5,51,23,43,14};
        System.out.println(findLargestNumber(arr2));
    }
}
