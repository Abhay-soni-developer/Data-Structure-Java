# Project DSA audit

Reviewed all 140 Java source files. Compiled .class files are build outputs and are not additional questions. This is a source review, not a correctness certification or an accepted-submission count. No solution files were changed.

The package name recursion does not limit the contents: recursion is an algorithmic technique, while arrays, lists, trees, stacks, queues, heaps and hash maps are data structures. This collection mixes both data structures and algorithm topics.

## Counts

- Java files: 140
- Files containing substantive exercise implementations or attempts: 121
- Partial or placeholder exercise files: 12
- Support classes or Java experiments: 7
- Verified correct / accepted solutions: not established. Several implementations have visible defects.
- A file is the counting unit here. Multi-exercise files and repeated problems prevent equating this count with unique solved questions. FindSubsets/PowerSet, GFG/NumberOfSubarraysWithBoundedMax, and missing-number variants overlap.

## Primary-topic breakdown

Each file is assigned once. Topics overlap in practice; for example, tree traversal can use a stack, and linked-list merge sort uses recursion.

| Primary topic | All files | Implementations / attempts | Partial / stubs | Support |
|---|---:|---:|---:|---:|
| Arrays and windows | 31 | 30 | 1 | 0 |
| Dynamic programming | 8 | 7 | 1 | 0 |
| Graphs and grid search | 3 | 3 | 0 | 0 |
| Greedy algorithms | 7 | 7 | 0 | 0 |
| Heaps and cache design | 5 | 4 | 1 | 0 |
| Linked lists | 15 | 14 | 1 | 0 |
| Math and bit operations | 7 | 5 | 2 | 0 |
| Recursion and backtracking | 20 | 18 | 2 | 0 |
| Sorting searching and intervals | 14 | 12 | 2 | 0 |
| Stacks and queues | 8 | 7 | 1 | 0 |
| Strings | 6 | 6 | 0 | 0 |
| Support and Java experiments | 7 | 0 | 0 | 7 |
| Trees and BSTs | 9 | 8 | 1 | 0 |

## File-by-file review

Status "Implementation / attempt" means substantive code exists, not that the problem is correctly solved. Defect notes are examples identified during reading, not an exhaustive bug audit.

