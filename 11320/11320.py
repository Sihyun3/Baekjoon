import sys

T = sys.stdin.readline

for _ in range(0,T):
    input = sys.stdin.readline
    A, B = map(int, input().split())
    print((A//B)**2)