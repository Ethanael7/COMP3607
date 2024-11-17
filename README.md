# INTRODUCTION:

## GROUP MEMBERS
Ethanael St. John - 816034639 
Shaynelle Edwards - 816035175 
Nandani Jagat - 816031286
Xaviella Millette - 816036180 
Tamia Williams - 816024758

## PROJECT SCOPE AND PURPOSE
Automated Judge System - To design, develop, evaluate, and present an automated judge system for evaluating assignments submitted in Object Oriented Programming 1.

# ANALYSIS:

## MAJOR REQUIREMENTS AND USE CASE
### Functional Requirements: 
1.File Upload
    The system must allow students to upload ZIP files containing their assignment submissions.
    The system must validate the ZIP file name format as studentID-assignment.zip. If the name does not match, an error message must be displayed.
    The system must verify that the ZIP file contains exactly five files. If there are more or fewer, an error message must be displayed.

2.File Type Validation
    The system must only accept .java files within the uploaded ZIP file. Any other file types should trigger an error message.

3.File Extraction
    The system must extract files from the uploaded ZIP folder for processing.
    The system must ensure extracted files maintain their original names and formats.

4.Code Compilation and Execution
    The system must compile each of the five .java files.
    The system must execute the compiled files using predefined test data.

5.Testing Functionality
    The system must run three types of tests:
    Correct Test Cases: Evaluate if the program produces the expected outputs for valid inputs.
    Boundary Tests: Evaluate the program's performance with edge cases or inputs at system limits.
    Error Cases: Validate if the program handles incorrect inputs gracefully.

6.Feedback Generation
    The system must provide immediate feedback after each test, indicating whether the test passed or failed.
    Feedback must include:
    Points assigned for successful tests.
    Error messages or suggestions for failed tests.

7.Error Handling
    The system must display user-friendly error messages for:
    Incorrect ZIP file names.
    Incorrect number of files in the ZIP folder.
    Unsupported file types.

### Non-Functional Requirements:
1.Usability
    The system should have an intuitive interface for students to upload their assignments easily.
    Error messages must be clear, concise, and provide guidance for correcting mistakes.

2.Performance
    The system must process uploaded files and generate feedback within 10 seconds.
    The system must handle at least 50 concurrent submissions without performance degradation.

3.Reliability
    The system must ensure 99.9% uptime during assignment submission periods.
    The system must accurately evaluate all submitted assignments against the defined test cases.

4.Scalability
The system should scale to accommodate an increasing number of students and assignments as needed.

5.Data Integrity
Uploaded files must not be altered during processing.
Test results and feedback must be accurately linked to the corresponding student ID.
Compliance

### Use Cases
1.Upload Assignment
2.Validate Files
3.Compile and Execute Code
4.Evaluate Test Cases
5.Provide Feedback
6.Error Handling

### Target Student:
The target students for this automated judge system are those enrolled in the Object-Oriented Programming 1 (OOP1) course, typically beginners or intermediate programmers learning Java.
The system is designed to evaluate their understanding of core OOP concepts.
It provides a user-friendly interface for students to upload assignments and receive detailed feedback, including test case results, corrective suggestions, and an overall score.

# DESIGN
## Design pattern used:
Strategy - This is a behavorial design pattern, the automated judge system implements the Strategy Pattern to handle different evaluation strategies for Java programs. This pattern allows the system to define a family of algorithms, encapsulate each one, and make them interchangeable without altering the context in which they are used.

## Conformance to SOLID principals