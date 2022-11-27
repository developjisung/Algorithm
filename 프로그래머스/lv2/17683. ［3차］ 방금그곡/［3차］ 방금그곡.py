def solution(m, musicinfos):
    result = []
    before, after = ['A#','C#','D#','F#','G#','E#'], ['H','I','J','K','L','M']
    
    for i in range(5):
        m = m.replace(before[i],after[i])

    for i in musicinfos:
        start, finish, name, code = i.split(',')
        temp_code = ""
        h_diff = int(finish[:2]) - int(start[:2])
        m_diff = int(finish[3:]) - int(start[3:])     
        time = 0

        if m_diff == 0:
            time = time + h_diff * 60
        elif m_diff < 0:
            time = time + ((h_diff-1) * 60) + abs(60-int(start[3:]) + int(finish[3:]))
        else:
            time = time + (h_diff * 60) + m_diff
            
            
        for i in range(5):
            code = code.replace(before[i],after[i])

        for j in range(time):
            temp_code += code[j % len(code)]

        if m in temp_code:
            result.append([name, time])
    
    if len(result) == 0:
        return "(None)"
    else:
        result.sort(key = lambda x:x[1], reverse= True)
        return result[0][0]