numberArray = list(range(1,31))

for i in range(0,28):
    num = int(input())
    numberArray.remove(num)

print(numberArray[0])
print(numberArray[1])