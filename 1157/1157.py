input = input().upper()
list = list(set(input))
result = []

for i in list:
    count = input.count(i)
    result.append(count)

if result.count(max(result)) >= 2:
    print("?")
else :
    print(list[result.index(max(result))])