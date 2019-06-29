package com.app.pojos;
import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name = "customer")
public class Customer {
private Integer cust_id;
private String name;
private String username;
private String password;
private String city;
private int age;
private Date date;

public Customer() {System.out.println("In constr customer "+getClass().getName());}


public Customer(String name, String username, String password, String city, int age, Date date) {
	super();
	this.name = name;
	this.username = username;
	this.password = password;
	this.city = city;
	this.age = age;
	this.date = date;
}


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Integer getCust_id() {
	return cust_id;
}
@Column(length = 20)
public void setCust_id(Integer cust_id) {
	this.cust_id = cust_id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Column(length = 20)
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
@Column(length = 20)
public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
@Temporal(TemporalType.DATE)
public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

@Override
public String toString() {
	return "Customer [cust_id=" + cust_id + ", name=" + name + ", city=" + city + ", age=" + age + ", date=" + date
			+ "]";
}


}
