package com.zkzj.controller;

import com.zkzj.common.Assist;
import com.zkzj.common.ResponseUtil;
import com.zkzj.entity.EpsmEnosedata;
import com.zkzj.entity.Result;
import com.zkzj.service.EpsmEnosedataService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 电流数据控制层
 * Created by chenwt on 2017/6/22.
 */
@Api(value = "EpsmEnosedataController控制器")
@RestController
@RequestMapping("/api")
public class EpsmEnosedataController extends BaseController {

    @Resource
    private EpsmEnosedataService epsmEnosedataService;

    /**
     * 查询电流数据列表
     * @return
     */
    @ApiOperation(value="查询电流数据列表", notes="查询电流数据列表接口")
    @GetMapping(value = "/epsmEnosedatas")
    public Result epsmEnosedataList() {
        logger.info("epsmEnosedataList");
        Long total =  epsmEnosedataService.getEpsmEnosedataRowCount(new Assist());
        List<EpsmEnosedata> EpsmEnosedataList = epsmEnosedataService.selectEpsmEnosedata(new Assist());
        return ResponseUtil.success(EpsmEnosedataList,total);
    }

    /**
     * 添加一个电流数据
     * @return
     */
    @ApiOperation(value="创建电流数据", notes="根据EpsmEnosedata对象电流数据")
    @ApiImplicitParam(name = "epsmEnosedata", value = "电流数据实体EpsmEnosedata", required = true, dataType = "EpsmEnosedata")
    @PostMapping(value = "/epsmEnosedatas")
    public Result<EpsmEnosedata> addEpsmEnosedata(@RequestBody EpsmEnosedata EpsmEnosedata) {
        logger.info("addEpsmEnosedata");
        epsmEnosedataService.insertNonEmptyEpsmEnosedata(EpsmEnosedata);
        return ResponseUtil.success();
    }

    /**
     * 查询一个电流数据
     * @param id
     * @return
     */
    @ApiOperation(value="获取电流数据详细信息", notes="根据url的id来获取电流数据详细信息")
    @ApiImplicitParam(name = "id", value = "电流数据Id", required = true, dataType = "String",paramType = "query")
    @GetMapping(value = "/epsmEnosedatas/{id}")
    public Result selectEpsmEnosedataById(@ApiParam(name = "id", required = true, value = "电流数据Id")@PathVariable("id") String id) {
        logger.info("selectEpsmEnosedataById");
        EpsmEnosedata EpsmEnosedata = epsmEnosedataService.selectEpsmEnosedataById(id);
        return ResponseUtil.success(EpsmEnosedata);
    }

    /**
     * 更新一个电流数据
     * @param EpsmEnosedata
     * @return
     */
    @ApiOperation(value="更新电流数据详细信息", notes="根据url的dataid来指定更新对象，并根据传过来的EpsmEnosedata信息来更新电流数据详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "电流数据ID", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "epsmEnosedata", value = "电流数据实体EpsmEnosedata", required = true, dataType = "EpsmEnosedata")
    })
    @PutMapping(value = "/epsmEnosedatas/{id}")
    public Result updateEpsmEnosedataById(@ApiParam(name = "id", required = true, value = "电流数据Id") @PathVariable("id") String id,@RequestBody EpsmEnosedata EpsmEnosedata) {
        logger.info("updateEpsmEnosedataById");
        if (!id.equals(EpsmEnosedata.getDataid())){
            return ResponseUtil.error(0,"要更新的dataid与更新的EpsmEnosedata不匹配");
        }
        epsmEnosedataService.updateEpsmEnosedataById(EpsmEnosedata);
        return ResponseUtil.success();
    }


    @ApiOperation(value="删除电流数据", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "电流数据ID", required = true, dataType = "String",paramType="query")
    //删除@DeleteMapping(value = "/epsmEnosedatas/{id}")
    @DeleteMapping(value = "/epsmEnosedatas/{id}")
    public Result deleteEpsmEnosedataById(@ApiParam(name = "id", required = true, value = "电流数据Id") @PathVariable("id") String id) {
        logger.info("deleteEpsmEnosedataById");
        epsmEnosedataService.deleteEpsmEnosedataById(id);
        return ResponseUtil.success();
    }

}
