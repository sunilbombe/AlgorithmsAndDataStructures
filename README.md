# Algorithms And Data Structures
This repository contains the implementations of different algorithms and data structures using java language

# Algorithms :

An algorithm is a number of steps to perform a perticular task.

# Data Structures :

Data structures are store and manipulate the data.

# Big O Notations :

Big O notations gives us a way to compare time complexity of an algorithm in a objective and hardware independent manner.

O(1)        Constant
O(logn)     Logarithmic
O(n)        Linear
O(nlogn)    n Log star n
O(n^2)      Quadratic

# Time complexity comparison :

O(1) < O(log n) < O(sqrt n) < O(n) < O(n log n) < O(n^2) < O(2^n) < O(n!)

# Arrays

1 continous block of memory.

2. if we know the start address (X), the size of data element in array (Y) and index of element (i) to retrieve then it can be retrieved using X +(Y*i) 
Ex. Array of integer, each int is of size 4 bytes, lets say start address is 12 then we can retrive the elements as below :

12 + (4 * 0) = 12
12 + (4 * 1) = 16
12 + (4 * 1) = 16

3. in an object array the object address is stored at the index the actual object reside at some other location in memory.

Time complexity of array :

1. search by index : O(1)
2. search without index : O(n)
3. insert or update at index : O(1)
4. delete by index : O(1)
5. delete without index : O(n)

# Sorting :

#Bubble Sort
