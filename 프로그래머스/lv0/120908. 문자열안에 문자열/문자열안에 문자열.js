function solution(str1, str2) {
    return new RegExp(str2, 'g').test(str1)? 1 : 2;
}