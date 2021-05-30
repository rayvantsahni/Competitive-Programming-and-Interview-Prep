class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i = 0;
        int j = 0;
        HashSet<Integer> intersections = new HashSet<>();
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersections.add(arr1[i]);
                i++;
                j++;
            }
            
            else if (arr1[i] < arr2[j]) 
                i++;
            else if (arr1[i] > arr2[j])
                j++;
        }
        
        return intersections.stream().mapToInt(Number::intValue).toArray();
    }
}
