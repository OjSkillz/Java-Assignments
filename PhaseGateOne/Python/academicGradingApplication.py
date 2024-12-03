"""
Pseudocode for student grading application

Prompt the teacher to enter the number of students
Read in the number of students
Prompt the teacher to enter the number of subjects
Read in the number of subjects
Prompt the teacher to enter the scores of each student per subject
Read in the scores of each student per subject 
If any score is lesser than 0 or greater than 100
	Print an error message
	Prompt the teacher to enter that score again
Display class summary after input collection
"""
students = []
subjects_list = []
scores = []

def update_students_list(number_of_students):
    for count in range(number_of_students):
        students.append(f"Student {count + 1}")
    return students

def update_subjects(number_of_students, number_of_subjects):
    subjects = []
    for index in range(number_of_students):
        for count in range(number_of_subjects):
            subjects.append(f"SUB {count+1}")
            students.extend(subjects)
    return subjects

def update_scores(scores_per_subject: list):
    pass


