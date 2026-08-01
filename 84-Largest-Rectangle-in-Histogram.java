class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int pse[] = new int[n];
        int nse[] = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i] = -1;
            }else{
                pse[i] = st.peek();
            }
            st.push(i);
        }

        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty() && heights[st2.peek()] >= heights[i]){
                st2.pop();
            }
            if(st2.isEmpty()){
                nse[i] = n;
            }else{
                nse[i] = st2.peek();
            }
            st2.push(i);
        }
        int res =0;
        for(int i=0; i<n;i++){
            int wid = nse[i]-pse[i]-1;
            int area = heights[i]*wid;
            res = Math.max(area, res);
        }
        return res;
    }
}