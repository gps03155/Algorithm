function solution(quiz) {
    const arr = [];
    for (let val of quiz) {
      const val2 = val.split("=");
      arr.push(eval(val2[0]) === Number(val2[1]) ? "O" : "X");
    }

    return arr;
}