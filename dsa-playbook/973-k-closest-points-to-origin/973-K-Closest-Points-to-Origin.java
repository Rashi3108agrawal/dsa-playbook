class Pair{
    int x;
    int y;
    public Pair(int x, int y){
        this.x =x;
        this.y = y;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        if(n<=k) return points;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> (a.x*a.x + a.y*a.y)-( b.x*b.x+ b.y*b.y));
        for(int i=0;i<n;i++){
            int [] temp = points[i];
            int x = temp[0];
            int y = temp[1];
            pq.add(new Pair(x,y));
        }
        int[][] res = new int[k][2];
        int i=0;
        while(k-->0){
            Pair p = pq.poll();
            int x = p.x;
            int y = p.y;
            res[i][0] = x;
            res[i][1] =y;
            i++;
        }
        return res;
    }
}