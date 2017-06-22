package com.zkzj.controller;

import com.zkzj.common.Assist;
import com.zkzj.common.ResponseUtil;
import com.zkzj.entity.EpsmFeedback;
import com.zkzj.entity.Result;
import com.zkzj.service.EpsmFeedbackService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 居民反馈控制层
 * Created by chenwt on 2017/6/22.
 */
@Api(value = "EpsmFeedbackController控制器")
@RestController
@RequestMapping("/api")
public class EpsmFeedbackController extends BaseController {

    @Resource
    private EpsmFeedbackService epsmFeedbackService;

    /**
     * 查询居民反馈列表
     * @return
     */
    @ApiOperation(value="查询居民反馈列表", notes="查询居民反馈列表接口")
    @GetMapping(value = "/epsmFeedbacks")
    public Result epsmFeedbackList() {
        logger.info("epsmFeedbackList");
        Long total =  epsmFeedbackService.getEpsmFeedbackRowCount(new Assist());
        List<EpsmFeedback> epsmFeedbackList = epsmFeedbackService.selectEpsmFeedback(new Assist());
        return ResponseUtil.success(epsmFeedbackList,total);
    }

    /**
     * 添加一个居民反馈
     * @return
     */
    @ApiOperation(value="创建居民反馈", notes="根据EpsmFeedback对象居民反馈")
    @ApiImplicitParam(name = "epsmFeedback", value = "居民反馈实体EpsmFeedback", required = true, dataType = "EpsmFeedback")
    @PostMapping(value = "/epsmFeedbacks")
    public Result<EpsmFeedback> addEpsmFeedback(@RequestBody EpsmFeedback EpsmFeedback) {
        logger.info("addEpsmFeedback");
        epsmFeedbackService.insertNonEmptyEpsmFeedback(EpsmFeedback);
        return ResponseUtil.success();
    }

    /**
     * 查询一个居民反馈
     * @param id
     * @return
     */
    @ApiOperation(value="获取居民反馈详细信息", notes="根据url的id来获取居民反馈详细信息")
    @ApiImplicitParam(name = "id", value = "居民反馈Id", required = true, dataType = "String",paramType = "query")
    @GetMapping(value = "/epsmFeedbacks/{id}")
    public Result selectEpsmFeedbackById(@ApiParam(name = "id", required = true, value = "居民反馈Id")@PathVariable("id") String id) {
        logger.info("selectEpsmFeedbackById");
        EpsmFeedback EpsmFeedback = epsmFeedbackService.selectEpsmFeedbackById(id);
        return ResponseUtil.success(EpsmFeedback);
    }

    /**
     * 更新一个居民反馈
     * @param EpsmFeedback
     * @return
     */
    @ApiOperation(value="更新居民反馈详细信息", notes="根据url的feedbackid来指定更新对象，并根据传过来的EpsmFeedback信息来更新居民反馈详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "居民反馈ID", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "epsmFeedback", value = "居民反馈实体EpsmFeedback", required = true, dataType = "EpsmFeedback")
    })
    @PutMapping(value = "/epsmFeedbacks/{id}")
    public Result updateEpsmFeedbackById(@ApiParam(name = "id", required = true, value = "居民反馈Id") @PathVariable("id") String id,@RequestBody EpsmFeedback EpsmFeedback) {
        logger.info("updateEpsmFeedbackById");
        if (!id.equals(EpsmFeedback.getFeedbackid())){
            return ResponseUtil.error(0,"要更新的feedbackid与更新的EpsmFeedback不匹配");
        }
        epsmFeedbackService.updateEpsmFeedbackById(EpsmFeedback);
        return ResponseUtil.success();
    }


    @ApiOperation(value="删除居民反馈", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "居民反馈ID", required = true, dataType = "String",paramType="query")
    //删除@DeleteMapping(value = "/EpsmFeedbacks/{id}")
    @DeleteMapping(value = "/epsmFeedbacks/{id}")
    public Result deleteEpsmFeedbackById(@ApiParam(name = "id", required = true, value = "居民反馈Id") @PathVariable("id") String id) {
        logger.info("deleteEpsmFeedbackById");
        epsmFeedbackService.deleteEpsmFeedbackById(id);
        return ResponseUtil.success();
    }

}
