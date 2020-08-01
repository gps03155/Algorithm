def solution(x):
    answer = True
    
#     == case1 ==
#     
#     total = 0
#     origin = x
    
#     while origin:
#         total += origin % 10
#         origin //= 10
    
#     if x % total != 0:
#         answer = False


#     == case2 ==
    answer = x % sum(int(i) for i in str(x)) == 0
    
    return answer
