class Solution:
    def judgeCircle(self, moves: str) -> bool:
        x_axis = y_axis = 0
        for move in moves:
            if move == "U":
                y_axis += 1
            elif move == "D":
                y_axis -= 1
            elif move == "R":
                x_axis += 1
            elif move == "L":
                x_axis -= 1
        return not x_axis and not y_axis
