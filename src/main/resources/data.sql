-- Insert dummy data into users table
INSERT INTO users (id, email, password, role) VALUES
(1, 'student1@example.com', 'password1', 'STUDENT'),
(2, 'teacher1@example.com', 'password2', 'TEACHER'),
(3, 'admin1@example.com', 'password3', 'ADMIN');

-- Insert dummy data into students table
INSERT INTO students (student_id, user_id, name, roll_number, department, semester) VALUES
(1, 1, 'Student One', 'S001', 'Computer Science', 1);

-- Insert dummy data into teachers table
INSERT INTO teachers (teacher_id, user_id, name, department) VALUES
(1, 2, 'Teacher One', 'Computer Science');

-- Insert dummy data into admin table
INSERT INTO admin (admin_id, user_id, name) VALUES
(1, 3, 'Admin One');

-- Insert dummy data into courses table
INSERT INTO courses (course_id, course_name, department, semester, teacher_id) VALUES
(1, 'Introduction to Programming', 'Computer Science', 1, 1);

-- Insert dummy data into course_enrollment table
INSERT INTO course_enrollment (student_id, course_id) VALUES
(1, 1);

-- Insert dummy data into attendance table
INSERT INTO attendance (attendance_id, student_id, course_id, attendance_date, status) VALUES
(1, 1, 1, '2025-03-19', 'PRESENT');

-- Insert dummy data into leave_requests table
INSERT INTO leave_requests (leave_id, user_id, leave_date, reason, status) VALUES
(1, 1, '2025-03-20', 'Medical leave', 'PENDING');

-- Insert dummy data into exam_results table
INSERT INTO exam_results (result_id, student_id, course_id, marks, grade) VALUES
(1, 1, 1, 85, 'A');