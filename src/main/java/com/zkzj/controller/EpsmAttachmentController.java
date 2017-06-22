package com.zkzj.controller;

import com.zkzj.common.Assist;
import com.zkzj.common.ResponseUtil;
import com.zkzj.entity.EpsmAttachment;
import com.zkzj.entity.Result;
import com.zkzj.service.EpsmAttachmentService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 附件控制层
 * Created by chenwt on 2017/6/22.
 */
@Api(value = "EpsmAttachmentController控制器")
@RestController
@RequestMapping("/api")
public class EpsmAttachmentController extends BaseController {

    @Resource
    private EpsmAttachmentService epsmAttachmentService;

    /**
     * 查询附件列表
     * @return
     */
    @ApiOperation(value="查询附件列表", notes="查询附件列表接口")
    @GetMapping(value = "/epsmAttachments")
    public Result epsmAttachmentList() {
        logger.info("epsmAttachmentList");
        Long total =  epsmAttachmentService.getEpsmAttachmentRowCount(new Assist());
        List<EpsmAttachment> epsmAttachmentList = epsmAttachmentService.selectEpsmAttachment(new Assist());
        return ResponseUtil.success(epsmAttachmentList,total);
    }

    /**
     * 添加一个附件
     * @return
     */
    @ApiOperation(value="创建附件", notes="根据epsmAttachment对象附件")
    @ApiImplicitParam(name = "epsmAttachment", value = "附件实体epsmAttachment", required = true, dataType = "epsmAttachment")
    @PostMapping(value = "/epsmAttachments")
    public Result<EpsmAttachment> addEpsmAttachment(@RequestBody EpsmAttachment epsmAttachment) {
        logger.info("addEpsmAttachment");
        epsmAttachmentService.insertNonEmptyEpsmAttachment(epsmAttachment);
        return ResponseUtil.success();
    }

    /**
     * 查询一个附件
     * @param id
     * @return
     */
    @ApiOperation(value="获取附件详细信息", notes="根据url的id来获取附件详细信息")
    @ApiImplicitParam(name = "id", value = "附件Id", required = true, dataType = "String",paramType = "query")
    @GetMapping(value = "/epsmAttachments/{id}")
    public Result selectEpsmAttachmentById(@ApiParam(name = "id", required = true, value = "附件Id")@PathVariable("id") String id) {
        logger.info("selectEpsmAttachmentById");
        EpsmAttachment epsmAttachment = epsmAttachmentService.selectEpsmAttachmentById(id);
        return ResponseUtil.success(epsmAttachment);
    }

    /**
     * 更新一个附件
     * @param epsmAttachment
     * @return
     */
    @ApiOperation(value="更新附件详细信息", notes="根据url的attachmentid来指定更新对象，并根据传过来的epsmAttachment信息来更新附件详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "附件ID", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "epsmAttachment", value = "附件实体epsmAttachment", required = true, dataType = "epsmAttachment")
    })
    @PutMapping(value = "/epsmAttachments/{id}")
    public Result updateEpsmAttachmentById(@ApiParam(name = "id", required = true, value = "附件Id") @PathVariable("id") String id,@RequestBody EpsmAttachment epsmAttachment) {
        logger.info("updateEpsmAttachmentById");
        if (!id.equals(epsmAttachment.getAttachmentid())){
            return ResponseUtil.error(0,"要更新的attachmentid与更新的epsmAttachment不匹配");
        }
        epsmAttachmentService.updateEpsmAttachmentById(epsmAttachment);
        return ResponseUtil.success();
    }


    @ApiOperation(value="删除附件", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "附件ID", required = true, dataType = "String",paramType="query")
    //删除@DeleteMapping(value = "/epsmAttachments/{id}")
    @DeleteMapping(value = "/epsmAttachments/{id}")
    public Result deleteEpsmAttachmentById(@ApiParam(name = "id", required = true, value = "附件Id") @PathVariable("id") String id) {
        logger.info("deleteEpsmAttachmentById");
        epsmAttachmentService.deleteEpsmAttachmentById(id);
        return ResponseUtil.success();
    }

}
