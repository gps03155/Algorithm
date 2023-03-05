function solution(num, k) {
    const index = num.toString().indexOf(k);
    return index > -1 ? index + 1 : -1;
}