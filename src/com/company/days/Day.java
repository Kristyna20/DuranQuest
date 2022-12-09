package com.company.days;

/**
 * enum Day uchovává dny v týdnu.
 * Každý den má název a popisek.
 * @author Kristýna Bártová
 * @version 0.1a
 * @since Java 16
 */
public enum Day {
    PONDELI("Pondělí", "Máma: 'Tomáááááááááášííííííííííííííííííí!!!!!!!! OOOOOOOOOVLLLLLLLLLLAAAAAAAAAAAAADAAAAAAAAAAAAAAAAAAAAČČČČČČČČČČČČČČČČČČČČ A KAFEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE!!!!!!!!!!!!'"),
    UTERY("Úterý", "Máma: 'Vstávej Tomáši, musíš mi udělat kafe, nebo ti zabavím počítač.'"),
    STREDA("Středa", "Nevlastní táta: 'TOMANEEEEEEEEEEEEEEEEEE, MAZEJ POSEKAT ZAHRADU'"),
    CTVRTEK("Čtvrtek", "Máma: 'Proč smažíš?!?!?!?!?!??!?!?! TÁÁÁHNIII DO ŠKOLYYYYYY!!!!!!!!!!!!!!!!'"),
    PATEK("Pátek", "Nevlastní táta: 'Máš už zabaleno na chalupu?!?!?!?! a noutbúk necháš doma!!!!'");

    private String name;
    private String info;

    Day(String name, String info) {
        this.name = name;
        this.info = info;
    }

    /**
     *
     * @return vrací název dne.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return vrací informace dne.
     */
    public String getInfo() {
        return info;
    }
}
