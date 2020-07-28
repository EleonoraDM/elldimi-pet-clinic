package elldimi.spring.elldimipetclinic.services.map;

import elldimi.spring.elldimipetclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

    //Acc to Guru this property should be qualified as protected.
    //Shouldn't it be a TreeMap or sth?
    private Map<ID, T> map = new HashMap<>();

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
    public T save(ID id, T object) {
        return this.map.put(id, object);
    }

    @Override
    public void delete(T object) {
        this.map.values().removeIf(o -> o.equals(object));
    }

    @Override
    public void deleteById(ID id) {
        this.map.entrySet().removeIf(entry -> entry.getKey().equals(id));
    }
}
