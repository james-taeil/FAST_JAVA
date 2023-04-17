package Programmers;

public class SecretMap {
    public String[] SecretMap(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 5 => 00101

            // decimal => binary
            String binaryString = Long.toBinaryString(arr1[i] | arr2[i]); // 비트 연산
            // arr1[i]: 16bit
            // arr2[i]: 16bit
            // arr1[i] | arr2[i]: 16bit
            // long: 64bit
            // String: "1111111111111111" => 16byte

            // 10010 | 01101 => "11111"

//            System.out.println(binaryString.getBytes().length); // 16 바이트

            binaryString = String.format("%" + n + "s", binaryString);

            binaryString = binaryString.replace("1", "#");
            binaryString = binaryString.replace("0", " ");
            answer[i] = binaryString;
        }

        return answer;
    }
}


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

            binaryString = binaryString.replace("1" , "#");
            binaryString = binaryString.replace("0" , " ");

            answer[i] = binaryString;

            // toBinaryString 10진수 => 2진수
            // replace 문자 바꾸는 method
        }

        return answer;
    }
}

