# Bubble Sort
It works by iterating the input array from the first element to the last, comparing each pair of elements and swapping them if needed. Bubble sort continues its iterations until no more swaps are needed.
## Working - 
In bubble sort we swap the elements if in such a way that the list is sorted.
For example we have two adjacent elememts
A[i-1] & A[i] in which the indexes are i-1 and i
If the value of the element at preceeding index is higher than the value of the element at succeeding index then we will swap the elements.
Let's say A[i-1] > A[i]
1. For this we firstly create a temporary variable "temp".
2. Then we store the value of element at index i-1 in temporary variable - 
    
    temp = A[i-1]
3. After this we will store the value of the element at index i in A[i-1] such that its index will be changed
    
    A[i-1] = A[i]
4. At last the value stored in temporary variable will now gets stored in A[i] such that the element which was greater is now at index i and the element which was smaller gets stored at index i.
    
    A[i] = temp
