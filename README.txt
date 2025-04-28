Smart CV Analyser
=================

SID: 2404938
Team Name: Diverse Pen Testers
Module Code: MOD003484 TRI2 F01CAM

---

Description:
-------------
This project is a Java console application that reads a candidate's CV (in .txt, .docx, or .pdf format), extracts relevant information, compares it to job requirements entered by the user, and calculates a match score based on skills and years of experience.

The program demonstrates object-oriented programming principles, error handling, file input/output, and external library integration.

---

How to Run:
-------------
1. Make sure you have Java JDK installed (version 17 or above recommended).
2. Recommended to use JetBrains IntelliJ IDEA
3. Compile all the Java files:
   - SmartCVAnalyser.java
   - Candidate.java
   - JobDescription.java
   - CVChecker.java
   - FileParser.java
3. Ensure the external libraries are available:
   - Apache POI libraries for .docx file reading
   - Apache PDFBox libraries for .pdf file reading
4. Run SmartCVAnalyser.java
5. Follow on screen prompts 

---

External Libraries Required:
-------------
- Apache POI (for handling .docx files)
- Apache PDFBox (for handling .pdf files)

*Note:* Manual download and addition of libraries are required if not using Maven. Instructions for adding .jar files to your classpath depend on your IDE or command-line setup.

---

Notes:
-------------
- The candidate CV must be structured correctly:
- Line 1: Full Name
- Line 2: Email Address
- Line 3: Education
- Line 4: Years of Experience
- Lines 5+: Skills (one per line)

- Only .txt, .docx, and .pdf files are supported.
- Also available on GitHub : https://github.com/VA567/SmartCVAnalyser_MOD003484-TRI2-F01CAM

---

