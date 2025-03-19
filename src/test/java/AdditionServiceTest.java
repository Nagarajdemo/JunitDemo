import additionservice.AdditionCalculation;
import additionservice.AdditionService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({AdditionService.class})
public class AdditionServiceTest {
    @Mock
    AdditionCalculation additionCalculation;
    AdditionService additionService=new AdditionService();

    @Test
    public void testForAddService() throws Exception {
        PowerMockito.whenNew(AdditionCalculation.class).withNoArguments().thenReturn(additionCalculation);
        PowerMockito.when(additionCalculation.additionCalculationLogic(4,5)).thenReturn(9);
        Assert.assertEquals(9,additionService.additionCall(4,5));

    }
}
