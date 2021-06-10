#### Answer questions a–d for the graph defined by the following sets:
* N = {1, 2, 3}
* N0 = {1}
* Nf = {3}
* E = {(1, 2), (1, 3), (2, 1), (2, 3), (3, 1)}
### Also consider the following (candidate) test paths:
* p1 = [1, 2, 3, 1]
* p2 = [1, 3, 1, 2, 3]
* p3 = [1, 2, 3, 1, 2, 1, 3]
* p4 = [2, 3, 1, 3]

#### (a) Which of the listed paths are test paths? For any path that is not a test path, explain why not.
    p1 is not a test path. Because it end at 1 (not final node)
    p2 is a test path
    p3 p3 is a test path
    p4 is not a test path. Because it start with 2 (not initial node)

#### (b) List the eight test requirements for Edge-Pair Coverage (only the length two subpaths).
    [1,2,1]
    [2,3,1] 
    [2,1,3] 
    [1,3,1]
    [2,1,2] 
    [3,1,3] 
    [3,1,2] 
    [1,2,3]

#### (c) Does the set of test paths from part (a) above satisfy Edge-Pair Coverage? If not, state what is missing.
    No, because p2 and p3 tour [2, 1, 2] or [3, 1, 3].

#### (d) Consider the prime path [3, 1, 3] and path p2. Does p2 tour the prime path directly? With a sidetrip?
    p3 does not tour [3, 1, 3] directly, but it does tour [3, 1, 3] with sidetrip [1, 2, 1].

