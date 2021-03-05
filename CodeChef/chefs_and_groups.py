# Problem Code: GROUPS 

def groups(seats):
    return seats.count("01") 

t = int(input())
for _ in range(t):
    seats = input()
    print(groups("0" + seats))
