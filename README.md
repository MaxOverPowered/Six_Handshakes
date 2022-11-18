Six handshakes


There is a theory, actually an already proven theory, which states that all people around the globe are six or fewer social connections away from each other. This means that a chain of friends no longer than six can be found between any two people.

This idea is called six degrees of separation or the 6-handshakes rule. It was originally set out by Frigyes Karinthy, Hungarian writer, in 1929 and appeared in many forms in popular culture since then.

Now it's your turn to simulate this theory and find answers to some interesting questions on a smaller social graph of connected friends, similar to the following example.

breadth-first-search.png
What are you going to learn?

    Implement a graph.
    Go through all the nodes of a graph.
    Find the shortest path between two nodes in a graph.
    Understand the queue abstract data type.

There is a function which calculates the minimum handshakes between two people.

    There is a Minimum handshakes menu point at start.
    After choosing Minimum handshakes, the system asks for two names, one by one.
        The application keeps re-asking for the name until two proper values are given, which are registered on the social network.
        When entering a value that is not in the graph, a The person does not exist. Give another name. message is displayed.
    The number of handshakes between two direct friends is one.
    The distance, or number of handshakes between two people is (n+1), where n is the number of people between them. For example, on the previous graph, the number of handshakes between Axel Lucian and Alice Aurora is two, because they have a common friend, Cally Tanner. 


There is a function which lists the friends-of-friends of a person at a given distance.

    There is a Friends of friends menu point at start.
    After choosing Friends of friends, the system asks for a name and the distance.
        The application keeps re-asking for the name until two proper values are given, which are registered on the social network.
        When entering a value that is not in the graph, a The person does not exist. Give another name. message is displayed.
        The distance can only be a positive integer.
    The list does not contain duplicates.
    The result is a list of people who are at no more than the given distance from the requested person. For example, on the previous graph, friends of friends with a distance of two or less from Emery Myles are Olympia Lydia, Emmanual Winfried, Cally Tanner, and Maggie Dolan. 


There is a function which lists the shortest paths between two people.

    There is a Shortest routes menu point at start.
    After choosing Shortest routes, the system asks for two names, one by one.
        The application keeps re-asking for the name until two proper values are given, which are registered on the social network.
        When entering a value that is not in the graph, a The person does not exist. Give another name. message is displayed.
    If their distance is dist, each path is a list that contains (dist + 1) users, displaying the "friend chain". For example, if A and B are not friends, but they have E and F as common friends, their distance is 2, and shortestPaths(A, B) returns [ [A, E, B], [A, F, B] ]. On the previous graph, the shortest path between Christopher Myles and Chrisopher Hillary is Christopher Myles, Naomi Lydia, Jena Lucian, and Chrisopher Hillary. 


General requirements

    After choosing a finder menu and entering valid data, the system visualizes the results. 

Hints

    Use the following data structure.

    **UserNode**
    id: The unique ID of the user
    firstName
    lastName
    friends: A list or array of IDs that this user is friends with

    Feel free to add new properties or methods to the UserNode.

    Do not use a database. The user data is stored in plain Java objects. There is a RandomDataGenerator class for generating sample data for the exercise.

    Use the provided visualizer class to help debug your code.

