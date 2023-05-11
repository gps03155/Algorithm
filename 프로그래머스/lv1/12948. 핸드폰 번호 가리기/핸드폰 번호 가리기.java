class Solution {
    public String solution(String phone_number) {
        int length = phone_number.length() - 4;
        return phone_number.replaceAll("^\\d{" + length + "}", "*".repeat(length));
    }
}