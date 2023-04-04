n = int(input())

road = list(map(int, input().split()))
price = list(map(int, input().split()))

result, min = 0, price[0]
for r, p in zip(road, price):
   if p < min: min = p
   result += min * r
print(result)