package quest1;

public class Course { //classe Course, visibilidade (pulblico).
    private String name; // visibilidade (privado).
    private int codeCourse; // visibilidade (privado).

    public String getName() { // visibilidade (pulblico), encapsulamento.
        return name;
    }

    public void setName(String name) { // visibilidade (pulblico), encapsulamento.
        this.name = name;
    }
    
     public int getCodeCourse() { // visibilidade (pulblico), encapsulamento.
        return codeCourse;
    }

    public void setCodeCourse(int codeCourse) { // visibilidade (pulblico), encapsulamento.
        this.codeCourse = codeCourse;
    }

}
