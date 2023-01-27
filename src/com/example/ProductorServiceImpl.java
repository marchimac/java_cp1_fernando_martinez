package com.example;

import java.util.ArrayList;
import java.util.List;

public class ProductorServiceImpl implements ProductorService {
    private List<Productor> database = new ArrayList<>();

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
        Long id = 0L;
        for (Productor productor : database)
            id = Math.max(id, productor.getId());

        return id + 1;
    }
}
