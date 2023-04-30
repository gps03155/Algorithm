class Solution {
    public int gcd(int a, int b){
        return b == 0? a : gcd(b, a % b);
    }
    
    public int solution(int[] arr) {
        int lcd = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            lcd = (lcd * arr[i + 1]) / gcd(lcd, arr[i + 1]);
        }
        
        return lcd;
    }
}