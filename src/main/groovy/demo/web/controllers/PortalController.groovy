package demo.web.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

/**
 * portal controller
 *
 * @author linux_china
 */
@Controller
class PortalController {

  @RequestMapping("/")
  public String index() {
    return "index"
  }

}
