#### 项目介绍

图书后台管理系统，采用SpringBoot+Thymeleaf，页面使用LayUI框架，使用RESTful API风格编写接口。

#### 已实现功能

- [x] 基本增删改查(RESTful API风格)
- [x] 拦截器
- [ ] ...

#### 项目技术栈

- Spring Boot
- MyBatis
- MySQL
- Thymeleaf
- ...


#### 项目预览

![](https://raw.githubusercontent.com/onlywyj/library-demo/master/README_img/00.png)

![](https://raw.githubusercontent.com/onlywyj/library-demo/master/README_img/01.png)

#### RESTful风格

|      | 普通CRUD                 | RestfulCRUD        |
| :--: | ------------------------ | ------------------ |
| 查询 | getUser                  | user---GET         |
| 添加 | addUser?xxx              | user---POST        |
| 修改 | updateUser?id=xxx&xxx=xx | user(/id)---PUT    |
| 删除 | deleteUser?id=1          | user(/id)---DELETE |

##### 详细

|              | 请求URI   | 请求方式 |
| ------------ | --------- | -------- |
| 查询所有人员 | users     | GET      |
| 查询某个人员 | user/{id} | GET      |
| 来到添加页面 | user      | GET      |
| 添加人员     | user      | POST     |
| 来到修改页面 | use/{id}  | GET      |
| 修改人员     | user      | PUT      |
| 删除人员     | user/{id} | DELETE   |

