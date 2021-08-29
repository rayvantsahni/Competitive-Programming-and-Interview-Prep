from sys import stdin

def input(): return stdin.readline()

def coin_piles(a, b):
    return not ((a + b) % 3) and max(a, b) <= 2 * min(a, b)

if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        a, b = map(int, input().split())
        print("YES" if coin_piles(a, b) else "NO")
