class Solution {
    public boolean isValid(String s) {
        // stack

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[' );
        map.put(')', '(');
        map.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } 
            else if (!stack.isEmpty()){
                Character c = stack.pop();
                if (map.get(s.charAt(i)) != c) {
                    return false;
                }
            }
            else {
                return false;

            }
        }
        return stack.isEmpty();
    }
}