| File | Primary topic | Status | What it contains |
|---|---|---|---|
| [AddTwoNumbers.java](AddTwoNumbers.java) | Linked lists | Implementation / attempt | Exercise: Add Two Numbers. Methods: `addTwoNumbers`. |
| [AdditionOfBinaryNumber.java](AdditionOfBinaryNumber.java) | Math and bit operations | Partial / stub | Partial: single-bit addition and binary parsing exist; add1 is a pass-through stub. Methods: `add1`, `parseBinary`, `addBinary`. |
| [ArrangeIntegersInSpecificOrder.java](ArrangeIntegersInSpecificOrder.java) | Arrays and windows | Implementation / attempt | Exercise: Arrange Integers In Specific Order. Methods: `arrange`, `swap`. |
| [ArrayPartitioning.java](ArrayPartitioning.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Array Partitioning. Methods: `partition`, `swap`. |
| [ArrayPractice.java](ArrayPractice.java) | Arrays and windows | Implementation / attempt | Exercise: Array Practice. Methods: `shiftElement`. |
| [BasicCalculator.java](BasicCalculator.java) | Stacks and queues | Implementation / attempt | Stack-based calculator attempt; parses individual digits rather than multi-digit numbers. Methods: `calculate`, `cal`. |
| [BestTimeToBuyAndSellStock.java](BestTimeToBuyAndSellStock.java) | Greedy algorithms | Implementation / attempt | Exercise: Best Time To Buy And Sell Stock. Methods: `maxProfit`. |
| [BestTimeToBuyAndSellStock2.java](BestTimeToBuyAndSellStock2.java) | Greedy algorithms | Implementation / attempt | Exercise: Best Time To Buy And Sell Stock2. Methods: `maxProfit`. |
| [BestTimeToBuyAndSellStock3.java](BestTimeToBuyAndSellStock3.java) | Dynamic programming | Implementation / attempt | Exercise: Best Time To Buy And Sell Stock3. Methods: `maxProfit`, `maxProfitInSignleTransactionForwardDirection`, `maxProfitInSignleTransactionBackwardDirection`. |
| [BestTimeToBuyAndSellStock4.java](BestTimeToBuyAndSellStock4.java) | Dynamic programming | Partial / stub | Empty main; proposed solution is commented out. |
| [BestTimeToBuyAndSellStockWithCooldown.java](BestTimeToBuyAndSellStockWithCooldown.java) | Dynamic programming | Implementation / attempt | Exercise: Best Time To Buy And Sell Stock With Cooldown. Methods: `maxProfit`. |
| [BestTimeToBuyAndSellStockWithTransactionFee.java](BestTimeToBuyAndSellStockWithTransactionFee.java) | Dynamic programming | Implementation / attempt | Exercise: Best Time To Buy And Sell Stock With Transaction Fee. Methods: `maxProfit`. |
| [Binary.java](Binary.java) | Recursion and backtracking | Implementation / attempt | Exercise: Binary. Methods: `getBinary`. |
| [BinaryCombination.java](BinaryCombination.java) | Recursion and backtracking | Implementation / attempt | Exercise: Binary Combination. Methods: `getBinaryCombinationOfLength`. |
| [BinarySearch.java](BinarySearch.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Binary Search. Methods: `bs`. |
| [BinaryTreeFromPreorderInorderTraversal.java](BinaryTreeFromPreorderInorderTraversal.java) | Trees and BSTs | Partial / stub | Only prints Math.abs; no tree reconstruction. |
| [BinaryTreeLevelOrderTraversal.java](BinaryTreeLevelOrderTraversal.java) | Trees and BSTs | Implementation / attempt | Exercise: Binary Tree Level Order Traversal. Methods: `levelOrder`. |
| [BitManipulationPractice.java](BitManipulationPractice.java) | Support and Java experiments | Support / experiment | Only prints a character code; no bit-manipulation exercise. |
| [BoatsToSavePeople.java](BoatsToSavePeople.java) | Greedy algorithms | Implementation / attempt | Exercise: Boats To Save People. Methods: `numRescueBoats`, `printArray`. |
| [BubbleSort.java](BubbleSort.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Bubble Sort. Methods: `bubbleSort`, `swap`. |
| [CreateTargetArrayInTheGivenOrder.java](CreateTargetArrayInTheGivenOrder.java) | Arrays and windows | Implementation / attempt | Exercise: Create Target Array In The Given Order. Methods: `createTargetArray`. |
| [DecompressRunLengthEncoded.java](DecompressRunLengthEncoded.java) | Arrays and windows | Implementation / attempt | Exercise: Decompress Run Length Encoded. Methods: `decompressRLElist`. |
| [DecordXORArray.java](DecordXORArray.java) | Math and bit operations | Implementation / attempt | Contains two exercises: decode XOR array and XOR of an arithmetic sequence. Methods: `decode`, `xorOperation`. |
| [DefangingIpAddr.java](DefangingIpAddr.java) | Strings | Implementation / attempt | Exercise: Defanging Ip Addr. Methods: `defangIPaddr`. |
| [DeleteColToMakeSorted.java](DeleteColToMakeSorted.java) | Strings | Implementation / attempt | Exercise: Delete Col To Make Sorted. Methods: `minDeletionSize`. |
| [DeleteNodeBST.java](DeleteNodeBST.java) | Trees and BSTs | Implementation / attempt | Exercise: Delete Node BST. Methods: `deleteNode`, `findAndRemoveNextInOrderNode`. |
| [DenominationCombination.java](DenominationCombination.java) | Recursion and backtracking | Implementation / attempt | Exercise: Denomination Combination. Methods: `getDenominationSet`. |
| [DutchNationalFlag.java](DutchNationalFlag.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Dutch National Flag. Methods: `sortColors`. |
| [DynamicWindow.java](DynamicWindow.java) | Arrays and windows | Partial / stub | Smallest subarray above a sum limit; loop is empty and result stays zero. Methods: `lenOfSmallestSubArrWithSumGrtThanLimit`. |
| [EliminationGame.java](EliminationGame.java) | Math and bit operations | Partial / stub | Unfinished elimination simulation; always returns -1. Methods: `lastRemaining`, `fillArr`. |
| [Fibonacci.java](Fibonacci.java) | Dynamic programming | Implementation / attempt | Memoized recursion with fixed-size cache. Methods: `fib`. |
| [FindMissingNumber.java](FindMissingNumber.java) | Arrays and windows | Implementation / attempt | Exercise: Find Missing Number. Methods: `missingNumber`. |
| [FindPossiblePartners.java](FindPossiblePartners.java) | Recursion and backtracking | Implementation / attempt | Exercise: Find Possible Partners. Methods: `findPossibleUniquePartnerGroupCount`, `findPossibleUniquePartnerGroup`. |
| [FindSmallestNode.java](FindSmallestNode.java) | Linked lists | Implementation / attempt | Attempt to find/remove minimum node; pointer never advances inside loop and removal is absent. Methods: `getAndRemoveSmallestNode`. |
| [FindSubsets.java](FindSubsets.java) | Recursion and backtracking | Implementation / attempt | Exercise: Find Subsets. Methods: `subsets`, `getSuperSet`. |
| [FlattenMultilevelDoublyLinkedList.java](FlattenMultilevelDoublyLinkedList.java) | Linked lists | Partial / stub | Empty main; no flattening implementation. |
| [GFG.java](GFG.java) | Arrays and windows | Implementation / attempt | Bounded-maximum subarray counting; same problem as NumberOfSubarraysWithBoundedMax. |
| [GenerateValidParentheses.java](GenerateValidParentheses.java) | Recursion and backtracking | Implementation / attempt | Exercise: Generate Valid Parentheses. Methods: `getValidParentheses`, `generateValidParentheses`. |
| [GroupAnagrams.java](GroupAnagrams.java) | Strings | Implementation / attempt | Exercise: Group Anagrams. Methods: `getCountArray`, `groupAnagrams`. |
| [HeightChecker.java](HeightChecker.java) | Sorting searching and intervals | Implementation / attempt | Sort-and-compare attempt; copied array excludes last item, causing out-of-bounds access. Methods: `heightChecker`. |
| [InorderTraversal.java](InorderTraversal.java) | Trees and BSTs | Implementation / attempt | Exercise: Inorder Traversal. Methods: `inorderTraversal`. |
| [InsertionSort.java](InsertionSort.java) | Sorting searching and intervals | Partial / stub | Only an example array; no sorting implementation. |
| [InsertionSortList.java](InsertionSortList.java) | Linked lists | Implementation / attempt | Exercise: Insertion Sort List. Methods: `insertionSortList`. |
| [IntersectionOf2Arrays.java](IntersectionOf2Arrays.java) | Arrays and windows | Implementation / attempt | Exercise: Intersection Of2 Arrays. Methods: `intersection`. |
| [IntervalListIntersections.java](IntervalListIntersections.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Interval List Intersections. Methods: `intervalIntersection`. |
| [JewelsAndStones.java](JewelsAndStones.java) | Strings | Implementation / attempt | Exercise: Jewels And Stones. Methods: `numJewelsInStones`. |
| [JumpGame.java](JumpGame.java) | Greedy algorithms | Implementation / attempt | Exercise: Jump Game. Methods: `canJump`. |
| [JumpGame2.java](JumpGame2.java) | Greedy algorithms | Implementation / attempt | Exercise: Jump Game2. Methods: `jump`. |
| [JumpGame3.java](JumpGame3.java) | Graphs and grid search | Implementation / attempt | Exercise: Jump Game3. Methods: `canReach`. |
| [JumpSearch.java](JumpSearch.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Jump Search. Methods: `jumpSearch`, `linearSearch`. |
| [KnightTour.java](KnightTour.java) | Recursion and backtracking | Implementation / attempt | Recursive knight-tour enumeration hardcoded to an 8 by 8 board. Methods: `knightTour`, `giveKnightATour`, `printBoard`, `getCordinate`. |
| [KthLargestElement.java](KthLargestElement.java) | Heaps and cache design | Partial / stub | findKthLargest always returns -1. Methods: `findKthLargest`. |
| [KthSmallestBST.java](KthSmallestBST.java) | Trees and BSTs | Implementation / attempt | Exercise: Kth Smallest BST. Methods: `kthSmallest`. |
| [LRUCache.java](LRUCache.java) | Heaps and cache design | Implementation / attempt | Hash map plus doubly linked list; pointer updates and eviction require correction. Methods: `get`, `put`. |
| [LargestNumberAtLeastTwiceOfOthers.java](LargestNumberAtLeastTwiceOfOthers.java) | Arrays and windows | Implementation / attempt | Exercise: Largest Number At Least Twice Of Others. Methods: `dominantIndex`. |
| [LetterCombinationsOfAPhoneNumber.java](LetterCombinationsOfAPhoneNumber.java) | Recursion and backtracking | Implementation / attempt | Exercise: Letter Combinations Of APhone Number. Methods: `letterCombinations`, `buildCombination`. |
| [LinkedListPractice.java](LinkedListPractice.java) | Linked lists | Implementation / attempt | Multiple exercises: swap pairs, double values recursively, reverse list, delete node. Methods: `swapEachPair`, `mulByN`, `reverseList`, `deleteNode`. |
| [ListMergeSort.java](ListMergeSort.java) | Linked lists | Implementation / attempt | Exercise: List Merge Sort. Methods: `sortList`, `divListAtPos`, `mergeTwoSortedLists`, `getListLength`. |
| [ListNode.java](ListNode.java) | Support and Java experiments | Support / experiment | Shared linked-list node and helpers; getLength never advances its pointer. Methods: `insertAt`, `toString`, `insertAfter`, `insertBefore`, `cloneList`, `insertInMiddle`, `getLength`. |
| [LongestValidParentheses.java](LongestValidParentheses.java) | Stacks and queues | Partial / stub | Always returns 1. Methods: `longestValidParentheses`. |
| [MajorityElement.java](MajorityElement.java) | Arrays and windows | Implementation / attempt | Exercise: Majority Element. Methods: `majorityElement`. |
| [MajorityElement2.java](MajorityElement2.java) | Arrays and windows | Implementation / attempt | Exercise: Majority Element2. Methods: `majorityElement`. |
| [Maths1.java](Maths1.java) | Support and Java experiments | Support / experiment | Division and exception-handling experiment. Methods: `divide`. |
| [MaxChunksToMakeSorted.java](MaxChunksToMakeSorted.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Max Chunks To Make Sorted. Methods: `maxChunksToSorted`. |
| [MaxChunksToMakeSorted2.java](MaxChunksToMakeSorted2.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Max Chunks To Make Sorted2. Methods: `maxChunksToSorted`. |
| [MaxSubArray.java](MaxSubArray.java) | Dynamic programming | Implementation / attempt | Exercise: Max Sub Array. Methods: `maxSubArray`. |
| [MaximumProductofThreeNumbers.java](MaximumProductofThreeNumbers.java) | Arrays and windows | Implementation / attempt | Chooses by absolute value, which does not always maximize signed product. Methods: `maximumProduct`, `modulus`. |
| [MaximumSumLinkedList.java](MaximumSumLinkedList.java) | Linked lists | Implementation / attempt | Exercise: Maximum Sum Linked List. Methods: `noMaxSumLinkedList`. |
| [MergeIntervals.java](MergeIntervals.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Merge Intervals. Methods: `merge`, `toString`, `getPoints`, `compareTo`. |
| [MergeKLists.java](MergeKLists.java) | Linked lists | Implementation / attempt | Concatenates lists; does not merge them into sorted order. Methods: `mergeKLists`. |
| [MergeSort.java](MergeSort.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Merge Sort. Methods: `mergeSort`. |
| [MergeSortedArray.java](MergeSortedArray.java) | Arrays and windows | Implementation / attempt | Exercise: Merge Sorted Array. Methods: `merge`. |
| [MergeSortedList.java](MergeSortedList.java) | Linked lists | Implementation / attempt | Exercise: Merge Sorted List. Methods: `mergeTwoSortedLists`. |
| [MinStack.java](MinStack.java) | Stacks and queues | Implementation / attempt | Exercise: Min Stack. Methods: `push`, `pop`, `top`, `getMin`, `toString`. |
| [MinimumDepthBinaryTree.java](MinimumDepthBinaryTree.java) | Trees and BSTs | Implementation / attempt | Exercise: Minimum Depth Binary Tree. Methods: `minDepth`. |
| [MinimumIndexSumTwoLists.java](MinimumIndexSumTwoLists.java) | Strings | Implementation / attempt | Exercise: Minimum Index Sum Two Lists. Methods: `findRestaurant`. |
| [MissingNumber.java](MissingNumber.java) | Arrays and windows | Implementation / attempt | Recursive missing-value search and sum formula for 1-based range; overlaps missing-number family in FindMissingNumber. Methods: `findMissingNumber`, `findMissingNumberInUnorderedList`. |
| [MyStack.java](MyStack.java) | Stacks and queues | Implementation / attempt | Array-backed stack attempt; push has no value parameter and decrements top; size returns capacity. Methods: `peek`, `pop`, `push`, `size`, `isEmpty`. |
| [NextGreaterElement.java](NextGreaterElement.java) | Stacks and queues | Implementation / attempt | Exercise: Next Greater Element. Methods: `nextGreaterElement`. |
| [NextGreaterElement2.java](NextGreaterElement2.java) | Arrays and windows | Implementation / attempt | Exercise: Next Greater Element2. Methods: `nextGreaterElements`. |
| [NextGreaterElement3.java](NextGreaterElement3.java) | Linked lists | Implementation / attempt | Next greater node in linked list; also contains array overload (can stall on equal elements). Methods: `nge`. |
| [Nqueens.java](Nqueens.java) | Recursion and backtracking | Implementation / attempt | Exercise: Nqueens. Methods: `nQueen`, `findNextFeasiblePositionOfQueen`, `resetRow`, `printBoard`, `findIfQueenCutsAnotherQueen`. |
| [NumberOfGoodPairs.java](NumberOfGoodPairs.java) | Arrays and windows | Implementation / attempt | Exercise: Number Of Good Pairs. Methods: `numIdenticalPairs`, `getTotalNumOfPossibleCombinations`, `getFrequencyList`. |
| [NumberOfIslands.java](NumberOfIslands.java) | Graphs and grid search | Implementation / attempt | Exercise: Number Of Islands. Methods: `numIslands`, `coverAllNewLand`, `findUndiscoveredLand`, `printMaze`. |
| [NumberOfStepsToReduceNumberToZero.java](NumberOfStepsToReduceNumberToZero.java) | Math and bit operations | Implementation / attempt | Exercise: Number Of Steps To Reduce Number To Zero. Methods: `numberOfSteps`. |
| [NumberOfSubarraysWithBoundedMax.java](NumberOfSubarraysWithBoundedMax.java) | Arrays and windows | Implementation / attempt | Exercise: Number Of Subarrays With Bounded Max. Methods: `numSubarrayBoundedMax`, `sumOfNSeqNum`. |
| [NumericPatterns.java](NumericPatterns.java) | Recursion and backtracking | Implementation / attempt | Recursive sum of products of three consecutive terms. Methods: `pattern1`. |
| [Palindrome.java](Palindrome.java) | Strings | Implementation / attempt | Exercise: Palindrome. Methods: `isPalindrome`. |
| [PalindromeLinkedList.java](PalindromeLinkedList.java) | Linked lists | Implementation / attempt | Exercise: Palindrome Linked List. Methods: `isPalindrome`, `reverseList`. |
| [PalindromePartition.java](PalindromePartition.java) | Recursion and backtracking | Implementation / attempt | Exercise: Palindrome Partition. Methods: `partition`, `palindromePartition`, `isPalindrome`. |
| [ParkingSystem.java](ParkingSystem.java) | Arrays and windows | Implementation / attempt | Exercise: Parking System. Methods: `addCar`. |
| [PartitionLabels.java](PartitionLabels.java) | Greedy algorithms | Implementation / attempt | Exercise: Partition Labels. Methods: `partitionLabels`. |
| [PatternBuilder.java](PatternBuilder.java) | Recursion and backtracking | Implementation / attempt | Three recursive sequence-printing exercises. Methods: `printPattern`, `printPattern1`, `pattern2`. |
| [PerfectSquare.java](PerfectSquare.java) | Math and bit operations | Implementation / attempt | Exercise: Perfect Square. Methods: `isPerfectSquare`. |
| [PermutationWithOutRepeatation.java](PermutationWithOutRepeatation.java) | Recursion and backtracking | Implementation / attempt | Exercise: Permutation With Out Repeatation. Methods: `getSet`. |
| [PickingLongestSubArrayWithDiffLessOrEqualToLimit.java](PickingLongestSubArrayWithDiffLessOrEqualToLimit.java) | Arrays and windows | Implementation / attempt | Picking Numbers frequency problem (subset, not necessarily contiguous subarray); i+1 access exceeds array bounds. Methods: `pickingNumbers`. |
| [PowerSet.java](PowerSet.java) | Recursion and backtracking | Implementation / attempt | Two recursive subset-generation approaches; overlaps FindSubsets. Methods: `getPowerSet`, `getPowerSetTech2`. |
| [PracticeString.java](PracticeString.java) | Support and Java experiments | Support / experiment | StringBuilder experiment. |
| [ProductofArrayExceptSelf.java](ProductofArrayExceptSelf.java) | Arrays and windows | Implementation / attempt | Exercise: Productof Array Except Self. Methods: `productExceptSelf`. |
| [QueueUsingStack.java](QueueUsingStack.java) | Stacks and queues | Implementation / attempt | Exercise: Queue Using Stack. Methods: `push`, `pop`, `peek`, `empty`, `shiftElemToOtherStackInReverseOrder`. |
| [RatMaze.java](RatMaze.java) | Recursion and backtracking | Implementation / attempt | Recursive path enumeration restricted to right and down on a square grid. Methods: `solveRatMaze`, `ratMaze`, `printMaze`. |
| [Recursion.java](Recursion.java) | Recursion and backtracking | Implementation / attempt | Multiple digit, string reversal, and star/number/alphabet pattern exercises. Methods: `sumOfDigit`, `countZeroesInNumber`, `turnAroundString`, `printStars`, `printDigits`, `printDigitInSequence`, `printDigitInSequentiallyAndGetLastPrintedDigit`, `halfPyramidPattern`, `upsideDownhalfPyramidPattern`, `numericHalfPyramid`, `numericSequenceHalfPyramid`, `halfDaimond`, `printSpace`, `halfPyramidMirrorImage`, `printAlphabetInSequentiallyAndGetLastPrintedAlphaAscii`, `printAlphabetInSequence`, `AlphabetsHalfPyramidPattern`, `alphabatecialSequenceHalfPyramid`, `printPyramid`, `printHalfPyramid`. |
| [Registrar.java](Registrar.java) | Support and Java experiments | Support / experiment | Java object demo; references Student, whose source is absent. |
| [RemoveDuplicates.java](RemoveDuplicates.java) | Arrays and windows | Implementation / attempt | Exercise: Remove Duplicates. Methods: `removeDuplicates`. |
| [RemoveDuplicatesFromSortedList2.java](RemoveDuplicatesFromSortedList2.java) | Linked lists | Implementation / attempt | Exercise: Remove Duplicates From Sorted List2. Methods: `deleteDuplicates`. |
| [RemoveEveryKthNode.java](RemoveEveryKthNode.java) | Linked lists | Implementation / attempt | Exercise: Remove Every Kth Node. Methods: `removeEveryKthNode`. |
| [RemoveZeroSumConsecutiveNode.java](RemoveZeroSumConsecutiveNode.java) | Linked lists | Implementation / attempt | Exercise: Remove Zero Sum Consecutive Node. Methods: `removeZeroSumSublists`. |
| [ReorganzieString.java](ReorganzieString.java) | Greedy algorithms | Implementation / attempt | Exercise: Reorganzie String. Methods: `reorganizeString`, `printArray`. |
| [ReplaceElementsWithGreatestElementOnRightSide.java](ReplaceElementsWithGreatestElementOnRightSide.java) | Arrays and windows | Implementation / attempt | Exercise: Replace Elements With Greatest Element On Right Side. Methods: `replaceElements`. |
| [ReverseInteger.java](ReverseInteger.java) | Math and bit operations | Implementation / attempt | Exercise: Reverse Integer. Methods: `reverse`. |
| [RotateArray.java](RotateArray.java) | Arrays and windows | Implementation / attempt | Exercise: Rotate Array. Methods: `rotate`. |
| [SeatManager.java](SeatManager.java) | Heaps and cache design | Implementation / attempt | Min-heap reservation design; constructor hardcodes seats 1..10 instead of using n. Methods: `reserve`, `unreserve`. |
| [SeprateEvenAndOddLL.java](SeprateEvenAndOddLL.java) | Linked lists | Implementation / attempt | Exercise: Seprate Even And Odd LL. Methods: `sepEvenAndOddPlaces`. |
| [ShuffleTheArray.java](ShuffleTheArray.java) | Arrays and windows | Implementation / attempt | Exercise: Shuffle The Array. Methods: `shuffle`. |
| [SlidingWindow.java](SlidingWindow.java) | Arrays and windows | Implementation / attempt | Exercise: Sliding Window. Methods: `maxSumSubArray`. |
| [SlidingWindow2.java](SlidingWindow2.java) | Arrays and windows | Implementation / attempt | Exercise: Sliding Window2. Methods: `findTotalCount`. |
| [SmallerThanMe.java](SmallerThanMe.java) | Arrays and windows | Implementation / attempt | Exercise: Smaller Than Me. Methods: `smallerNumbersThanCurrent`. |
| [SortColors.java](SortColors.java) | Sorting searching and intervals | Implementation / attempt | Exercise: Sort Colors. Methods: `sortColors`, `swap`. |
| [SortedAndRotated.java](SortedAndRotated.java) | Sorting searching and intervals | Partial / stub | Pivot search has an empty loop and returns -1. Methods: `findPivot`. |
| [SortedArrayList.java](SortedArrayList.java) | Support and Java experiments | Support / experiment | Custom ArrayList with sorted insertion; utility rather than standalone question. Methods: `sortingAdd`. |
| [SquaresOfSortedArray.java](SquaresOfSortedArray.java) | Arrays and windows | Implementation / attempt | Exercise: Squares Of Sorted Array. Methods: `sortedSquares`. |
| [Staircase.java](Staircase.java) | Recursion and backtracking | Implementation / attempt | Exercise: Staircase. Methods: `getPossibleCombinationToClimbStep`. |
| [StockSpanner.java](StockSpanner.java) | Stacks and queues | Implementation / attempt | Exercise: Stock Spanner. Methods: `next`. |
| [SubsetFinder.java](SubsetFinder.java) | Recursion and backtracking | Partial / stub | Subset method returns its input; binary-bit helper only. Methods: `subsetFinder`, `getSubsetByMarkedBits`. |
| [SumOfNaturalNumber.java](SumOfNaturalNumber.java) | Recursion and backtracking | Implementation / attempt | Exercise: Sum Of Natural Number. Methods: `getSumOfNaturalNumbers`. |
| [SumTriplet.java](SumTriplet.java) | Arrays and windows | Implementation / attempt | Exercise: Sum Triplet. Methods: `threeSum`. |
| [SymmetricTree.java](SymmetricTree.java) | Trees and BSTs | Implementation / attempt | Recursive mirror comparison attempt; wrong initial comparison and missing return for two null nodes. Methods: `isSymmetric`, `traverseAndCompare`. |
| [TaskScheduler.java](TaskScheduler.java) | Heaps and cache design | Implementation / attempt | Exercise: Task Scheduler. Methods: `leastInterval`, `compareTo`, `toString`. |
| [TopKFrequentWords.java](TopKFrequentWords.java) | Heaps and cache design | Implementation / attempt | Exercise: Top KFrequent Words. Methods: `topKFrequent`, `compareTo`. |
| [TowerOfHanoi.java](TowerOfHanoi.java) | Recursion and backtracking | Partial / stub | Empty toh method. Methods: `toh`. |
| [TreeNode.java](TreeNode.java) | Support and Java experiments | Support / experiment | Shared binary-tree node definition. |
| [TreeRightSideView.java](TreeRightSideView.java) | Trees and BSTs | Implementation / attempt | Exercise: Tree Right Side View. Methods: `rightSideView`. |
| [TwoSum.java](TwoSum.java) | Arrays and windows | Implementation / attempt | Two-pointer implementation assumes sorted input; supplied example is unsorted. Methods: `twoSum`. |
| [UglyNumber.java](UglyNumber.java) | Math and bit operations | Implementation / attempt | Factor reduction; incorrectly accepts zero. Methods: `isUgly`. |
| [UglyNumber2.java](UglyNumber2.java) | Dynamic programming | Implementation / attempt | Exercise: Ugly Number2. Methods: `nthUglyNumber`. |
| [UniquePaths.java](UniquePaths.java) | Dynamic programming | Implementation / attempt | Grid path-count DP with recursive row processing. Methods: `uniquePaths`, `printMaze`. |
| [ValidParathesis.java](ValidParathesis.java) | Stacks and queues | Implementation / attempt | Exercise: Valid Parathesis. Methods: `isValid`. |
| [ValidateBinarySearchTree.java](ValidateBinarySearchTree.java) | Trees and BSTs | Implementation / attempt | Exercise: Validate Binary Search Tree. Methods: `isValidBST`. |
| [WordSearch.java](WordSearch.java) | Graphs and grid search | Implementation / attempt | Exercise: Word Search. Methods: `exist`, `searchChar`, `searchWord`, `printBoard`. |
| [example.java](example.java) | Arrays and windows | Implementation / attempt | Array reversal exercise; midpoint loop swaps one pair twice for even lengths. |

## Coverage gaps

No substantive implementation of tries, disjoint-set union, segment/Fenwick trees, shortest paths, minimum spanning trees, or topological sorting was found. Heap coverage mainly uses Java PriorityQueue. Bit manipulation coverage is small. This is a broad practice collection, not a complete DSA syllabus.
