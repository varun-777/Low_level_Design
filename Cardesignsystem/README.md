# 🚗 Car – Engine – Wheel

A simple Car system designed using Java to understand how **Encapsulation works in real-world applications.**

## 📖 About the Project

A Car consists of one Engine and four Wheels. This project demonstrates how to protect these internal components and control their behavior through well-defined methods.

Instead of allowing direct access to the Engine and Wheels, the Car provides controlled operations to interact with them.

## ⚙️ Features

- **Start the Car:** Starts the engine only if it is in the IDLE state.
- **Stop the Car:** Changes the engine state back to IDLE.
- **Accelerate:** Allows acceleration only when the engine is RUNNING.
- **Engine States:** Supports IDLE, RUNNING, and OVERHEATED states.
- **Check Tire Pressure:** Identifies wheels with pressure below 30 PSI.

## 🏗️ Design Approach

- Car owns one Engine and four Wheels (Composition).
- Internal fields are kept private to prevent direct access.
- State changes happen through controlled methods.
- No public setters that bypass business rules.
- Each class manages its own responsibilities.

## 🧠 Concepts Learned

- Encapsulation
- Data Hiding
- Object Composition (HAS-A Relationship)
- Enum and State Management
- Separation of Responsibilities

## 🛠️ Technology

**Language:** Java
