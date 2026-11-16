package com.pluralsight;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NameFormatterTest {

    @Test
    public void format_shouldFormatFirstAndLastName() {

        String result = NameFormatter.format("John", "Doe");

        assertEquals("Doe, John", result);
    }

    @Test
    public void format_shouldIncludePrefixMiddleNameAndSuffix() {

        String result = NameFormatter.format(
                "Dr.", "John", "Michael", "Doe", "Jr.");

        assertEquals("Doe, Dr. John Michael, Jr.", result);
    }

    @Test
    public void format_shouldHandleMissingOptionalNames() {

        String result = NameFormatter.format(
                "", "John", "", "Doe", "");

        assertEquals("Doe, John", result);
    }

    @Test
    public void format_shouldHandleFullName() {

        String result = NameFormatter.format("John Doe");

        assertEquals("Doe, John", result);
    }

}