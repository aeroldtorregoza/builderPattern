# Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

<img width="1000" alt="image" src="https://github.com/aeroldtorregoza/builderPattern/assets/143488240/c5d2df74-3ecb-4285-8925-1558aeca1ae8">

# However, you encounter challenges:

- `Registration forms`: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
* `Optional fields`: Not all customers provide complete information, but the constructor forces them to.
- `Data consistency`: Changes to user profiles after registration can cause unexpected issues due to mutable fields.

Implement solution using the Builder Pattern to address the issue.

# Class Diagram
<img width="1000" alt="image" src="https://github.com/aeroldtorregoza/builderPattern/assets/143488240/6993c25c-9424-4a97-89d2-5c0f7840b626">
