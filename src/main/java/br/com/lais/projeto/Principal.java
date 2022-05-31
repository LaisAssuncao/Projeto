package br.com.lais.projeto;

import br.com.lais.projeto.db.HospitalDatabase;

public class Principal {

    public static void main(String[] args) {
        HospitalDatabase hospitalDatabase = new HospitalDatabase();
        var hospitals = hospitalDatabase.find("SAO PAULO", "SAO MIGUEL", "FISICA");
        System.out.println(hospitals.size());
        System.out.println(hospitals);
    }
}
