In this Exercise, the Composite and Decorator Pattern 
had to be implemented.

The whole issue of the assignment here is that the offices 
have to be able to handle an arbitrary amount of different
bakery-classes without being altered afterwards.

The solution to this issue is the Decorator-Pattern:
The (Abstract) Class Bakery stands for the Decorator here:
    - It can be extended by any subclass with alternate
      functionalities (normal, sweets, bread)

Afterwards the issue of repeating code-patterns sustains:
Since all bakery-types share functionalities and 
characteristics it is vital to reuse code.

We've implemented this by extending the all-including class
Normalbakery by adding Bread- and Sweetsbakeries as sub-
classes of which.
They only contain parts of the functionalities of their
parent, so they instanciate the Normal-Bakery class
and leave out the functionalities they don't need.

In the end, if it is necessary to modify the functionalities,
one can only alter the Normal-Bakery.
Nevertheless there is no limit to extending the whole pattern.
