function solution(quiz) {
    const arr = [];
    for (let val of quiz) {
      const [formula, result] = val.split("=");
      arr.push(eval(formula) === Number(result) ? "O" : "X");
    }

    return arr;
}