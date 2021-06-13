def nearest_larger(arr, i):
    minIndex = None
    minDistance = 0

    for index in range(i+1, len(arr)):
        if arr[index] > arr[i]:
            minIndex = index
            minDistance = index - i
            break

    for index in reversed(range(i)):
        if arr[index] > arr[i]:
            if i - index < minDistance:
                minIndex = index
            break

    return minIndex

def main():
    arr = [4, 1, 3, 5, 6]
    print(nearest_larger(arr, 0))

if __name__ == "__main__":
    main()