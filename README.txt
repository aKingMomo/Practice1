Solving the following problem:

You are given an array that is meant to represent a single apartment in our system.

[2, 3, 2]

The position of array is a particular day a guest wants to start a booking.
The value at that position is how long that guest intends to stay.

However, note that two guests' stays cannot overlap.

In the previous example if we chose to take the guest at position 0, we could not take the guest at position 1. This is because the guest at position 0 would like to stay two days which overlaps with the day the guest at position 1 would want to start.

Your goal is to find the maximum number of days you can book an apartment given it's array representation.

Using the example from before:

[2, 3, 2] = 4

This is because you can take guest 0 and guest 2 for the maximum value.

Write the algorithm in any language you desire.