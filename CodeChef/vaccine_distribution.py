def days_required(ages, each_day):
    if each_day == 1:
        return len(ages)

    at_risk = 0
    not_at_risk = 0
    total_days = 0

    for age in ages:
        if 80 > age > 9:
            not_at_risk += 1
        else:
            at_risk += 1

    total_days += at_risk // each_day
    total_days += not_at_risk // each_day

    if not_at_risk % each_day:
        total_days += 1
    if at_risk % each_day:
        total_days += 1

    return total_days



t = int(input())
for _ in range(t):
    n, d = map(int, input().split())
    ages = list(map(int, input().split()))
    print(days_required(ages, d))