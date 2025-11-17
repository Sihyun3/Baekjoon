import sys

input = sys.stdin.readline

N, M = map(int, input().split())

A = []

result = []
# 첫번째 행렬
for _ in range(0,N):
    input = sys.stdin.readline
    A .append(list(map(int, input().split())))
#두번째 행렬
for i in range(0,N):
    input = sys.stdin.readline
    B = list(map(int, input().split()))
    C = [a + b for a, b in zip(A[i], B)]
    result.append(C)

for row in result:
    print(*row)