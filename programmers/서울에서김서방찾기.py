def solution(seoul):
    answer = ''
    
    # case1
    # for idx, value in enumerate(seoul):
    #     if value == 'Kim':
    #         answer = '김서방은 {}에 있다'.format(idx);
    #         break;
    
    #case2
    answer = '김서방은 {}에 있다'.format(seoul.index('Kim'));
    
    return answer;
