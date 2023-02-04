function solution(babbling) {
   const regex = /(aya|ye|woo|ma)/g;

    let cnt = 0;
    for (let val of babbling) {
      val = val.replaceAll(regex, "");
      if (!val.length) cnt++;
    }
    
    return cnt;
}