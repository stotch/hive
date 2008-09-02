/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hive.ql.exec;

import org.apache.hadoop.hive.ql.metadata.HiveException;

/**
 * A dummy User-defined function (UDF) for the use with Hive.
 * 
 * New UDF classes do NOT need to inherit from this UDF class.
 * 
 * Required for all UDF classes:
 * 1. Implement a single method named "evaluate" which will be called by Hive.
 *    The following are some examples:
 *    public int evaluate(int a);
 *    public double evaluate(int a, double b);
 *    public String evaluate(String a, int b, String c);
 * 
 *    "evaluate" should neither be a void method, nor should it returns "null" in any case.
 *    In both cases, the Hive system will throw an HiveException saying the evaluation of UDF
 *    is failed.
 */
public class UDF {

  public UDF() { }
  
  /** Evaluate the UDF.
   *  @return plain old java object
   **/
  public int evaluate() {
    return 0;
  }
  
}
