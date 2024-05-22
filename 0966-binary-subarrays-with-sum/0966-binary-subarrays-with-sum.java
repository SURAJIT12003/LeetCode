class Solution {
    public int numSubarraysWithSum(int[] arr, int k) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        hs.put(0,1);
        int sum=0;
        int ans =0;
        int N = arr.length;
        for(int i=0;i<N;i++){
        
            sum=sum+arr[i];  
            int t = sum-k;
            if(hs.containsKey(t)){
                ans = ans+hs.get(t);
            }
            if(hs.containsKey(sum)){
                int get = hs.get(sum);
                get=get+1;
                hs.put(sum,get);
            }
            else{
                hs.put(sum,1);
            }
        }
        
        return ans;
    }
}