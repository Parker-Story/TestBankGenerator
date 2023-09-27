# TestBankGenerator (Emerging Scholars)

Via the Emerging Scholars Program I have had the privlage to work with ULM’s program coordinator of Computer Science, Dr. Cordova, on this facinating project that has some very exciting ideas for application within the university. Starting Spring 2023, our goal was to write a program for each Discrete Structures question type that could recieve data from a file and then use that data to instantly generate an unlimited amount of unique questions for that respective type. The wider scope of the project is to collect data and determine if each student getting their own unique question encourages cooperation and group studying, thus improving overall study time and scores in the course.

By the end of the Semester, we began using the software to generate questions for in class activities, homework, quizzes, and tests.

Before any data was able to be collected, Dr. Cordova and I were informed that the University will be switching to the LMS Canvas so the primary focus for the Fall 2023 semester will be converting the existing software so that it functions within the new LMS.

Thus, this repository will serve as a way to document progress and to enable cooperation via multiple machines.


## LogicQuestion

The LogicQuestion file is the abstract super class by which all current question types extend from.


## Moodle Compatible 

TranslateToLogic 1-10 and TranslateFromLogic 1-10 all output a specific question in XML format that can be saved and imported into moodle. 

## Canvas Compatible

None currently. Transfering current software and developing new questions is this semseter's project.

## Data Extraction

The data extraction file pulls data from a file which is used to randomize each question. words.txt is just an arbitrary file we began with to test certain features.
