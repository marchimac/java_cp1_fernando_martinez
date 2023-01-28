package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductorServiceImpl implements ProductorService {
    private final List<Productor> database = new ArrayList<>();

    @Override
    public Productor create(Productor productor) {

        if (productor.getId() != null)
            return null;

        Long id = this.generateId();
        productor.setId(id);

        database.add(productor);

        return productor;
    }

    private Long generateId() {
        long id = 0L;
        for (Productor productor : database)
            id = Math.max(id, productor.getId());

        return id + 1;
    }

    @Override
    public List<Productor> findAll() {
        return new ArrayList<>(database);
    }

    @Override
    public Productor findById(Long id) {

        for (Productor productor : database) {
            if (Objects.equals(productor.getId(), id)) {
                return productor;
            }
        }

        return null;
    }

    @Override
    public Productor update(Productor productorToUpdate) {

        if (productorToUpdate.getId() == null)
            return null;

        for (Productor productor : database) {
            if (Objects.equals(productor.getId(), productorToUpdate.getId())) {

                productor.setDireccion(productorToUpdate.getDireccion());
                productor.setEmail(productorToUpdate.getEmail());
                productor.setTelefono(productorToUpdate.getTelefono());

                return productor;
            }
        }

        return null;
    }

    @Override
    public boolean removeById(Long id) {

        for (Productor productor : database) {
            if (Objects.equals(productor.getId(), id)) {
                database.remove(productor);
                return true;
            }
        }

        return false;
    }
}
