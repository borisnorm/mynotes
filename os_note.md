# Concept

## Mutex
* Actually a Binary Semaphore
* Short for mutual exclusion object. In computer programming, a mutex is a program object that allows multiple program threads to share the same resource, such as file access, but not simultaneously.

## Semaphore (信号量)
* Initialize a Semaphore with a non-negative value
* Wait: if the value is not negative, decrements the value by 1. If the semaphore variable is now negative, the process executing wait is blocked (i.e., added to the semaphore's queue) until the value is greater or equal to 1. Otherwise, the process continues execution, having used a unit of the resource.
* Signal: Increments the value of semaphore variable by 1. After the increment, if the pre-increment value was negative (meaning there are processes waiting for a resource), it transfers a blocked process from the semaphore's waiting queue to the ready queue.

## Deadlock
1. Mutual exclusion
2. Hold and wait
3. No preemption
4. Circular wait

Deadlock prevention algorithm normally forces on condition 4

## Process state
1. New
2. Ready
3. Running
4. Waiting
5. Terminated

## Paging
* One of the memory management schemes by which a computer stores and retrieves data from the secondary storage (hard disk) for use in main memory.
* An important part of virtual memory implementation.

## Virtual memory:
* a memory management technique maps memory addresses used by a program, called virtual addresses, into physical addresses in computer memory.

## Context switch
* a context switch is the process of storing and restoring the state (more specifically, the context) of a process or thread so that execution can be resumed from the same point at a later time. (Switch from one state to another state)

## Interrupt

a signal to the processor emitted by hardware or software indicating an event that needs immediate attention.

1. Hardware interrupt
* used by devices to communicate that they require attention from the operating system.
2. Software interrupt
* caused either by an exceptional condition in the processor itself, or a special instruction in the instruction set which causes an interrupt when it is executed.

## System call
* How a program requests a service from an operating system's kernel.

## Operating System Scheduling algorithms
1. First Come First Serve (FCFS) Scheduling
2. Shortest-Job-First (SJF) Scheduling
3. Priority Scheduling
4. Round Robin(RR) Scheduling
5. Multilevel Queue Scheduling

# Compare

## Thread vs. Process
* A process can be though of as an instance of a program in execution.
* A process is an independent entity to which system resource are allocated.
* Each process is executed in a separate address space
* One process cannot access the variables and data structure of another process. Has to use inter-process communications (pipes, sockets, etc.)
* A thread exists within a process.
* Multiple threads within a process share same heap space.
* Each thread still has its own registers and stack.

# Q & A
* Two ways to implement thread in Java:
	Implement Runnable interface
	Extend Thread class

* Why Runnable interface is better than Thread class?
	Java does not support multiple inheritance
	If we only what to be runnable, then just Runnable interface would be enough. No need to bother to inherit the full overhead of the Thread class.

# Interview Problems
## Use Mutex to implement read write lock
* Use one read mutex, and one write mutex.
* Use a counter to store how many reads are there currently.
* To start a read, lock the read mutex. If this is the first read, lock the write mutex as well. Then unlock the read mutex, as there could be multiple concurrent reads.
* To end a read, lock the read mutex. If this is the only read, unlock the write mutex as well. Then unlock the read mutex.
* To start a write, lock the write mutex.
* To end a write, unlock the write mutex.

Reference: http://blog.csdn.net/raomeng1/article/details/7685421
