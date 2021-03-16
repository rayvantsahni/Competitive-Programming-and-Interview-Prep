def can_two_movies_fill_flight(movie_lengths, flight_length):
    s = set()
    
    for movie_length in movie_lengths:
        if flight_length - movie_length in s:
            return True
        else:
            s.add(movie_length)
        
    return False
