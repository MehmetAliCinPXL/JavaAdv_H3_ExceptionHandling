package be.pxl.ja.streamingservice.model;

import be.pxl.ja.streamingservice.exception.InvalidDateException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProfileSetDateOfBirthException {
    @Test
    public void throwsInvalidDateExceptionWhenDateOfBirthInFuture() {
        Profile profile = new Profile("Profiel");
        assertThrows(InvalidDateException.class, () -> profile.setDateOfBirth(LocalDate.now().plusMonths(1)));
    }
}
