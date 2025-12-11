import sys

cnt = int(sys.stdin.readline())

answer = 0
setList = set([])

for _ in range(0,cnt):
    name = sys.stdin.readline().strip()
    if name == "ENTER":
        answer += len(setList)
        setList = set([])
    else :
        setList.add(name)

answer += len(setList)
print(answer)