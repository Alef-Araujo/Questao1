package quest1;

public class Address { //classe Address, visibilidade (publico).
    private String cep; // visibilidade (privado).
    private String uf; // visibilidade (privado).
    private String public_place; // visibilidade (privado).
    private String city; // visibilidade (privado).
    private int idAddress; // visibilidade (privado).

    public String getCep() { // visibilidade (publico), encapsulamento.
        return cep;
    }

    public void setCep(String cep) { // visibilidade (publico), encapsulamento.
        this.cep = cep;
    }

    public String getUf() { // visibilidade (publico), encapsulamento.
        return uf;
    }

    public void setUf(String uf) { // visibilidade (publico), encapsulamento.
        this.uf = uf;
    }
    
    public String getPublic_place() { // visibilidade (publico), encapsulamento.
        return public_place;
    }

    public void setPublic_place(String public_place) { // visibilidade (publico), encapsulamento.
        this.public_place = public_place;
    }


    public String getCity() { // visibilidade (publico), encapsulamento.
        return city;
    }
    
    public void setCity(String city) { // visibilidade (publico), encapsulamento.
        this.city = city;
    }
    
    public int getIdAddress() { // visibilidade (publico), encapsulamento.
        return idAddress;
    }

    public void setIdAddress(int idAddress) { // visibilidade (publico), encapsulamento.
        this.idAddress = idAddress;
    }
}
