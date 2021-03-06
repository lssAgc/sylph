/*
 * Copyright (C) 2018 The Sylph Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ideal.sylph.runner.flink.sqlTest;

import org.junit.Assert;
import org.junit.Test;

import static ideal.sylph.runner.flink.actuator.FlinkStreamSqlActuator.SqlFlow.SQL_REGEX;

public class SqlSplit
{
    @Test
    public void splitTest1()
    {
        String code = "a1;a2;'12;34';\"a4;a8\";10";
        String[] split = code.split(SQL_REGEX);
        Assert.assertArrayEquals(split, new String[] {"a1", "a2", "'12;34'", "\"a4;a8\"", "10"});
    }
}
