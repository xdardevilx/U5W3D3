package valerio.U5W3D3.entity;

import valerio.U5W3D3.DataSource;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class Adapter implements DataSource {
    private Info info;


    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta(){

        LocalDate dataDiNascita = info.getDataDiNascita();
        LocalDate dataOggi = LocalDate.now();
        Period periodo = Period.between(dataDiNascita, dataOggi);
        return periodo.getYears();

    }
}
