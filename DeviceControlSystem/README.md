# 💡 Device Control System

A Java-based Low-Level Design (LLD) project that demonstrates Abstraction, Inheritance, and Polymorphism through a simple device management system.

## 📖 About the Project

Designed a Device Control System to manage different devices such as Fans and Lights.

The system uses an abstract base class `Device` to define common behavior, while individual devices provide their own implementations. A common controller operates different devices without knowing their specific types.

## ⚙️ System Features

- **Device Abstraction:** Defines a common abstract `Device` class with `turnOn()` and `turnOff()` methods.
- **Device Implementation:** Fan and Light extend the Device class and provide their own implementations.
- **Device Control:** A `DeviceController` manages different devices through a common `Device` reference.
- **State Management:** Each device maintains its own ON/OFF state.
- **Invalid Operation Handling:** Prevents turning ON an already ON device or turning OFF an already OFF device.
- **Extensibility:** Supports adding new device types without modifying the existing controller logic.

## 🏗️ Design Approach

- `Device` acts as the abstract base class.
- `Fan` and `Light` inherit from `Device`.
- `DeviceController` uses polymorphism to operate different device types.
- Each device is responsible for managing its own state and behavior.
- No type checking or `instanceof` is used in the controller.

## 🧠 Concepts Practiced

- Abstraction
- Inheritance
- Runtime Polymorphism
- Method Overriding
- State Management
- Extensible Object-Oriented Design

## 🛠️ Technology

- **Language:** Java
- **Paradigm:** Object-Oriented Programming
