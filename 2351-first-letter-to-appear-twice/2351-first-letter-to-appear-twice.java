class Solution {
    public char repeatedCharacter(String s) {
      Set<Character>x=new HashSet<>();
      for(int i=0;i<s.length();i++){
        if(!x.contains(s.charAt(i))){
            x.add(s.charAt(i));
        }
        else{
            return s.charAt(i);
        }
      }
      return ' ';
     
        
    }
}