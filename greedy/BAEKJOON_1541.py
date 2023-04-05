n = str(input())
m = n.split('-')
x = sum(map(int, (m[0].split('+'))))
for i in m[1:]:
    x -= sum(map(int, (i.split('+'))))
print(x)
