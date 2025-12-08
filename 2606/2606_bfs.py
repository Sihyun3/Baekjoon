import sys
from collections import deque

def input():
    return  map(int, sys.stdin.readline().split())

computerNum = int(sys.stdin.readline())
line = int(sys.stdin.readline())

networks = {}

for _ in range(0,line):
    k,v = input()
    networks.setdefault(k,[]).append(v)
    networks.setdefault(v,[]).append(k)

def bfs(v):
    global networks
    visited = set([v])
    q = deque([v])

    while q:
        node = q.popleft()
        for v in networks.get(node, []):
            if v not in visited:
                visited.add(v)
                q.append(v)

    return visited

answer = bfs(1)
answer.discard(1)
print(len(answer))