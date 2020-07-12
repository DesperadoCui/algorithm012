### 学习总结 ###

#### 数据结构与算法总览 ####
- 一维数据结构
    + 基础：数组array(string)  链表 linked list
    + 高级：栈stack 队列queue 双端队列deque 集合set 映射map(hash or map),etc

- 二维数据结构
    + 基础：数tree 图graph
    + 高级：二叉搜索树binary search tree(red-black tree, AVL),堆heap, 并查集disjoint set,字典树Trie,etc

- 特殊数据结构
    + 位运算 Bitwise
    + 布隆过滤器 BloomFilter 
    + LRU Cache
    
- 五遍刷题法
    + 第一遍
        - 5分钟：读题 + 思考
        - 直接看解法：多解法，比较解法优劣
        - 背诵和默写
    + 第二遍
        - 马上自己写 leetcode 提交
    + 第三遍
        - 第二天来一遍
    + 第四遍
        - 第二周来一遍
    + 第五遍
        - 面试前一周来一遍
        
        
#### 训练准备和复杂度分析 ####

- 自顶向下的编程方式
- 时间复杂度
    + O(1) Constant Complextity 常数时间复杂度
    + O(log n) Logarithmic Complexity 对数时间复杂度
    + O(n) Linear Complexity 线性时间复杂度
    + O(n^2) N square Complexity 平方
    + O(n^3) N cubic Complexity 立方
    + O(2^n) Exponential Grouth指数
    + O(n!) Factorial 阶乘
    
#### 数组、链表、跳表的基本表现和特性 ####
- 数组 Array
    + 访问时间复杂度是O(1)
    + 添加和删除时间复杂度是O(n)
    + 查看Java ArrayList源代码
- 链表 Linked List
    + 适用于更改比较频繁的情况下
    + 添加和删除时间复杂度是O(1)
    + 访问时间复杂度是O(n)
    + CMU15121课程 和 查看Java源代码（双向链表）
- 跳表 Skip List
    + 只能用于链表元素有序的情况下
    + 对标平衡树AVL Tree和二分查找
    + 插入/删除/搜索都是O(logn)
    + 应用场景 Redis LevelDB LRU缓存
    + 缺点就是维护成本高

- 重要解题思想
    + 一维数据结构加速查找的办法一般是提升维度
    + 升维思想 和 空间换时间思想
    + 双指针向中间收敛
    + 找最近重复子问题
    + 双指针问题一般先排序
    + 环形链表使用快慢指针
    
#### 栈、队列、优先队列、双端队列 ####
- Stack 栈
    + 特点 先入后出
    + 添加删除O(1)
    + 查询O(n)
    
- Queue 队列
    + 特点 先入先出
    + 添加删除O(1)
    + 查询O(n)
    
- Double-End Queue 双端队列
    + 特点 两端都可以进出的队列
    + 添加删除O(1)
    + 查询O(n)

- Priority Queue 优先队列
    + 添加删除O(1)
    + 查询O(logn)
    
- 解题思想
    + 最近相关性(括号匹配问题) ->用栈来解决
    + 先来后到 -> 用队列来解决
    + 常数时间获取最小值 -> 辅助栈
    + 滑动窗口 -> 双端队列