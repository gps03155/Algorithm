function solution(array) {
    return array.reduce(
      (total, cur) => (total += String(cur).split("7").length - 1),
      0
    );
}