# Problem Code: CCBTS01

def pcm_dilemma(arr):
    present = "P" in arr and "C" in arr and "M" in arr
    return "YES" if present else "NO"

if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        arr = set(input())
        print(pcm_dilemma(arr))
