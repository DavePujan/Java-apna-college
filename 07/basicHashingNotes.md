

Think of this as your **HashMap playbook for interviews**.

---

# 🧠 What is a HashMap? (In Simple Words)

A **HashMap** stores data in **key → value** form.

Example (frequency counting):

```
Number → How many times it appears
5      → 3
2      → 1
7      → 4
```

In Java:

```java
HashMap<Integer, Integer> map = new HashMap<>();
```

* **Key** → element of array
* **Value** → frequency (count)

⏱️ Average Time: **O(1)** for insert, search, update
That’s why it’s used in almost **every LeetCode frequency problem**.

---

# 🔑 Core HashMap Functions (MASTER THESE)

These 6 functions solve **90% of problems**.

---

## 1️⃣ `put(key, value)` – Insert / Update

```java
map.put(5, 1);
map.put(5, 2); // updates value
```

📌 If key exists → value is replaced
📌 If key does not exist → new entry

---

## 2️⃣ `get(key)` – Get Value

```java
int count = map.get(5);
```

⚠️ If key does NOT exist → returns `null`

❌ Dangerous:

```java
map.get(10) + 1; // NullPointerException
```

---

## 3️⃣ `containsKey(key)` – Check Existence

```java
if (map.containsKey(5)) {
    // safe to use get
}
```

Used in:

* Two Sum
* First occurrence
* Frequency update

---

## 4️⃣ ⭐ `getOrDefault(key, defaultValue)` – MOST IMPORTANT

```java
map.put(num, map.getOrDefault(num, 0) + 1);
```

🧠 Meaning:

* If key exists → return its value
* Else → return default value (0)

🔥 This line alone solves **most frequency problems**

---

## 5️⃣ `keySet()` – Loop Through Keys

```java
for (int key : map.keySet()) {
    System.out.println(key + " -> " + map.get(key));
}
```

Used when:

* Finding max frequency
* Printing frequencies
* Top K elements

---

## 6️⃣ `entrySet()` – Loop Through Key + Value Together

```java
for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    int key = entry.getKey();
    int value = entry.getValue();
}
```

Cleaner and faster than `keySet()` in interviews.

---

# 🧩 Frequency Pattern (MOST COMMON)

### Template (Memorize This)

```java
HashMap<Integer, Integer> map = new HashMap<>();

for (int num : nums) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

📌 Used in:

* Majority Element
* Top K Frequent
* First Unique
* Duplicates
* Anagrams
* Subarray problems

---

# 🧪 Dry Run Example (Important)

Array:

```
nums = [1, 2, 2, 3, 1, 2]
```

Execution:

```
1 → 1
2 → 1
2 → 2
3 → 1
1 → 2
2 → 3
```

Final Map:

```
1 → 2
2 → 3
3 → 1
```

---

# 🏆 Real Interview Examples

---

### 🔹 Check Duplicate

```java
HashSet<Integer> set = new HashSet<>();
for (int num : nums) {
    if (!set.add(num)) return true;
}
```

(Uses same idea as HashMap but only keys)

---

### 🔹 First Unique Element

```java
for (int num : nums) {
    if (map.get(num) == 1) return num;
}
```

---

### 🔹 Max Frequency Element

```java
int maxFreq = 0;
int ans = -1;

for (int key : map.keySet()) {
    if (map.get(key) > maxFreq) {
        maxFreq = map.get(key);
        ans = key;
    }
}
```

---

# ❌ Common Beginner Mistakes

❌ Using `get()` without checking null
❌ Forgetting `getOrDefault()`
❌ Using array when range is large
❌ Overcomplicating logic

---

# 🧠 Mental Model (VERY IMPORTANT)

Whenever you see:

> “count”, “frequency”, “how many times”, “duplicate”, “unique”

👉 **Your brain should auto-think: HashMap**

---

# 🚀 What I Recommend Next (Mentor Advice)

Practice in this order:

1. Frequency of elements
2. First unique element
3. Majority element
4. Two Sum
5. Top K Frequent
