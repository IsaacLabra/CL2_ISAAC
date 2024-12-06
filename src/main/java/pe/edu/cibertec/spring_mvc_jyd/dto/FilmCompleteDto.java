package pe.edu.cibertec.spring_mvc_jyd.dto;

public record FilmCompleteDto(String title,
                              String description,
                              Integer releaseYear,
                              Integer rentalDuration,
                              Double rentalRate,
                              Integer length,
                              Double replacementCost,
                              String rating,
                              String specialFeatures,
                              Integer languageId) {
}
