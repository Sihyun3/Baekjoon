import sys

L = int(input())
S = list(map(int, input().split()))
n = int(input())
S=[0]+S
S.sort()

min = 0
max = 0
if n in  S:
    print(0)
    sys.exit()

for v in S:
    if n>v:
        min = v
    else:
        max = v
        break
min += 1
max -= 1
print(max - min + (max - n)*(n-min))