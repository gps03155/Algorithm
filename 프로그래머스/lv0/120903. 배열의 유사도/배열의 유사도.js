function solution(s1, s2) {
    return s1.filter(m => s2.includes(m)).length;
}