package juhwan;

import java.util.ArrayList;
import java.util.List;

public class Programmers_숫자_문자열과_영단어 {
    public static void main(String[] args) {

        String s = "zerothreefive55seven";

        solution(s);
    }

    private static void solution(String s) {

        char[] charS = s.toCharArray();
        List<Character> charList = new ArrayList<>();

        for (int i = 0; i < charS.length; i++) {
            if (charS[i] == 'z') {
                charList.add('0');
                i = i + 3;
            } else if (charS[i] == 'o') {
                charList.add('1');
                i = i + 2;
            } else if (charS[i] == 't') {
                if (charS[i + 1] == 'w') {
                    charList.add('2');
                    i = i + 2;
                } else {
                    charList.add('3');
                    i = i + 4;
                }
            } else if (charS[i] == 'f') {
                if (charS[i + 1] == 'o') {
                    charList.add('4');
                    i = i + 3;
                } else {
                    charList.add('5');
                    i = i + 3;
                }
            } else if (charS[i] == 's') {
                if (charS[i + 1] == 'i') {
                    charList.add('6');
                    i = i + 2;
                } else {
                    charList.add('7');
                    i = i + 4;
                }
            } else if (charS[i] == 'e') {
                charList.add('8');
                i = i + 4;
            } else if (charS[i] == 'n') {
                charList.add('9');
                i = i + 3;
            } else {
                charList.add(charS[i]);
            }
        }
        String answer = "";

        for (int i = 0; i < charList.size(); i++) {
            answer += charList.get(i);
        }
        System.out.println("answer = " + answer);
        int Answer = Integer.parseInt(answer);
        System.out.println("Answer = " + Answer);

    }


}
