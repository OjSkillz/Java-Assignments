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
averages = []
merged_grades = {}
positions = []

header = {"STUDENT" : ["TOT", "AVE", "POS"]}
def update_students_list(number_of_students):
    for count in range(number_of_students):
        students.append(f"Student {count + 1}")
    return students

def update_subjects(number_of_subjects):
    for count in range(number_of_subjects):
        subjects.append(f"SUB {count+1}")
    return subjects

def update_totals():
    for value in scores_per_student.values():
        totals.append(sum(value))
    return totals
   
def update_averages():
    for value in scores_per_student.values():
        averages.append(float(f"{sum(value)/len(value):.2f}"))
    return averages

def update_positions():
    position_values = []
    totals.sort(reverse=True)
    for total in totals:
        position_values.append(total)
    for key in range(len(position_values)):
        positions.append(count + 1)
    return positions
def update_scores_per_student():
    for value in scores_per_student.values():
        value.append(sum(value))
        value.append(float(f"{sum(value)/len(value):.2f}"))
    return scores_per_student
   
def update_merged_grades():
    for key,value in zip(students, totals):
        merged_grades[key] = value
    return (merged_grades.sort())  
    
    
def display_header():
    print("=" * 80)
    for subject in subjects[: : -1]:
        header["STUDENT"].insert(0, subject)
    for key,value in header.items():
        print(f"{key:<12}" + "\t".join(value), end=" ")
    print()
    print("=" * 80)

def display_results():
    for key,value in scores_per_student.items():
        print(f"{key:<20}" +"\t".join(map(str, value)))
      
            
 
    


number_of_students = int(input("How many students do you have? >> "))
update_students_list(number_of_students)

number_of_subjects = int(input("How many subjects do they offer? >> "))
update_subjects(number_of_subjects)

for index in range(1, number_of_students + 1):
    print()
    print(f"Entering Scores for Student {index}") 
    scores = []
    for count in range(1, number_of_subjects + 1):
        score = int(input(f"Enter score for {subjects[count - 1]} >> "))
        while score < 0 or score > 100:
            print("\nInvalid entry. Enter scores between 0 and 100")
            score = int(input(f"Enter score for {subjects[count - 1]} >> "))
        scores.append(score)
        print("Saved Successfully")
        print()
        scores_per_student[students[index-1]] = scores

update_totals()
update_averages()
print(totals)
update_scores_per_student()
print(scores_per_student)
display_header()
print(header)
display_results()
update_positions()
print(positions)
