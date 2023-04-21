function solution(x, n) {
    return Array(n)
          .fill(x)
          .map((m, index) => m + x * index);
}