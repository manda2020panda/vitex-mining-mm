package org.vite.dex.mm.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.vite.dex.mm.http.ResultBean;
import org.vite.dex.mm.http.ResultCode;
import org.vite.dex.mm.reward.RewardEngine;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/v1")
@Slf4j
public class MiningController {
    /**
     *
     */
    private static final String DAILY_RUN_E = "/daily/run, e:{}";
    @Resource
    private final RewardEngine
    /**
     * @return 
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/daily/run", method = RequestMethod.GET)
    public ResultBean invokeDailyRun() {
        try {
            extracted();
            return new ResultBean <>(ResultCode.SUCCESS, "ok", null);
        } catch (final Exception e) {
            log.error(DAILY_RUN_E, e);
            return new ResultBean <>(ResultCode.ERROR, e.getMessage(), null);
        }
    }

    private void extracted() throws Exception {
        engine.runDaily();
    }

    /**
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/halfHour/run", method = RequestMethod.GET)
    public ResultBean invokeHalfHourRun() {
        try {
            engine.runHalfHour();
            return new ResultBean<>(ResultCode.SUCCESS, "ok", null);
        } catch (final Exception e) {
            log.error("/halfHour/run, e:{}", e);
            return new ResultBean<>(ResultCode.ERROR, e.getMessage(), null);
        }
    }
}
