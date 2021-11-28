# Graphs
<!-- Short summary or background information -->
A Graph is a non-linear data structure consisting of nodes and edges. The nodes are sometimes also referred to as vertices and the edges are lines or arcs that connect any two nodes in the graph.

## Challenge
<!-- Description of the challenge -->
Implementing the graph, and should include the following methods:

- add node
- add edge
- get nodes
- size

## API
<!-- Description of each method publicly available in your Graph -->
- add node()  
Arguments: value
Returns: The added node
Add a node to the graph
- add edge()  
Arguments: 2 nodes to be connected by the edge,
Returns: nothing
Adds a new edge between two nodes in the graph
Both nodes should already be in the Graph
- get nodes()  
Arguments: none
Returns all of the nodes in the graph as a collection (set, list, or similar)
get neighbors
Arguments: node
Returns a collection of edges connected to the given node
Include the weight of the connection in the returned collection
- size()  
Arguments: none
Returns the total number of nodes in the graph