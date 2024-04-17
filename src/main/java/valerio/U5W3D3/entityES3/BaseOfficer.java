package valerio.U5W3D3.entityES3;

import lombok.Getter;
import lombok.Setter;
import valerio.U5W3D3.Officer;

@Getter
@Setter
public abstract class BaseOfficer implements Officer {
    Officer superior;
    protected int salary;


    public void SetSuperior(Officer superior){
        this.superior = superior;
    }
    public void  handleRequest(int amount){
        if(amount <= salary){
            System.out.println(getClass().getSimpleName() + "può gestire l'importo di " + amount);
        }else if(superior != null){
            superior.handleRequest(amount);
        }else{
            System.out.println("nessun ufficiale può gestire l'importo di " + amount);
        }
    }
}
