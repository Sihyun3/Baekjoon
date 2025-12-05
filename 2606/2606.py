import sys

def input():
    return  map(int, sys.stdin.readline().split())

computerNum = int(sys.stdin.readline())
line = int(sys.stdin.readline())

networks = {}

for _ in range(0,line):
    k,v = input()
    networks.setdefault(k,[]).append(v)
    networks.setdefault(v,[]).append(k)

answer = set([])

def searching(key):
    global answer
    destinations = networks.get(key,[])
    for k in destinations:
        if k not in answer:
            answer.add(k)
            searching(k)
        
searching(1)
answer.discard(1)
print(len(answer))