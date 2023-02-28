package Fundamentals.Exams.FinalExamRetake2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P3ThePianist {
    static class Pieces {
        String piece;
        String composer;
        String key;

        public void setPiece(String piece) {
            this.piece = piece;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getPiece() {
            return this.piece;
        }

        public String getComposer() {
            return this.composer;
        }

        public String getKey() {
            return this.key;
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numPieces = Integer.parseInt(scan.nextLine());

        List<Pieces> listPieces = new ArrayList<>();

        for (int i = 1; i <= numPieces; i++) {
            String[] pieceInfo = scan.nextLine().split("\\|");

            Pieces currentPiece = new Pieces();

            currentPiece.setPiece(pieceInfo[0]);
            currentPiece.setComposer(pieceInfo[1]);
            currentPiece.setKey(pieceInfo[2]);

            listPieces.add(currentPiece);

        }
        String commands = scan.nextLine();

        while (!commands.equals("Stop")) {

            String[] commandParts = commands.split("\\|");
            String command = commandParts[0];

            switch (command) {
                case "Add":

                    boolean isInTheList = false;

                    for (Pieces existingPiece : listPieces) {

                        if (existingPiece.getPiece().equals(commandParts[1])) {
                            System.out.printf("%s is already in the collection!%n", existingPiece.getPiece());
                            isInTheList = true;
                            break;
                        }
                    }

                    if (!isInTheList) {
                        Pieces newPiece = new Pieces();

                        newPiece.setPiece(commandParts[1]);
                        newPiece.setComposer(commandParts[2]);
                        newPiece.setKey(commandParts[3]);

                        listPieces.add(newPiece);


                        AddCommand(commandParts[1], commandParts[2], commandParts[3]);

                    }
                    break;
                case "Remove":
                    isInTheList = false;

                    Pieces pieceToBeRemoved = new Pieces();


                    for (Pieces existingPiece : listPieces) {


                        if (existingPiece.getPiece().equals(commandParts[1])) {
                            pieceToBeRemoved = existingPiece;
                            isInTheList = true;
                            break;
                        }
                    }

                    if (isInTheList) {
                        listPieces.remove(pieceToBeRemoved);
                        System.out.printf("Successfully removed %s!%n", pieceToBeRemoved.getPiece());
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", commandParts[1]);
                    }

                    break;
                case "ChangeKey":
                    isInTheList = false;


                    for (Pieces existingPiece : listPieces) {

                        if (existingPiece.getPiece().equals(commandParts[1])) {
                            existingPiece.setKey(commandParts[2]);
                            isInTheList = true;
                            System.out.printf("Changed the key of %s to %s!%n", existingPiece.getPiece(), commandParts[2]);
                        }

                    }

                    if (!isInTheList) {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", commandParts[1]);
                    }

                    break;
            }

            commands = scan.nextLine();
        }
        for (Pieces finalPieces : listPieces) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", finalPieces.getPiece(), finalPieces.getComposer(), finalPieces.getKey());
        }

    }
//Methods

    public static void AddCommand(String piece, String composer, String key) {

        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);

    }
}
