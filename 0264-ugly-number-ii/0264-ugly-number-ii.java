class Solution {
    public int nthUglyNumber(int n) {
       int[] arr=new int[n];
       arr[0]=1;
       int p2=0,p3=0,p5=0;
       for(int i=1;i<n;i++){
            int n2=arr[p2]*2;
            int n3=arr[p3]*3;
            int n5=arr[p5]*5;
            arr[i]=Math.min(n2,Math.min(n3,n5));
            if(arr[i]==n2) p2++;
            if(arr[i]==n3) p3++;
            if(arr[i]==n5) p5++;
       }
       return arr[n-1];
    }
}