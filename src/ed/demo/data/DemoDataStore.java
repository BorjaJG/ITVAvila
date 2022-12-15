package ed.demo.data;

import com.iesam.itvavila.demo.domain.models.Demo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DemoDataStore {
    private static DemoDataStore instance = null;

    private Map<String, Demo> dataStore = new TreeMap<>();

    public void guardar(Demo model) {
        dataStore.put(model.getCodigo(), model);
    }

    public void eliminar(String codigo) {
        dataStore.remove(codigo);
    }

    public Demo buscar(String codigo) {
        return dataStore.get(codigo);
    }

    public void modificar(Demo model) {
        dataStore.put(model.getCodigo(), model);
    }

    public static DemoDataStore getInstance() {
        if (instance == null) {
            instance = new DemoDataStore();
        }
        return instance;
    }
}
