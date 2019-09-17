package András_AlarmClock;

public class András_AlarmClock {

    public static void main(String[] args) {
        Main AlarmClock = new Main();
        //der kan nu laves metoder
        AlarmClock.dagDerVises = hverdagfraint(4);
        AlarmClock.startDagen = true;
        AlarmClock.dagnummer = 4;
        AlarmClock.alarmclocktid = 8;
        System.out.print("Dagen er " +AlarmClock.dagDerVises + " og klokken er " +AlarmClock.alarmclocktid);
        //ideen er at det skal hvise hvilken dag det er og hvad klokken er
    }

    public static String hverdagfraint(int dag) {
        Main AlarmClock = new Main();
        //var nød til at skrive det igen da det ikke ville virke uden Main AlarmClock.
        if(AlarmClock.alarmclocktid != 8);
        if(AlarmClock.alarmclocktid == 9);
        else
            System.out.println("Tid til at vågne op! ");
        //Den udskriver beskeden da klokken er 8 og den er ikke 9.

        switch (AlarmClock.dagnummer) {
            /*denne switch statement gør det muligt at skifte mellem de forskellige dage i ugen ved at skifte nummeret
            på AlarmClock.dagDerVises  = hverdagfraint (x)*/

            case 1:
                return ("Mandag ");
            case 2:
                return ("Tirsdag ");
            case 3:
                return ("Onsdag ");
            case 4:
                return ("Torsdag ");
            case 5:
                return ("Fridag ");
            case 6:
                return ("Lørdag ");
            case 7:
                return ("Søndag ");
            default:

                return "Torsdag";

        }
    }
}