class Solution {
    static int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        if(n <= 1) return 0;
        if(arr[0] == 0) return -1;
        
        int jumps = 1, farthest = arr[0], currEnd = arr[0];
        for(int i = 1; i < n; i++){
            if(i == n - 1) return jumps;
            farthest = Math.max(farthest, i + arr[i]);
            if(i == currEnd){
                jumps++;
                if(farthest <= i) return -1;
                currEnd = farthest;
            }
        }
        return -1;
    }
}
