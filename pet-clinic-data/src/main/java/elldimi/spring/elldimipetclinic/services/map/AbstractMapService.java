package elldimi.spring.elldimipetclinic.services.map;

import elldimi.spring.elldimipetclinic.model.BaseEntity;
import elldimi.spring.elldimipetclinic.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> implements CrudService<T, ID> {

    //Acc to Guru this property should be qualified as protected.
    //Shouldn't it be a TreeMap or sth?
    private Map<Long, T> map = new HashMap<>();

    //Guru: no other constructor except the default one.
    protected AbstractMapService() {
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(this.map.values());
    }

    @Override
    public T findById(ID id) {
        return this.map.get(id);
    }

    @Override
    public T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null!");
        }
        return object;
    }

    @Override
    public void delete(T object) {
        this.map.values().removeIf(o -> o.equals(object));
    }

    @Override
    public void deleteById(ID id) {
        this.map.entrySet().removeIf(entry -> entry.getKey().equals(id));
    }

    private Long getNextId() {
        Long nextId = null;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException ex){
            nextId = 1L;
        }
        return nextId;
    }
}
