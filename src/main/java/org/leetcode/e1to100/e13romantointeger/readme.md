# [13. Roman to Integer](https://leetcode.com/problems/roman-to-integer/description/)

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

>Symbol       Value <p>
I       =      1 <p>
V       =      5 <p>
X       =      10 <p>
L       =      50 <p>
C       =      100 <p>
D       =      500 <p>
M       =      1000 <p>

For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. <p>
However, the numeral for four is not IIII. Instead, the number four is written as IV. <p>
Because the one is before the five we subtract it making four. <p>
The same principle applies to the number nine, which is written as IX. <p>

There are six instances where subtraction is used:
* I can be placed before V (5) and X (10) to make 4 and 9.
* X can be placed before L (50) and C (100) to make 40 and 90.
* C can be placed before D (500) and M (1000) to make 400 and 900. <p>
Given a roman numeral, convert it to an integer.

---
### Example 1:
>Input: s = "III" <p>
Output: 3 <p>
Explanation: III = 3. <p>
### Example 2:
>Input: s = "LVIII" <p>
Output: 58 <p>
Explanation: L = 50, V= 5, III = 3. <p>
### Example 3: 
>Input: s = "MCMXCIV" <p>
Output: 1994 <p>
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4. <p>
___
### Constraints:
* 1 <= s.length <= 15
* s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
* It is guaranteed that s is a valid roman numeral in the range [1, 3999].
