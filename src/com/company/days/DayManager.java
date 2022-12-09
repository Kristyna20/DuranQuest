package com.company.days;

import com.company.GameDialog;

/**
 * Třída DayManager se stará o správu dnů.
 * @author kristyna.bartova
 * @version 0.1a
 * @since Java 16
 *
 */
public class DayManager {

    private short dayCount = 1;
    private byte weekDay = 0;
    private GameDialog gameDialog = new GameDialog();

    /**
     * spustí nový den
     * @throws Exception
     */

    public void startDay() throws Exception {
        dayIntro();
    }

    /**
     * Uvede hráče do nového dne
     * @throws Exception
     */

    private void dayIntro() throws Exception {
        Day day;
        switch (weekDay) {
            case 0 -> day = Day.PONDELI;
            case 1 -> day = Day.UTERY;
            case 2 -> day = Day.STREDA;
            case 3 -> day = Day.CTVRTEK;
            case 4 -> day = Day.PATEK;
            default -> throw new Exception("Špatně zvolený den");
        }
        System.out.println("Den: " + dayCount);
        System.out.println("Den v týdnu: " + day.getName());
        gameDialog.say(day.getInfo(), "purple");

    }

    public void endDay() {

    }

}
