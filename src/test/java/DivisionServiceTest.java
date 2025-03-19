import divisionservice.DivisionCalculation;
import divisionservice.DivisionService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DivisionCalculation.class})
public class DivisionServiceTest {
    @Mock
    DivisionCalculation divisionCalculation;
    @Test
    public void calculateDiv(){
        DivisionService divisionService=new DivisionService();
        PowerMockito.mockStatic(DivisionCalculation.class);
        when(divisionCalculation.calculateDiv(10,5)).thenReturn(2);
        Assert.assertEquals(2,divisionService.divisionService(10,5));


    }
}
