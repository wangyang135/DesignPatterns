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

## 迪米特法则(最少知道准则)
得墨忒耳(迪米特)定律（Law of Demeter，缩写LoD）亦称为“最少知识原则（Principle of Least Knowledge）”，是一种软件开发的设计指导原则，特别是面向对象的程序设计。得墨忒耳(迪米特)定律是松耦合的一种具体案例。该原则是美国东北大学在1987年末在发明的，可以简单地以下面任一种方式总结:

    1. 每个单元对于其他的单元只能拥有有限的知识：只是与当前单元紧密联系的单元；

    2. 每个单元只能和它的朋友交谈：不能和陌生单元交谈；

    3. 只和自己直接的朋友交谈。

这个原理的名称来源于希腊神话中的农业女神，孤独的得墨忒耳。

很多面向对象程序设计语言用"."表示对象的域的解析算符，因此得墨忒耳定律可以简单地陈述为“只使用一个.算符”。因此，a.b.Method()违反了此定律，而a.Method()不违反此定律。一个简单例子是，人可以命令一条狗行走（walk），但是不应该直接指挥狗的腿行走，应该由狗去指挥控制它的腿如何行走。----WIKIPIDIA

个人的理解：

面向对象的程序设计中，对象与对象之间尽量相互独立，具体对象的行为由具体的对象去完成，而不是由某个对象去指定另一个对象去实施行为而且是具体的行为。迪米特法则，核心的思想就是，要求我们在设计的时候，尽量避免类与类之间的耦合，弱化耦合关系可以提升复用率，但是这样的话，会产生中间的跳转类等，导致系统复杂。实际使用的过程中尽量在保证可读性与复杂性较低的情况下，按照迪米特法则去弱化类与类之间的耦合关系（高内聚、低耦合）。
http://blog.csdn.net/wangyang1354/article/details/51177866

## 开闭原则
在面向对象编程领域中，开闭原则规定“软件中的对象（类，模块，函数等等）应该对于扩展是开放的，但是对于修改是封闭的”，这意味着一个实体是允许在不改变它的源代码的前提下变更它的行为。该特性在产品化的环境中是特别有价值的，在这种环境中，改变源代码需要代码审查，单元测试以及诸如此类的用以确保产品使用质量的过程。遵循这种原则的代码在扩展时并不发生改变，因此无需上述的过程。

开闭原则的命名被应用在两种方式上。这两种方式都使用了继承来解决明显的困境，但是它们的目的，技术以及结果是不同的。----WIKIPEDIA

个人对于开闭原则的理解：

开闭原则相当于一个纲领性质的原则，提倡类等应该在设计完成后通过扩展的方式适应新的业务需求，而不是通过修改的方式去适应新的需求，这样的设计更加灵活、稳定。之前的五大原则是开闭原则思想的具体实现的情况。
http://blog.csdn.net/wangyang1354/article/details/51179851

## 单例模式
单例模式，也叫单子模式，是一种常用的软件设计模式。在应用这个模式时，单例对象的类必须保证只有一个实例存在。许多时候整个系统只需要拥有一个的全局对象，这样有利于我们协调系统整体的行为。比如在某个服务器程序中，该服务器的配置信息存放在一个文件中，这些配置数据由一个单例对象统一读取，然后服务进程中的其他对象再通过这个单例对象获取这些配置信息。这种方式简化了在复杂环境下的配置管理。----维基百科（WIKIPEDIA）

个人的理解：

单例模式概念比较简单，他的目的就是只允许出现一个该类的实例，经常在JDBC操作类等处被用到，我在项目中应用到的地方就是用于获取Dao层的类的实例，单例模式有多种实现方式，这里我认知到的有饿汉式、懒汉式、枚举、静态内部类。庆幸这次整理过程，因为又拓展了不少的单例模式的知识。
http://blog.csdn.net/wangyang1354/article/details/51193223

## 简单工厂、工厂方法、抽象工厂
工厂模式的核心思想在我认为是将类创建的权利授予给工厂类，其他的类不允许创建，授予了权限的类创建好之后，需要某些的对象的时候，可以去工厂当中去取。也就是像一个工厂一样，用的人不需要关心对象怎么来的，你只需要关心怎么用就好了。工厂模式细分为三种，简单工厂、工厂方法、抽象工厂三种模式。这三种模式比较相似，往往会引发混淆，本文主要结合实际的例子去进行区分。理清三者之间的关系与适用范围。

概述
简单工厂
对于简单工厂，我个人的理解是，直接实现一个方法，要生产什么由这个方法以及传入的参数来决定。

工厂方法
1. 解决了哪类“工厂”生产哪类东西的问题。
2.这种模式通过公共的接口或抽象类定义生产出来的是哪种东西，但是不限制生产出来的具体产品，在其子类中或者实现类中去确定具体生产出来的是什么东西。

抽象工厂
1. 解决了同一种东西多种分类的情况。
2. 抽象类去设定生产的产品的具体分类，交给子类去实际生产该分类下的产品。

简单的讲，三者最主要的区别在于：
简单工厂：通过参数控制生产的不同的产品。
工厂方法：通过不同的子类工厂生产不同的产品。
抽象工厂：通过方法生产不同的产品。
http://blog.csdn.net/wangyang1354/article/details/51211877




