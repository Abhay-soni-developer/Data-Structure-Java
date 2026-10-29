# Java & DSA Practice

A personal collection of Java practice covering data structures, algorithms, recursion, backtracking, and core Java concepts. The exercises explore different approaches through standalone classes and small examples.

## What is covered

- **Data structures:** arrays, strings, linked lists, stacks, queues, hash maps, heaps, binary trees, and binary search trees.
- **Algorithms:** searching, sorting, two pointers, sliding windows, prefix sums/products, greedy algorithms, dynamic programming, DFS, BFS, recursion, and backtracking.
- **Java fundamentals:** classes, collections, StringBuilder, and exception handling.

Existing filenames and the `recursion` package are retained. Despite the package name, this collection covers a broad range of DSA topics.

## History note

The Java exercises were originally written while learning data structures and algorithms between March and August 2021. The Git history was reconstructed on October 29, 2026 by grouping the existing source files into topic-based practice commits. Historical commit dates are approximate placements within that remembered period, not recovered session timestamps. The current files were imported as they exist; these commits do not recreate intermediate edits or establish the original order of study. Documentation and repository housekeeping are dated when they were created.

## Reading the index

| Status | Meaning |
| --- | --- |
| Implemented | Substantive exercise code is present; this does not claim a tested or LeetCode-accepted solution. |
| Needs review | Code is present, but the source review identified a correctness issue or incomplete behavior. |
| In progress | The main exercise is a placeholder or only partially implemented. |
| Java practice / helper | A supporting type, utility, or Java experiment rather than a standalone DSA question. |

**Inventory:** 140 Java source files: 121 contain substantive exercise implementations/attempts, 12 are partial/placeholders, and 7 are Java experiments or helpers. Files can contain multiple exercises, and different files can cover the same problem. These are file counts, not unique solved-question counts.

LeetCode references identify the matching problem or the intended exercise. **Related** and **Variant** explicitly mark differences in the local exercise or interface. A reference does not claim that the code originated on LeetCode or was accepted there. Unmatched exercises are identified as general practice rather than assigned a speculative link.

## Exercise index

