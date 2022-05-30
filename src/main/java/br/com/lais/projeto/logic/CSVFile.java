package br.com.lais.projeto.logic;

import br.com.lais.projeto.adapter.HospitalAdapter;
import br.com.lais.projeto.model.Hospital;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBaseBuilder;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVFile {

    public static String CSV_FILE_NAME = "/project-sheets.csv";
    public static String COMMA_DELIMITER = ";";

    private CSVReader getCsvReader(final InputStreamReader reader) {
        return new CSVReaderBuilder(reader)
                .withCSVParser(new CSVParserBuilder()
                        .withSeparator(';')
                        .build())
                .build();
    }

    public String read() {
        final List<List<String>> records = new ArrayList<>();
        final InputStream inputStream = getClass().getResourceAsStream(CSV_FILE_NAME);
        final InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        try (final CSVReader csvReader = getCsvReader(reader)) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }

        List<Hospital> hospitals = new ArrayList<>();
        records.forEach(line -> hospitals.add(HospitalAdapter.toHospital(line)));

        System.out.println(hospitals);

        return "";
    }
}
