class Solution {
    public boolean isAnagram(String s, String t) {
        char [] cs= s.toCharArray();
        char [] ct=t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        int i=0;
        if(cs.length==ct.length){
        while(i<cs.length){
            if(cs[i]==ct[i]){
                i++;
            }else{
                return false;
            }
        }
        return true;
        }
        else{
            return false;
        }
        /*if(Arrays.equals(cs,ct)){
        return true;
        }
        return false;*/
    }
}
