package valerio.U5W3D3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

}
