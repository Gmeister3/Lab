# Lab 2: SmartHome Pro UML Class Diagram

## Overview
This repository contains the solution for Laboratory 2 of COSC 3P91 - Advanced Object-Oriented Programming. The assignment requires creating a comprehensive UML Class Diagram for a "SmartHome Pro" system based on detailed requirements.

## Files

### 1. `lab_2.pdf`
The original laboratory assignment document containing:
- System requirements for SmartHome Pro
- Learning objectives
- Analysis questions
- Grading criteria

### 2. `SmartHomePro.puml`
The complete UML Class Diagram implementation in PlantUML format. This file includes:
- All required classes and interfaces
- Proper relationship types (Composition, Aggregation, Inheritance, Realization)
- Multiplicities at all association ends
- Attributes and methods with visibility modifiers
- Abstract class notation

#### Key Components:
- **User, House, Room**: Property management hierarchy
- **CentralHub, ActivityLog, LogEntry**: System management and logging
- **IConnectable**: Interface for WiFi-enabled devices
- **SmartDevice (abstract)**: Base class for all smart devices
  - Light (with brightnessLevel)
  - Thermostat (with targetTemperature)
  - SmartLock (with pinCode)
- **Sensor**: Environmental monitoring devices
- **AutomationRule**: Automation logic connecting Sensors to SmartDevices

### 3. `ANALYSIS_ANSWERS.md`
Detailed answers to all 10 analysis questions from the lab assignment, including:
- Relationship type justifications
- OOP principle explanations
- UML notation clarifications
- Design decision rationale

## How to View the UML Diagram

### Option 1: Online PlantUML Editor
1. Copy the contents of `SmartHomePro.puml`
2. Visit [PlantUML Online Server](http://www.plantuml.com/plantuml/uml/)
3. Paste the code and view the rendered diagram

### Option 2: VS Code Extension
1. Install the "PlantUML" extension in VS Code
2. Open `SmartHomePro.puml`
3. Use the preview feature (Alt+D)

### Option 3: Command Line
```bash
# Install PlantUML (requires Java)
sudo apt-get install plantuml

# Generate PNG diagram
plantuml SmartHomePro.puml

# This creates SmartHomePro.png
```

## Design Highlights

### Composition Relationships (Strong Ownership)
- **House ◆→ Room**: Rooms are destroyed when House is deleted
- **House ◆→ CentralHub**: Each house has exactly one hub
- **CentralHub ◆→ ActivityLog**: Logs belong to the hub
- **ActivityLog ◆→ LogEntry**: Entries are part of the log

### Aggregation Relationships (Weak Ownership)
- **User ◇→ House**: User owns houses, but houses can exist independently
- **Room ◇→ SmartDevice**: Devices can be reassigned to different rooms

### Inheritance (Generalization)
- **SmartDevice** is abstract with concrete implementations:
  - Light
  - Thermostat
  - SmartLock

### Interface Realization
- **IConnectable** implemented by:
  - SmartDevice (and all its subclasses)
  - Sensor

### Special Relationships
- **Sensor → AutomationRule → SmartDevice**: 1:1:1 association for automation

## Learning Outcomes Demonstrated

✅ Translation of text requirements into formal UML Class Diagram  
✅ Correct distinction between Composition and Aggregation  
✅ Proper modeling of Inheritance and Interface realization  
✅ Appropriate multiplicities and visibility modifiers  
✅ Structural implications of abstract classes  

## Author
Solution for COSC 3P91 Laboratory 2 - Winter Term