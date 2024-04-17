package valerio.U5W3D3.entityES3;

import valerio.U5W3D3.Officer;

public class Tenente extends BaseOfficer {
    public Tenente(){
        salary = 1000;
    }

    @Override
    public void setSuperior(Officer officer){
        this.superior = officer;
    }
}
