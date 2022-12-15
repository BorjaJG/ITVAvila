package ed.demo.domain.usecase;

import com.iesam.itvavila.demo.data.DemoDataStore;
import com.iesam.itvavila.demo.domain.models.Demo;

public class BuscarDemoUseCase {
    private DemoDataStore dataStore = DemoDataStore.getInstance();

    public Demo execute(String codigo) {
        return dataStore.buscar(codigo);
    }
}
