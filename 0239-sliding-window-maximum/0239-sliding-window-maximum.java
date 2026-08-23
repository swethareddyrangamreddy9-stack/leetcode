class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> que=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(que.isEmpty() || nums[que.peekLast()]>=nums[i]){
                que.offer(i);
            }
            else{
                while(!que.isEmpty() && nums[que.peekLast()]<nums[i]){
                que.pollLast();                
                }
                que.offer(i);
            }   
        }
        int n=nums.length,k1=0;
        int[] res=new int[n-k+1];
        res[k1++]=nums[que.peek()];
        for(int i=k;i<n;i++){
            if(que.peek()==i-k){
                que.pollFirst();
            }
            if(que.isEmpty() || nums[que.peekLast()]>=nums[i]){
                que.offer(i);
            }else{
            while(!que.isEmpty() && nums[que.peekLast()]<nums[i]){
                que.pollLast();                
            }
                que.offer(i);
            }
            res[k1++]=nums[que.peek()];
            
        }
    return res;

    }
}