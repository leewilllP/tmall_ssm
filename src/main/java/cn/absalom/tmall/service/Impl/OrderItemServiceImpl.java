package cn.absalom.tmall.service.Impl;

import cn.absalom.tmall.mapper.OrderItemMapper;
import cn.absalom.tmall.mapper.ProductMapper;
import cn.absalom.tmall.pojo.Order;
import cn.absalom.tmall.pojo.OrderItem;
import cn.absalom.tmall.pojo.OrderItemExample;
import cn.absalom.tmall.pojo.Product;
import cn.absalom.tmall.service.OrderItemService;
import cn.absalom.tmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderItemServiceImpl implements OrderItemService{
    @Autowired
    OrderItemMapper orderItemMapper;
    @Autowired
    ProductService productService;

    @Override
    public void add(OrderItem c) {
        orderItemMapper.insert(c);
    }

    @Override
    public void delete(int id) {
        orderItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(OrderItem c) {
        orderItemMapper.updateByPrimaryKeySelective(c);
    }

    @Override
    public OrderItem get(int id) {
        OrderItem result  = orderItemMapper.selectByPrimaryKey(id);
        setProduct(result);
        return result;
    }

    @Override
    public List list() {
        return null;
    }

    @Override
    public void fill(List<Order> os) {
        for (Order o:os
             ) {
            fill(o);
        }
    }

    @Override
    public void fill(Order o) {
        OrderItemExample example = new OrderItemExample();
        example.createCriteria().andOidEqualTo(o.getId());
        example.setOrderByClause("id desc");
        List<OrderItem> ois = orderItemMapper.selectByExample(example);
        setProduct(ois);
    }

    public void setProduct(List<OrderItem> ois){
        for (OrderItem oi:ois
             ) {
            setProduct(oi);
        }
    }
    public void setProduct(OrderItem oi){
        Product p = productService.get(oi.getId());
        oi.setProduct(p);
    }
}
