# [Identical Linked Lists](https://www.geeksforgeeks.org/problems/identical-linked-lists/1)
## Easy
Given the heads of two singly linked lists, head1 and head2, the task is to determine whether the two linked lists are identical. Two linked lists are considered identical if they have the same number of nodes and each corresponding node contains the same data in the same order. Return true if both lists are identical; otherwise, return false.
Examples:
Input: head1: 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6, head2: 99-&gt;59-&gt;42-&gt;20
Output: falseExplanation:As shown in figure the two lists are not identical.
Input: head1: 1-&gt;2-&gt;3-&gt;4-&gt;5, head2: 1-&gt;2-&gt;3-&gt;4-&gt;5
Output: trueExplanation:  As shown in figure both are identical.
Constraints:1 ≤ length of lists ≤ 1051 ≤ elements of lists ≤ 105