# Problem Code: VACCINE1

d1, v1, d2, v2, p = map(int, input().split())

day = 0
total_vaccines = 0

while total_vaccines < p:
    if d1 <= day:
        total_vaccines += v1
    if d2 <= day:
        total_vaccines += v2
    day += 1

print(day - 1)
