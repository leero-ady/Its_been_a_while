public class maximum_sum_contiguous_k {

    private static int maximum_sum_contiguous_k(int[] input, int n ,int m){

        int curr_max=0;
        int max=0;

        for(int i=0;i<m;i++){

            curr_max=curr_max+input[i];

        }
        max = curr_max;

        for(int i=m;i<n;i++){

            curr_max = max - input[i-m] +input[i];
            if(curr_max > max)
                max = curr_max;

        }


        return max;
    }


    public static void main(String[] args){


        int input[ ] = { 2, 1, 3, 5, 0 ,1 ,4};
        int n = input.length;
        int m = 3;

        System.out.print(maximum_sum_contiguous_k(input,n,m));

    }





}
