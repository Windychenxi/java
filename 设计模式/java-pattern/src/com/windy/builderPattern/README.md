# 建造者模式

## 使用场景

一个类的构造函数：

- 参数超过4个；
- 参数可选。

## 如何实现

1. 在`Computer`中创建一个静态内部类 Builder，然后将`Computer`中的参数都复制到Builder类中。
2. 在`Computer`中创建一个private的构造函数，参数为`Builder`类型
3. 在`Builder`中创建一个`public`的构造函数，参数为`Computer`中必填的那些参数，`cpu` 和 `ram`。
4. 在`Builder`中创建设置函数，对`Computer`中那些可选参数进行赋值，返回值为`Builder`类型的实例
5. 在`Builder`中创建一个`build()`方法，在其中构建`Computer`的实例并返回