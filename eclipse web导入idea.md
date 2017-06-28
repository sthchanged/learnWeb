# eclipse web项目导入至idea
## 1. 前期准备
- JDK、IntelliJ IDEA、Tomcat安装（本地安装）
version 
JDK8 
IntelliJ IDEA 17.1.4(下称idea)
Tomcat 8.5
## 2. eclipse Web项目导入至idea
1. [file]-[close project]至idea初始界面
![idea初始界面](pic\eclipseWeb导入idea\idea初始界面.jpg)
2. 选择需要导入的项目目录
![选择import项目](pic\eclipseWeb导入idea\选择import项目.jpg)
3. 导入项目一路next
- 选择eclipse项目
![ec项目导入0](pic\eclipseWeb导入idea\ec项目导入0.jpg)
![ec项目导入1](pic\eclipseWeb导入idea\ec项目导入1.jpg)
![ec项目导入2](pic\eclipseWeb导入idea\ec项目导入2.jpg)
![ec项目导入3](pic\eclipseWeb导入idea\ec项目导入3.jpg)
4. 完成项目导入
- 出现warning，点击ok无视，项目设置会解决该问题
![ec项目导入4](pic\eclipseWeb导入idea\ec项目导入4.jpg)
- 项目导入后的目录结构
![import后目录结构](pic\eclipseWeb导入idea\import后目录结构.jpg)
可以看到多了idea项目依赖的.idea和.iml文件
5. 设置项目结构
- 配置project structure
【F4】 或 项目右键 【Open Module Settings】或 右上角有个黑蓝色的框框 或 菜单栏【view】-【Open Module Settings】进入 
![project structure](pic\eclipseWeb导入idea\projectstructure.jpg)
- [Project]标签，无需改动
![importProStr](pic\eclipseWeb导入idea\importProStr.jpg)
- [Moudle]-[Dependenies],出去eclipse自身的jdk，换成自己的jdk
![import更换自己jdk](pic\eclipseWeb导入idea\import更换自己jdk.jpg)
- 更换成自己的jdk，并配置需要的jar(lib目录 外部依赖项)，和Tomcat的lib目录
添加jar
![impot_jar](pic\eclipseWeb导入idea\impot_jar.jpg)
<br \>添加tomcat lib
![importtomcat](pic\eclipseWeb导入idea\importtomcat.jpg)
![importdepend](pic\eclipseWeb导入idea\importdepend.jpg)
- [Facets] ,选择web项目添加
![importFacets0](pic\eclipseWeb导入idea\importFacets0.jpg)
![importFacets1](pic\eclipseWeb导入idea\importFacets1.jpg)
上方为idea web目录，下方修改为eclipse项目webContent目录
![importFacets2](pic\eclipseWeb导入idea\importFacets2.jpg)
- [Artifacts] 添加WebApp Exploded
![importArtifacts](pic\eclipseWeb导入idea\importArtifacts.jpg)
选择项目点击ok
6. 配置Tomcat
Configurations
菜单栏【run】-【Edit Configurations】或 右上角有个向下的小箭头
![配置](pic\eclipseWeb导入idea\配置Configurations.jpg)
![importTomcat0](pic\eclipseWeb导入idea\importTomcat0.jpg)
![importTomcat1](pic\eclipseWeb导入idea\importTomcat1.jpg)
7. 完成，不出意外可以运行啦啦啦(笑
配置完成的项目结构
![finish](pic\eclipseWeb导入idea\finish.jpg)
## 3. 项目编码
**eclipse项目和idea项目编码设置保持一致**