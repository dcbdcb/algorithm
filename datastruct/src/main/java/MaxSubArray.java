import java.io.IOException;
import java.util.Scanner;

public class MaxSubArray {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] arr = new int[a];
        int index = 0;
        while (in.hasNextInt()) {
           arr[index] = in.nextInt();
           index++;
           if (index == a) {
               function(a, arr);
               System.out.println(maxSubArray2(arr));
               return;
           }
        }
    }

    private static int maxSubArray(int[] arr) {
        int sum = 0; // 记录当前的和
        int res = Integer.MIN_VALUE;
        for (int n : arr) {
            // 如果累加到小于0了，就清零重新累加
            if (sum < 0) {
                sum = 0;
            }
            sum += n; // 累加
            res = Math.max(res, sum);
        }
        return res;
    }

    private static String maxSubArray2(int[] arr) {
        int sum = 0; // 记录当前的和
        int res = Integer.MIN_VALUE;
        int start = arr[0];
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            // 如果累加到小于0了，就清零重新累加
            if (sum < 0) {
                sum = 0;
            }
            sum += n; // 累加
            if (res >= sum) {

            } else {
                if (sum == n && res != 0) {
                    start = n;
                }
                res = sum;
                end = n;
            }
        }
        if (res < 0) {
            return "0" + " " + arr[0] + " " + arr[arr.length - 1];
        }
        return res + " " + start + " " + end;
    }

    static void function(int N,int[] arr){

        int thisSum = 0;
        int maxSum=0;
        int maxStartIndex = 0;
        int maxEndIndex = 0;
        int thisStartIndex=0;

        boolean is=false;

        /*-10 1 2 3 4 -5 -23 3 7 -21*/

        for (int i=0;i<N;i++){

            thisSum+=arr[i];

            if(thisSum > maxSum){
                maxSum = thisSum;
                maxStartIndex = thisStartIndex;
                maxEndIndex=i;

            }else if(thisSum<0){
                thisSum=0;
                thisStartIndex=i+1;
            }else if(maxSum==0&&arr[i]==0){

                maxStartIndex=i;

                maxEndIndex=i;

                is=true;

            }

        }

        if(maxSum==0&&is==false){
            maxStartIndex=0;
            maxEndIndex=arr.length-1;

        }

        System.out.println(maxSum+" "+arr[maxStartIndex]+" "+arr[maxEndIndex]);

    }

}
