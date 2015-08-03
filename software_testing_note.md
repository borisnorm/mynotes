# Box approach

## Black-box testing

## White-box testing

## Gray-box testing

# Testing levels

## Unit testing / component testing
* usually written by developers as they work on code
* white-box test
* Though this method of test design can uncover many errors or problems, it might not detect unimplemented parts of the specification or missing requirements.
* While white-box testing can be applied at the unit, integration and system levels of the software testing process, it is usually done at the unit level. 
* It can test paths within a unit, paths between units during integration, and between subsystems during a system–level test.

## Integration testing
* Any type of software testing that seeks to verify the interfaces between components against a software design.

* The phase in software testing in which individual software modules are combined and tested as a group. 

* Occurs after unit testing and before validation testing.

* Progressively larger groups of tested software components corresponding to elements of the architectural design are integrated and tested until the software works as a system.

## Component interface testing 
* Black-box testing

## System testing
* Test the whole integrated system
* Black-box test
* GUI testing, Usability testing, Software performance testing, Load testing, Stress testing, Security testing, Scalability testing, Sanity testing, Exploratory testing, Ad hoc testing, Regression testing, Accessibility testing.

## Operational Acceptance Testing / Operational Readiness Testing
* Used to conduct operational readiness (pre-release) of a product, service or system as part of a quality management system.
* A common type of non-functional software testing


# Testing Types

## Regression testing
* Uncover new software bugs, or regressions after changes, enhancements, patches or configuration changes.

* Ensure that changes have not introduced new faults.

* Rerunning previously completed tests and checking whether program behavior has changed and whether previously fixed faults have re-emerged.

* Systematically select the appropriate minimum set of tests needed to adequately cover a particular change.

## Non-regression testing
* To verify whether the change after an update of the software has had the intended effect.

## Smoke testing
* Reveal simple failures severe enough to reject a prospective software release. Test cases that cover the most important functionality are selected and run to determine if crucial functions work correctly.

# Agile testing

* Not a separate phase, but an integral part of software development, along with coding.

* Testing and coding are done incrementally and iteratively.

# Ad hoc testing

* Intended to be run only once

* Least formal test method

* Goodness of ad hoc testing: important defects can be found quickly.

# Test-driven Development
Test-driven development (TDD) is a software development process that relies on the repetition of a very short development cycle: first the developer writes an (initially failing) automated test case that defines a desired improvement or new function, then produces the minimum amount of code to pass that test, and finally refactors the new code to acceptable standards.


# Software Testing Life Cycle (STLC)

* Requirement Analysis
** Identify types of tests to be performed. 
** Gather details about testing priorities and focus.
** Prepare Requirement Traceability Matrix (RTM).
** Identify test environment details where testing is supposed to be carried out. 
** Automation feasibility analysis (if required).

* Test Planning / Test Strategy
** Prepare test plan/strategy document
** Select test tool
** Estimate test effort
** Determine resource / roles / responsibilities
** Training requirement

* Test Case Development
** Create test cases, automation scripts
** Review and baseline test cases and scripts 
** Create test data

* Environment Setup

* Test Execution

* Test Cycle Closure



Reference to: https://help.github.com/articles/markdown-basics/

# The largest heading

## The second largest heading

*This text will be italic*

**This text will be bold**

* Item
* Item
* Item

- Item
- Item
- Item

1. Item 1
2. Item 2
3. Item 3

1. Item 1
  1. A corollary to the above item.
  2. Yet another point to consider.
2. Item 2
  * A corollary that does not need to be ordered.
    * This is indented four spaces, because it's two spaces further than the item above.
    * You might want to consider making a new list.
3. Item 3