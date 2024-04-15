package set;

import java.util.HashSet;
import java.util.Set;

public class SetTutorial4 {
    public static void main(String[] args) {
        Set<Country> countries = new HashSet<>();

        Country country1 = new Country("Canada", "Ottawa");
        Country country2 = new Country("United Kingdom", "London");
        Country country3 = new Country("Netherlands", "Amsterdam");
        Country country4 = new Country("United Kingdom", "London");

        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);

        for (Country country: countries) {
            System.out.println(country);
        }

        // java doesn't recognize that country 2 and 4 are same
        System.out.println(country2.equals(country4)); // false

        // Because Set is supposed to prevent duplicates,
        // we need to override equals method in Country class

        System.out.println(country2.hashCode()); // 1554547125
        System.out.println(country4.hashCode()); // 1159190947
        // now country 2 and country 4 are same, but Set still can't prevent duplicates
        // to make Set recognize the same object with same values
        // override hashcode() method

    }


}
