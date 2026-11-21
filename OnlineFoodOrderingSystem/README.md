# 🍔 Online Food Ordering System

A Java-based Low-Level Design (LLD) project that models users, orders, and food items while exploring object-oriented design principles and relationships.

## 📖 About the Project

Designed a simplified Online Food Ordering System where users can place multiple orders, and each order can contain multiple food items.

The system focuses on maintaining proper relationships between objects, protecting data through encapsulation, and calculating the total order cost dynamically.

## ⚙️ System Features

- **User Management:** Each user has a unique ID and maintains a collection of all orders placed.
- **Food Items:** Each food item contains a name, price, and quantity.
- **Order Management:** Every order has a unique ID, is associated with a user, and contains multiple food items.
- **Order Creation:** Orders are created through an OrderService.
- **Cost Calculation:** Calculates the total cost dynamically using the price and quantity of each food item.

## 🏗️ Object Relationships

### 1. Association (User → Order)
- A user can have multiple orders.
- Each order is linked to its respective user.

### 2. Aggregation (Order → FoodItem)
- An order contains multiple food items.
- Food items can exist independently of an order.

## 🔒 Encapsulation

- All class fields are declared `private`.
- Constructors are used for object initialization.
- Getters provide controlled access to data.
- Direct field access and unnecessary setters are avoided.

## 🧠 Concepts Practiced

- Encapsulation and Data Hiding
- Association
- Aggregation
- Object Relationships
- Dynamic Cost Calculation
- Separation of Responsibilities

## 🛠️ Technology

- **Language:** Java
- **Paradigm:** Object-Oriented Programming
