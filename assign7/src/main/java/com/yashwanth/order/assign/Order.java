package com.yashwanth.order.assign;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString

@Document(collection = "Employee")
public class Order {
	@Id
	private int id;
	private String orderName;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	


}
