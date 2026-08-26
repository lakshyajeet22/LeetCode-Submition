class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        int i=0, c=0; 
        String ans="";
        int minS=0, minL=Integer.MAX_VALUE;

        for( i=0; i<t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)+1);
        }
        i=0;
        for(int j=0; j<s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)-1);
                if(map.get(s.charAt(j))>=0) c++;
            }
            while(c==t.length()){
               if(j-i+1<minL){
                    minL=j-i+1;
                    minS=i;
               }
               if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
                if(map.get(s.charAt(i))>0) c--;
                
               }
               i++;
            }
        }

        if(minL==Integer.MAX_VALUE) return "";
        return s.substring(minS, minS+minL);

    }
}