# Proxy Design Pattern in Java

This repository contains a working example demo code in Java that illustrates the Proxy design pattern. The Proxy design pattern provides a surrogate or placeholder for another object to control access to it. It adds an extra level of indirection to support distributed, controlled, or intelligent access while protecting the real component from undue complexity.

## Table of Contents

- [Introduction](#introduction)
- [Problem](#problem)
- [Usage Scenarios](#usage-scenarios)
- [Structure](#structure)
- [Discussion](#discussion)
- [Important Points](#important-points)
- [Checklist](#checklist)
- [Rules of Thumb](#rules-of-thumb)

## Introduction

Doctors often utilize proxies or assistant doctors unless their presence is specifically required. For preliminary investigations, a senior doctor or surgeon is not necessary, and proxy/assistant doctors are employed. However, for operations or consultations, the senior doctor takes charge and replaces the proxy.

**Proxy** means 'in place of' or 'on behalf of'. This concept is analogous to giving a proxy for a friend during attendance roll call in college. This readme explains the Proxy design pattern, which acts as a representative or placeholder for an object, managing access and interactions.

## Problem

The Proxy pattern is used when resource-intensive objects should not be instantiated unless they are requested by the client. The pattern addresses scenarios where controlled, deferred, or efficient access to objects is required.

## Usage Scenarios

The Proxy pattern finds application in various scenarios:

1. **Remote Proxy**: Represents an object locally that belongs to a different address space. This is seen in technologies like RMI (Remote Method Invocation) where proxy objects for remote objects are used.

2. **Virtual Proxy**: Instead of using a complex or heavy object directly, a virtual proxy acts as a placeholder. For example, with large images, a virtual proxy can be used to load the real object only when needed.

3. **Protection Proxy**: Common in corporate environments, a protection proxy controls access to sensitive master objects. Similar to how a proxy server censors internet content, this proxy ensures proper access permissions.

4. **Smart Reference**: This proxy type simply holds a reference to the real object, acting as a pointer.

## Structure

The Proxy design pattern involves the following components:

- **Subject**: An interface defining the methods that the Proxy and RealSubject (the actual object) will implement. The Proxy object is transparent to the client.

- **Proxy**: This surrogate object stands in place of the RealSubject. It instantiates the real object upon the client's first request and forwards subsequent requests to the real object.

- **RealSubject**: The actual object that the Proxy represents.

## Discussion

A proxy is a wrapper object that manages the instantiation and interaction of a real object. It instantiates the real object when necessary and forwards requests to it. The Proxy pattern is applicable in various situations:

- A **virtual proxy** reduces the overhead of creating expensive objects by deferring their instantiation until needed.

- A **remote proxy** provides a local representation of an object in a different address space.

- A **protective proxy** controls access to sensitive objects by checking permissions before forwarding requests.

- A **smart proxy** can perform additional actions when an object is accessed.

## Important Points

- A proxy can hide information about the real object from the client.
- Proxies can optimize by performing on-demand loading.
- Proxies can handle additional tasks like auditing.
- Proxy design pattern is also known as the surrogate design pattern.

## Checklist

To effectively implement the Proxy pattern:

1. Identify aspects that are best implemented as wrappers or surrogates.
2. Define an interface making the proxy and real component interchangeable.
3. Consider implementing a Factory to decide between proxy or original objects.
4. The wrapper class holds a reference to the real class and implements the interface.
5. Initialize the reference either during construction or on first use.
6. Each wrapper method contributes leverage and delegates to the real object.

## Rules of Thumb

- **Adapter**: Provides a different interface to its subject.
- **Proxy**: Provides the same interface as the subject.
- **Decorator**: Provides an enhanced interface.

Decorator and Proxy have different purposes but similar structures, both providing a level of indirection to another object while keeping a reference to the object they forward requests to.

## Getting the Example Code

You can download the example code from the [GitHub repository](https://github.com/premaseem/designPatterns/tree/4bb9beca7bab5b5e71d02b76e4f1ad48fce4aca6/ZipDownloadableProjects). This repository contains a Java project that demonstrates the Proxy design pattern with practical code examples.

Feel free to explore and learn from the provided code to understand how the Proxy design pattern is implemented in Java.
