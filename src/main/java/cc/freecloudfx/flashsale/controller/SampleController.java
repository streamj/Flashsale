package cc.freecloudfx.flashsale.controller;

import cc.freecloudfx.flashsale.result.CodeMsg;
import cc.freecloudfx.flashsale.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author StReaM on 3/25/2018
 */
@Controller
@RequestMapping("/sample")
public class SampleController {

    @RequestMapping("/leaf")
    @ResponseBody
    public String thymeleaf(Model model) {
        model.addAttribute("name", "sakura");
        return "Hello";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public Result<String> hello() {
        return Result.success("hello");
    }

    @RequestMapping("/error")
    @ResponseBody
    public Result<String>error() {
        return Result.error(CodeMsg.SERVER_ERROR);
    }
}
