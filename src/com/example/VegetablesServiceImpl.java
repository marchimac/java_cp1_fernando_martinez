package com.example;

import java.util.ArrayList;
import java.util.List;

public class VegetablesServiceImpl implements VegetablesService {
    private List<Vegetables> database = new ArrayList<>();

    public VegetablesServiceImpl() {

        Productor productor1 = new Productor("Pepe", "12341234A", "La cruz", "abc@def.com", "5556781239");
        Productor productor2 = new Productor("Paco", "81528513S", "los alejos", "hdu@def.com", "4446781239");
        Productor productor3 = new Productor("Jose", "98765456G", "Mayor", "poi@def.com", "3336781239");
        Productor productor4 = new Productor("Francisco", "82417286B", "Ruiz Aguilera", "aws@def.com", "2226781239");

        Vegetables vegetables1 = new Vegetables("Tomate", "Cherry", 100.0, 2.0, productor1, 10.0);
        Vegetables vegetables2 = new Vegetables("Tomate", "Kumato", 50.0, 4.0, productor2, 5.0);
        Vegetables vegetables3 = new Vegetables("Pimiento verde", "Padrón", 80.0, 2.0, productor3, 8.0);
        Vegetables vegetables4 = new Vegetables("Pimiento verde", "Italiano", 150.0, 2.0, productor4, 12.0);
    }

    @Override
    public List<Vegetables> findAllType() {
        return null;
    }

    @Override
    public List<Vegetables> findAllByPriceRange(Double min, Double max) {
        return null;
    }

    @Override
    public String findProductor(String name) {
        return null;
    }

    @Override
    public List<Vegetables> findAll() {
        return null;
    }

    @Override
    public Vegetables create(Vegetables vegetables) {
        return null;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }
}
