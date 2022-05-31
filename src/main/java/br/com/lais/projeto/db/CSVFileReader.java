package br.com.lais.projeto.db;

import br.com.lais.projeto.adapter.HospitalAdapter;
import br.com.lais.projeto.model.Hospital;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVFileReader {

    public static final Character COMMA_DELIMITER = ';';
    public static final String CSV_FILE_NAME = "/project-sheets.csv";

    private CSVReader getCsvReader(final InputStreamReader reader) {
        return new CSVReaderBuilder(reader)
                .withCSVParser(new CSVParserBuilder()
                        .withSeparator(COMMA_DELIMITER)
                        .build())
                .build();
    }

    public List<Hospital> read() {
        final var records = new ArrayList<List<String>>();
        final var inputStream = getClass().getResourceAsStream(CSV_FILE_NAME);
        final var reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        try (var csvReader = getCsvReader(reader)) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        final var hospitals = new ArrayList<Hospital>();
        records.forEach(line -> hospitals.add(HospitalAdapter.toHospital(line)));
        return hospitals;
    }
}
