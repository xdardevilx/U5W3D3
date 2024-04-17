package valerio.U5W3D3.entityES2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import valerio.U5W3D3.Component;

@Getter
@Setter
@NoArgsConstructor
public class Page implements Component {
    private int pageNumber;

    public Page(int pageNumber){
        this.pageNumber = pageNumber;
    }

    @Override
    public int GetNumberOfPages() {
        return 1;
    }

    @Override
    public void print(){
        System.out.println("Page: " + pageNumber);
    }

}
