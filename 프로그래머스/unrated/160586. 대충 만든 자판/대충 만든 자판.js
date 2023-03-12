function solution(keymap, targets) {
    const result = [];
    for (let target of targets) {
      let sum = 0;
      for (let i of target.split("")) {
        let min = Number.MAX_VALUE;

        for (let j in keymap) {
          if (keymap[j].indexOf(i) > -1) {
            min = Math.min(min, keymap[j].indexOf(i) + 1);
          }
        }

        if (min === Number.MAX_VALUE) {
          sum = -1;
          break;
        } else if (min > -1) {
          sum += min;
        }
      }
      result.push(sum);
    }

    return result;
}