package valerio.U5W3D3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import valerio.U5W3D3.entityES1.Adapter;
import valerio.U5W3D3.entityES1.Info;
import valerio.U5W3D3.entityES1.UserData;
import valerio.U5W3D3.entityES2.Book;
import valerio.U5W3D3.entityES2.Page;
import valerio.U5W3D3.entityES2.Section;
import valerio.U5W3D3.entityES3.Capitano;
import valerio.U5W3D3.entityES3.Maggiore;
import valerio.U5W3D3.entityES3.Tenente;

import java.time.LocalDate;
import java.util.Arrays;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args)throws Exception{
        Info info = new Info("Valerio", "Vignoli", LocalDate.of(1993, 8, 29));

        Adapter adapter = new Adapter(info);

        UserData userData = new UserData();
        userData.getData(adapter);

        System.out.println("Nome completo : " + userData.getNomeCompleto());
        System.out.println("Eta : " + userData.getEta());

//        --------------------------------esercizio 2


        Book book = new Book(Arrays.asList("autore1", "autore2", "autore3"),  19.58);

        Page page1 = new Page(1);
        Page page2 = new Page(2);
        Page page3 = new Page(3);
        Page page4 = new Page(4);
        Page page5 = new Page(5);
        Page page6 = new Page(6);


        Section section1 = new Section();
        section1.add(page1);
        section1.add(page2);

        Section section2 = new Section();
        section2.add(page3);
        section2.add(page4);

        Section section3 = new Section();
        section3.add(page5);
        section3.add(page6);

        book.addComponent(section1);
        book.addComponent(section2);
        book.addComponent(section3);

        page1.print();

        System.out.println("----------------");

        section1.print();

        System.out.println("----------------");

        book.print();

        System.out.println("numero totale di pagine : " + book.GetNumberOfPages());


//        ----------------------------------------------------------------esercizio 3----------------------------------------

        System.out.println("---------------------------------------------");
        Officer tenente = new Tenente();
        Officer capitano = new Capitano();
        Officer maggiore = new Maggiore();

        tenente.setSuperior(capitano);
        capitano.setSuperior(maggiore);

        int[] amounts = {500, 1500, 2500, 3500, 4500, 5500};

        for (int amount : amounts){
            System.out.println("Richiesta di stipendio di " + amount + "€");
            System.out.println("---------------------");
            tenente.handleRequest(amount);
        }
    }
}
