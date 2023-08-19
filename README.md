This repository will be yet another house for the infamouse Gang of Four Design patterns.

I got inspired to set this up after looking at the work by Prem Aseem Jain.
That repo (https://github.com/premaseem/DesignPatternsJava9) is licensed as GPL v3.
All diagrams and many code examples are his work. Hence this repository has been licenced as GPL v3.


# Creational design patterns (5)

|Sr. no| Pattern name                                                    | GoF book description                                                                                                                                                       |
|-----:| -------------                                                   |:-------------:                                                                                                                                                    |
|  1   | [Singleton](#1-singleton-pattern-gem)                           | Ensure a class only has one instance, and provide a global point of access to it                                                                              |
|  2   | [Builder](#2-builder-pattern-construction_worker)               | **Saperate the construction of complex object from its representation so that the same construction process can create different representations**                    |
|  3   | [Prototype](#3-prototype-pattern-clipboard)                     | Specify the kinds of objects to create using a protypical instance, and create new objects by copying this prototype                                          |
|  4   | [Factory Method](#4-factory-method-pattern-factory)             | **Define an interface for creating an object, but let sub-classess decide which class to instantiate. Factory method lets a class defer instantiation to subclasses** |
|  5   | [Abstract Factory](#5-abstractfactory-pattern-factory--factory) | Provide an interface for creating families of related or dependent objects without specifying their concrete classes.                                         |

# Structural design patterns (7)

|Sr. no| Pattern name                                      | GoF book description                                                                                                                                                                |
|-----:| -------------                                     |:-------------:                                                                                                                                                             |
|  1   | [Adapter](#1-adapter-pattern--electric_plug)      | Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces. |
|  2   | [Bridge](#2-bridge-pattern--bridge_at_night)      | **Decouple an abstraction from its implementation so that the two can vary independently**                                                                                     |
|  3   | [Composite](#3-composite-pattern--leaves)         | Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.       |
|  4   | [Decorator](#4-decorator-pattern-heart_decoration)| **Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.**                         |
|  5   | [Facade](#5-facade-pattern--notes)                | Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.                     |
|  6   | [Flyweight](#6-flyweight-pattern-butterfly)       | **Use sharing to support large numbers of fine-grained objects efficiently.**                                                                                                  |
|  7   | [Proxy](#7-proxy-pattern-trollface)               | Provide a surrogate or placeholder for another object to control access to it.                                                                                         |

# Behavioral design patterns (11)

|Sr. no| Pattern name                                                 | GoF book description                                                                                                                                                                                                      |
|-----:| -------------                                                |:-------------:                                                                                                                                                                                                            |
|  1   | [Chain of Responsibility](#1-chain-of-responsibility-chains) | Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.   |
|  2   | [Command](#2-command-pattern-genie)                          | **Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.**                                                             |
|  3   | [Interpreter](#3-Interpreter-pattern-speaking_head)          | Given a language, define a represention for its grammar along with an interpreter that uses the representation to interpret sentences in the language.                                                               |
|  4   | [Iterator](#4-Iterator-pattern-loop)                         | **Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.**                                                                                                  |
|  5   | [Mediator](#5-mediator-pattern-phone)                        | Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently. |
|  6   | [Memento](#6-memento-arrow_right_hook)                       | **Without violating encapsulation, capture and externali ze an object's internal state so that the object can be restored to this state later.**                                                                             |
|  7   | [Observer](#7-observer-eyes)                                 | Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.                                                                    |
|  8   | [State](#8-state-design-pattern-arrows_counterclockwise)     | **Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.**                                                                                                        |
|  9   | [Strategy](#9-strategy-design-pattern-shipit)                | Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.                                                         |
|  10  | [Template method](#10-template-method-design-pattern-part_alternation_mark)| **Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.**              |
|  11  | [Visitor](#11-visitor-design-pattern-santa)                  | Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.                            |


