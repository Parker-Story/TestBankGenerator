# TestBankGenerator (Emerging Scholars)

Welcome to the TestBankGenerator project, a part of the Emerging Scholars Program at the University of Louisiana at Monroe (ULM). This project, developed in collaboration with Dr. Cordova, ULM's program coordinator of Computer Science, aims to revolutionize the way Discrete Structures questions are generated and utilized within the university. Our objective is to create a program that can efficiently generate an unlimited number of unique questions for various question types, promoting cooperation and group studying among students.

**Table of Contents**
- [Overview](#overview)
- [Project Goals](#project-goals)
- [Current Progress](#current-progress)
- [LogicQuestion](#logicquestion)
- [Moodle Compatibility](#moodle-compatibility)
- [Canvas Compatibility](#canvas-compatibility)
- [Data Extraction](#data-extraction)

## Overview

Through the Emerging Scholars Program, we have embarked on an exciting journey to enhance the learning experience at ULM. Starting in Spring 2023, we initiated the development of software capable of generating diverse questions for Discrete Structures courses. The key innovation is our ability to generate personalized questions for each student, fostering cooperation and improving overall learning outcomes.

## Project Goals

Our project encompasses the following goals:

1. Create a program for generating unique questions for different Discrete Structures question types.
2. Enable the program to receive data from files and use that data for question generation.
3. Collect data to determine if personalized questions promote cooperation and group studying.
4. Enhance overall study time and scores in the course.

## Current Progress

By the end of the Spring 2023 semester, we successfully integrated our software into various aspects of the course, including in-class activities, homework, quizzes, and tests. However, we encountered a pivotal development with ULM's transition to the Canvas Learning Management System (LMS) scheduled for the Spring 2024 semester.

## LogicQuestion

The `LogicQuestion` file serves as the abstract superclass from which all current question types extend. It forms the foundation for question generation within our software.

## Moodle Compatibility

To facilitate integration with Moodle, we have developed the following components:

- `TranslateToLogic 1-10`: Outputs questions in XML format that can be saved and imported into Moodle.
- `TranslateFromLogic 1-10`: Outputs questions in XML format that can be saved and imported into Moodle.

## Canvas Compatibility

As of now, our software is not compatible with Canvas. Our primary focus for the Fall 2023 semester is to adapt and transfer the existing software to function seamlessly within the new Canvas LMS.

## Data Extraction

The `ExtractWords` file is responsible for extracting data from a file, which is then used to randomize each question. We initially used `words.txt` as an arbitrary file to test certain features and is not relevant to the existing software.

This repository serves as a documentation hub for our project's progress.

We are excited to continue this journey, adapt our software for Canvas, and further enhance the learning experience at ULM. Your contributions and feedback are welcome as we strive to reach our goals.

Feel free to explore the sections above for more details on each aspect of our project.
