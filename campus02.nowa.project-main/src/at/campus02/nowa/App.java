package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figureNr;
    private int size=0;
    private Figure figure;

    // Konstruktor
    // input wird verwendet um Daten vom Benutzer einzulesen (verwendet scanner)
    // output wird verwendet um Text auf der Konsole auszugeben (verwendet sysout)
    public App(Scanner input, PrintStream output){
        this.input = input;
        this.output = output;
    }

    //die Gameloop
    public void Run() {
        initialize();
        printState();

        while(!exit) {
            readUserInput();
            updateState();
            printState();
        }
    }

    private void initialize() {
//todo
        output.println("Willkommen in Project Kurs!!");
    }

    private void readUserInput() {
        //TODO: Alle Eingaben der Benutzer einlesen
        output.println("Welche Größe möchten Sie (1-3)");
        size = input.nextInt();
        if (size < 1 || size > 3) {
            output.println("Dies ist keine gültige Größe!");
        } else {
            //figure.size=size;
        }
        System.out.println("size" + size);
           //??size=size;
        inputFigure();

    }

    private void updateState() {

        switch (figureNr){
            case 1:
                figure = new FigureH();
                //figure.setSize(size);
                figure.size=size;
                break;
            case 2:
                figure = new FigureL();
                figure.size=size;
                break;
            case 3:
                figure = new FigureO();
                figure.size=size;
                break;
            case 4:
                figure = new FigureO2();
                figure.size=size;
                break;
            case 5:
                figure = new FigureI();
                figure.size=size;
                break;
            case 6:
                figure = new FigureMinus();
                figure.size=size;
                break;
            default: break;
        }
        figure.size=size;   //oder getSize();
    }

    private void printState() {
        //TODO: Ausgabe des aktuellen Zustands
        output.println("Ich drücke aktuell die Figure nummer: "+figureNr); //??

        if (figure != null){
            output.println(figure);
        }

    }

    private void inputFigure() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do {
            output.println("Welche Grafik möchten Sie anzeigen (1-6)");
            figureNr = input.nextInt();
            if (figureNr < 1 || figureNr > 6) {
                output.println("Dies ist keine gültige Grafik!");
            } else {
                break;
            }
            output.println("Welche Size möchten Sie (1-3)");
            size = input.nextInt();
            if (size < 1 || size > 3) {
                output.println("Dies ist keine gültige Size!");
            } else {
                break;
            }
        } while (true);
    }
}
