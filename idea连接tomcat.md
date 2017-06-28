# IntelliJ IDEA 连接 Tomcat
## 1. 前期准备
- JDK、IntelliJ IDEA、Tomcat安装（本地安装）
version 
JDK8 
IntelliJ IDEA 17.1.4
Tomcat 8.5
## 2. 开始
### 2.1 创建、配置项目
#### 2.1.1 创建项目
- [New Project] 勾选[Web Application]
![勾选Web Application](pic\idea连接tomcat\勾选web.jpg)
#### 2.1.2 配置项目
- 配置project structure
【F4】 或 项目右键 【Open Module Settings】或 右上角有个黑蓝色的框框 或 菜单栏【view】-【Open Module Settings】进入 
![project structure](pic\idea连接tomcat\projectstructure.jpg)
##### 2.1.2.1 设置Sources标签
![modules](pic\idea连接tomcat\modules.jpg)
**classes和lib需要新建 classes设置成excluded**
##### 2.1.2.2 设置Paths标签
勾选Use module compile output path
修改Output path & Test output path
![Paths](pic\idea连接tomcat\paths.jpg)
##### 2.1.2.3 设置Dependencies
绿色加号 选择 JARs or directories...
![Dependencies1](pic\idea连接tomcat\dependencies1.jpg)
选择之前创建的lib目录 ok 后选择 Jar Directory
![Dependencies2](pic\idea连接tomcat\dependencies2.jpg)
结果 ok
![Dependencies3](pic\idea连接tomcat\dependencies3.jpg)
### 2.2 配置Tomcat
#### 2.2.1 配置Configurations
菜单栏【run】-【Edit Configurations】或 右上角有个向下的小箭头
![配置](pic\idea连接tomcat\配置Configurations.jpg)
#### 2.2.2 新建Tomcat Server
*IntelliJ 2016 社区版(也就是免费版) 没有Tomcat Server这个选项，收费版有
如果是收费版也没有Tomcat Server选项*
![tomcatserver0](pic\idea连接tomcat\tomcatserver0.jpg)
给server起个名字
![tomcatserver1](pic\idea连接tomcat\tomcatserver1.jpg)
在第二个选项卡Deployment中
右边有个绿色+ 加一个Artifact 
![tomcatserver2](pic\idea连接tomcat\tomcatserver2.jpg)
项目已经自动添加进来
记得在右边Application context 中输入项目的启动地址 记得加“/” 
![tomcatserver3](pic\idea连接tomcat\tomcatserver3.jpg)
然后点ok
配好之后 面板会有些变化 证明tomcat 已经配好了
![tomcatserver4](pic\idea连接tomcat\tomcatserver4.jpg)
## 3. 运行
![jsp](pic\idea连接tomcat\jsp.jpg)
点击绿色小箭头运行
结果
![result](pic\idea连接tomcat\result.jpg)
## 4. 注意事项
## Address localhost:8080 is already in use 
### 4.1 win停止
cmd>netstat   -ano|findstr  8080
找到pid后
管理员cmd>taskkill /f  /pid pidnum  
### 4.2 关闭tomcat自启动localhost:8080
禁用启动项无效
[我的电脑]-[管理]-[服务与应用程序]-[服务]找到Tomcat服务[属性]调成手动