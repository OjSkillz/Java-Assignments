from unittest import TestCase
import academicGradingApplication

class TestAcademicGradingApplication(TestCase):
    def test_that_function_update_students_list_returns_correct_value(self):
        self.assertEqual(academicGradingApplication.update_students_list(4), ["Student 1", "Student 2", "Student 3", "Student 4"])
    
    def test_that_function_update_subjects_list_returns_correct_values(self):
        actual = academicGradingApplication.update_subjects(2, 2)
        expected = [["SUB 1", "SUB 2"], ["SUB 1", "SUB 2"]]
        self.assertEqual(actual, expected)
