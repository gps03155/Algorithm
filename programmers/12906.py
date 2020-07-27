def solution(arr):
    answer = []
    
    for idx in range(len(arr)):
        if idx == 0:
            answer.append(arr[idx])
            
        if answer[-1] != arr[idx]:
            answer.append(arr[idx])
    
    return answer
