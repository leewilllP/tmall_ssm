package cn.absalom.tmall.service.Impl;

import cn.absalom.tmall.mapper.CategoryMapper;
import cn.absalom.tmall.pojo.Category;
import cn.absalom.tmall.pojo.CategoryExample;
import cn.absalom.tmall.service.CategoryService;
import cn.absalom.tmall.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 接口的实现类
* */
//声明当前类
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List<Category> list() {
        CategoryExample example = new CategoryExample();
        example.setOrderByClause("id desc");
        return categoryMapper.selectByExample(example);

    }

    /*@Override
        public int total() {
            return categoryMapper.total();
        }
        @Override
        public List<Category> list(Page page){
            return categoryMapper.list(page);
        }*/
    @Override
    public void add(Category category) {
        categoryMapper.insert(category);
    }
    @Override
    public void delete(int id) {
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Category get(int id) {
        return categoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Category category) {
        categoryMapper.updateByPrimaryKey(category);
    }
}
