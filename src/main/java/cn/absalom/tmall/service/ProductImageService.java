package cn.absalom.tmall.service;

import cn.absalom.tmall.pojo.ProductImage;

import java.util.List;

public interface ProductImageService {
    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage pi);
    void delete(int id);
    void update(ProductImage pi);
    ProductImage get(int id);
    //根据产品id和图片类型查询
    List list(int pid,String type);
}
