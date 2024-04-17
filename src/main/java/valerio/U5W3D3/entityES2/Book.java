package valerio.U5W3D3.entityES2;

import valerio.U5W3D3.Component;

import java.util.ArrayList;
import java.util.List;

public class Book implements Component {
    private List<Component> components = new ArrayList<>();
    private List<String> authors;

    private double price;

    public Book(List<String> authors, double price){
        this.authors = authors;
        this.price = price;
    }

    public void addComponent(Component component){
        components.add(component);
    }

    @Override
    public int GetNumberOfPages() {
        int totalPages = 0;
        for(Component component : components){
            totalPages += component.GetNumberOfPages();
        }
        return totalPages;
    }

    @Override
    public void print(){
        for(Component component : components){
            component.print();
        }
    }
}
