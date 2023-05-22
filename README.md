# Element-Occurrence-Tracker
The "Element-Occurrence-Tracker" algorithm solves the problem of finding the top K frequent elements in an array.
Given an array of integers, the algorithm identifies the K most frequent elements and returns them in descending order of their frequency.
## Algorithm
The algorithm follows the following steps:

- Create a HashMap to store the frequency of each element in the input array.
- Iterate through the input array and update the frequency count in the HashMap.
- Create a PriorityQueue and override its comparator to prioritize elements based on their frequency in descending order.
- Iterate through the entries of mymap and add each entry as an array to the heap, where the first element of the array represents the element from the array, and the second element represents its frequency.
- Initialize an output array of size K.
- Iterate K times and extract the top element (with the highest frequency) from the heap. Store the extracted element in the output array.
- Return the output array containing the top K frequent elements.
## Complexity Analysis
The time complexity of the "Element-Occurrence-Tracker" algorithm is O(N log K), where N is the size of the input array. This complexity arises from iterating through the input array and adding elements to the heap. The space complexity is O(N) to store the frequencies in the HashMap and the heap.
