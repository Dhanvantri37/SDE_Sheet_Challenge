# LeetCode 13: Roman to Integer

**Difficulty:** Easy  
**Topics:** Math, String  

---

## 📝 Problem Summary
Roman numerals are represented by seven different symbols: 
`I` (1), `V` (5), `X` (10), `L` (50), `C` (100), `D` (500), and `M` (1000).

Given a roman numeral string (e.g., `MCMXCIV`), convert it to a standard integer.

---

## 🧠 The Core Logic (The "Trick")

Normally, Roman numerals are written from largest to smallest, left to right, and you simply **add** them up. (e.g., `XII` -> 10 + 1 + 1 = 12).

The twist is the **subtraction rule** (e.g., `IV` = 4, `IX` = 9). Instead of hardcoding all these special cases (like checking specifically for "IV" or "CM"), we use one simple, universal rule:

> **Read left to right. Look at your current letter, and peek at the immediate next letter.**
> - If your current letter is **SMALLER** than the next letter, you are in a shortcut -> **Subtract** your current value.
> - Otherwise -> **Add** your current value.

### Step-by-Step Example: `XIV` (14)
*Start with a Total of 0*

1. **Current: X (10)** | Next: I (1) 
   -> 10 is *not* smaller than 1. **Add 10**. *(Total: 10)*
2. **Current: I (1)** | Next: V (5) 
   -> 1 *is* smaller than 5! **Subtract 1**. *(Total: 9)*
3. **Current: V (5)** | Next: (none) 
   -> End of string. **Add 5**. *(Total: 14)*

---

## ⏱️ Complexity Analysis

- **Time Complexity: O(N)** (or O(1))
  We iterate through the string of length `N` exactly once. Because the largest valid Roman numeral is 3999, the string length is technically capped at 15 characters, meaning this runs in constant time, or O(1), in a strict sense.
  
- **Space Complexity: O(1)**
  We only need to keep track of a running total and look up static character values. No auxiliary data structures that grow with input size are required.