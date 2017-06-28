# Java环境配置 for Win10
## 1. 下载Java
- [Java SE Development Kit 8 Downloads](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Oracle Technology Network](http://www.oracle.com/technetwork/index.html)
## 2. 环境配置
进入“控制面板\系统和安全\系统”,点击“高级系统设置”，“高级”标签，点击“环境变量”。
![Win10_环境变量](pic\java配置forWin10\win10_huanjingbianliang.jpg)
- 配置JAVA_HOME:“环境变量”对话框里，在系统变量标签下点击“新建”，在新建系统变量对话框里输入“变量名”和“变量值”。
![JAVA_HOME](pic\java配置forWin10\JAVA_HOME.jpg)
- 配置path:在环境变量对话框的系统变量里找到“path”变量，双击path。输入“变量名”和“变量值”。
结果![path变量](pic\java配置forWin10\path.jpg)
- 配置classpath:在环境变量对话框的系统变量**新建**“classpath”变量输入“变量名”和“变量值”。![classpath变量](pic\java配置forWin10\classpath.jpg)
## 3.验证
cmd下java[-options] class [args...]