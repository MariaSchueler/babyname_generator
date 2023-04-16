package com.akamea.generator;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        //initialisierung des Scanner Objekts
        Scanner scanner = new Scanner(System.in);
        //TODO kleinbuchstaben und fehlerbehandlung
        List<String> alphabet = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y","Z");

        Map<String, String> femalenames = new TreeMap<>();
        femalenames.put("A", "Adolfine");
        femalenames.put("B", "Berndine");
        femalenames.put("C", "Chrisine");
        femalenames.put("D", "Danieline");
        femalenames.put("E", "Erikine");
        femalenames.put("F", "Florianine");
        femalenames.put("G", "Gerdine");
        femalenames.put("H", "Hugoine");
        femalenames.put("I", "Ingolfine");
        femalenames.put("J", "Jensine");
        femalenames.put("K", "Kurtine");
        femalenames.put("L", "Ludwigine");
        femalenames.put("M", "Marioine");
        femalenames.put("N", "Norbertine");
        femalenames.put("O", "Olafine");
        femalenames.put("P", "Peterine");
        femalenames.put("Q", "Quentine");
        femalenames.put("R", "Ronnyne");
        femalenames.put("S", "Sörenine");
        femalenames.put("T", "Tobine");
        femalenames.put("U", "Uwenine");
        femalenames.put("V", "Volkerine");
        femalenames.put("W", "Wernerine");
        femalenames.put("X", "Xenosine");
        femalenames.put("Y", "Yadidine");
        femalenames.put("Z", "Zacine");

        Map<String, String> malenames = new TreeMap<>();
        malenames.put("A", "Adolf");
        malenames.put("B", "Bernd");
        malenames.put("C", "Chris");
        malenames.put("D", "Daniel");
        malenames.put("E", "Erik");
        malenames.put("F", "Florian");
        malenames.put("G", "Gerd");
        malenames.put("H", "Hugo");
        malenames.put("I", "Ingolf");
        malenames.put("J", "Jens");
        malenames.put("K", "Kurt");
        malenames.put("L", "Ludwig");
        malenames.put("M", "Mario");
        malenames.put("N", "Norbert");
        malenames.put("O", "Olaf");
        malenames.put("P", "Peter");
        malenames.put("Q", "Quentin");
        malenames.put("R", "Ronny");
        malenames.put("S", "Sören");
        malenames.put("T", "Tobi");
        malenames.put("U", "Uwe");
        malenames.put("V", "Volker");
        malenames.put("W", "Werner");
        malenames.put("X", "Xenos");
        malenames.put("Y", "Yadid");
        malenames.put("Z", "Zac");

        System.out.println("\tBitte geben Sie den Namen der Mutter an: ");

        String nameMother = scanner.nextLine();
        
        System.out.println("\tBitte geben Sie den Namen des Vaters an: ");

        String nameFather = scanner.nextLine();

        System.out.println("\tMöchten Sie einen Mädchennamen(1) oder einen Jungennamen(2)?");

        int gender = scanner.nextInt();

        String firstLetterM = nameMother.substring(0,1);

        String firstLetterF = nameFather.substring(0,1);

        int indexMother = 0;
        int indexFather = 0;

        for(int index = 0; index < alphabet.size(); index++) {
            String letter = alphabet.get(index);

            if(letter.equals(firstLetterM)) {
                indexMother = index;
            }

            if(letter.equals(firstLetterF)) {
                indexFather = index;
            }
        } 

        long penis = Math.round((indexMother + indexFather) / 2);
        int index = (int) penis;
        String letter = alphabet.get(index);
        //System.out.println(letter);
        
        String boyname = malenames.get(letter);
        String girlname = femalenames.get(letter);
        
        if(gender == 1) {
            System.out.println(girlname);
        } else {
            System.out.println(boyname);
        }

        
    }
}