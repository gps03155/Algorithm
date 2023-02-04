function solution(common) {
    let addDiff = common[1] - common[0];
    let mulDiff = common[1] / common[0];

    if (common[common.length - 1] === common[common.length - 2] * mulDiff) {
      return common[common.length - 1] * mulDiff;
    } else return common[common.length - 1] + addDiff;
}