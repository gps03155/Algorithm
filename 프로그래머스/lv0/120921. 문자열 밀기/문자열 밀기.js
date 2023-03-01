function solution(A, B) {
    const arr = A.split("");
    let count = 0;

    while (true) {
      if (arr.join("") === B) {
        break;
      }

      arr.unshift(arr.pop());
      count++;

      if (arr.join("") === A) {
        count = -1;
        break;
      }
    }

    return count;
}