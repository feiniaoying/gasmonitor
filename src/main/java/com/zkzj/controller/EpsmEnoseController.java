package com.zkzj.controller;

import com.zkzj.common.Assist;
import com.zkzj.common.ResponseUtil;
import com.zkzj.entity.EpsmEnose;
import com.zkzj.entity.Result;
import com.zkzj.service.EpsmEnoseService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电子鼻信息控制层
 * Created by chenwt on 2017/6/22.
 */
@Api(value = "EpsmEnoseController控制器")
@RestController
@RequestMapping("/api")
public class EpsmEnoseController extends BaseController {

    @Resource
    private EpsmEnoseService epsmEnoseService;

    /**
     * 查询电子鼻信息列表
     * @return
     */
    @ApiOperation(value="查询电子鼻信息列表", notes="查询电子鼻信息列表接口")
    @GetMapping(value = "/epsmEnoses")
    public Result epsmEnoseList() {
        logger.info("epsmEnoseList");
        //Long total =  epsmEnoseService.getEpsmEnoseRowCount(new Assist());
        List<EpsmEnose> epsmEnoseList = epsmEnoseService.selectEpsmEnose(new Assist());
        return ResponseUtil.success(epsmEnoseList,(long)epsmEnoseList.size());
    }

    /**
     * 添加一个电子鼻信息
     * @return
     */
    @ApiOperation(value="创建电子鼻信息", notes="根据EpsmEnose对象电子鼻信息")
    @ApiImplicitParam(name = "epsmEnose", value = "电子鼻信息实体EpsmEnose", required = true, dataType = "EpsmEnose")
    @PostMapping(value = "/epsmEnoses")
    public Result<EpsmEnose> addEpsmEnose(@RequestBody EpsmEnose EpsmEnose) {
        logger.info("addEpsmEnose");
        epsmEnoseService.insertNonEmptyEpsmEnose(EpsmEnose);
        return ResponseUtil.success();
    }

    /**
     * 查询一个电子鼻信息
     * @param id
     * @return
     */
    @ApiOperation(value="获取电子鼻信息详细信息", notes="根据url的id来获取电子鼻信息详细信息")
    @ApiImplicitParam(name = "id", value = "电子鼻信息Id", required = true, dataType = "String",paramType = "query")
    @GetMapping(value = "/epsmEnoses/{id}")
    public Result selectEpsmEnoseById(@ApiParam(name = "id", required = true, value = "电子鼻信息Id")@PathVariable("id") String id) {
        logger.info("selectEpsmEnoseById");
        EpsmEnose epsmEnose = epsmEnoseService.selectEpsmEnoseById(id);
        return ResponseUtil.success(epsmEnose);
    }


    /**
     * 查询电子鼻信息(分页使用)
     * @param start
     * @param end
     * @return
     */
    @ApiOperation(value="获取电子鼻信息(分页)", notes="根据url的start来获取从第start条开始，每次取end-start条")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "start", value = "第start条记录", required = true, dataType = "Integer ",paramType = "query"),
            @ApiImplicitParam(name = "end", value = "第end条记录", required = true, dataType = "Integer",paramType = "query")
    })
    @GetMapping(value = "/epsmEnoses/from/{start}/to/{end}")
    public Result selectEpsmEnosePage(@ApiParam(name = "start", required = true, value = "第start条记录")@PathVariable("start") Integer start,@ApiParam(name = "end", required = true, value = "第end条记录")@PathVariable("end") Integer end) {
        logger.info("selectEpsmEnosePage");
        Assist assist = new Assist();
        assist.setStartRow(start);
        assist.setRowSize(end-start);
        List<EpsmEnose> epsmEnoseList = epsmEnoseService.selectEpsmEnose(assist);
        return ResponseUtil.success(epsmEnoseList);
    }

    /**
     * 更新一个电子鼻信息
     * @param EpsmEnose
     * @return
     */
    @ApiOperation(value="更新电子鼻信息详细信息", notes="根据url的enoseid来指定更新对象，并根据传过来的EpsmEnose信息来更新电子鼻信息详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "电子鼻信息ID", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "epsmEnose", value = "电子鼻信息实体EpsmEnose", required = true, dataType = "EpsmEnose")
    })
    @PutMapping(value = "/epsmEnoses/{id}")
    public Result updateEpsmEnoseById(@ApiParam(name = "id", required = true, value = "电子鼻信息Id") @PathVariable("id") String id,@RequestBody EpsmEnose EpsmEnose) {
        logger.info("updateEpsmEnoseById");
        if (!id.equals(EpsmEnose.getEnoseid())){
            return ResponseUtil.error(0,"要更新的enoseid与更新的EpsmEnose不匹配");
        }
        epsmEnoseService.updateEpsmEnoseById(EpsmEnose);
        return ResponseUtil.success();
    }


    @ApiOperation(value="删除电子鼻信息", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "电子鼻信息ID", required = true, dataType = "String",paramType="query")
    //删除@DeleteMapping(value = "/EpsmEnoses/{id}")
    @DeleteMapping(value = "/epsmEnoses/{id}")
    public Result deleteEpsmEnoseById(@ApiParam(name = "id", required = true, value = "电子鼻信息Id") @PathVariable("id") String id) {
        logger.info("deleteEpsmEnoseById");
        epsmEnoseService.deleteEpsmEnoseById(id);
        return ResponseUtil.success();
    }

}
