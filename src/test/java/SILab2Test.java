import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class SILab2Test {
    @Test
    void everyBranchTest(){
        List<String> case1 = List.of();
        List<String> case2 = List.of("0", "#");

        IllegalArgumentException illegalArgumentException, illegalPerfect;

        IllegalGreater = assertThrows(illegalArgumentException.class, () => SILab2.function(case1));
        assertTrue(IllegalGreater.getMessage().contains("List length should be greater than 0"));

        IllegalPerfect = assertThrows(illegalArgumentException.class, () => SILab2.function(case2));
        assertTrue(IllegalGreater.getMessage().contains("List length should be a perfect square"));
    }


}
