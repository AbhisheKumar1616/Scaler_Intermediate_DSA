public class Composite_in_range {
    public int[] solve(int[] A, int[][] B) {
        int n=A.length;
        int [] f_arr=new int[n];
        f_arr[0]=factor_count(A[0]);
        System.out.println(f_arr[0]);
        for(int i=1;i<n;i++){
            f_arr[i]=f_arr[i-1]+factor_count(A[i]);
            System.out.println(f_arr[i]);
        }
        int [] ans=new int[B.length];
        for(int i=0;i<B.length;i++){
            if(B[i][0]==0)
                ans[i]=f_arr[B[i][1]];
            else{
                ans[i]=f_arr[B[i][1]]-f_arr[(B[i][0]-1)];
            }
        }
        return ans;

    }
    public int factor_count(int A) {
        int f=0;
        for(int i=1;i*i<=A;i++){
            if(A%i==0 && i*i!=A)
                f+=2;
            else if(A%i==0 && i*i!=A)
                f+=1;
        }
        if(f>2)
            return 1;

        return 0;
    }
}

