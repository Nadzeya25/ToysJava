package toystore;

import java.io.FileWriter;
import java.io.IOException;

public class MethodAddFileWinToy {
    public static void AddWinToyInFile(String text) {


        try (FileWriter fw = new FileWriter("WinLine.txt", true)) {

            fw.write(String.valueOf(text));
            fw.flush();
            System.out.println("Игрушка добавлена в список  WinLine для для последующей выдачи победителю");

        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}




