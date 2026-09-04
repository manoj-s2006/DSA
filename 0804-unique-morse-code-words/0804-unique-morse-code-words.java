class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
        "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
        ".--","-..-","-.--","--.."};

        Set<String> set = new HashSet<>();

        for(String w : words){
            StringBuilder s = new StringBuilder();
            for(char ch : w.toCharArray()){
                s.append(code[ch - 'a']);
            }
            set.add(s.toString());
        }
        return set.size();

    }
}