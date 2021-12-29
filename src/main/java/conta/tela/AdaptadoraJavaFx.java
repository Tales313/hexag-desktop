package conta.tela;

import conta.hml.Build3;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AdaptadoraJavaFx extends Application {

    private ApplicationContext spring;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        System.out.println("Iniciando o Spring");
//        spring = new AnnotationConfigApplicationContext(Build2.class);
        spring = new AnnotationConfigApplicationContext(Build3.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        var form = spring.getBean(TransferenciaForm.class);
        form.mostrar(stage);
    }

}
