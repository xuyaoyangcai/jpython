# JPython — Java 实现的 Python 解释器

用纯 Java 实现的 Python 语言解释器，完整覆盖从源码到执行的全部流水线。

## 架构

```
Python 源码 → Tokenizer → Parser → AST → Interpreter → 执行结果
```

## 模块

| 模块 | 路径 | 说明 |
|------|------|------|
| Tokenizer | `tokenizer/` | 词法分析，将源码分割为 Token 流 |
| Parser | `parser/` | 语法分析，基于 DFA 的 LL(1) 解析器 |
| AST | `ast/` | 抽象语法树节点定义（70+ 节点类型） |
| Grammar | `grammar/` | 语法定义与 DFA 生成器 |
| Interpreter | `interpreter/` | 解释执行引擎，支持变量、函数、控制流 |
| Object | `object/` | Python 对象系统（int/str/list/dict/function） |

## 支持特性

- 变量赋值与作用域
- 算术/布尔/比较运算
- if/while/for 控制流
- 函数定义与调用
- print 输出
- break/continue
- 列表/字典/集合/元组

## 构建与运行

```bash
# 构建
mvn package

# 交互式 REPL
java -cp target/jpython.jar pers.xia.jpython.main.REPL

# 执行 .py 文件
java -cp target/jpython.jar pers.xia.jpython.main.Run example.py
```

## 参考

详见 [java-pythoninterpreter.pdf](./java-pythoninterpreter.pdf)
