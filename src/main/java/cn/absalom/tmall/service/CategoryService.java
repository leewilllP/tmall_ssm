package cn.absalom.tmall.service;

import cn.absalom.tmall.pojo.Category;
import cn.absalom.tmall.util.Page;

import java.util.List;

/*
* 业务层
*
* 首先设计接口，再设计其实现的类
接着再在Spring的配置文件中配置其实现的关联。这样我们就可以在应用中调用Service接口来进行业务处理。
Service层的业务实现，具体要调用到已定义的DAO层的接口，
封装Service层的业务逻辑有利于通用的业务逻辑的独立性和重复利用性，程序显得非常简洁。
*/
public interface CategoryService{
    List<Category> list();
   // int total();
   // List<Category> list(Page page);
    void add(Category category);
    void delete(int id);
    Category get(int id);
    void update(Category category);
}