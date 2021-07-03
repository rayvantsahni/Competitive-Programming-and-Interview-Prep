#User function Template for python3


class Solution:
    def MissingNumber(self,arr,n):
        # code here
        return ((n * n) + n) // 2 - sum(arr)

#{ 
#  Driver Code Starts
#Initial Template for Python 3




t=int(input())
for _ in range(0,t):
    n=int(input())
    a=list(map(int,input().split()))
    s=Solution().MissingNumber(a,n)
    print(s)
# } Driver Code Ends
