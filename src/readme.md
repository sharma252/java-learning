# **Design Patterns in Java**

This document provides a brief overview of key design patterns in Java: **Factory Pattern, Decorator Pattern, Proxy Pattern, Observer Pattern, and Adapter Pattern**.

---

## **1. Factory Pattern**

**Type:** Creational Design Pattern  
**Purpose:** Used to create objects without specifying their concrete class.

**Advantages:**  
✅ Encapsulates object creation logic  
✅ Reduces code duplication  
✅ Increases code maintainability

---

## **2. Decorator Pattern**
**Type:** Structural Design Pattern  
**Purpose:** Adds behavior dynamically to an object without modifying its original code.

**Advantages:**  
✅ Extends functionality dynamically  
✅ Follows Open-Closed Principle  
✅ Avoids subclass explosion

---

## **3. Proxy Pattern**
**Type:** Structural Design Pattern  
**Purpose:** Controls access to another object (e.g., caching, lazy loading, security).

**Advantages:**  
✅ Improves performance with caching  
✅ Controls access to sensitive objects  
✅ Supports lazy initialization

---

## **4. Observer Pattern**
**Type:** Behavioral Design Pattern  
**Purpose:** Defines a **one-to-many** dependency between objects. When one object changes state, all its dependents are notified automatically.

**Advantages:**  
✅ Reduces tight coupling  
✅ Allows event-driven programming  
✅ Improves scalability

---

## **5. Adapter Pattern**
**Type:** Structural Design Pattern  
**Purpose:** Allows two incompatible interfaces to work together by providing a wrapper that translates requests between them.

**When to Use:**
- When you need to integrate an existing class with a new interface without modifying its code.
- When working with third-party libraries that don’t match your system’s expected interface.

**Real-World Example:**
- A power socket adapter that allows a device with a different plug type to connect to an electrical outlet.
- Using legacy payment gateways in a modern e-commerce application by wrapping them in a common payment interface.

**Advantages:**  
✅ Enables interoperability between incompatible interfaces  
✅ Allows reusability of existing code without modification  
✅ Supports the **Open-Closed Principle** by extending functionality without modifying existing code

---

## **Conclusion**
These five patterns (**Factory, Decorator, Proxy, Observer, and Adapter**) are widely used in Java applications. They help make code more maintainable, scalable, and flexible.


