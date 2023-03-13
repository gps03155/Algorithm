function solution(t, p) {
    let count = 0;

    for (let i = 0; i < t.length; i++) {
      if (i + p.length > t.length) {
        continue;
      }

      const num = t.substring(i, i + p.length);

      if (parseInt(num) <= parseInt(p)) {
        count++;
      }
    }

    return count;
}