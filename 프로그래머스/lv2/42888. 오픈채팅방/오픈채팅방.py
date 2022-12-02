def solution(record):
    enter_info = []
    user_info = {}
    
    
    for i in range(len(record)):
        string = record[i].split(' ')
        
        if string[0] == 'Enter':
            enter_info.append([string[1], string[0]])       # 출입 정보 저장
            user_info[string[1]] = string[2]
        elif string[0] == 'Leave':
            enter_info.append([string[1], string[0]])
        elif string[0] == 'Change':
            user_info[string[1]] = string[2]

    result =[]
    for i in range(len(enter_info)):
        result_str = user_info[enter_info[i][0]] + "님이 "
        
        if enter_info[i][1] == "Enter":
            result_str = result_str + "들어왔습니다."
        elif enter_info[i][1] == 'Leave':
            result_str = result_str + "나갔습니다."
            
        result.append(result_str)
    return result