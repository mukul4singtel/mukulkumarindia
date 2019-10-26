Solution 

1. Implementation of sing method is done in Bird Class
1.a Test has been added in BirdTest
1.b Proper use of access modifiers, inheritance and composition will help in optimizing the code.

3.b Both Chicken and Rooster are subclasses of Bird hence they are sibling.
3.c Yes instead of using inheritance we can go for Composition, Rooster class will be composed of Bird and will call the method of Bird Class with the Bird object. And Bird Class should have all methods as parametrised methods.
  class Rooster {
  private Bird bird = new Bird();
  }
  
  
  Rest implementation done through Animal Controller and service.