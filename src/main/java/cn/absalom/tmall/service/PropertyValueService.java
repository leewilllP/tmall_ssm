package cn.absalom.tmall.service;

import cn.absalom.tmall.pojo.Product;
import cn.absalom.tmall.pojo.Property;
import cn.absalom.tmall.pojo.PropertyValue;

import java.util.List;

public interface PropertyValueService {
    void init(Product p);
    void update(PropertyValue pv);
    PropertyValue get(int ptid,int pid);
    List<PropertyValue> list(int pid);
}
