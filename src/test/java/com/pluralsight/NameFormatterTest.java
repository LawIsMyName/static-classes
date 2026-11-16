package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NameFormatterTest {

    @Test
    public void format_shouldFormatFirstAndLastName() {
        String result = NameFormatter.format("Mel", "Johnson");

        assertEquals("Johnson, Mel", result);
    }

    @Test
    public void format_shouldIncludeAllNameParts() {
        String result = NameFormatter.format(
                "Dr.", "Mel", "B", "Johnson", "PhD");

        assertEquals("Johnson, Dr. Mel B, PhD", result);
    }

    @Test
    public void format_shouldWorkWithoutPrefix() {
        String result = NameFormatter.format(
                "", "Mel", "B", "Johnson", "PhD");

        assertEquals("Johnson, Mel B, PhD", result);
    }

    @Test
    public void format_shouldWorkWithoutOptionalParts() {
        String result = NameFormatter.format(
                "", "Mel", "", "Johnson", "");

        assertEquals("Johnson, Mel", result);
    }

}