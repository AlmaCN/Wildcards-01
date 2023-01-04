package it.develhope.exerciseWildsCards;

import java.util.ArrayList;
import java.util.List;

public class Testing {

    public static void main(String[] args) {

        /*
        Ho crato la lista di due elementi individualMarksListLisa per i voti individuali di Lisa Stuart
        usando il metodo add delle liste
         */
        List<Double> individualMarksListLisa = new ArrayList<>(2);
        individualMarksListLisa.add(6.5);
        individualMarksListLisa.add(9.5);

        /*
        Ho crato la lista di due elementi projectMarksListJeremy per i voti individuali di Jeremy Green
        usando il metodo add delle liste
         */
        List<Integer> projectMarksListJeremy = new ArrayList<>(2);
        projectMarksListJeremy.add(8);
        projectMarksListJeremy.add(6);

        /*
        Ho calcolato l'average dei due usando il metodo getAverageMark e riassegnandoli a delle variabili di
        tipo double
         */
        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        /*
        Ho crato una lista di studenti a cui ho aggiuto i due studenti con i propri dati.
         */
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Lisa", "Stuart", lisaAvg));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAvg));

        /*
        Ho stampato in console i dettagli degli studenti prima con l'override del toString e poi con il metodo
        gel della List passando il numero di appartenenza.
         */
        System.out.println(listOfStudents);
        System.out.println(listOfStudents.get(0));
        System.out.println(listOfStudents.get(1));
    }
}
