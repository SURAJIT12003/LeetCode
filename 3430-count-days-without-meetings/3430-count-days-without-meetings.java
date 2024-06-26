class Solution {
    public int countDays(int days, int[][] mat) {
        Arrays.sort(mat, Comparator.comparingDouble(o -> o[0]));
        HashMap<Integer,Integer> hs = new HashMap<>();
        int s = mat[0][0];
        int e = mat[0][1];

        for(int i=1;i<mat.length;i++){
            int cs = mat[i][0];
            int ce = mat[i][1];

            if(e>=cs){
                e = Math.max(e,ce);
            }
            else{
                hs.put(s,e);
                s  = cs;
                e = ce;
            }
        }
        hs.put(s,e);
        
       
        int sum =0;
        for(int v:hs.keySet()){
            int t  = hs.get(v);
            int g = t-v;
            g++;
            sum+=g;
        }
    
        return days-sum;


      

    }
}