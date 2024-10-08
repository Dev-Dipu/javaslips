//Define a class patient (patient_name, patient_age, patient_oxy_level,patient_HRCT_report).
//Create an object of patient. Handle appropriate exception while patient oxygen level less than
//95% and HRCT scan report greater than 10, then throw user defined Exception “Patient is Covid
//Positive(+) and Need to Hospitalized” otherwise display its information


class CovidposException extends Exception{
    CovidposException(String message){
        super(message);
    }
}

class Patient{
    String pname;
    int page, polevel, phrct;

    Patient(String pname, int page, int polevel, int phrct){
        this.pname = pname;
        this.page = page;
        this.polevel = polevel;
        this.phrct = phrct;
    }

    public void check() throws CovidposException {
        if (polevel < 95 && phrct > 10) {
            throw new CovidposException("Patient is Covid Positive(+) and Needs to be Hospitalized.");
        }
    }

    public void display() {
        System.out.println("Patient Name: " + pname);
        System.out.println("Patient Age: " + page);
        System.out.println("Patient Oxygen Level: " + polevel + "%");
        System.out.println("Patient HRCT Report: " + phrct);
    }
}

public class Slip3_b {
    public static void main(String[] args) {
        Patient Abhi = new Patient("Abhishek", 21, 96, 8);
        try{
            Abhi.display();
            Abhi.check();
        }catch (CovidposException e){
            System.out.println(e.getMessage());
        }
    }
}
