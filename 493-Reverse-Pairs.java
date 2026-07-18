class Solution {
    int ans=0;
    public int reversePairs(int[] nums) {
        mergersort(nums,0,nums.length-1);
        return ans;
    }
    public void mergersort(int []nums,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergersort(nums,low,mid);
        mergersort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }

    public void merge(int []nums,int low,int mid,int high){
        int j=mid+1;
        for(int i=low;i<=mid;i++){
            while(j<=high && nums[i]>2L*nums[j]){
                j++;
            }
            ans=ans+(j-(mid+1));
        }
        int temp[]=new int[high-low+1];
        int k=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]>nums[right]){
                temp[k++]=nums[right++];
            }else{
                temp[k++]=nums[left++];
            }
        }
        while(left<=mid){
            temp[k++]=nums[left++];
        }
        while(right<=high){
             temp[k++]=nums[right++];
        }
        for(int i=0;i<temp.length;i++){
            nums[low+i]=temp[i];
        }
    }
}