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
subjects = []

scores_per_student = {}
totals = []
total = 0
def update_students_list(number_of_students):
    for count in range(number_of_students):
        students.append(f"Student {count + 1}")
    return students

def update_subjects(number_of_subjects):
    for count in range(number_of_subjects):
        subjects.append(f"SUB {count+1}")
    return subjects

def update_subjects_per_student(number_of_students, number_of_subjects):
    for count in range(number_of_students):
        update_subjects(number_of_subjects)
        subjects_per_student.extend(subjects)
    return subjects_per_student

number_of_students = int(input("How many students do you have? >> "))
update_students_list(number_of_students)

number_of_subjects = int(input("How many subjects do they offer? >> "))
print(update_subjects(number_of_subjects))
for index in range(1, number_of_students + 1):
    print()
    print(f"Entering Scores for Student {index}") 
    scores = []
    for count in range(1, number_of_subjects + 1):
        score = int(input(f"Enter score for Subject {count} >> "))
        while score < 0 or score > 100:
            print("\nInvalid entry. Enter scores between 0 and 100")
            score = int(input(f"Enter score for Subject {count} >> "))
        scores.append(score)
        print("Saved Successfully")
        scores_per_student[students[index-1]] = scores
print(scores_per_student)




for count in range(len(scores) // number_of_subjects):
    total+= scores[count]
totals.append(total)
total = 0
for count in range(len(scores) // number_of_subjects, len(scores)):
    total+= scores[count]
totals.append(total)
total = 0

#print(totals)
