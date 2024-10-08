//Write a program for multilevel inheritance such that Country is inherited from Continent.
//State is inherited from Country. Display the place, State, Country and Continent

import java.util.Scanner;

class Continent {
    String continent;

    Continent(String continent) {
        this.continent = continent;
    }
}

class Country extends Continent {
    String country;

    Country(String continent, String country) {
        super(continent);  // Call Continent's constructor
        this.country = country;
    }
}

class State extends Country {
    String state;

    State(String continent, String country, String state) {
        super(continent, country);  // Call Country's constructor
        this.state = state;
    }

    void display() {
        System.out.println("State: " + state);
        System.out.println("Country: " + country);
        System.out.println("Continent: " + continent);
    }

    public static void main(String[] args) {
        String continent, country, state;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name of continent: ");
        continent = sc.next();
        System.out.print("Enter the name of country: ");
        country = sc.next();
        System.out.print("Enter the name of state: ");
        state = sc.next();

        State place = new State(continent, country, state);
        place.display();
    }
}
