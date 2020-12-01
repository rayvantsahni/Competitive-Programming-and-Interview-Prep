'''
Code Challenge #21
'''

def flatten_array(arr):
    flat_arr = []

    for element in arr:
        if type(element) == list or type(element) == tuple:
            flat_arr.extend(element)
        else:
            flat_arr.append(element)
    return flat_arr


def flatten_array_N(arr, flat_arr = []):
    for item in arr:
        try:
            size = len(item)
            flatten_array_N(item, flat_arr)
        except:
            flat_arr.append(item)

    return flat_arr


if __name__ == "__main__":
    two_dim_array_basic = [1, 2, 3, [4,5], 6, [7,8], 9]
    print(flatten_array(two_dim_array_basic))

    two_dim_array_intermediate = [1, 2, [3, [4, 5, ()]], 6, None]
    print(flatten_array_N(two_dim_array_intermediate))