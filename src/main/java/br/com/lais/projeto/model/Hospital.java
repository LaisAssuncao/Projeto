package br.com.lais.projeto.model;

import java.util.List;

public class Hospital {

    private String state; // Estado
    private String strict; // Bairro
    private String address; // Endereço
    private String zipCode; // CEP
    private String hospitalName; // Nome do Hospital
    private List<String> categories; // Categorias/Modalidade

    public Hospital() {}

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        this.state = state;
    }

    public String getStrict() {
        return strict;
    }

    public void setStrict(final String strict) {
        this.strict = strict;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(final String zipCode) {
        this.zipCode = zipCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(final String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(final List<String> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "state='" + state + '\'' +
                ", strict='" + strict + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", categories=" + categories +
                '}';
    }
}
