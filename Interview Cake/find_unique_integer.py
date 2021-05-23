# https://www.interviewcake.com/question/python3/find-unique-int-among-duplicates?utm_source=weekly_email&utm_source=drip&utm_campaign=weekly_email&utm_campaign=Interview%20Cake%20Weekly%20Problem%20%23348:%20The%20Cake%20Thief&utm_medium=email&utm_medium=email

from functools import reduce

def find_unique_delivery_id(delivery_ids):
    # Find the one unique ID in the list
    return reduce(lambda x, y: x ^ y, delivery_ids)
