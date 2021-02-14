# Problem Code: MAXFUN

def maximise_function(arr):
    if len(arr) == 3:
        return triplet_sum(*arr)
    return max(triplet_sum(arr[0], arr[1], arr[-1]), 
                triplet_sum(arr[0], arr[-1], arr[-2]))
    
def triplet_sum(a, b, c):
    return abs(a - b) + abs(b - c) + abs(c - a)

t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    print(maximise_function(arr))
