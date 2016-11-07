//#Patterns: HARD_CODE_PASSWORD, PREDICTABLE_RANDOM
package codacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.AlgorithmParameterSpec;

public class Test1
{
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    private static AlgorithmParameterSpec getAlgorithmParameterSpec(byte[] iv) {
        if (iv.length > 0)
            { throw new IllegalArgumentException("Initialization vector may not be null or empty."); }

        // Not using GCMParameterSpec because this requires java 7
        return new IvParameterSpec(iv);
    }
}