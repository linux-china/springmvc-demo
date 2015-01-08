package org.mvnsearch.springmvc;

import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

/**
 * unicorn base test
 *
 * @author linux_china
 */
@SpringApplicationContext({"/appContext-demo.xml", "/appContext-unit.xml"})
public abstract class ProjectBaseTest extends UnitilsJUnit4 {

}
