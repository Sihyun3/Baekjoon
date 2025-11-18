import sys

input = sys.stdin.readline().strip()

result = 1
for i in range(0,len(input)//2):
    if input[i] != input[len(input)-1-i]:
        result = 0
        break

print(result)