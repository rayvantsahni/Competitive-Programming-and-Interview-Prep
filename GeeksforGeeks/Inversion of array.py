#User function Template for python3

# arr[]: Input Array
# N : Size of the Array arr[]

def inversionCount(arr,n):
    global count
    count = 0
    mergesort(arr)
    return count
    
def mergesort(arr):
    if len(arr) <= 1:
        return arr
    middle = len(arr) // 2
    left = mergesort(arr[:middle])
    right = mergesort(arr[middle:])
    
    return merge(left, right)
    
def merge(left, right):
    global count
    i, j = 0, 0
    merge_arr = []
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            merge_arr.append(left[i])
            i += 1
        else:
            merge_arr.append(right[j])
            j += 1
            count += (len(left) - i)
    
    merge_arr.extend(left[i:])
    merge_arr.extend(right[j:])
    
    return merge_arr



#{ 
#  Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER

@atexit.register

def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())

if __name__=='__main__':
    t = int(input())
    for tt in range(t):
        n = int(input())
        a = list(map(int, input().strip().split()))
        print(inversionCount(a,n))
# } Driver Code Ends
