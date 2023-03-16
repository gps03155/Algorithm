function solution(k, score) {     
    const result = [];
    let rank = [];

    for (let item of score) {
      rank.push(item);
      rank.sort((a, b) => b - a);
      rank = rank.slice(0, k);
      result.push(Math.min(...rank));
    }
    
    return result;
}