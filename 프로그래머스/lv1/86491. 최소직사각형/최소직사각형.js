function solution(sizes) {
   const w = [],
      h = [];

    for (let item of sizes) {
      w.push(Math.max(...item));
      h.push(Math.min(...item));
    }

    return Math.max(...w) * Math.max(...h);
}