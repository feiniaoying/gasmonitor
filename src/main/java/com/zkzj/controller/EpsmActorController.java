package com.zkzj.controller;

import com.zkzj.common.Assist;
import com.zkzj.common.ResponseUtil;
import com.zkzj.entity.EpsmActor;
import com.zkzj.entity.Result;
import com.zkzj.service.EpsmActorService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 参与者管理控制层
 * Created by chenwt on 2017/6/22.
 */
@Api(value = "EpsmActorController控制器")
@RestController
@RequestMapping("/api")
public class EpsmActorController extends BaseController {

    @Resource
    private EpsmActorService epsmActorService;

    /**
     * 查询所有参与者管理(居民、执法人员、设备维护人员)列表
     * @return
     */
    @ApiOperation(value="查询所有参与者管理列表", notes="查询所有参与者管理列表接口")
    @GetMapping(value = "/epsmActors")
    public Result epsmActorList() {
        logger.info("epsmActorList");
        Long total =  epsmActorService.getEpsmActorRowCount(new Assist());
        List<EpsmActor> epsmActorList = epsmActorService.selectEpsmActor(new Assist());
        return ResponseUtil.success(epsmActorList,total);
    }

    /**
     * 添加一个参与者管理
     * @return
     */
    @ApiOperation(value="创建参与者管理", notes="根据EpsmActor对象创建用户")
    @ApiImplicitParam(name = "epsmActor", value = "参与者管理实体epsmActor", required = true, dataType = "EpsmActor")
    @PostMapping(value = "/epsmActors")
    public Result<EpsmActor> addEpsmActor(@RequestBody EpsmActor epsmActor) {
        logger.info("addEpsmActor");
        epsmActorService.insertNonEmptyEpsmActor(epsmActor);
        return ResponseUtil.success();
    }

    /**
     * 查询一个参与者管理
     * @param id
     * @return
     */
    @ApiOperation(value="获取参与者管理详细信息", notes="根据url的id来获取参与者管理详细信息")
    //@ApiImplicitParam(name = "id", value = "参与者管理者Id", required = true, dataType = "String")
    @GetMapping(value = "/epsmActors/{id}")
    public Result selectEpsmActorById(@ApiParam(name = "id", required = true, value = "参与者管理者Id")@PathVariable("id") String id) {
        logger.info("selectEpsmActorById");
        EpsmActor epsmActor = epsmActorService.selectEpsmActorById(id);
        return ResponseUtil.success(epsmActor);
    }

    /**
     * 更新一个参与者管理
     * @param epsmActor
     * @return
     */
    @ApiOperation(value="更新参与者管理详细信息", notes="根据url的actorid来指定更新对象，并根据传过来的epsmActor信息来更新参与者管理详细信息")
    @ApiImplicitParams({
            //@ApiImplicitParam(name = "id", value = "参与者管理ID", required = true, dataType = "String"),
            @ApiImplicitParam(name = "epsmActor", value = "参与者管理实体epsmActor", required = true, dataType = "EpsmActor")
    })
    @PutMapping(value = "/epsmActors/{id}")
    public Result updateEpsmActorById(@ApiParam(name = "id", required = true, value = "参与者管理者Id") @PathVariable("id") String id,@RequestBody EpsmActor epsmActor) {
        logger.info("updateEpsmActorById");
        if (!id.equals(epsmActor.getActorid())){
            return ResponseUtil.error(0,"要更新的actorid与更新的epsmActor不匹配");
        }
        epsmActorService.updateEpsmActorById(epsmActor);
        return ResponseUtil.success();
    }


    @ApiOperation(value="删除参与者管理", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "参与者管理ID", required = true, dataType = "String")
    //删除@DeleteMapping(value = "/epsmActors/{id}")
    @DeleteMapping(value = "/epsmActors")
    public Result deleteEpsmActorById(@ApiParam(name = "id", required = true, value = "参与者管理者Id") @RequestParam("id") String id) {
        logger.info("deleteEpsmActorById");
        epsmActorService.deleteEpsmActorById(id);
        return ResponseUtil.success();
    }

}
