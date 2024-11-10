import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

//         Builder builder =  Student.getBuilder();
////         builder.setId(1);
////         builder.setName("Ponsiva");
////         builder.setPSP(97.45);
////
////
////         Student s =  builder.builder();

        Student s = Student.getBuilder().
                setName("Ponsiva").
                setPSP(42.0).
                build();

        System.out.println(s);

    }
}