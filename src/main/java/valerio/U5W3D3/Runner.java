package valerio.U5W3D3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import valerio.U5W3D3.entity.Adapter;
import valerio.U5W3D3.entity.Info;
import valerio.U5W3D3.entity.UserData;

import java.time.LocalDate;

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
    }
}
