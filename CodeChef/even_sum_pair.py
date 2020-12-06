def even_pair_sum(x, y):
    if a & 1 and not b & 1:  # odd and even
        return a * (b // 2)
    if not a & 1 and b & 1:  # even and odd
        return b * (a // 2)
    if not a & 1 and not b & 1:  # both even
        return a * b // 2
    if a & 1 and b & 1:  # both odd
        return 1 + (a * b) // 2




t = int(input())

for _ in range(t):
    a, b = map(int, input().split())
    print(even_pair_sum(a, b))
