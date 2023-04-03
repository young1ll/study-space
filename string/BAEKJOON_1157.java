//string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAEKJOON_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] counts = new int[26];//26개 알파벳 대문자 카운트 배열

        for(int i = 0; i < str.length(); i++) {
            counts[str.charAt(i) - 'A']++;//알파벳 대문자만 처리하기 때문에 'A'를 빼줌
        }
        //System.out.println(Arrays.toString(counts));
        int maxCnt = 0;
        char maxChar = '?';

        for(int i = 0; i < counts.length; i++) {
            if(counts[i] > maxCnt) {
                maxCnt = counts[i];
                maxChar = (char) ('A' + i);
            } else if(counts[i] == maxCnt) {
                maxChar = '?';
            }
        }

        System.out.println(maxChar);
    }
}