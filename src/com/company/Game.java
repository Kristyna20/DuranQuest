package com.company;

import com.company.days.DayManager;
import com.company.entities.Player;

/**
 * Třída Game spravuje herní postup
 * @author Kristýna Bártová
 * @since Java 16
 * @version 0.1a
 */
public class Game {
    /**
     * Název Hry
     */
    private final String name = "Kindergarten - SPSMB DLC";
    /**
     * Verze hry
     */
    private final double version = 0.2;
    /**
     * Jméno autora
     */
    private final String author = "Kristyna";
    private GameDif gameDif;
    private GameDialog gameDialog;
    private DayManager dayManager;
    private Player player;

    public Game() {
        gameDialog = new GameDialog();
        dayManager = new DayManager();
        player = new Player();
    }

    /**
     * Spustí hru
     * @throws Exception
     */
    public void start() throws Exception {
        gameDialog.intro(name, version, author);
        introMenu();
        dayManager.startDay();
    }

    /**
     * Uvede hráče do hry
     */
    private void introMenu() {
        gameDialog.say("Vítejte v kůži Tomáše Ďurána, který chodí na Střední průmyslovou školu do Mladé Boleslavi, kde se ztratila Kája společně s virtuální realitou.\nNaposledy byla viděna včera ve škole na poslední hodině programování. I přesto jste dostali ředitelské volno  a tak se vydáváte do školy.");
        gameDialog.say("Zvol si obtížnost:", "red");
        for (GameDif value : GameDif.values()) {
            gameDialog.say(value.toString(), "purple");
        }
        selectDif();
        storyIntro();
    }

    /**
     * Výběr možností
     */
    public void selectDif() {
        String userInput = gameDialog.userInput();
        boolean check = false;
        for (GameDif value : GameDif.values()) {
            if (userInput.trim().equalsIgnoreCase(value.toString())) {
                check = true;
                gameDif = value;
                break;
            }
        }
        if (!check) {
            selectDif();
        }
    }

    /**
     * Uvede hráče do příběhu
     */
    private void storyIntro() {
        gameDialog.say("Vybrána obtížnost " + gameDif, "red");
        gameDialog.say("------------------------------------------------", "white");
        gameDialog.say("                 Hra zacina                     ");
        gameDialog.say("------------------------------------------------", "white");
        gameDialog.say("Vítej Tomáši v našem poklidném městečku, kde tisíce lidí přežívají tvojí existenci.");
    }

    private void day() {

    }

}
