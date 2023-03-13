function solution(cards1, cards2, goal) {
    for (let item of goal) {
      let isGoal = false;

      if (cards1[0] === item) {
        cards1.splice(0, 1);
        isGoal = true;
      }

      if (cards2[0] === item) {
        cards2.splice(0, 1);
        isGoal = true;
      }

      if (!isGoal) {
        return "No";
      }
    }

    return "Yes";
}