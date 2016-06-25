# DesignPatterns
本项目与CSDN博客同步展示，希望将自己对于设计模式的认知展示出来与大家共同探讨和分析，在讲解设计模式的同时，将写博客期间写的示例进行分享，本项目会在博客更新后一段时间内进行代码示例的更新，请大家多多关注和支持！博客地址：http://blog.csdn.net/wangyang1354/
# 设计模式文章综述
## 单一功能原则
单一功能原则（Single responsibility principle）规定每个类都应该有一个单一的功能，并且该功能应该由这个类完全封装起来。所有它的（这个类的）服务都应该严密的和该功能平行（功能平行，意味着没有依赖）。http://blog.csdn.net/wangyang1354/article/details/51136530

## 里氏替换原则
在面向对象的程序设计中，里氏替换原则（Liskov Substitution principle）是对子类型的特别定义。它由芭芭拉·利斯科夫（Barbara Liskov）在1987年在一次会议上名为“数据的抽象与层次”的演说中首先提出。

里氏替换原则的内容可以描述为： “派生类（子类）对象能够替换其基类（超类）对象被使用。” 以上内容并非利斯科夫的原文，而是译自罗伯特·马丁（Robert Martin）对原文的解读。其原文为：

    Let q(x) be a property provable about objectsx of typeT. Thenq(y) should be true for objectsy of typeS whereS is a subtype ofT.

芭芭拉·利斯科夫与周以真（Jeannette Wing）在1994年发表论文并提出的以上的Liskov代换原则。----维基百科
里氏替换原则我个人的理解是：在继承关系中，父类的对象如果替换为子类的对象，他原来执行的行为依然保持不变，那么这样的程序才符合里氏替换原则，否则违背了里氏替换原则。http://blog.csdn.net/wangyang1354/article/details/51164514

## 依赖倒置原则
In object-oriented programming, the dependency inversion principle refers to a specific form of decoupling software modules. When following this principle, the conventional dependency relationships established from high-level, policy-setting modules to low-level, dependency modules are reversed, thus rendering high-level modules independent of the low-level module implementation details. The principle states:

        A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
        B. Abstractions should not depend on details. Details should depend on abstractions.

The principle inverts the way some people may think about object-oriented design, dictating that both high- and low-level objects must depend on the same abstraction.
----WIKIPEDIA
释义（读者可以试着自己翻译下，个人感觉第二句不好翻，不过蛮有意思的）：

在面向对象的程序设计中，依赖倒置原则是指解耦软件模块的特殊的形式。传统的依赖关系建立在高层次，而具体的策略设置应用在低层次上。使用依赖倒置原则，使得高层独立于底层的实现细节，依赖关系被倒置，使得低层次模块依赖于高层次模块的抽象。

原则规定：
A. 高层模块不应该依赖于低层模块，双方都要依赖于抽象类。
B. 抽象类不应该依赖于实现细节，实现细节应该依赖于抽象。
这项原则颠覆了一些人对面向对象程序设计的认识，比如：高层和低层都应该依赖于相同的抽象。
http://blog.csdn.net/wangyang1354/article/details/51167071

## 接口隔离原则
接口隔离原则（英语：interface-segregation principles， 缩写：ISP）指明没有客户（client）应该被迫依赖于它不使用方法。接口隔离原则(ISP)拆分非常庞大臃肿的接口成为更小的和更具体的接口，这样客户将会只需要知道他们感兴趣的方法。这种缩小的接口也被称为角色接口（role interfaces）。接口隔离原则(ISP)的目的是系统解开耦合，从而容易重构，更改和重新部署。----WIKIPEDIA

个人对于接口隔离原则的理解是:
设计接口的时候，尽量保证实现接口的那些类尽可能一致的包含着接口中的方法，避免过多的设计了接口中的方法，导致其实现类中需要实现多个完全没有用处的方法（会造成代码的冗余和混乱）。
http://blog.csdn.net/wangyang1354/article/details/51172635


