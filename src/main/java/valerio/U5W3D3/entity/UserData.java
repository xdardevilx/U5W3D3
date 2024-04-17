package valerio.U5W3D3.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import valerio.U5W3D3.DataSource;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
