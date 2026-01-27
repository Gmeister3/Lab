# SmartHome Pro - Java Implementation from UML Class Diagram

## Lab 2b: UML-to-Code Structural Mapping

This Java implementation is based strictly on the `SmartHome_ClassDiagram.png` UML diagram, following the requirements specified in `lab_2b.pdf`.

## Class Notation Standards

According to the new requirements, the following visual notation is used in the UML diagram:

### Class Types

1. **Classes** (Concrete Classes)
   - Visual: Green Circle with **C** inside (on top bar)
   - Text: Class name in **regular text**
   - Examples: `SmartHome`, `Room`, `SmartCamera`, `SmartLight`, `SmartLock`, `EnergyMonitor`, `Logger`, `NotificationService`

2. **Abstract Classes**
   - Visual: Blue Circle with **A** inside (on top bar)
   - Text: Class name in *italic text*
   - Examples: `SmartDevice`, `Sensor`

3. **Static Classes**
   - Visual: Green Circle with **C** inside (on top bar)
   - Text: `<<static>>` precedes the Class name in **regular text**
   - Examples: `DeviceFactory`

4. **Interfaces**
   - Visual: Purple Circle with **I** inside (on top bar)
   - Text: Interface name in *italic text*
   - Examples: `User`, `INetworkEnabled`, `IControllable`, `IDeployable`, `IMonitorable`, `Schedule`

## Project Structure

```
src/smarthome/
├── SmartHome.java              (Class - Green C)
├── Room.java                   (Class - Green C)
├── AutomationRule.java         (Class - Green C)
├── devices/
│   ├── SmartDevice.java        (Abstract Class - Blue A)
│   ├── SmartCamera.java        (Class - Green C)
│   ├── SmartLight.java         (Class - Green C)
│   ├── SmartLock.java          (Class - Green C)
│   ├── SmartThermostat.java    (Class - Green C)
│   └── EnergyMonitor.java      (Class - Green C)
├── sensors/
│   ├── Sensor.java             (Abstract Class - Blue A)
│   ├── TemperatureSensor.java  (Class - Green C)
│   ├── MotionSensor.java       (Class - Green C)
│   └── DoorSensor.java         (Class - Green C)
├── interfaces/
│   ├── User.java               (Interface - Purple I)
│   ├── INetworkEnabled.java    (Interface - Purple I)
│   ├── IControllable.java      (Interface - Purple I)
│   ├── IDeployable.java        (Interface - Purple I)
│   ├── IMonitorable.java       (Interface - Purple I)
│   └── Schedule.java           (Interface - Purple I)
├── services/
│   └── NotificationService.java (Class - Green C)
├── utils/
│   └── Logger.java             (Class - Green C)
└── factories/
    └── DeviceFactory.java      (Static Class - Green C with <<static>>)
```

## Implementation Details

### Relationships Implemented

1. **Composition** (Strong ownership - lifecycle binding)
   - Uses `final` keyword where appropriate
   - Constructor-based instantiation for lifecycle binding
   - Example: SmartHome has Rooms (when SmartHome is deleted, Rooms are destroyed)

2. **Aggregation** (Weak ownership - independent existence)
   - Objects can exist independently
   - Example: Room has SmartDevices (devices can exist without a room)

3. **Association**
   - Simple references between objects
   - Implemented through fields and method parameters

4. **Inheritance**
   - Uses `extends` keyword
   - Example: `SmartCamera extends SmartDevice`

5. **Interface Realization**
   - Uses `implements` keyword
   - Example: `SmartDevice implements INetworkEnabled, IControllable`

### Multiplicities

- `1..*` or `0..*` multiplicities implemented using Java Collections (`List`, `Set`)
- Example: `List<Room> rooms` for one-to-many relationships

### Visibility Modifiers

- `+` (public) → `public`
- `-` (private) → `private`
- `#` (protected) → `protected`

## Key Classes

### Abstract Classes (Blue Circle with A)

#### SmartDevice
- Base class for all smart devices
- Implements `INetworkEnabled` and `IControllable` interfaces
- Has abstract method `operate()` that must be implemented by subclasses
- Contains common attributes: deviceId, name, manufacturer, powerConsumption, isOnline

#### Sensor
- Base class for all sensors
- Implements `IMonitorable` interface
- Has abstract methods `readValue()` and `calibrate()`
- Contains common attributes: sensorId, sensorType, accuracy

### Concrete Classes (Green Circle with C)

#### SmartCamera, SmartLight, SmartLock, SmartThermostat, EnergyMonitor
- Extend `SmartDevice`
- Implement specific behavior for each device type
- Override abstract `operate()` method

#### TemperatureSensor, MotionSensor, DoorSensor
- Extend `Sensor`
- Implement specific sensor functionality
- Override abstract `readValue()` and `calibrate()` methods

### Interfaces (Purple Circle with I)

#### INetworkEnabled
- Defines network connectivity contract
- Methods: `connect()`, `disconnect()`, `getIPAddress()`

#### IControllable
- Defines device control contract
- Methods: `turnOn()`, `turnOff()`, `getStatus()`

#### IDeployable
- Defines scheduling contract
- Methods: `setSchedule()`, `executeSchedule()`

#### IMonitorable
- Defines data monitoring contract
- Methods: `getSensorData()`, `getLastUpdateTime()`

## Compilation

To compile the project:

```bash
cd /home/runner/work/Lab/Lab
mkdir -p bin
javac -d bin $(find src -name "*.java")
```

## Verification

All Java files:
- ✅ Compile successfully without errors
- ✅ Follow UML class diagram structure
- ✅ Implement proper relationships (Composition, Aggregation, Inheritance, Realization)
- ✅ Use correct visibility modifiers
- ✅ Include all attributes and method signatures from the diagram
- ✅ Use Collections for multiplicity handling
- ✅ Follow the new notation requirements (color circles for class types)

## Method Stubs

As per lab requirements, all methods have signatures but **do not include implementation logic**. Method bodies contain minimal stub code (e.g., `return null;` for non-void methods, empty `{}` for void methods).

## Author

COSC 3P91 - Advanced Object-Oriented Programming - Laboratory 2b
Winter Term - SmartHome Pro UML-to-Code Implementation
