function solution(park, routes) {

    const board = [];
    let dog = [0, 0];

    for (let [index, item] of park.entries()) {
      if (item.includes("S")) {
        dog = [index, item.indexOf("S")];
      }

      board.push(item.split(""));
    }

    for (let route of routes) {
      const [direction, distanceStr] = route.split(" ");
      const distance = Number(distanceStr);

      let isMove = true;
      switch (direction) {
        case "N": // 북
          if (dog[0] - distance >= 0) {
            for (let i = 1; i <= distance; i++) {
              if (board[dog[0] - i][dog[1]] === "X") {
                isMove = false;
                break;
              }
            }

            if (isMove) {
              dog[0] -= distance;
            }
          }
          break;
        case "E": // 동
          if (dog[1] + distance < board[0].length) {
            for (let i = 1; i <= distance; i++) {
              if (board[dog[0]][dog[1] + i] === "X") {
                isMove = false;
                break;
              }
            }

            if (isMove) {
              dog[1] += distance;
            }
          }
          break;
        case "S": // 남
          if (dog[0] + distance < board.length) {
            for (let i = 1; i <= distance; i++) {
              if (board[dog[0] + i][dog[1]] === "X") {
                isMove = false;
                break;
              }
            }

            if (isMove) {
              dog[0] += distance;
            }
          }
          break;
        case "W": // 서
          if (dog[1] - distance >= 0) {
            for (let i = 1; i <= distance; i++) {
              if (board[dog[0]][dog[1] - i] === "X") {
                isMove = false;
                break;
              }
            }

            if (isMove) {
              dog[1] -= distance;
            }
          }
      }
    }

    return dog;
}