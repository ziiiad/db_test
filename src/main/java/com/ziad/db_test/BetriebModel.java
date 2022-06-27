package com.ziad.db_test;

import java.util.List;

public class BetriebModel {

    private String PLC;
    private String RL100Code;
    private String RL100Langname;
    private String RL100Kurzname;
    private String TypKurz;
    private String TypLang;
    private String Betriebszustand;
    private String DatumAb;
    private String DatumBis;
    private String Niederlassung;
    private String Regionalbereich;
    private String LetzteAenderung;

    public BetriebModel(String PLC, String RL100Code, String RL100Langname, String RL100Kurzname, String typKurz, String typLang, String betriebszustand, String datumAb, String datumBis, String niederlassung, String regionalbereich, String letzteAenderung) {
        this.PLC = PLC;
        this.RL100Code = RL100Code;
        this.RL100Langname = RL100Langname;
        this.RL100Kurzname = RL100Kurzname;
        TypKurz = typKurz;
        TypLang = typLang;
        Betriebszustand = betriebszustand;
        DatumAb = datumAb;
        DatumBis = datumBis;
        Niederlassung = niederlassung;
        Regionalbereich = regionalbereich;
        LetzteAenderung = letzteAenderung;
    }

    public BetriebModel(List<String> list) {
        this.PLC = list.get(0);
        this.RL100Code = list.get(1);
        this.RL100Langname = list.get(2);
        this.RL100Kurzname = list.get(3);
        TypKurz = list.get(4);
        TypLang = list.get(5);
        Betriebszustand = list.get(6);
        DatumAb = list.get(7);
        DatumBis = list.get(8);
        Niederlassung = list.get(9);
        Regionalbereich = list.get(10);
        LetzteAenderung = list.get(11);
    }

    public String getPLC() {
        return PLC;
    }

    public void setPLC(String PLC) {
        this.PLC = PLC;
    }

    public String getRL100Code() {
        return RL100Code;
    }

    public void setRL100Code(String RL100Code) {
        this.RL100Code = RL100Code;
    }

    public String getRL100Langname() {
        return RL100Langname;
    }

    public void setRL100Langname(String RL100Langname) {
        this.RL100Langname = RL100Langname;
    }

    public String getRL100Kurzname() {
        return RL100Kurzname;
    }

    public void setRL100Kurzname(String RL100Kurzname) {
        this.RL100Kurzname = RL100Kurzname;
    }

    public String getTypKurz() {
        return TypKurz;
    }

    public void setTypKurz(String typKurz) {
        TypKurz = typKurz;
    }

    public String getTypLang() {
        return TypLang;
    }

    public void setTypLang(String typLang) {
        TypLang = typLang;
    }

    public String getBetriebszustand() {
        return Betriebszustand;
    }

    public void setBetriebszustand(String betriebszustand) {
        Betriebszustand = betriebszustand;
    }

    public String getDatumAb() {
        return DatumAb;
    }

    public void setDatumAb(String datumAb) {
        DatumAb = datumAb;
    }

    public String getDatumBis() {
        return DatumBis;
    }

    public void setDatumBis(String datumBis) {
        DatumBis = datumBis;
    }

    public String getNiederlassung() {
        return Niederlassung;
    }

    public void setNiederlassung(String niederlassung) {
        Niederlassung = niederlassung;
    }

    public String getRegionalbereich() {
        return Regionalbereich;
    }

    public void setRegionalbereich(String regionalbereich) {
        Regionalbereich = regionalbereich;
    }

    public String getLetzteAenderung() {
        return LetzteAenderung;
    }

    public void setLetzteAenderung(String letzteAenderung) {
        LetzteAenderung = letzteAenderung;
    }
}
