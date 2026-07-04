class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(new ArrayList<>(), nums, 0, list);
        return list;
    }

    public void subset(List<Integer> ans, int[] nums, int idx, List<List<Integer>> list) {

        if (idx == nums.length) {
            list.add(ans);
            return;
        }

        // Take
        List<Integer> take = new ArrayList<>(ans);
        take.add(nums[idx]);
        subset(take, nums, idx + 1, list);

        // Skip
        subset(ans, nums, idx + 1, list);
    }
}

//  Why is `take` needed?**

// The reason is that **`ArrayList` is mutable**, while **`String` is immutable**.

// ### What happens if we don't use `take`?

// Suppose you write:

// ```java
// ans.add(nums[idx]);
// subset(ans, nums, idx + 1, list);   // Take

// subset(ans, nums, idx + 1, list);   // Skip
// ```

// Now dry run for:

// ```java
// nums = [1]
// ```

// Initially:

// ```java
// ans = []
// ```

// **Take branch:**

// ```java
// ans.add(1);
// ```

// Now:

// ```java
// ans = [1]
// ```

// Call:

// ```java
// subset([1], 1);   // Base case
// ```

// Output:

// ```java
// [1]
// ```

// After returning, the **Skip** call is:

// ```java
// subset(ans, 1);
// ```

// But `ans` is still:

// ```java
// ans = [1]
// ```

// So the Skip branch also outputs:

// ```java
// [1]
// ```

// You never get the empty subset `[]` because the element `1` was never removed.

// ---

// ### Why do we create a copy?

// Instead, we write:

// ```java
// List<Integer> take = new ArrayList<>(ans);
// take.add(nums[idx]);
// ```

// Now:

// ```java
// ans  = []
// take = [1]
// ```

// * The **Take** branch receives `[1]`.
// * The **Skip** branch still receives `[]`.

// Both branches are independent.

// ---

// ### Compare this with Strings

// In your string solution:

// ```java
// subset(ans + ch, s, idx + 1, list);
// subset(ans, s, idx + 1, list);
// ```

// If:

// ```java
// ans = "ab";
// ```

// then:

// ```java
// ans + "c"
// ```

// creates a **new String**:

// ```java
// "abc"
// ```

// The original string remains:

// ```java
// ans = "ab"
// ```

// So Strings automatically behave as if a copy was made.

// ---

// ### Summary

// * **String:** `ans + ch` automatically creates a new object.
// * **ArrayList:** `ans.add(...)` modifies the existing object.
// * To make the list version behave like the string version, we create a copy:

// ```java
// List<Integer> take = new ArrayList<>(ans);
// take.add(nums[idx]);
// ```

// Without creating this copy (or using backtracking with `remove()`), both recursive calls would share the same list and produce incorrect results.


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna