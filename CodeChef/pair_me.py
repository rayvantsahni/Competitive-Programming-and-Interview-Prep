# Problem Code: SUMPOS

def pair_me(x, y, z):
    return abs(x - y) == z or abs(x - z) == y or abs(y - z) == x

t = int(input())
for _ in range(t):
    x, y, z = map(int, input().split())
    print("YES" if pair_me(x, y, z) else "NO")
