def merge_lists(a, b):

    # Combine the sorted lists into one large sorted list
    merged_list = []
    m, n = len(a), len(b)
    i = j = 0
    
    while i < m and j < n:
        if a[i] <= b[j]:
            merged_list.append(a[i])
            i += 1
        else:
            merged_list.append(b[j])
            j += 1
    
    if i < m:
        merged_list.extend(a[i:])
    else:
        merged_list.extend(b[j:])
        
    return merged_list

