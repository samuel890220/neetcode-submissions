class Solution {
    public boolean checkInclusion(String s1, String s2) {
         Map<Character, Integer> s1Count = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Count.put(c, s1Count.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowCount = new HashMap<>();
        int l = 0;
        for (int r = 0; r < s2.length(); r++) {
            windowCount.put(s2.charAt(r), windowCount.getOrDefault(s2.charAt(r), 0) + 1);
            
            if (r - l + 1 > s1.length()) {
                windowCount.put(s2.charAt(l), windowCount.getOrDefault(s2.charAt(l), 0) - 1);
                if (windowCount.get(s2.charAt(l)) == 0) {
                    windowCount.remove(s2.charAt(l));
                }
                l++;
            }

            // 視窗長度剛好等於 s1 長度,比對兩個 Map
            if (r - l + 1 == s1.length() && windowCount.equals(s1Count)) {
                return true;
            }
        }
        return false;
    }
}
