## 递归 Recursion ##
### 本质 ： 通过函数来进行的循环 ###
    模版：
        recursion terminator 递归终结条件
        process logic 当前层逻辑
        drill down 下探下一层
        reverse states  清理当前层（可选）
        

## 分治和回溯 Divide & Conquer ##

### 分治本质 ： 寻找子问题和重复性 ###

    模版：
    recusion terminator
    prepare data
    conquer subproblems（其实相当于下探）
    process and generate the final result（比递归多了一步）
    revert the current level states

### 回溯 Backtracking ###
    八皇后 和 数独问题