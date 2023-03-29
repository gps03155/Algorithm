import java.util.regex.Pattern;
class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            String babble = babbling[i];

            if (Pattern.matches(".*((aya){2}|(ye){2}|(woo){2}|(ma){2}).*", babble)) {
                continue;
            }

            while (babble.contains("aya") || babble.contains("ye") || babble.contains("woo") || babble.contains("ma")) {
                babble = babble.replaceFirst("(aya|ye|woo|ma)", " ");
            }

            if (babble.trim().isEmpty()) {
                count++;
            }
        }

        return count;
    }
}