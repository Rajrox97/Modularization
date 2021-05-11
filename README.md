# Modularization
This application is a simple demonstration of Creating a Simple Sorting Utility and from the consumer, we are
calling it and we are logging the information. 

1. To make use of the sorting algorithm, I built the MySortingUtil class under a package. 

2. Pattern of the BubbleSort Class I am creating another class(to give us flexibilty to chose any other algorithms that we
want to make use of). Hence I create another class BubbleSort under another package. 

3. If MySortingUtil is some kind of API that is being exposed, we must have some kind of consumer for that. 
Hence consumer class being created to utilise the sort class. So I create MySortingUtilConsumer. 

We normally use System.out.println for printing , but here we are using the logger class .
The subsequent modularizaton projects have the rest of the modified code. 
