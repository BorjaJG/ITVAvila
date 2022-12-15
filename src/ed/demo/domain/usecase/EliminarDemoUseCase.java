package ed.demo.domain.usecase;

import com.iesam.itvavila.demo.data.DemoDataStore;
import com.iesam.itvavila.demo.domain.models.Demo;

public class EliminarDemoUseCase {
    private DemoDataStore dataStore = DemoDataStore.getInstance();

    public void execute(String codigo) {
        dataStore.eliminar(codigo);
    }
}
