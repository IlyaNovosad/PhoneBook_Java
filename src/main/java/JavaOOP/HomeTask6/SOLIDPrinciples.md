## Student
    Класс Student расширяет класс User - LSP
    Конструктор и методы класса Student, отвечают только за операции,
    связанные со студентами - SRP
## StudentGroup
    Класс StudentGroup реализует интерфейс Iterable<Student> - ISP
    Конструктор и методы класса StudentGroup отвечают только за операции,
    связанные с группой студентов - SRP
## StudentGroupIterator
    StudentGroupIterator реализует интерфейс Iterator<Student>, выполняет только одну задачу
    обход списка студентов в группе - SRP
## StudentGroupService
    Класс StudentGroupService отвечает только за сортировку - SRP
    Метод getSortedStudentGroup сортирует список студентов - OCP
    Метод getSortedStudentGroupByFIO сортирует список студентов,
    но использует компаратор UserComparator - LSP
## StudentView
    Класс отвечает только за вывод списка студентов в консоль - SRP
## Teacher
    Класс Teacher расширяет класс User - LSP
    Конструктор и методы класса Teacher, отвечают только за операции,
    связанные с преподавателями - SRP
## TeacherService
    Класс TeacherService отвечает только за сортировку - SRP
    Метод getSortedTeacherList сортирует список студентов - OCP
    Метод getSortedTeacherListByFIO сортирует список студентов, но использует компаратор UserComparator - LSP
## TeacherView
    Класс отвечает только за вывод списка преподавателей в консоль - SRP
## User
    Конструктор и методы класса User, отвечают только за операции,
    связанные с пользователями - SRP
## UserComparator
    Класс отвечает только за сравнение пользователей - SRP
## UserView
    ISP