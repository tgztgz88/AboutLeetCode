package com.tgz.leetCodeSimple;

import java.util.HashMap;
import java.util.Map;

public class WordPatternTest {
    public static void main(String[] args) {
        String pattern = "abba";
        String str="dog dog dog dog";
        WordPatternTest wordPatternTest = new WordPatternTest();
        boolean result=wordPatternTest.wordPattern(pattern,str);
        System.out.println(result);
    }
    public boolean wordPattern(String pattern, String str) {
        if (str.length()<0){return false;}
        int strlen=str.length();
        int patternlen=pattern.length();
        Map<Character,String> char2str=new HashMap<>();
        Map<String,Character> str2char=new HashMap<>();
        int i=0;
        for (int k = 0; k < patternlen; k++) {
            int j=i;
            if (j>=strlen){
                return false;
            }
            while (j<strlen&&str.charAt(j)!=' '){
                j++;
            }
            String ssnow=str.substring(i,j);
            if(char2str.get(pattern.charAt(k))==null){
                char2str.put(pattern.charAt(k),ssnow);
            }
            if(str2char.get(ssnow)==null){
               str2char.put(ssnow,pattern.charAt(k));
            }
            if (str2char.get(ssnow)!=pattern.charAt(k)){
                return false;
            }
            if (!char2str.get(pattern.charAt(k)).equals(ssnow)){
                return false;
            }
            i=j+1;
        }
        return i>strlen;
    }
}
