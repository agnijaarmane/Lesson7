public class Lesson7 {

    public static void main(String[] args) {


        short time = 8;
        short day = 5;
        short month = 11;
        short year = 2021;

        if ( time >	16 && time< 24 )
            System.out.println("Something");

        System.out.println(day + "/" + month + "/" + year);


        boolean isVaccinated = true;
        boolean hasTested = true;
        boolean hadCovid = false;

        if( isVaccinated)
            System.out.println("You are vaccinated");

        if( isVaccinated && hasTested )
            System.out.println("You are vaccinated and TESTED");

        if( (isVaccinated && hasTested) || hadCovid )
        System.out.println("you are able to go to restaurant");




         // Alarm clock application
        String dayOfWeek;
         // initialization
        dayOfWeek = "Wednesday";

        if( dayOfWeek == "Tuesday" || dayOfWeek == "Monday" );
        System.out.println("Alarm is set to 7 o'clock");

        else if( dayOfWeek == "Wednesday")
        System.out.println("Alarm is set to 8 o'clock");
        else if( dayOfWeek == "Thursday" || dayOfWeek == "Friday")
            System.out.println("Alarm is set to 7.30 o'clock");
        else if( dayOfWeek == "Saturday" ||	dayOfWeek == "Sunday")
            System.out.println("Alarm is set off");

        System.out.println("No such day of Week exists");


    }
}
