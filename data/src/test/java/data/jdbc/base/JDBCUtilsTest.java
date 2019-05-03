package data.jdbc.base;

import com.rc.data.jdbc.base.JDBCUtils;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName TestJDBCUtils
 * @Description JDBC 工具类测试
 * @Author liux
 * @Date 19-5-2 下午6:06
 * @Version 1.0
 */
public class TestJDBCUtils {

    @Test
    public void testGetConnection() throws SQLException, IOException, ClassNotFoundException {
        Connection connection = JDBCUtils.getConnection();
        assert connection != null;
        Assert.assertNotNull(connection);
    }


}
