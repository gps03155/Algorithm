function solution(babbling) {
    let cnt = 0;
    const words = ["aya", "ye", "woo", "ma"];

    for (let val of babbling) {
      for (let word of words) {
        val = val.replace(word, " ");
      }

      if (!val.trim().length) cnt++;
    }

    return cnt;
}