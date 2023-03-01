function solution(my_string) {
    return my_string
            .split("")
            .map((m) => m.toLowerCase())
            .sort()
            .join("");
}