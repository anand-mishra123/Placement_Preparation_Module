class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                sb1.append(c);
            } else if (sb1.length() > 0) {
                sb1.deleteCharAt(sb1.length() - 1);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (c != '#') {
                sb2.append(c);
            } else if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }
        return sb1.toString().equals(sb2.toString());
    }

}