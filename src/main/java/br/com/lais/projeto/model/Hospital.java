package br.com.lais.projeto.model;

public class Hospital {

    private String state;
    private String strict;
    private String address;
    private String zipCode;
    private String hospitalName;
    private String category;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }
}
