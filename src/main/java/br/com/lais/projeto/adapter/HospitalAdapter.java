package br.com.lais.projeto.adapter;

import br.com.lais.projeto.model.Hospital;

import java.util.List;

public class HospitalAdapter {

    public static Hospital toHospital(final List<String> columns) {
        Hospital hospital = new Hospital();
        hospital.setState(columns.get(0));
        hospital.setStrict(columns.get(1));
        hospital.setAddress(columns.get(2));
        hospital.setZipCode(columns.get(3));
        hospital.setHospitalName(columns.get(4));
        hospital.setCategories(List.of(columns.get(5).split(",")));
        return hospital;
    }
}
