function solution(today, terms, privacies) {
    const result = [];
    for (let i in privacies) {
      const [privacy_date, privacy_name] = privacies[i].split(" ");

      for (let term of terms) {
        const [term_name, term_month] = term.split(" ");

        if (term_name === privacy_name) {
          const date = new Date(privacy_date);
          date.setMonth(date.getMonth() + Number(term_month));

          if (new Date(today).getTime() >= date.getTime()) {
            result.push(Number(i) + 1);
          }
        }
      }
    }

    return result;
}