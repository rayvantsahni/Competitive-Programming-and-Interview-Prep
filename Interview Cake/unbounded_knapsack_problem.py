# https://www.interviewcake.com/question/python3/cake-thief?utm_source=weekly_email&utm_source=drip&utm_campaign=weekly_email&utm_campaign=Interview%20Cake%20Weekly%20Problem%20%23348:%20The%20Cake%20Thief&utm_medium=email&utm_medium=email

def max_duffel_bag_value(cake_tuples, capacity):
    # Calculate the maximum value we can carry
    max_values = [0] * (capacity + 1)
    
    for weight, value in cake_tuples:
        if not weight and value:
            return float("inf")
    if not capacity:
        return 0
    
    for bag_capacity in range(capacity + 1):
        max_value = 0
        
        for weight, value in cake_tuples:
            if weight <= bag_capacity:
                max_value = max(max_value, value + max_values[bag_capacity - weight])
        
        max_values[bag_capacity] = max_value
        
    return max_values[capacity]
