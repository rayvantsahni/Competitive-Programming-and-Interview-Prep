# https://www.interviewcake.com/question/python3/graph-coloring?utm_source=weekly_email&utm_source=drip&utm_campaign=weekly_email&utm_campaign=Interview%20Cake%20Weekly%20Problem%20%23355:%20Graph%20Coloring&utm_medium=email&utm_medium=email

class GraphNode:
    def __init__(self, label):
        self.label = label
        self.neighbors = set()
        self.color = None


def color_graph(graph, colors):
    # Create a valid coloring for the graph
    
    for node in graph:
        if node.color:  # checking if the node already has an assigned color
            continue
        
        neighbors = node.neighbors  # extracting all the current node's neighbors
        if node in neighbors:
            raise Exception("Found a loop at the node {}!".format(node.label))
            
        used_colors = set([neighbor.color for neighbor in neighbors])  # extracting all the current node's neighbors' colors
        
        for color in colors:  # iterating over all colors
            if color not in used_colors:  # checking to find a color that is not assigned to any immediate neighbor
                node.color = color  # assigning a legal color to the node
                break
            
    return 
