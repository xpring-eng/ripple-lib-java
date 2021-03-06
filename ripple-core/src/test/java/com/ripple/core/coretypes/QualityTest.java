package com.ripple.core.coretypes;

import com.ripple.core.coretypes.hash.Hash256;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class QualityTest {

    @Test
    public void testFromBookDirectory() throws Exception {
        Hash256 hash256 = Hash256.fromHex("4627DFFCFF8B5A265EDBD8AE8C14A52325DBFEDAF4F5C32E5C08A1FB2E56F800");
        assertEquals(0, BigDecimal.valueOf(24.299)
                                  .compareTo(Quality.fromBookDirectory(hash256, true, false)));
    }
}
