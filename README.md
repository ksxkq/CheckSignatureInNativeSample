#CheckSignatureInNativeSample

## 前言
**安全** 这个问题就不多讲了，没有绝对的安全，我们能做的只是增加破解难度。

这两天看了一下如何防止二次打包，发现可以通过检测 App 签名的方式来判断是被修改。直接在 Java 层判断很容易，调用现有接口，然后判断就行了，但是这样很容易被别人反编译然后破解掉。但是如果放在 native 层检测的话，会稍微安全一些。

所以这里把这几天收集的资料整理成了一个 demo，希望对大家有所帮助。

因为刚接触 JNI，所以如果内容有什么错误的地方，希望大家指出，帮助改正。

## 目的
如果 App 被别人二次打包，那就让 App 无法启动。

## 参考
* [Android so库防客户端破解的解决方案](http://leehong2005.com/2016/08/08/android-so-signature-check/)
* [Android逆向之旅---Android应用的安全的攻防之战](http://blog.csdn.net/jiangwei0910410003/article/details/51530696)
* [Android 密钥保护和 C/S 网络传输安全理论指南](https://drakeet.me/android-security-guide#more-1685)