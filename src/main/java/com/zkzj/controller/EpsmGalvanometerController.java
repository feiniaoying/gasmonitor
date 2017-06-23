package com.zkzj.controller;

import com.zkzj.common.Assist;
import com.zkzj.common.ResponseUtil;
import com.zkzj.entity.EpsmGalvanometer;
import com.zkzj.entity.Result;
import com.zkzj.service.EpsmGalvanometerService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电流表控制层
 * Created by chenwt on 2017/6/22.
 */
@Api(value = "EpsmGalvanometerController控制器")
@RestController
@RequestMapping("/api")
public class EpsmGalvanometerController extends BaseController {

    @Resource
    private EpsmGalvanometerService epsmGalvanometerService;

    /**
     * 查询电流表列表
     * @return
     */
    @ApiOperation(value="查询电流表列表", notes="查询电流表列表接口")
    @GetMapping(value = "/epsmGalvanometers")
    public Result epsmGalvanometerList() {
        logger.info("epsmGalvanometerList");
        //Long total =  epsmGalvanometerService.getEpsmGalvanometerRowCount(new Assist());
        List<EpsmGalvanometer> epsmGalvanometerList = epsmGalvanometerService.selectEpsmGalvanometer(new Assist());
        return ResponseUtil.success(epsmGalvanometerList,(long)epsmGalvanometerList.size());
    }

    /**
     * 添加一个电流表
     * @return
     */
    @ApiOperation(value="创建电流表", notes="根据EpsmGalvanometer对象电流表")
    @ApiImplicitParam(name = "epsmGalvanometer", value = "电流表实体EpsmGalvanometer", required = true, dataType = "EpsmGalvanometer")
    @PostMapping(value = "/epsmGalvanometers")
    public Result<EpsmGalvanometer> addEpsmGalvanometer(@RequestBody EpsmGalvanometer EpsmGalvanometer) {
        logger.info("addEpsmGalvanometer");
        epsmGalvanometerService.insertNonEmptyEpsmGalvanometer(EpsmGalvanometer);
        return ResponseUtil.success();
    }

    /**
     * 查询一个电流表
     * @param id
     * @return
     */
    @ApiOperation(value="获取电流表详细信息", notes="根据url的id来获取电流表详细信息")
    @ApiImplicitParam(name = "id", value = "电流表Id", required = true, dataType = "String",paramType = "query")
    @GetMapping(value = "/epsmGalvanometers/{id}")
    public Result selectEpsmGalvanometerById(@ApiParam(name = "id", required = true, value = "电流表Id")@PathVariable("id") String id) {
        logger.info("selectEpsmGalvanometerById");
        EpsmGalvanometer epsmGalvanometer = epsmGalvanometerService.selectEpsmGalvanometerById(id);
        return ResponseUtil.success(epsmGalvanometer);
    }



    /**
     * 查询电流表(分页使用)
     * @param start
     * @param end
     * @return
     */
    @ApiOperation(value="获取电流表(分页)", notes="根据url的start来获取从第start条开始，每次取end-start条")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "start", value = "第start条记录", required = true, dataType = "Integer ",paramType = "query"),
            @ApiImplicitParam(name = "end", value = "第end条记录", required = true, dataType = "Integer",paramType = "query")
    })
    @GetMapping(value = "/epsmGalvanometers/from/{start}/to/{end}")
    public Result selectEpsmGalvanometerPage(@ApiParam(name = "start", required = true, value = "第start条记录")@PathVariable("start") Integer start,@ApiParam(name = "end", required = true, value = "第end条记录")@PathVariable("end") Integer end) {
        logger.info("selectEpsmGalvanometerPage");
        Assist assist = new Assist();
        assist.setStartRow(start);
        assist.setRowSize(end-start);
        List<EpsmGalvanometer> epsmGalvanometerList = epsmGalvanometerService.selectEpsmGalvanometer(assist);
        return ResponseUtil.success(epsmGalvanometerList,(long)epsmGalvanometerList.size());
    }

    /**
     * 更新一个电流表
     * @param EpsmGalvanometer
     * @return
     */
    @ApiOperation(value="更新电流表详细信息", notes="根据url的galvanometerid来指定更新对象，并根据传过来的EpsmGalvanometer信息来更新电流表详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "电流表ID", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "epsmGalvanometer", value = "电流表实体EpsmGalvanometer", required = true, dataType = "EpsmGalvanometer")
    })
    @PutMapping(value = "/epsmGalvanometers/{id}")
    public Result updateEpsmGalvanometerById(@ApiParam(name = "id", required = true, value = "电流表Id") @PathVariable("id") String id,@RequestBody EpsmGalvanometer EpsmGalvanometer) {
        logger.info("updateEpsmGalvanometerById");
        if (!id.equals(EpsmGalvanometer.getGalvanometerid())){
            return ResponseUtil.error(0,"要更新的galvanometerid与更新的EpsmGalvanometer不匹配");
        }
        epsmGalvanometerService.updateEpsmGalvanometerById(EpsmGalvanometer);
        return ResponseUtil.success();
    }


    @ApiOperation(value="删除电流表", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "电流表ID", required = true, dataType = "String",paramType="query")
    //删除@DeleteMapping(value = "/EpsmGalvanometers/{id}")
    @DeleteMapping(value = "/epsmGalvanometers/{id}")
    public Result deleteEpsmGalvanometerById(@ApiParam(name = "id", required = true, value = "电流表Id") @PathVariable("id") String id) {
        logger.info("deleteEpsmGalvanometerById");
        epsmGalvanometerService.deleteEpsmGalvanometerById(id);
        return ResponseUtil.success();
    }

}