- [Arrays and windows](#arrays-and-windows)
- [Strings](#strings)
- [Linked lists](#linked-lists)
- [Stacks and queues](#stacks-and-queues)
- [Trees and BSTs](#trees-and-bsts)
- [Heaps and cache design (hash map + linked list)](#heaps-and-cache-design-hash-map--linked-list)
- [Graphs and grid search](#graphs-and-grid-search)
- [Recursion and backtracking](#recursion-and-backtracking)
- [Sorting, searching, and intervals](#sorting-searching-and-intervals)
- [Greedy algorithms](#greedy-algorithms)
- [Dynamic programming](#dynamic-programming)
- [Math and bit operations](#math-and-bit-operations)
- [Support and Java experiments](#support-and-java-experiments)

### Arrays and windows

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [ArrangeIntegersInSpecificOrder.java](ArrangeIntegersInSpecificOrder.java) | Recursively arrange adjacent values into an alternating low-high (zigzag) order. | General practice; no direct match verified | Implemented |
| [ArrayPractice.java](ArrayPractice.java) | Move an array element from one index to another by shifting intervening elements. | General practice; no direct match verified | Implemented |
| [CreateTargetArrayInTheGivenOrder.java](CreateTargetArrayInTheGivenOrder.java) | Construct a target array from values and their specified insertion indices. | [1389. Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/) | Implemented |
| [DecompressRunLengthEncoded.java](DecompressRunLengthEncoded.java) | Expand frequency/value pairs into a decompressed integer array. | [1313. Decompress Run-Length Encoded List](https://leetcode.com/problems/decompress-run-length-encoded-list/) | Implemented |
| [DynamicWindow.java](DynamicWindow.java) | Planned exercise: find the shortest subarray whose sum is greater than a limit. | [209. Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)<br>Related: local target is sum > limit; LeetCode uses sum >= target. | In progress |
| [FindMissingNumber.java](FindMissingNumber.java) | Find the missing number from the range 0..n using a marker array. | [268. Missing Number](https://leetcode.com/problems/missing-number/) | Implemented |
| [GFG.java](GFG.java) | Count contiguous subarrays with a maximum inside [L, R] using valid-run counting. | [795. Number of Subarrays with Bounded Maximum](https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/) | Implemented |
| [IntersectionOf2Arrays.java](IntersectionOf2Arrays.java) | Find unique values shared by two arrays using a boolean membership table. | [349. Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | Implemented |
| [LargestNumberAtLeastTwiceOfOthers.java](LargestNumberAtLeastTwiceOfOthers.java) | Find the largest value's index when it is at least twice every other value. | [747. Largest Number At Least Twice of Others](https://leetcode.com/problems/largest-number-at-least-twice-of-others/) | Implemented |
| [MajorityElement.java](MajorityElement.java) | Find an element appearing more than n/2 times with candidate voting. | [169. Majority Element](https://leetcode.com/problems/majority-element/) | Implemented |
| [MajorityElement2.java](MajorityElement2.java) | Find elements appearing more than n/3 times using sorting and counting. | [229. Majority Element II](https://leetcode.com/problems/majority-element-ii/) | Implemented |
| [MaximumProductofThreeNumbers.java](MaximumProductofThreeNumbers.java) | Attempt to maximize the product of three array values. | [628. Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/) | Needs review |
| [MergeSortedArray.java](MergeSortedArray.java) | Merge two sorted arrays into a newly allocated result array. | [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)<br>Variant: allocates a new array; LeetCode requires merging into nums1. | Implemented |
| [MissingNumber.java](MissingNumber.java) | Find a gap recursively in a sorted sequence or use a sum formula for the range 1..n+1. | [268. Missing Number](https://leetcode.com/problems/missing-number/)<br>Related: local range is 1..n+1; LeetCode uses 0..n. | Implemented |
| [NextGreaterElement2.java](NextGreaterElement2.java) | Find next greater values in a circular array using a doubled array and scanning. | [503. Next Greater Element II](https://leetcode.com/problems/next-greater-element-ii/) | Implemented |
| [NumberOfGoodPairs.java](NumberOfGoodPairs.java) | Count pairs of equal values using frequencies and n*(n-1)/2. | [1512. Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/) | Implemented |
| [NumberOfSubarraysWithBoundedMax.java](NumberOfSubarraysWithBoundedMax.java) | Count subarrays whose maximum lies within supplied lower and upper bounds. | [795. Number of Subarrays with Bounded Maximum](https://leetcode.com/problems/number-of-subarrays-with-bounded-maximum/) | Implemented |
| [ParkingSystem.java](ParkingSystem.java) | Track parking capacity separately for big, medium, and small cars. | [1603. Design Parking System](https://leetcode.com/problems/design-parking-system/) | Implemented |
| [PickingLongestSubArrayWithDiffLessOrEqualToLimit.java](PickingLongestSubArrayWithDiffLessOrEqualToLimit.java) | Picking Numbers: select the largest subset with pairwise absolute difference at most one; not a contiguous subarray problem. | General practice; no direct match verified | Needs review |
| [ProductofArrayExceptSelf.java](ProductofArrayExceptSelf.java) | Build products excluding each position using prefix products and a running suffix product. | [238. Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/) | Implemented |
| [RemoveDuplicates.java](RemoveDuplicates.java) | Remove duplicates from a sorted array in place and return the logical length. | [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Implemented |
| [ReplaceElementsWithGreatestElementOnRightSide.java](ReplaceElementsWithGreatestElementOnRightSide.java) | Replace each value with the greatest value to its right using a reverse scan. | [1299. Replace Elements with Greatest Element on Right Side](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/) | Implemented |
| [RotateArray.java](RotateArray.java) | Rotate array values using an auxiliary array and modular indexing. | [189. Rotate Array](https://leetcode.com/problems/rotate-array/) | Implemented |
| [ShuffleTheArray.java](ShuffleTheArray.java) | Interleave the first and second halves of an array. | [1470. Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) | Implemented |
| [SlidingWindow.java](SlidingWindow.java) | Find the maximum sum of a contiguous subarray of fixed length using a sliding window. | General practice; no direct match verified | Implemented |
| [SlidingWindow2.java](SlidingWindow2.java) | Count contiguous countdown sequences starting at k and decreasing to 1. | General practice; no direct match verified | Implemented |
| [SmallerThanMe.java](SmallerThanMe.java) | Count array elements smaller than each value using a sorted copy. | [1365. How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/) | Implemented |
| [SquaresOfSortedArray.java](SquaresOfSortedArray.java) | Return sorted squares of a sorted array using two pointers. | [977. Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | Implemented |
| [SumTriplet.java](SumTriplet.java) | Find unique triplets summing to zero using sorting and two pointers. | [15. 3Sum](https://leetcode.com/problems/3sum/) | Implemented |
| [TwoSum.java](TwoSum.java) | Explore pair-sum approaches; active method uses two pointers and requires sorted input. | [1. Two Sum](https://leetcode.com/problems/two-sum/)<br>[167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)<br>Intended pair-sum family; active code assumes sorted input and returns zero-based indices. | Needs review |
| [example.java](example.java) | Practice reversing an integer array in place with symmetric swaps. | General practice; no direct match verified | Needs review |

### Strings

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [DefangingIpAddr.java](DefangingIpAddr.java) | Replace each dot in an IPv4 address with [.]. | [1108. Defanging an IP Address](https://leetcode.com/problems/defanging-an-ip-address/) | Implemented |
| [DeleteColToMakeSorted.java](DeleteColToMakeSorted.java) | Count columns that are not sorted from top to bottom in an array of strings. | [944. Delete Columns to Make Sorted](https://leetcode.com/problems/delete-columns-to-make-sorted/) | Implemented |
| [GroupAnagrams.java](GroupAnagrams.java) | Group words by a key built from their character frequencies. | [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/) | Implemented |
| [JewelsAndStones.java](JewelsAndStones.java) | Count stones whose characters appear in the jewels string. | [771. Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/) | Implemented |
| [MinimumIndexSumTwoLists.java](MinimumIndexSumTwoLists.java) | Find shared restaurant names with the smallest sum of indices using a hash map. | [599. Minimum Index Sum of Two Lists](https://leetcode.com/problems/minimum-index-sum-of-two-lists/) | Implemented |
| [Palindrome.java](Palindrome.java) | Check a string for palindrome symmetry after filtering non-alphanumeric characters and ignoring case. | [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Implemented |

### Linked lists

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [AddTwoNumbers.java](AddTwoNumbers.java) | Add two numbers stored as reversed-digit linked lists; propagate carry. | [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) | Implemented |
| [FindSmallestNode.java](FindSmallestNode.java) | Attempt to find and remove the smallest linked-list node. | General practice; no direct match verified | Needs review |
| [FlattenMultilevelDoublyLinkedList.java](FlattenMultilevelDoublyLinkedList.java) | Planned exercise: flatten a multilevel doubly linked list. | [430. Flatten a Multilevel Doubly Linked List](https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/) | In progress |
| [InsertionSortList.java](InsertionSortList.java) | Sort a linked list by inserting each node into the sorted portion. | [147. Insertion Sort List](https://leetcode.com/problems/insertion-sort-list/) | Implemented |
| [LinkedListPractice.java](LinkedListPractice.java) | Practice swapping node pairs, doubling node values, reversing a list, and deleting a given node. | [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)<br>[206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)<br>[237. Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)<br>Matches apply to pair swapping, reversal, and deletion; doubling values is extra practice. | Implemented |
| [ListMergeSort.java](ListMergeSort.java) | Sort a linked list by recursively splitting it and merging sorted halves. | [148. Sort List](https://leetcode.com/problems/sort-list/) | Implemented |
| [MaximumSumLinkedList.java](MaximumSumLinkedList.java) | Attempt to construct a maximum-sum route through two sorted lists with common values as switching points. | General practice; no direct match verified | Needs review |
| [MergeKLists.java](MergeKLists.java) | Attempt the merge-k-sorted-lists problem; current code concatenates the lists. | [23. Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/) | Needs review |
| [MergeSortedList.java](MergeSortedList.java) | Merge two sorted linked lists by relinking nodes. | [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Implemented |
| [NextGreaterElement3.java](NextGreaterElement3.java) | Find next greater linked-list node values using reversal and a stack; includes an array overload. | [1019. Next Greater Node In Linked List](https://leetcode.com/problems/next-greater-node-in-linked-list/) | Needs review |
| [PalindromeLinkedList.java](PalindromeLinkedList.java) | Find the middle, reverse the second half, and compare linked-list values. | [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | Implemented |
| [RemoveDuplicatesFromSortedList2.java](RemoveDuplicatesFromSortedList2.java) | Remove every value that appears more than once in a sorted linked list. | [82. Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) | Needs review |
| [RemoveEveryKthNode.java](RemoveEveryKthNode.java) | Delete every kth node from a linked list. | General practice; no direct match verified | Implemented |
| [RemoveZeroSumConsecutiveNode.java](RemoveZeroSumConsecutiveNode.java) | Remove consecutive zero-sum linked-list sections using prefix sums and a hash map. | [1171. Remove Zero Sum Consecutive Nodes from Linked List](https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/) | Implemented |
| [SeprateEvenAndOddLL.java](SeprateEvenAndOddLL.java) | Group linked-list nodes at odd positions before nodes at even positions. | [328. Odd Even Linked List](https://leetcode.com/problems/odd-even-linked-list/) | Implemented |

### Stacks and queues

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [BasicCalculator.java](BasicCalculator.java) | Evaluate addition/subtraction expressions using operand and operator stacks; current parser handles individual digits. | [224. Basic Calculator](https://leetcode.com/problems/basic-calculator/)<br>Intended calculator problem; current parser supports a narrower input set. | Needs review |
| [LongestValidParentheses.java](LongestValidParentheses.java) | Planned exercise: find the longest valid parentheses substring; result is a placeholder. | [32. Longest Valid Parentheses](https://leetcode.com/problems/longest-valid-parentheses/) | In progress |
| [MinStack.java](MinStack.java) | Implement a stack with constant-time minimum tracking using encoded values. | [155. Min Stack](https://leetcode.com/problems/min-stack/) | Needs review |
| [MyStack.java](MyStack.java) | Practice implementing a fixed-capacity stack backed by an integer array. | General practice; no direct match verified | Needs review |
| [NextGreaterElement.java](NextGreaterElement.java) | Find next greater values for a subset using a monotonic stack and hash map. | [496. Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | Implemented |
| [QueueUsingStack.java](QueueUsingStack.java) | Implement FIFO operations by transferring values between two stacks. | [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | Implemented |
| [StockSpanner.java](StockSpanner.java) | Compute online stock spans using a monotonic stack of price/index pairs. | [901. Online Stock Span](https://leetcode.com/problems/online-stock-span/) | Implemented |
| [ValidParathesis.java](ValidParathesis.java) | Validate matching (), [], and {} brackets using a stack. | [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | Implemented |

### Trees and BSTs

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [BinaryTreeFromPreorderInorderTraversal.java](BinaryTreeFromPreorderInorderTraversal.java) | Planned exercise: reconstruct a binary tree from preorder and inorder traversals. | [105. Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/) | In progress |
| [BinaryTreeLevelOrderTraversal.java](BinaryTreeLevelOrderTraversal.java) | Return tree values level by level using breadth-first search and a queue. | [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | Implemented |
| [DeleteNodeBST.java](DeleteNodeBST.java) | Delete a key from a binary search tree using recursive search and successor handling. | [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/) | Needs review |
| [InorderTraversal.java](InorderTraversal.java) | Traverse a binary tree in left-root-right order using an explicit stack. | [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) | Implemented |
| [KthSmallestBST.java](KthSmallestBST.java) | Find the kth smallest BST value using iterative inorder traversal. | [230. Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/) | Implemented |
| [MinimumDepthBinaryTree.java](MinimumDepthBinaryTree.java) | Find the first leaf level using breadth-first search. | [111. Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/) | Implemented |
| [SymmetricTree.java](SymmetricTree.java) | Attempt recursive mirror comparison of a binary tree. | [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/) | Needs review |
| [TreeRightSideView.java](TreeRightSideView.java) | Collect the visible rightmost value at each tree level using right-first BFS. | [199. Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/) | Implemented |
| [ValidateBinarySearchTree.java](ValidateBinarySearchTree.java) | Validate strictly increasing inorder traversal using a stack. | [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/) | Implemented |

### Heaps and cache design (hash map + linked list)

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [KthLargestElement.java](KthLargestElement.java) | Planned exercise: find the kth largest array element; method is a placeholder. | [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) | In progress |
| [LRUCache.java](LRUCache.java) | Implement least-recently-used eviction with a hash map and a doubly linked list. | [146. LRU Cache](https://leetcode.com/problems/lru-cache/) | Needs review |
| [SeatManager.java](SeatManager.java) | Reserve the smallest available seat and return released seats to a min-heap. | [1845. Seat Reservation Manager](https://leetcode.com/problems/seat-reservation-manager/) | Needs review |
| [TaskScheduler.java](TaskScheduler.java) | Schedule tasks separated by a cooldown using a frequency heap and recursive cycle processing. | [621. Task Scheduler](https://leetcode.com/problems/task-scheduler/) | Implemented |
| [TopKFrequentWords.java](TopKFrequentWords.java) | Rank words by frequency and lexicographic order using a hash map and priority queue. | [692. Top K Frequent Words](https://leetcode.com/problems/top-k-frequent-words/) | Implemented |

### Graphs and grid search

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [JumpGame3.java](JumpGame3.java) | Search forward/backward jumps for a zero value using recursion and visited tracking. | [1306. Jump Game III](https://leetcode.com/problems/jump-game-iii/) | Implemented |
| [NumberOfIslands.java](NumberOfIslands.java) | Count connected land components in a grid using recursive flood fill. | [200. Number of Islands](https://leetcode.com/problems/number-of-islands/) | Implemented |
| [WordSearch.java](WordSearch.java) | Find a word in a grid using adjacent-cell DFS and backtracking without reusing cells. | [79. Word Search](https://leetcode.com/problems/word-search/) | Implemented |

### Recursion and backtracking

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [Binary.java](Binary.java) | Convert a positive decimal integer to a binary string using recursion. | General practice; no direct match verified | Implemented |
| [BinaryCombination.java](BinaryCombination.java) | Generate all binary strings of a specified length using recursive branching. | General practice; no direct match verified | Implemented |
| [DenominationCombination.java](DenominationCombination.java) | Recursively generate denomination selections summing to a target, then deduplicate combinations. | [39. Combination Sum](https://leetcode.com/problems/combination-sum/)<br>Variant: generates ordered selections before deduplication. | Implemented |
| [FindPossiblePartners.java](FindPossiblePartners.java) | Count and enumerate friends remaining single or forming pairs using recursion. | General practice; no direct match verified | Implemented |
| [FindSubsets.java](FindSubsets.java) | Generate all subsets of an integer array using recursive expansion. | [78. Subsets](https://leetcode.com/problems/subsets/) | Implemented |
| [GenerateValidParentheses.java](GenerateValidParentheses.java) | Generate balanced parentheses while tracking counts of opening and closing brackets. | [22. Generate Parentheses](https://leetcode.com/problems/generate-parentheses/) | Implemented |
| [KnightTour.java](KnightTour.java) | Enumerate knight tours on an 8-by-8 board with recursive backtracking. | General practice; no direct match verified | Implemented |
| [LetterCombinationsOfAPhoneNumber.java](LetterCombinationsOfAPhoneNumber.java) | Generate letter combinations for telephone keypad digits using backtracking. | [17. Letter Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/) | Implemented |
| [Nqueens.java](Nqueens.java) | Enumerate and count valid placements of eight queens using backtracking. | [51. N-Queens](https://leetcode.com/problems/n-queens/)<br>Variant: fixed eight-queen enumeration/counting rather than the general n interface. | Implemented |
| [NumericPatterns.java](NumericPatterns.java) | Recursively sum a numeric series of products of three consecutive terms. | General practice; no direct match verified | Implemented |
| [PalindromePartition.java](PalindromePartition.java) | Generate all partitions of a string into palindromic substrings using recursion. | [131. Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/) | Implemented |
| [PatternBuilder.java](PatternBuilder.java) | Explore three recursive numeric sequence-printing patterns. | General practice; no direct match verified | Implemented |
| [PermutationWithOutRepeatation.java](PermutationWithOutRepeatation.java) | Recursively generate permutations of a set of string elements. | [46. Permutations](https://leetcode.com/problems/permutations/)<br>Variant: string-element permutations rather than the integer-array interface. | Implemented |
| [PowerSet.java](PowerSet.java) | Generate all subsets with include/exclude recursion and a second recursive expansion approach. | [78. Subsets](https://leetcode.com/problems/subsets/) | Implemented |
| [RatMaze.java](RatMaze.java) | Count routes through a maze using recursion with right/down moves only. | General practice; no direct match verified | Implemented |
| [Recursion.java](Recursion.java) | Practice digit sums, zero counting, string reversal, and recursive star/number/alphabet patterns. | General practice; no direct match verified | Implemented |
| [Staircase.java](Staircase.java) | Enumerate ways to climb stairs with permitted steps 1, 2, and 3. | General practice; no direct match verified | Implemented |
| [SubsetFinder.java](SubsetFinder.java) | Unfinished subset generator with a helper that splits an integer's binary representation. | [78. Subsets](https://leetcode.com/problems/subsets/)<br>Intended subset exercise inferred from filename and stub. | In progress |
| [SumOfNaturalNumber.java](SumOfNaturalNumber.java) | Compute the sum of the first n positive integers using recursion. | General practice; no direct match verified | Implemented |
| [TowerOfHanoi.java](TowerOfHanoi.java) | Planned Tower of Hanoi exercise; recursive method is empty. | General practice; no direct match verified | In progress |

### Sorting, searching, and intervals

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [ArrayPartitioning.java](ArrayPartitioning.java) | Practice partitioning an array around a supplied pivot value. | General practice; no direct match verified | Implemented |
| [BinarySearch.java](BinarySearch.java) | Search for a target in a sorted array by repeatedly halving the search range. | [704. Binary Search](https://leetcode.com/problems/binary-search/) | Implemented |
| [BubbleSort.java](BubbleSort.java) | Sort an array with repeated adjacent swaps and early stopping. | General practice; no direct match verified | Implemented |
| [DutchNationalFlag.java](DutchNationalFlag.java) | Sort values 0, 1, and 2 using frequency counting. | [75. Sort Colors](https://leetcode.com/problems/sort-colors/) | Implemented |
| [HeightChecker.java](HeightChecker.java) | Compare original heights with their sorted order and count mismatches. | [1051. Height Checker](https://leetcode.com/problems/height-checker/) | Needs review |
| [InsertionSort.java](InsertionSort.java) | Planned insertion-sort exercise; currently contains only a sample array. | General practice; no direct match verified | In progress |
| [IntervalListIntersections.java](IntervalListIntersections.java) | Find intersections between interval lists by sorting endpoints and using a stack. | [986. Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/) | Implemented |
| [JumpSearch.java](JumpSearch.java) | Search a sorted array in square-root-sized blocks, then scan a candidate block. | General practice; no direct match verified | Needs review |
| [MaxChunksToMakeSorted.java](MaxChunksToMakeSorted.java) | Count chunks that can be sorted independently when the input is a permutation. | [769. Max Chunks To Make Sorted](https://leetcode.com/problems/max-chunks-to-make-sorted/) | Implemented |
| [MaxChunksToMakeSorted2.java](MaxChunksToMakeSorted2.java) | Count sortable chunks with duplicates using a sorted copy and frequency differences. | [768. Max Chunks To Make Sorted II](https://leetcode.com/problems/max-chunks-to-make-sorted-ii/) | Implemented |
| [MergeIntervals.java](MergeIntervals.java) | Merge overlapping intervals using sorted endpoints and a stack. | [56. Merge Intervals](https://leetcode.com/problems/merge-intervals/) | Implemented |
| [MergeSort.java](MergeSort.java) | Sort an array recursively with divide-and-conquer and a sorted-array merge helper. | [912. Sort an Array](https://leetcode.com/problems/sort-an-array/)<br>Related sorting task; this file practices merge sort. | Implemented |
| [SortColors.java](SortColors.java) | Sort an array of 0s, 1s, and 2s using boundary pointers and swaps. | [75. Sort Colors](https://leetcode.com/problems/sort-colors/) | Implemented |
| [SortedAndRotated.java](SortedAndRotated.java) | Planned exercise: find a pivot in a sorted and rotated array. | General practice; no direct match verified | In progress |

### Greedy algorithms

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [BestTimeToBuyAndSellStock.java](BestTimeToBuyAndSellStock.java) | Find maximum profit from one buy/sell transaction by tracking the minimum price. | [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | Implemented |
| [BestTimeToBuyAndSellStock2.java](BestTimeToBuyAndSellStock2.java) | Find maximum profit with unlimited transactions by adding positive adjacent gains. | [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | Implemented |
| [BoatsToSavePeople.java](BoatsToSavePeople.java) | Pair people within a boat's weight limit using sorting and two pointers. | [881. Boats to Save People](https://leetcode.com/problems/boats-to-save-people/) | Implemented |
| [JumpGame.java](JumpGame.java) | Determine whether the last index is reachable by moving a backward greedy goal. | [55. Jump Game](https://leetcode.com/problems/jump-game/) | Implemented |
| [JumpGame2.java](JumpGame2.java) | Find the minimum jump count by repeatedly finding an earlier reachable position. | [45. Jump Game II](https://leetcode.com/problems/jump-game-ii/) | Implemented |
| [PartitionLabels.java](PartitionLabels.java) | Split a string so each letter appears in only one partition using its last position. | [763. Partition Labels](https://leetcode.com/problems/partition-labels/) | Implemented |
| [ReorganzieString.java](ReorganzieString.java) | Rearrange letters to prevent equal adjacent characters using frequencies and alternating positions. | [767. Reorganize String](https://leetcode.com/problems/reorganize-string/) | Implemented |

### Dynamic programming

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [BestTimeToBuyAndSellStock3.java](BestTimeToBuyAndSellStock3.java) | Combine forward/backward profit arrays to allow at most two transactions. | [123. Best Time to Buy and Sell Stock III](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/) | Implemented |
| [BestTimeToBuyAndSellStock4.java](BestTimeToBuyAndSellStock4.java) | Planned exercise: maximize stock profit with at most k transactions; no active solution yet. | [188. Best Time to Buy and Sell Stock IV](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/) | In progress |
| [BestTimeToBuyAndSellStockWithCooldown.java](BestTimeToBuyAndSellStockWithCooldown.java) | Track stock trading states with a cooldown after selling. | [309. Best Time to Buy and Sell Stock with Cooldown](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/) | Implemented |
| [BestTimeToBuyAndSellStockWithTransactionFee.java](BestTimeToBuyAndSellStockWithTransactionFee.java) | Track holding/selling states while charging a transaction fee. | [714. Best Time to Buy and Sell Stock with Transaction Fee](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/) | Implemented |
| [Fibonacci.java](Fibonacci.java) | Compute Fibonacci numbers using memoized recursion. | [509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/) | Implemented |
| [MaxSubArray.java](MaxSubArray.java) | Find the maximum contiguous subarray sum using Kadane's algorithm. | [53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) | Implemented |
| [UglyNumber2.java](UglyNumber2.java) | Generate the nth ugly number using dynamic programming and three pointers. | [264. Ugly Number II](https://leetcode.com/problems/ugly-number-ii/) | Implemented |
| [UniquePaths.java](UniquePaths.java) | Count right/down paths through a rectangular grid using DP with recursive row processing. | [62. Unique Paths](https://leetcode.com/problems/unique-paths/) | Implemented |

### Math and bit operations

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [AdditionOfBinaryNumber.java](AdditionOfBinaryNumber.java) | Explore binary-to-decimal parsing and a three-bit full-adder helper; linked-list increment is unfinished. | General practice; no direct match verified | In progress |
| [DecordXORArray.java](DecordXORArray.java) | Decode an XOR-encoded array; also compute XOR of the sequence start + 2*i. | [1720. Decode XORed Array](https://leetcode.com/problems/decode-xored-array/)<br>[1486. XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/) | Implemented |
| [EliminationGame.java](EliminationGame.java) | Planned exercise: find the final number after alternating elimination passes. | [390. Elimination Game](https://leetcode.com/problems/elimination-game/) | In progress |
| [NumberOfStepsToReduceNumberToZero.java](NumberOfStepsToReduceNumberToZero.java) | Count repeated halving/subtraction operations until an integer reaches zero. | [1342. Number of Steps to Reduce a Number to Zero](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/) | Implemented |
| [PerfectSquare.java](PerfectSquare.java) | Check whether a nonnegative integer is a perfect square by incrementing a candidate root. | [367. Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/) | Implemented |
| [ReverseInteger.java](ReverseInteger.java) | Reverse decimal digits of a signed integer with overflow checks. | [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/) | Implemented |
| [UglyNumber.java](UglyNumber.java) | Check whether repeated factor reduction leaves only factors 2, 3, and 5. | [263. Ugly Number](https://leetcode.com/problems/ugly-number/) | Needs review |

### Support and Java experiments

| File | Problem / practice | LeetCode reference | Status |
| --- | --- | --- | --- |
| [BitManipulationPractice.java](BitManipulationPractice.java) | Java character-code experiment; no substantive bit-manipulation exercise yet. | Supporting Java code | Java practice / helper |
| [ListNode.java](ListNode.java) | Shared singly linked-list node type, constructors, and insertion/cloning/traversal helpers. | Supporting Java code | Java practice / helper |
| [Maths1.java](Maths1.java) | Practice integer division and Java exception handling. | Supporting Java code | Java practice / helper |
| [PracticeString.java](PracticeString.java) | Explore Java StringBuilder append, substring, length, and index operations. | Supporting Java code | Java practice / helper |
| [Registrar.java](Registrar.java) | Java object-construction/getter demo using a Student class that is absent from this repository. | Supporting Java code | Java practice / helper |
| [SortedArrayList.java](SortedArrayList.java) | Custom ArrayList utility that inserts integers into descending sorted order. | Supporting Java code | Java practice / helper |
| [TreeNode.java](TreeNode.java) | Shared binary-tree node type with value, left child, and right child. | Supporting Java code | Java practice / helper |

## Compile and run

Install a Java Development Kit (JDK). From the repository root, compile a runnable example and its source dependencies into a separate output directory:

```sh
mkdir -p out
javac -d out BinarySearch.java
java -cp out recursion.BinarySearch
```

Replace `BinarySearch.java` and `recursion.BinarySearch` with the example class you want to run. Some classes provide only methods or a data-structure API and do not have a `main` method.

For an example that uses other local classes, explicitly include those sources. For example:

```sh
javac -d out AddTwoNumbers.java ListNode.java
java -cp out recursion.AddTwoNumbers
```

`Registrar.java` requires a `Student` class whose source is not included, so compiling every file together currently needs that dependency to be supplied or that demo to be excluded.

## Practice notes

- Alternative approaches and overlapping exercises are retained as part of the learning process.
- The tables describe the exercises and current source status; they are not a complete correctness audit.
- For source-review details and identified issues, see [PROJECT_ANALYSIS.md](PROJECT_ANALYSIS.md).
- Commit `.java` sources and documentation. Generated `.class` files and the `out/` directory belong in `.gitignore`.

## Problem references

The LeetCode links in the tables point to official problem pages; their problem numbers and titles were checked when this index was created. Mapping a local exercise to a problem is based on its source code and intended behavior. Where only the filename/stub identifies an intended problem, the row is marked In progress.
