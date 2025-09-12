class Solution {
    public int mostFrequentElement(int[] nums) {
            HashMap<Integer,Integer> map=new HashMap<>();
            int maxEleFreq=Integer.MIN_VALUE;
            int maxEle=Integer.MAX_VALUE;
            for (int i = 0; i < nums.length; i++) {
			int k = 1;
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i],k);
			}
			maxEleFreq=Math.max(maxEleFreq,map.get(nums[i]));
		}

        for(Map.Entry<Integer,Integer> et: map.entrySet()){
            if(et.getValue()==maxEleFreq){
                if(et.getKey()<maxEle){
                    maxEle=et.getKey();
                }
            }
        }
        return maxEle;

    }
}


/*

Time Complexity: O(n)
Space Complexity: O(k)
*/
