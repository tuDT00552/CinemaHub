package vn.cinemahub.cinemahub.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.cinemahub.cinemahub.entities.Order;
import vn.cinemahub.cinemahub.serviceImpl.OrderService;

import java.util.Date;
import java.util.List;
import java.util.Random;

@CrossOrigin
@RestController
@RequestMapping("/api/order")
public class OrderResource {
    Date date = new Date();
    @Autowired
    private OrderService orderService;

    @GetMapping
    public List<Order> findAll() {
        return orderService.findAll();
    }

    @PostMapping
    public Order save(@RequestBody Order order) {
        Random ran = new Random();
//        order.setOrderid(order.getOrderid() + x);
        order.setCreatedAt(date);
        order.setUpdateAt(date);
        order.setStatus(1);
        return orderService.save(order);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> findOne(@PathVariable Long id) {
        return orderService.get(id).map(movie -> new ResponseEntity<>(movie, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        orderService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
