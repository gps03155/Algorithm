function solution(s) {
    const result = [];

    for (let i = 0; i < s.length; i++) {
      let index = -1;
      for (let j = 0; j < i; j++) {
        if (s[j] === s[i]) {
          index = i - j;
        }
      }

      result.push(index);
    }

    return result;
}