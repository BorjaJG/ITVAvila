package ed.demo.domain.usecase;

import com.iesam.itvavila.demo.data.DemoDataStore;
import com.iesam.itvavila.demo.domain.models.Demo;

public class ModificarDemoUseCase {
    private DemoDataStore dataStore = DemoDataStore.getInstance();

    public void execute(Demo model) {
        dataStore.modificar(model);
    }
}
