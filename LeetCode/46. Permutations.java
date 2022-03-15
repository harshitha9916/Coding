class Solution {
    public void recPermutations(int idx,List<List<Integer>> ans,  int[] nums){
        
        if(idx == nums.length ){ 
             List<Integer> ds = new ArrayList<>();
             for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
             }
            ans.add(new ArrayList<>(ds));
        }
                    
         for(int i=idx;i<nums.length;i++){
             swap(i,idx,nums);
             recPermutations(idx+1,ans,nums);
             swap(i,idx,nums);
         }
        
    }
    public void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
       // List<Integer> ds = new ArrayList<>();
        recPermutations(0,ans,nums);
        return ans;
    }
}

----------------------------------------------------------------------------------------------

class Solution {
    public void recPermutations(int[] nums, List<List<Integer>> ans, List<Integer> ds,boolean[] freq){
        
        if(ds.size() == nums.length){ 
            ans.add(new ArrayList<>(ds));
        }
        
        for(int i=0;i<nums.length;i++){
            if( !freq[i]){

                freq[i] = true;
                ds.add(nums[i]);
                recPermutations(nums,ans,ds,freq);
                
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
        
    }
 
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recPermutations(nums,ans,ds,freq);
        return ans;
        
    }
}
