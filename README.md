# Java OOP Lab Sheet 08 — MCA III Semester

Solutions for all 20 questions from the supplied lab sheet, written as small, independent Java programs using classes, encapsulation, JavaBeans conventions, networking classes, and threads.

## Requirements
- JDK 17 or newer (JDK 21 recommended)
- Internet access only for Questions 18 and 19
- Run each question from its own folder so programs with the same class name do not conflict.

## How to run
Open a terminal in a question folder, then run:

```bash
javac *.java
java ClassName
```

For example:

```bash
cd Q01_StudentBean
javac *.java
java StudentBeanDemo
```

For server/client exercises, start the server first in one terminal and then run the client in another terminal. Both programs should run on the same computer unless you change the host address.

## Questions
| Folder | Task |
|---|---|
| Q01 | StudentBean — private fields and getters/setters |
| Q02 | RectangleBean — area and perimeter |
| Q03 | Serializable EmployeeBean |
| Q04 | Read-only currentDate property |
| Q05 | Write-only password property |
| Q06 | PropertyChangeListener for account balance |
| Q07 | Fire a property-change event after balance update |
| Q08 | Introspector — list StudentBean properties and methods |
| Q09 | CarBean — set and get properties |
| Q10 | CircleBean — radius, read-only area and circumference |
| Q11 | Display host name and IP address |
| Q12 | TCP HelloServer |
| Q13 | TCP HelloClient |
| Q14 | TCP server reads and displays client message |
| Q15 | TCP echo server and client |
| Q16 | UDP MessageSender |
| Q17 | UDP MessageReceiver |
| Q18 | Read web page using URL |
| Q19 | Download file using URLConnection |
| Q20 | Multithreaded TCP server |

**Note:** Questions 6 and 7 use separate demonstrations of the same JavaBeans property-change concept. Questions 12 and 14 are separate server versions, as requested by the lab sheet. The example.com download URL in Q19 may not provide a real `sample.txt`; the program reports the HTTP/download error clearly.
