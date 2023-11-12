package org.example.task13;

public class ProgrammerBook {
    private String programmingLanguage;
    private int programmingLevel;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ProgrammerBook otherBook = (ProgrammerBook) obj;

        return programmingLanguage.equals(otherBook.programmingLanguage) &&
                programmingLevel == otherBook.programmingLevel;
    }

    @Override
    public int hashCode() {
        int result = programmingLanguage.hashCode();
        result = 33 * result + programmingLevel;
        return result;
    }

    @Override
    public String toString() {
        return "ProgrammerBook{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", programmingLevel=" + programmingLevel +
                '}';
    }

    public void setProgrammingLanguage(String ded) {
        programmingLanguage = ded;
    }

    public void setProgrammingLevel(Integer ded) {
        programmingLevel = ded;
    }

}


