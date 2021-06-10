## Answer questions (a) through (d) for the mutant on line 5 in the method findVal().

```java
/**
 * Find last index of element
 * 
 * @param numbers array to search
 * @param val value to look for
 * @return last index of val in numbers; -1 if absent
 * @throws NullPointerException if numbers is null
 */
public static int findVal(int numbers[], int val)
{
    int findVal = -1;

    for (int i=0; i<numbers.length; i++)
    // for (int i=(0+1); i<numbers.length; i++>)
        if (numbers[i] == val)
            findVal = i;
    return (findVal); 
}
```

#### (a) If possible, find test inputs that do not reach the mutant.

#### (b) If possible, find test inputs that satisfy reachability but not infection for the mutant.

#### (c) If possible, find test inputs that satisfy infection, but not propagation for the mutant.

#### (d) If possible, find test inputs that strongly kill the mutants.
