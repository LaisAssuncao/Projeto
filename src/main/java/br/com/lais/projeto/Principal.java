package br.com.lais.projeto;

import br.com.lais.projeto.logic.CSVFile;

public class Principal {

    public static void main(String[] args) {
        CSVFile csvFile = new CSVFile();
        csvFile.read();
    }
}
