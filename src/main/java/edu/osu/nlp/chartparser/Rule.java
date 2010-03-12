/*
 *
 *    Copyright [2010] Chris Brew
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package edu.osu.nlp.chartparser;

import java.util.List;
import java.util.Arrays;

/**
 * Data structure representing phrase structure rules
 * 
 * @author Chris Brew
 * @version 0.5
 */

public class Rule  {
    public String lhs;
    public List<String> rhs;
  
    public Rule(String label,String rstr) {
	lhs = label;
	rhs = Arrays.asList(rstr.trim().split("[ \t]+")); // split by space
    }

    

}