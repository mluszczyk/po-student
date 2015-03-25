JFLAGS = -Xlint -Werror

CLASSES = Student.class Main.class

all: $(CLASSES)

Main.class: main.java
	javac $(JFLAGS) main.java

Student.class: student.java
	javac $(JFLAGS)  student.java

cleanclasses:
	rm -f $(CLASSES)

run: all
	java -ea Main


