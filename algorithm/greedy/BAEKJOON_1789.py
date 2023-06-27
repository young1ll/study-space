s = int(input())
num, cnt = 0, 0
for i in range(1, s) :
    num += i
    if num >= s :
        break
    cnt += 1
    
print(cnt)