N = int(input())

for _ in range(0,N):
    ps = input()
    psList = list(ps)
    queuePs = []
    flag = False
    for v in psList:
        if v == "(":
            queuePs.append(v)
        else:
            if len(queuePs) > 0:
                queuePs.pop()
            else:
                flag = True
                break
    if len(queuePs) == 0 and flag == False:
        print("YES")
    else:
        print("NO")