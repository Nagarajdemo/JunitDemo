import Multiplicationservice.MultiplicationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;

@RunWith(PowerMockRunner.class)
@PrepareForTest({MultiplicationService.class})
public class MultiplicationServiceTest {
    @Mock
    MultiplicationService multiplicationService;
    @Test
    public void testForMulService() throws Exception {
        MultiplicationService multiplicationService=PowerMockito.spy(new MultiplicationService());
        PowerMockito.doReturn(10).when(multiplicationService,"calculateMul",5,2);
        int result= Whitebox.invokeMethod(multiplicationService,"checkMultiplication",5,2);
        Assert.assertEquals(10,result);
    }
}
