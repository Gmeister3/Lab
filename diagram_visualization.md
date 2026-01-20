# SmartHome Pro UML Class Diagram - Visual Guide

Since PlantUML rendering requires Java or online tools, here's a text-based representation of the diagram structure:

## System Architecture Overview

```
┌─────────────────────────────────────────────────────────────────┐
│                         SmartHome Pro System                     │
└─────────────────────────────────────────────────────────────────┘

┌──────────┐
│   User   │ ────owns──┐
└──────────┘           │ (Aggregation - o--)
                       │
                       ▼
                  ┌─────────┐
                  │  House  │ ────contains──┐ (Composition - *--)
                  └─────────┘               │
                       │                    │
                       │ contains           │
                       │ (Composition)      ▼
                       │              ┌───────────┐ 1..*
                       │              │   Room    │ ────contains──┐
                       │              └───────────┘               │
                       │                                          │ (Aggregation)
                       ▼ 1                                        ▼ 0..*
                 ┌──────────────┐                          ┌──────────────┐
                 │ CentralHub   │                          │ SmartDevice  │ (Abstract)
                 └──────────────┘                          └──────────────┘
                       │                                          │
                       │ maintains                                │
                       │ (Composition)                            │ implements
                       ▼                                          │
                 ┌──────────────┐                                │
                 │ ActivityLog  │                         ┌──────▼──────┐
                 └──────────────┘                         │IConnectable │ <<interface>>
                       │                                  └─────────────┘
                       │ contains                                │
                       │ (Composition)                            │ implements
                       ▼ 0..*                                     │
                 ┌──────────────┐                                │
                 │  LogEntry    │                          ┌─────▼────┐
                 └──────────────┘                          │  Sensor  │
                                                           └──────────┘
                                                                 │
                                                                 │ triggers (1:1)
                                                                 ▼
                                                          ┌──────────────┐
                                                          │AutomationRule│
                                                          └──────────────┘
                                                                 │
                                                                 │ performs action on (1:1)
                                                                 ▼
                                                          ┌──────────────┐
                                                          │ SmartDevice  │
                                                          └──────────────┘
                                                                 △
                                                                 │
                              ┌──────────────────┬───────────────┼───────────────┐
                              │                  │               │               │
                        ┌─────▼─────┐      ┌────▼─────┐    ┌────▼──────┐  ┌────▼─────┐
                        │   Light   │      │Thermostat│    │ SmartLock │  │   ...    │
                        └───────────┘      └──────────┘    └───────────┘  └──────────┘
```

## Relationship Summary

### Composition (Strong Ownership - ◆→ or *--)
Objects are destroyed with their parent:
- House *-- Room (1 to 1..*)
- House *-- CentralHub (1 to 1)
- CentralHub *-- ActivityLog (1 to 1)
- ActivityLog *-- LogEntry (1 to 0..*)

### Aggregation (Weak Ownership - ◇→ or o--)
Objects can exist independently:
- User o-- House (1 to 0..*)
- Room o-- SmartDevice (0..1 to 0..*)

### Inheritance (Generalization - △→ or <|--)
Subclasses inherit from superclass:
- SmartDevice <|-- Light
- SmartDevice <|-- Thermostat
- SmartDevice <|-- SmartLock

### Interface Realization (△--- or <|..)
Classes implement interface contract:
- IConnectable <|.. SmartDevice
- IConnectable <|.. Sensor

### Association
Regular connections between objects:
- Sensor -- AutomationRule (1:1)
- AutomationRule -- SmartDevice (1:1)

## Class Details

### IConnectable (Interface)
```
<<interface>>
IConnectable
─────────────────────────
+ connectToWifi(): void
+ getSignalStrength(): int
```

### SmartDevice (Abstract)
```
{abstract}
SmartDevice
─────────────────────────
# deviceId: String
# deviceName: String
# status: boolean
─────────────────────────
+ turnOn(): void
+ turnOff(): void
+ {abstract} performAction(): void
```

### Concrete SmartDevice Implementations

**Light**
```
Light
─────────────────────────
- brightnessLevel: int
─────────────────────────
+ setBrightness(level: int): void
+ performAction(): void
```

**Thermostat**
```
Thermostat
─────────────────────────
- targetTemperature: double
─────────────────────────
+ setTemperature(temp: double): void
+ performAction(): void
```

**SmartLock**
```
SmartLock
─────────────────────────
- pinCode: String
─────────────────────────
+ unlock(pin: String): boolean
+ lock(): void
+ performAction(): void
```

## To View the Actual UML Diagram

1. **Online**: Copy `SmartHomePro.puml` to http://www.plantuml.com/plantuml/uml/
2. **VS Code**: Install PlantUML extension and open the .puml file
3. **Command Line**: Install PlantUML and run `plantuml SmartHomePro.puml`

This will generate a professional UML diagram with proper notation.
