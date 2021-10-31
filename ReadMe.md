# Basics of Spring

## Inversion of Control

The approach of outsourcing the construction and management of objects. Outsourcing is managed by Object factory.

Best practice - code to interface

## Spring Container

Spring container provides object factory that can help to make the app configurable

### Primary Functions

    1. Create and manage objects (IOC)
    2. Inject Object dependencies (Dependency Injection)

### Ways of configuring Spring

    1. XML configuration - legacy
    2. Java Annotations - modern
    3. Java Source Code - modern

### Spring development Process

    1. Configure spring beans
    2. Create Spring container (ApplicationContext)
    3. Retreive beans from Spring container

### Types of Dependency Injection

    1. Constructor Injection
    2. Setter Injection

    Using Autowired annotation

### Bean Scopes

Bean scope refers to lifecycle of bean and how it is shared. The default scope of a bean is Singleton meaning Spring
will create only one instance of the bean and every consumer of that bean will share the same instance.

Best use case of this scope is for stateless beans

Other bean scope

    1. Default Scope - one instance shared.
    2. Prototype scope: Every time a consumer call is made to the bean a new instance is created.
    3. request - scoped to Http Web request.
    4. Session - scoped to Http Web Session.
    5. global-session - Scoped to global Http web session

>Note: 3,4 and 5 are for only Web Apps


    