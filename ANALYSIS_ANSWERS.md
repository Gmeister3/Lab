# SmartHome Pro - Analysis Answers

## Laboratory 2: UML Class Diagram
### Analysis Task Answers

**1. Which relationship best describes the link between House and Room?**

**Composition** - The relationship between House and Room is composition because the requirements explicitly state: "If a House is deleted from the system, all its associated Rooms are also destroyed." This indicates that Rooms cannot exist without their parent House, which is the defining characteristic of composition (strong ownership with lifecycle dependency).

**2. How should the relationship between Room and SmartDevice be represented to show that devices survive room deletion?**

**Aggregation** - The relationship should be represented as aggregation because the requirements state: "Devices can exist independently of a Room; if a Room is deleted, devices are unassigned but not destroyed." This is a weaker relationship where SmartDevices can exist without being assigned to a Room, indicating shared ownership rather than exclusive ownership.

**3. If SmartDevice is abstract, can it be instantiated directly?**

**No** - Abstract classes cannot be instantiated directly. SmartDevice serves as a template that defines common attributes and methods for all smart devices, but you can only create instances of its concrete subclasses (Light, Thermostat, SmartLock). The abstract class may contain abstract methods (like performAction()) that must be implemented by the concrete subclasses.

**4. What notation is used to represent the IConnectable implementation?**

A **dashed line with a hollow triangle arrow** pointing from the implementing class to the interface (realization relationship). In UML, this is called the "realization" or "interface implementation" relationship. Additionally, the interface name is typically prefixed with `<<interface>>` stereotype or marked with an "I" prefix in the name.

**5. What is the multiplicity between House and Room?**

**1 to 1..\*** (one-to-many) - Each House contains "at least one Room," which means a House must have a minimum of 1 Room and can have many Rooms. From the Room's perspective, each Room belongs to exactly 1 House. This is notated as `House "1" *-- "1..*" Room`.

**6. Where should the startRecording() method be placed if only SecurityCamera uses it?**

The `startRecording()` method should be placed **only in the SecurityCamera class**. Since this functionality is specific to SecurityCamera and not shared by other SmartDevice types (Light, Thermostat, SmartLock), it should not be in the abstract SmartDevice class. This follows the principle of placing methods at the most specific level where they are needed.

**7. Is the link between CentralHub and LogEntry Aggregation or Composition?**

**Composition** - The requirements state: "The CentralHub maintains an ActivityLog consisting of multiple LogEntries... If the hub is destroyed, the logs are also destroyed." This lifecycle dependency indicates composition. The LogEntries are created and owned by the CentralHub (through ActivityLog), and they have no independent existence outside of the hub.

**8. Which OOP principle is applied when creating Admin and Guest from User?**

**Inheritance (Generalization)** - When creating Admin and Guest from User, we apply the inheritance principle. User serves as the base class (superclass), and Admin and Guest are derived classes (subclasses) that inherit common attributes and methods from User while potentially adding their own specific behaviors and attributes. This demonstrates the "is-a" relationship (Admin is-a User, Guest is-a User).

**9. How are interface names typically formatted in UML (e.g., <<interface>>)?**

Interface names are typically formatted in one or more of these ways:
- Using the **<<interface>>** stereotype above the interface name
- Using **italic text** for the interface name
- Prefixing the name with "I" (e.g., IConnectable)
- In a class box with the compartments showing only abstract methods (all public)

The most common and recommended approach is using the `<<interface>>` stereotype.

**10. How many objects are involved in a single execution of an AutomationRule?**

**Three objects** are involved in a single execution of an AutomationRule:
1. **One Sensor** object - that triggers the rule
2. **One AutomationRule** object - the rule itself that defines the automation logic
3. **One SmartDevice** object - that the action is performed on

The requirements specify a "1:1:1 relationship" between Sensor, AutomationRule, and SmartDevice, meaning each AutomationRule is triggered by exactly one Sensor and performs actions on exactly one SmartDevice.

---

## Key Design Decisions

### Composition Relationships:
- **House → Room**: Rooms destroyed with House
- **House → CentralHub**: CentralHub destroyed with House
- **CentralHub → ActivityLog**: ActivityLog destroyed with CentralHub
- **ActivityLog → LogEntry**: LogEntries destroyed with ActivityLog

### Aggregation Relationships:
- **User → House**: Houses can exist without specific User ownership
- **Room → SmartDevice**: Devices can exist independently of Room assignment

### Inheritance Hierarchies:
- **SmartDevice** (abstract) ← Light, Thermostat, SmartLock

### Interface Realizations:
- **IConnectable** ← SmartDevice (all smart devices must connect to WiFi)
- **IConnectable** ← Sensor (sensors must connect to WiFi)

### Association:
- **Sensor → AutomationRule → SmartDevice**: 1:1:1 relationship for automation execution
