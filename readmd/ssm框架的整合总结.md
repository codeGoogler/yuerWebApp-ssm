### SSM框架的整合

**创建实例**：

https://www.cnblogs.com/dengcl/p/7595160.html


**解决IntelliJ IDEA 创建Maven项目速度慢问题**：
https://www.cnblogs.com/huahua035/p/6954152.html

**IDEA中的maven web 项目中如何设置自己的本地仓库**
https://www.cnblogs.com/1314wamm/p/7476199.html

对时下互联网项目的三个主流框架进行整合开发，MyBatis作为模型层、SpringMVC 作为控制层、Spring作为整个各层输出、粘合作用的解决方案。



#### 第一步，创建Maven项目，导入依赖


#### 第二步，生成实体类和映射文件

生成实体类：不生成DAO接口，DAO接口是是实现类手动编写的
必须要继承：SQLSessionDaoSupport(之类的酒具有SqlSession的能力)


##### 第三步，开发DAO接口和实现类

需要继承整合类：SqlSessionDaoSupport，他可以直接帮助我们得到SqlSeeeion，然后我们就可以调用getSqlSession（）方法



 #### 第四步，配置整合持久层
 
1、配置数据源

2、加入依赖

**关键点：**，加载配置，得到SqlSessionFcatory



#### 第五步，测试
![ ](https://upload-images.jianshu.io/upload_images/14371339-fe42bdf773655265.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
