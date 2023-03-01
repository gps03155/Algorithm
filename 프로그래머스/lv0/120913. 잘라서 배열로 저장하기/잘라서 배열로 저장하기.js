function solution(my_str, n) {
    const arr = [];
    let length = 0;

    while (arr.join("") !== my_str) {
      arr.push(my_str.substring(length, n + length));
      length += n;
    }
    
    return arr;
}