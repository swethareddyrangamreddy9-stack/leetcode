class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k1=0;
        int[] a=new int[set.size()];
        for(int x:set){
            a[k1++]=x;
        }*/
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}