class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
            return new ArrayList();
            
        HashMap<String, List> anagramGroups = new HashMap<>();

        for (String word: strs) {
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = String.valueOf(wordArray);
            
            if (!anagramGroups.containsKey(sortedWord))
                anagramGroups.put(sortedWord, new ArrayList());
            
            anagramGroups.get(sortedWord).add(word);
        }
        
        return new ArrayList(anagramGroups.values());
    }
}
