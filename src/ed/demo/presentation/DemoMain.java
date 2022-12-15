package ed.demo.presentation;

import com.iesam.itvavila.demo.domain.models.Demo;
import com.iesam.itvavila.demo.domain.usecase.BuscarDemoUseCase;
import com.iesam.itvavila.demo.domain.usecase.EliminarDemoUseCase;
import com.iesam.itvavila.demo.domain.usecase.GuardarDemoUseCase;

public class DemoMain {

    public static void main() {
        Demo demo = new Demo();
        demo.setCodigo("1");
        demo.setNombre("Nombre1");

        //-- 1. Guardo el modelo
        GuardarDemoUseCase guardarDemoUseCase = new GuardarDemoUseCase();
        guardarDemoUseCase.execute(demo);

        //-- 2. Recupero un  modelo
        BuscarDemoUseCase buscarDemoUseCase = new BuscarDemoUseCase();
        Demo demoBuscado = buscarDemoUseCase.execute("1"); //Pongo el código del Demo que quiero recuperar
        System.out.println("Demo buscado" + demoBuscado.getCodigo() + " | " + demoBuscado.getNombre());

        //-- 3. Modifico un modelo buscado (reutilizo la creación del caso de uso "Buscar" anterior)
        Demo demoAModificar = buscarDemoUseCase.execute("1");
        demoAModificar.setNombre("NombreModificado");
        //Guardo el modelo para salvar las modificaciones (reutilizo el caso de uso guardado)
        guardarDemoUseCase.execute(demoAModificar);

        //-- 4. Elimino un modelo
        EliminarDemoUseCase eliminarDemoUseCase = new EliminarDemoUseCase();
        eliminarDemoUseCase.execute("1"); //Elimino el modelo con código 1.
    }
}
