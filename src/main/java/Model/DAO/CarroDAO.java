package Model.DAO;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Model.domain.Carro;

@Repository
public class CarroDAO {

    private static List<Carro> carros;

    public CarroDAO() {
        criarCarros();
    }

    private void criarCarros() {
        if (carros == null) {
            carros = new ArrayList<Carro>();

            carros.add(new Carro("Focus", "Ford", 2021));
            carros.add(new Carro("Linea", "Fiat", 2020));
            carros.add(new Carro("Jetta", "Volkswagen", 2019));
            carros.add(new Carro("Cruze", "Chevrolet", 2018));
        }
    }

    public List<Carro> getCarros() {
        return carros;
    }

}