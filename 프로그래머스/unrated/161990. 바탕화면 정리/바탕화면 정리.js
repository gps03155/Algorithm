function solution(wallpaper) {
    const arr = [];

    for (let i of wallpaper) {
      arr.push(i.split(""));
    }

    let minRow = Number.MAX_VALUE;
    let minCol = Number.MAX_VALUE;
    let maxRow = Number.MIN_VALUE;
    let maxCol = Number.MIN_VALUE;

    for (let i in arr) {
      for (let j in arr[i]) {
        if (arr[i][j] == "#") {
          minRow = Math.min(minRow, i);
          minCol = Math.min(minCol, j);
          maxRow = Math.max(maxRow, Number(i) + 1);
          maxCol = Math.max(maxCol, Number(j) + 1);
        }
      }
    }

    return [minRow, minCol, maxRow, maxCol];
}