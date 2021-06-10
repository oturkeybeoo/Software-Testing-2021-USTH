## Answer the following questions for the method checkIt() below:
'''java
public static void checkIt (boolean a, boolean b, boolean c)
{
    if (a && (b || c))
        System.out.println("P is true");
    else
        System.outprintln("P is not true");
}
'''

#### (a) Transform checkIt() to checkItExpand(), a method where each if statement tests exactly one boolean variable. Instrument checkItExpand() to record which edges are traversed. (“print” statements are fine for this.)

#### (b) Derive a GACC test set T1 for checkIt(). Derive an EdgeCoverage test set T2 for checkItExpand(). Build T2 so that it does not satisfy GACC on the predicate in checkIt().

#### (c) Run both T1 and T2 on both checkIt() and checkItExpand().
