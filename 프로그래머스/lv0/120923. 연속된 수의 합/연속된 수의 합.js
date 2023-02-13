function solution(num, total) {
   let sum = 0;
    const result = [];
    let i = 1000;

    while(true){
        result.push(i);

        if(result.length > num){
          result.splice(0, 1);
        }

        if(result.length === num){
          if(result.reduce((tot, cur) => tot + cur, 0) === total){
            return result.sort((a, b) => a - b);
          }
        }
        i--;
    }
    
    return result;
}