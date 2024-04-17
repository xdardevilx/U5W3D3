package valerio.U5W3D3.entityES2;

import valerio.U5W3D3.Component;

import java.util.ArrayList;
import java.util.List;

public class Section implements Component {
    private List<Component> components = new ArrayList<>();
    public void add(Component component){
        components.add(component);
    }

    @Override
    public int GetNumberOfPages() {
        int total = 0;
        for(Component component : components){
            total += component.GetNumberOfPages();
        }
        return total;
    }

    @Override
    public void print(){
        for(Component component : components){
            component.print();
        }

    }

}
