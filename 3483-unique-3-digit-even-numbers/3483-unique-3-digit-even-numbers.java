class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        HashSet<Integer> set=new HashSet<>();
        boolean[] used=new boolean[n];
        solve(digits,0,0,set,used);
        return set.size();
    }
    public void solve(int[]digits,int idx,int num,HashSet<Integer>set,boolean[]used){
        if(idx==3){
            set.add(num);
            return;
            
        }
        
        for(int i=0;i<digits.length;i++){
           if(used[i]) continue;
           if(idx==0 && digits[i]==0) continue;
           if (idx == 2 && digits[i] % 2 != 0) continue;
           used[i]=true;
           solve(digits,idx+1,num*10+digits[i],set,used);
           used[i]=false;
        }
    }
}