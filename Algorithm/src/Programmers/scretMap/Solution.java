package Programmers.scretMap;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {

            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);
            // Integer : 32bit
            // programmers test case 1, 6이 비약적으로 느려짐
            // Long으로 하는게 비교적 빨라보인다.

            // 왼쪽 0 없에고 오른쪽으로 밀어내는 방법
            binaryString = String.format("%" + n + "s", binaryString);

            binaryString = binaryString.replace("1", "#");
            binaryString = binaryString.replace("0", " ");

            answer[i] = binaryString;

            // toBinaryString 10진수 => 2진수
            // replace 문자 바꾸는 method
        }

        return answer;
    }
}
