public int minSteps(String s, String t) {
    int[] map=new int[26];
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map[ch-'a']++;
    }
    
    for(int i=0;i<t.length();i++){
        char ch=t.charAt(i);
        map[ch-'a']--;
    }
    
    
    int ans=0;
    for(int i=0;i<26;i++){
        if(map[i]>0){
            ans+=map[i];
        }
    }
    return ans;
}