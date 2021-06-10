## Below are four faulty programs. Each includes test inputs that result in failure. Answer the following questions about each program

#### (a) Explain what is wrong with the given code. Describe the fault precisely by proposing a modification to the code.
    
    (1) Cannot search index 0
    (2) Return the first index of 0 instead of the last
    (3) Also count 0 as positive number
    (4) Cannot % negative integer

#### (b) If possible, give a test case that does not execute the fault. If not, briefly explain why not.

    (1) x = [0, 1, 2, 3, 4, 2] y = 2
    (2) x = [1, 2, 3, 4, 0]
    (3) x = [-2, 3, 1, -5, 2]
    (4) x = [1, 2, 3, 4, 5, 6]

#### (d) If possible give a test case that results in an error, but not a failure. If not, briefly explain why not. Hint: Don’t forget about the program counter.

    (1) 
'''java
    private static int findLast(int[] x, int y) {
        for (int i=x.length-1; i > -1; i--) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }
'''

    (2)
''' java
    public static int lastZero (int[] x)
    {
        for (int i=x.length-1; i > -1; i--)
        {
            if (x[i] == 0)
            {
                return i;
            }
        }
        return -1;
    }
'''
    (3) 
'''java
    private static int countPositive (int[] x)
    {
        int count = 0;
        for (int i=0; i < x.length; i++)
        {
            if (x[i] > 0)
            {
                count++;
            }
        }
        return count;
    }
'''
    (4) 
'''java
    private static int oddOrPos(int[] x)
    {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (Math.abs(x[i])%2 == 1 || x[i] > 0) {
                count++;
            }
        }
        return count;
    }
'''