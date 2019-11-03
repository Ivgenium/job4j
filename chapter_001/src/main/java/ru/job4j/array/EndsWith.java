package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        //for (int i =)
        int wordLength = word.length;
        int postLength = post.length;
        for (int i = wordLength - 1; i > wordLength - postLength - 1; i--) {
            if (word[i] != post[i - postLength - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
