# Lab 4 - Encapsulation

**Name:** Your Name  
**Section:** Section 2A  

## Required Test Output

```text
BMW 3 Series (2022)
Age: 4
Is Vintage: false

Ford Mustang (1995)
Age: 31
Is Vintage: true

Honda Civic (2020)
Age: 6
Is Vintage: false

=== Demonstrating Getters (v1) ===
Brand: BMW
Model: 3 Series
Year: 2022

=== Testing setYear() Behavior ===
setYear(2000) return value: true
Stored Year: 2000; Age: 26; Vintage: true

setYear(1885) return value: false
Stored Year: 2000

setYear(2027) return value: false
Stored Year: 2000

=== Testing Constructor Invalid Year Rules ===
New vehicle created with year 1885 -> Initial year stored: 2026
New vehicle created with year 2027 -> Initial year stored: 2026