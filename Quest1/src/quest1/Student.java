package quest1;

public class Student { //classe (Student), herança (Student herda de User, visibilidade (publico)).
    private int year_registration; // visibilidade (privado).
    private int current_semester;  //visibilidade (privado).
    private Course curse; // visibilidade (privado), assosiaçao (Course esta associado a Student).

    public int getYear_registration() { // encapsulamento, visibilidade (publico).
        return year_registration;
    }

    public void setYear_registration(int year_registration) { // visibilidade (publico) , encapsulamento.
        this.year_registration = year_registration;
    }

    public int getCurrent_semester() { // visibilidade (publico) , encapsulamento.
        return current_semester;
    }

    public void setCurrent_semester(int current_semester) { // visibilidade (publico) , encapsulamento.
        this.current_semester = current_semester;
    }

    public Course getCurse() { // visibilidade (publico) , encapsulamento.
        return curse;
    }

    public void setCurse(Course curse) { // visibilidade (publico) , encapsulamento.
        this.curse = curse;
    }

    void setEmail(String alefgmailcom) { //encapsulamento.
        
    }

    void setName(String alef) {//encapsulamento.
        
    }

    void setLast_name(String araujo) {//encapsulamento.
 
    }

    void setRegistration(int i) {//encapsulamento.

    }

    void setPassword(String string) {//encapsulamento.

    }

    void setUser_address(Object object) {//encapsulamento.

    }

}
