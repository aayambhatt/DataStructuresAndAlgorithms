package warmup;

public class SecondLargest {
    static int secondLargestNumMyFirstApproach(int[] arr){
        // solved using two for loops, O(n)
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i]>maxNum){
                maxNum = arr[i];
            }
        }
        int smax = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]<maxNum && arr[i]>smax){
                smax = arr[i];
            }
        }
        return smax;
    }

    static int secondLargestOneGo(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max){
                smax = arr[i];
            }
        }
        return smax;
    }

    public static void main(String[] args) {
        int[] arr = {4,9,0,2,8,7,9};

        System.out.println(secondLargestNumMyFirstApproach(arr));
        System.out.println(secondLargestOneGo(arr));
    }
}
