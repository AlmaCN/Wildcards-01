package it.develhope.exerciseWildsCards;

import java.util.ArrayList;
import java.util.List;

public class Student {

    /*
    Ho crato la classe Student con le tre variabili name, surname e marksAverage.
     */
    public String studentName;
    public String studentSurname;
    public double marksAverage;

    /*
    Ho crato il metodo costruttore con i tre parametri name, surname e average e assegnato i loro valori ai giusti
    attributi.
     */
    public Student(String name, String surname, double average){
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }

    /*
    Ho creato il metodo getAverageMark che contiene una upper bound wildcard estesa ai numeri.
    Ho fatto poi la media dei due numeri usanto il metodo get ed il metodo doubleValue gia presenti nella
    List ed ho fatto in modo che il risultato fosse un double.
     */
    public static double getAverageMark(List<? extends Number> listOfMarks){
        double average = ((listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue()) / 2);
        return average;
    }

    /*
    Ho fatto l'override del metodo toString ed ho aggiustato il return
     */
    @Override
    public String toString() {
        return "Student name is " + studentName + " " + studentSurname + ", and the marks average is " + marksAverage + "\n";
    }
}
