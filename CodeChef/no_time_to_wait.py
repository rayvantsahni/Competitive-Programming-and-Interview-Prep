# Problem Code: NOTIME 

def no_time_to_wait(H, x, t):
    return max(t) + x >= H

if __name__ == "__main__":
    N, H, x = map(int, input().split())
    t = list(map(int, input().split()))
    
    print("yes" if no_time_to_wait(H, x, t) else "no")
