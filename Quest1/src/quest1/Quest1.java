package quest1;

public class Quest1 {

    public static void main(String[] args) { //classe (main).
        Course course1 = new Course(); // alocaçao de memoria, objeto-course1, metodo construtor Course().
        course1.setCodeCourse(166545); // objeto .
        course1.setName("programaçao I"); //objeto.
        
        Student studant1 = new Student(); // alocaçao de memoria, metodo construtor Studant(), objeto (studant1).
        studant1.setCurse(course1); // associaçao.
        studant1.setCurrent_semester(3); //objeto.
        studant1.setYear_registration(2019); //objeto.
        studant1.setEmail("alef@gmail.com"); //objeto.
        studant1.setName("Alef"); //objeto.
        studant1.setLast_name("Araujo"); //objeto.
        studant1.setRegistration(165459); //objeto.
        studant1.setPassword("5415849"); //objeto.
        studant1.setUser_address(null); //objeto.
    }
    
}
