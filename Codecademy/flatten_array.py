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

if __name__ == "__main__":
    two_dim_array = [1, 2, 3, [4,5], 6, [7,8], 9]
    one_dim_array = flatten_array(two_dim_array)
    print(one_dim_array)