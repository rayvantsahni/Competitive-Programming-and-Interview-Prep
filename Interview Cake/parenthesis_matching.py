def get_closing_paren(sentence, opening_paren_index):    
    for index, paren in enumerate(sentence):
        if index < opening_paren_index:
            continue
        if index == opening_paren_index:
            open_count = 1
            continue
        if paren == '(':
            open_count += 1
        elif paren == ')':
            open_count -= 1
        if open_count == 0:
            return index
    
    raise Exception("Invalid sentence")
