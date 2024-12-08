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
merged_grades = []
positions = {}
positions_keys = []
header = {"STUDENT" : ["TOT", "AVE", "POS"]}
header_list = []
def update_students_list(number_of_students):
    for count in range(number_of_students):
        students.append(f"Student{count + 1}")
    return students

def update_subjects(number_of_subjects):
    for count in range(number_of_subjects):
        subjects.append(f"SUB {count+1}")
    return subjects
    
def update_scores_per_student():
    for value in scores_per_student.values():
        value.append(sum(value))
        value.append(float(f"{sum(value)/len(value):.2f}"))
    return scores_per_student
    
def update_totals():
    for value in scores_per_student.values():
        totals.append(sum(value))
    return totals
   
def update_averages():
    for value in scores_per_student.values():
        averages.append(float(f"{sum(value)/len(value):.2f}"))
    return averages

def update_positions():
    position = 0
    positions = dict(zip(students, totals))
    positions = {key: value for key,value in sorted(positions.items(), key = lambda item: item[1], reverse  = True)}
    for value in positions.values():
        for values in scores_per_student.values():
            if  value in values: 
                position = position + 1
                values.append(position)
    return scores_per_student


   
def update_merged_grades():
    for key,value in scores_per_student.items():
        merged_grades.append(key)
        merged_grades.extend(value)
    return merged_grades  
    
    
def display_header():
    print("=" * 100)
    for subject in subjects[: : -1]:
        header["STUDENT"].insert(0, subject)
    for key,value in header.items():
        header_list.append(key)
        header_list.extend(value)
    for index in range(len(header_list)):
        print(f"{header_list[index]:<9}",end=" ")
    print()
    print("=" * 100)

def display_results():
    for key, values in scores_per_student.items():
        print(f"{key:<9}", end=" ")
        for value in values:
            print(f"{value:<9}", end=" ")
        print()
    print("=" * 100)
    print()
    print("=" * 100)

"""def get_highest_in_subject_one():
    subject_one_scores = []
    for values in scores_per_student.values():
        subject_one_scores.append(values[0])
    subject_one_rankings = dict(zip(students, subject_one_scores))
    subject_one_keys = list(subject_one_rankings.keys())
    subject_one_keys.sort(reverse=True)
    subject_one_rankings = {key: subject_one_rankings[key] for key in subject_one_keys}
    return f"Subject 1\nHighest scoring student is:  {subject_one_rankings{key[0]}} scoring {subject_one_rankings{value[0]}}"
"""                   
 
    


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
        while score < 0 or score > 100 :
            print("\nInvalid entry. Enter scores between 0 and 100")
            score = int(input(f"Enter score for {subjects[count - 1]} >> "))
        scores.append(score)
        print("Saved Successfully")
        print()
        scores_per_student[students[index-1]] = scores

update_totals()
update_averages()
update_scores_per_student()
display_header()
update_merged_grades()
display_results()


