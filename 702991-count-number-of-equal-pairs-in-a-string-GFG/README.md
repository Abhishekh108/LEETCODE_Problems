# [Count number of equal pairs in a string](https://www.geeksforgeeks.org/problems/count-number-of-equal-pairs-in-a-string0520/1)
## Easy
Given a string s, count the number of pairs of indices [i, j] such that s[i] is equal to s[j]. Note that [i, j] and [j, i] are counted as different pairs, and pairs where i == j are also valid and counted.
Note: s contains only lowercase English characters.
Examples:
Input: s = "air"
Output: 3
Explanation: The only equal pairs are [0, 0], [1, 1], and [2, 2], since all characters are distinct.
Input: s = "aa"
Output: 4
Explanation: The equal pairs are [0, 0], [0, 1], [1, 0], and [1, 1].

Constraints:1 ≤ s.size() ≤ 4*104