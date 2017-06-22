package com.zkzj.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

/**
 * Created by chenwt on 2017/6/22.
 */
public class BaseController {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    public static String get32UUID() {
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
}
