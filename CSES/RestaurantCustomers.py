from sys import stdin

def input(): return stdin.readline()

def restaurant_customers(n, arrivals, departures):
    arrivals.sort()
    departures.sort()

    maximum = 1
    count = 0
    i = j = 0
    while i < n and j < n:
        if arrivals[i] < departures[j]:
            count += 1
            maximum = max(maximum, count)
            i += 1
        else:
            count -= 1
            j += 1
    return maximum

if __name__ == "__main__":
    n = int(input())
    a = []
    d = []
    for _ in range(n):
        arrival, departure = map(int, input().split())
        a.append(arrival)
        d.append(departure)

    print(restaurant_customers(n, a, d))
