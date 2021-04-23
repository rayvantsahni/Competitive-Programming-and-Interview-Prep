class Solution:
    def judgeCircle(self, moves: str) -> bool:
        x_axis = y_axis = 0
        for move in moves:
            if move == "U":
                x_axis += 1
            elif move == "D":
                x_axis -= 1
            elif move == "R":
                y_axis += 1
            elif move == "L":
                y_axis -= 1
        return not x_axis and not y_axis
