package com.github.TebogoP;

public class StringUtils {

    public String reverse(String word) {
        String charWord[] = word.split("");
        String reversedWord = "";
        for(int i = charWord.length -1 ; i >= 0 ; i -- ){
            reversedWord += charWord[i];
        }
        return reversedWord;
    }
}
