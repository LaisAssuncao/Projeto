package br.com.lais.projeto.db;

import br.com.lais.projeto.model.Hospital;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HospitalDatabase {

    private static final Map<String, Map<String, List<Hospital>>> database =
            new CSVFileReader()
                    .read()
                    .stream()
                    .collect(Collectors.groupingBy(Hospital::getState,
                            Collectors.groupingBy(Hospital::getStrict)));

    private Boolean hasCategory(final List<String> categories, final String categoryRequired) {
        return categories
                .stream()
                .anyMatch(categoryRequired::equalsIgnoreCase);
    }

    public List<Hospital> find(final String state, final String strict, final String category) {
        var hospitals = database.get(state).get(strict);
        return hospitals
                .stream()
                .filter(hospital -> hasCategory(hospital.getCategories(), category))
                .collect(Collectors.toList());
    }
}
