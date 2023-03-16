function solution(s) {
    let first;
    let first_count = 0;
    let other_count = 0;

    let result = 0;

    for (let i = 0; i < s.length; i++) {
      if (!first) {
        first = s[i];
      }

      if (s[i] === first) {
        first_count++;
      } else {
        other_count++;
      }

      if (first_count === other_count) {
        result++;
        first_count = 0;
        other_count = 0;
        first = null;
      } else if (i === s.length - 1) {
        result++;
      }
    }

    return result;
}