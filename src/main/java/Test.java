import com.google.common.math.IntMath;
import org.springframework.util.Assert;

public class Test {
    public static void main(String[] args) {
        System.out.println(IntMath.pow(2,5));
        //Assert.assertTrue(5==10); не можем сделать потому-что указана опция <scope>Test</scope>
        //а это значит, что эта библиотека доступна только в тестах

    }
}
