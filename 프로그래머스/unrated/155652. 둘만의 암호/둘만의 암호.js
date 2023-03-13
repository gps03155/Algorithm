function solution(s, skip, index) {
    let result = "";
    for (let item of s.split("")) {
      const arr = [];
      let charIndex = 1;
      while (arr.length < index) {
        const ascii = item.charCodeAt(0) + charIndex;
        const alpha = String.fromCharCode(97 + ((ascii - 97) % 26));

        if (!skip.includes(alpha)) {
          arr.push(alpha);
        }
        charIndex++;
      }
      result += arr[arr.length - 1];
    }

    return result;
}