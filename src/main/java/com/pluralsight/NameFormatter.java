package com.pluralsight;

public class NameFormatter {

    private NameFormatter(){

    }

    public static String format(String firstName, String lastName) {

        return lastName + ", " + firstName;
    }

    public static String format(String prefix, String firstName,
                                String middleName, String lastName,
                                String suffix) {

        String formattedName = lastName + ", ";

        if (prefix != null && !prefix.isBlank()) {
            formattedName += prefix + " ";
        }

        formattedName += firstName;

        if (middleName != null && !middleName.isBlank()) {
            formattedName += " " + middleName;
        }

        if (suffix != null && !suffix.isBlank()) {
            formattedName += ", " + suffix;
        }

        return formattedName;
    }

    public static String format(String fullName) {

        String[] parts = fullName.trim().split("\\s+");

        String firstName = parts[0];
        String lastName = parts[parts.length - 1];

        return format(firstName, lastName);
    }
}
