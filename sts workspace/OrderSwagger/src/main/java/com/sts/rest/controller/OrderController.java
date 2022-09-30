package com.sts.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sts.rest.entity.Orders;

import com.sts.rest.services.OrderService;
@RequestMapping("/rest/orders")

@RestController
public class OrderController {
	
	@Autowired
	public OrderService order;
	
	
	@GetMapping("/orders")
	public List<Orders> getAllOrders()
	{
		return order.getAllOrders();
	}
	
	
	@PostMapping("/addorder")
	public void addOrder(@RequestBody Orders order)
	{
		this.order.addOrder(order);
		
	} 
	
	
	@PutMapping("/order/{orderid}")
	public void updateOrder(@PathVariable String orderid,@RequestBody Orders s)
	{
		this.order.updateOrder(Integer.parseInt(orderid),s);
	}
	
	
	@DeleteMapping("/deleteorder/{orderid}")
	public void deleteOrder(@PathVariable String orderid)
	{
		this.order.deleteOrder(Integer.parseInt(orderid));
	}
	
	@GetMapping
	public String hello() 
	{
	return "hello";
	
		
	}
	@PostMapping("/hello")
	public String helloPost(@RequestBody final String hello)
	{
		return hello;
	}
	@PutMapping
	public String helloPut(@RequestBody final String hello)
	{
		return hello;
		
	}
	
	
	
}
