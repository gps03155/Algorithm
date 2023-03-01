function solution(M, N) {
    const row = M - 1;
    const col = (N - 1) * M;
    
    return row + col;
}