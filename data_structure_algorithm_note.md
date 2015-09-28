# Recurrence Relations

| Recurrence             | Algorithm                          | Big-Oh Solution |
| ---------------------- | ---------------------------------- | --------------- |
| T(n) = T(n/2) + O(1)   | Binary Search                      | O(logn)        |
| T(n) = T(n-1) + O(1)   | Sequential Search                  | O(n)            |
| T(n) = 2T(n/2) + O(1) | tree traversal                     | O(n)            |
| T(n) = T(n-1) + O(n)   | Selection Sort (other n^2 sorts)   | O(n^2)           |
| T(n) = 2T(n/2) + O(n) | Mergesort (average case Quicksort) | O(nlogn)      |
