N = int(input())
arr = list(map(int, input().split()))

xor_sum = 0
for v in arr:
    xor_sum ^= v

if xor_sum == 0:
    print("cubelover")
else:
    print("koosaga")