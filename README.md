# 🧠 DSA Solutions — Akash Anshuman

> Structured problem-solving practice in **Java** and **Python**, organized by topic.  
> Each solution includes time & space complexity analysis.

---

## 📊 Progress Tracker

| Topic | Easy | Medium | Hard | Total |
|-------|------|--------|------|-------|
| Arrays | 0 | 0 | 0 | 0 |
| Linked Lists | 0 | 0 | 0 | 0 |
| Trees | 0 | 0 | 0 | 0 |
| Graphs | 0 | 0 | 0 | 0 |
| Dynamic Programming | 0 | 0 | 0 | 0 |
| Strings | 0 | 0 | 0 | 0 |
| Sorting & Searching | 0 | 0 | 0 | 0 |
| **Total** | **0** | **0** | **0** | **0** |

---

## 📁 Folder Structure

```
dsa-solutions/
├── arrays/
├── linked-lists/
├── trees/
├── graphs/
├── dynamic-programming/
├── strings/
└── sorting-searching/
```

---

## 🗂️ Problem List

### Arrays
| # | Problem | Difficulty | Solution | Time | Space |
|---|---------|------------|----------|------|-------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Easy | [Java](arrays/two-sum.java) | O(n) | O(n) |

### Linked Lists
| # | Problem | Difficulty | Solution | Time | Space |
|---|---------|------------|----------|------|-------|

### Trees
| # | Problem | Difficulty | Solution | Time | Space |
|---|---------|------------|----------|------|-------|

### Graphs
| # | Problem | Difficulty | Solution | Time | Space |
|---|---------|------------|----------|------|-------|

### Dynamic Programming
| # | Problem | Difficulty | Solution | Time | Space |
|---|---------|------------|----------|------|-------|

### Strings
| # | Problem | Difficulty | Solution | Time | Space |
|---|---------|------------|----------|------|-------|

### Sorting & Searching
| # | Problem | Difficulty | Solution | Time | Space |
|---|---------|------------|----------|------|-------|

---

## 💡 How I Structure Each Solution

```java
// Problem: Two Sum (LeetCode #1)
// Difficulty: Easy
// Approach: HashMap to store seen values
// Time Complexity:  O(n)
// Space Complexity: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

---

## 🚀 Where to Start (Recommended Order)

If you're also learning DSA and want to follow the same path:

1. **Arrays** — Two Sum, Best Time to Buy and Sell Stock, Maximum Subarray
2. **Strings** — Valid Anagram, Valid Palindrome, Longest Substring Without Repeating Characters
3. **Linked Lists** — Reverse Linked List, Merge Two Sorted Lists, Detect Cycle
4. **Trees** — Inorder Traversal, Maximum Depth, Validate BST
5. **Graphs** — Number of Islands, Clone Graph, Course Schedule
6. **DP** — Climbing Stairs, House Robber, Coin Change

---

## 🔗 Connect

- 💼 [LinkedIn](https://linkedin.com/in/akash-anshuman-30702727a)
- 🖥️ [LeetCode Profile](https://leetcode.com/akashanshuman) ← update this link
- 📧 Arnav1401singh@gmail.com
