package valerio.U5W3D3.entityES3;

import valerio.U5W3D3.Officer;

public class Maggiore extends BaseOfficer{

    public Maggiore(){
        salary= 3000;
    }

    @Override
    public void setSuperior(Officer officer){
        this.superior = officer;
    }
}
