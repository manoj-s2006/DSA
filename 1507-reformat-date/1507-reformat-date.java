class Solution {
    public String reformatDate(String date) {
        String ans[]=date.split(" ");
        String day=ans[0].substring(0,ans[0].length()-2);
        if(Integer.parseInt(day)<10) day="0"+day;
        

        Map<String,String>mp=new HashMap<>();
        mp.put("Jan","01");
        mp.put("Feb","02");
        mp.put("Mar","03");
        mp.put("Apr","04");
        mp.put("May","05");
        mp.put("Jun","06");
        mp.put("Jul","07");
        mp.put("Aug","08");
        mp.put("Sep","09");
        mp.put("Oct","10");
        mp.put("Nov","11");
        mp.put("Dec","12");

        return ans[2]+"-"+mp.get(ans[1])+"-"+day;
        
    }
}