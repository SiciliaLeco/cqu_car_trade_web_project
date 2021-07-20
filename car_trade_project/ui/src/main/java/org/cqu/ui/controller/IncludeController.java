package org.cqu.ui.controller;


import org.apache.dubbo.config.annotation.Reference;
import org.cqu.include.service.IncludeService;
import org.cqu.pojo.Include;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/IncludeAPI")
public class IncludeController {
    @Reference
    private IncludeService includeService;
    @RequestMapping(value = "/findDistinctCID")
    public List<Include> findDistinctCID() {
        return includeService.findDistinctCID();
    }

    @RequestMapping(value = "/findMCountByCID")
    public List<Include> findMCountByCID() {return includeService.findMCountByCID(3591);}
}
