# Problem Code: HDIVISR

def highest_divisor(n):
    for i in range(10, 0, -1):
        if not n % i:
            return i
            
n = int(input())
print(highest_divisor(n))
