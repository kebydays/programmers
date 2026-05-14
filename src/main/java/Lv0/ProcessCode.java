package main.java.Lv0;

public class ProcessCode {
    public static String solution(String code) {
        int mode = 0;
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            if(c == '1')
                mode = 1 - mode;
            else if((mode == 0 && i % 2 == 0) | (mode == 1 && i % 2 == 1))
                ret.append(c);
        }
        String answer = ret.toString();
        return answer.isEmpty() ? "EMPTY" : answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }
}

// mode가 0일 땐 짝수, 1일 땐 홀수 인덱스를 추가하므로
// i의 홀짝 구분을 나머지값 대신 mode 값으로 판단할 수도 있음.