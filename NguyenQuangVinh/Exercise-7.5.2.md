## For the following questions a–c, consider the FSM that models a (simplified) programmable thermostat. Suppose the variables that define the state and the methods that transition between states are:
```java
partOfDay: {Wake, Sleep}
temp: {Low, High}

// Initially "Wake" at "Low" temperature

// Effects: Advance to next part of the day
public void advance();

// Effects: Make current temp higher, if possible 
public void up();

// Effects: Make Current temp lower, if possible
public void down();
```

#### (a) How many states are there?

#### (b) Draw and label the states (with variable values) and transitions (with method names). Notice that all of the methods are total, that is, their behaviors are defined for all possible inputs.

#### (c) A test case is simply a sequence of method calls. Provide a test set that satisfies Edge Coverage on your graph.
