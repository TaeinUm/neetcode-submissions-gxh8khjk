class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> t = new ArrayList<>();

        for (int i=0; i<nums.length; i++) {
            if (t.contains(nums[i])) {
                return true;
            }
            t.add(nums[i]);
        }

        return false;
    }
}