package quest1;

public class User { // classe(User), visibilidade(publico).
    private String name; // visibilidade(privado)..
    private String last_name; // visibilidade(privado)..
    private String email; // visibilidade(privado).
    private String password; // visibilidade(privado).
    private Address user_address; // visibilidade(privado), composiçao (Address compõem User).
    private int registration; // visibilidade(privado).

    public String getName() { // visibilidade(publico), encapsulamento.
        return name;
    }

    public void setName(String name) { // visibilidade(publico), encapsulamento.
        this.name = name;
    }

    public String getLast_name() { // visibilidade(publico), encapsulamento.
        return last_name;
    }

    public void setLast_name(String last_name) { // visibilidade(publico), encapsulamento.
        this.last_name = last_name;
    }

    public String getEmail() { // visibilidade(publico), encapsulamento.
        return email;
    }

    public void setEmail(String email) { // visibilidade(publico), encapsulamento.
        this.email = email;
    }

    public String getPassword() { // visibilidade(publico), encapsulamento.
        return password;
    }

    public void setPassword(String password) { // visibilidade(publico), encapsulamento.
        this.password = password;
    }

    public Address getUser_address() { // visibilidade(publico), encapsulamento.
        return user_address;
    }

    public void setUser_address(Address user_address) { // visibilidade(publico), encapsulamento.
        this.user_address = user_address;
    }
    
    public int getRegistration() { // visibilidade(publico), encapsulamento.
        return registration;
    }

    public void setRegistration(int registration) { // visibilidade(publico), encapsulamento.
        this.registration = registration;
    }

}
