class Solution {
    public int trap(int[] ht) {
        int n = ht.length;
        int l=0;
        int lm =0;
        int r= n-1;
        int rm =0;
        int water =0;
        while(l<r){
            if(ht[l]<ht[r]){
                if(ht[l]>= lm){
                    lm = ht[l];
                }else{
                    water+= lm- ht[l];
                }
                l++;
            }else{
                if(ht[r]>= rm){
                    rm = ht[r];
                }else{
                    water+= rm-ht[r];
                }
                r--;
            }
        }
        return water;
    }
}