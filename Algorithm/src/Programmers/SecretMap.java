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
