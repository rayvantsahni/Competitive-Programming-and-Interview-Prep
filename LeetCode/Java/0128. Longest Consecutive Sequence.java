class Solution {
    public int longestConsecutive(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return n;

		int count = 0;
		int max = 1;

		HashSet<Integer> set = new HashSet<>();
		for (int a: arr)
			set.add(a);

		for (int a: arr) {
			if (!set.contains(a - 1)) {
				count = 1;
				set.remove(a);
				while (set.contains(++a)) {
					count++;
					set.remove(a);
				}
				max = Math.max(max, count);
			}
		}

		return max;
    }
}
