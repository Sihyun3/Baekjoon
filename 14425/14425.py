import sys

n, m = map(int, sys.stdin.readline().split())

setList = set([])
count = 0
for _ in range (0,n):
    setList.add(sys.stdin.readline())

for _ in range (0,m):
    line = sys.stdin.readline()
    if line in setList:
        count += 1
        
print(count)