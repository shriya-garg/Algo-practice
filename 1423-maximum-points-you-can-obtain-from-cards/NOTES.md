Two pointers + sliding window.
​
Appeared DP at first
​
- Take a window of first k elements as sum first as cuu and max
- Now remove element from position [k] and add element as [arr.length-1]
- keep sliding and update max
- return max