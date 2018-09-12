package org.camunda.bpm.getstarted.loanapproval.controller;

import io.swagger.annotations.Api;
import org.camunda.bpm.engine.ProcessEngineConfiguration;
import org.camunda.bpm.engine.impl.cfg.ProcessEngineConfigurationImpl;
import org.camunda.bpm.getstarted.loanapproval.mybatis.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Api
@RestController("ContractPlaceControllerV1")
@RequestMapping("/test")
public class test {
    @Autowired
    ProcessEngineConfiguration processEngineConfiguration;
    @Autowired
    AccountMapper accountMapper;

    //查主流程
    @RequestMapping(value = "/queryMianProcess",method = RequestMethod.GET)
    public String test(@RequestParam(value = "contractNo", required = false) String contractNo){
       return accountMapper.getMain(contractNo);
        //((ProcessEngineConfigurationImpl)processEngineConfiguration).getDeploymentCache().getProcessDefinitionCache().remove();
    }
}
