package com.zkzj.controller;

import com.zkzj.common.Assist;
import com.zkzj.common.ResponseUtil;
import com.zkzj.entity.Industry;
import com.zkzj.entity.Result;
import com.zkzj.service.IndustryService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 行业类别控制层
 * Created by chenwt on 2017/6/22.
 */
@Api(value = "IndustryController控制器")
@RestController
@RequestMapping("/api")
public class IndustryController extends BaseController {

    @Resource
    private IndustryService industryService;

    /**
     * 查询行业类别列表
     * @return
     */
    @ApiOperation(value="查询行业类别列表", notes="查询行业类别列表接口")
    @GetMapping(value = "/industrys")
    public Result industryList() {
        logger.info("industryList");
        //Long total =  industryService.getIndustryRowCount(new Assist());
        List<Industry> industryList = industryService.selectIndustry(new Assist());
        return ResponseUtil.success(industryList,(long)industryList.size());
    }

    /**
     * 添加一个行业类别
     * @return
     */
    @ApiOperation(value="创建行业类别", notes="根据Industry对象行业类别")
    @ApiImplicitParam(name = "industry", value = "行业类别实体Industry", required = true, dataType = "Industry")
    @PostMapping(value = "/industrys")
    public Result<Industry> addIndustry(@RequestBody Industry Industry) {
        logger.info("addIndustry");
        industryService.insertNonEmptyIndustry(Industry);
        return ResponseUtil.success();
    }

    /**
     * 查询一个行业类别
     * @param id
     * @return
     */
    @ApiOperation(value="获取行业类别详细信息", notes="根据url的id来获取行业类别详细信息")
    @ApiImplicitParam(name = "id", value = "行业类别Id", required = true, dataType = "String",paramType = "query")
    @GetMapping(value = "/industrys/{id}")
    public Result selectIndustryById(@ApiParam(name = "id", required = true, value = "行业类别Id")@PathVariable("id") String id) {
        logger.info("selectIndustryById");
        Industry industry = industryService.selectIndustryById(id);
        return ResponseUtil.success(industry);
    }

    /**
     * 查询行业类别分页使用)
     * @param start
     * @param end
     * @return
     */
    @ApiOperation(value="获取行业类别(分页)", notes="根据url的start来获取从第start条开始，每次取end-start条")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "start", value = "第start条记录", required = true, dataType = "Integer ",paramType = "query"),
            @ApiImplicitParam(name = "end", value = "第end条记录", required = true, dataType = "Integer",paramType = "query")
    })
    @GetMapping(value = "/Industrys/from/{start}/to/{end}")
    public Result selectIndustryPage(@ApiParam(name = "start", required = true, value = "第start条记录")@PathVariable("start") Integer start,@ApiParam(name = "end", required = true, value = "第end条记录")@PathVariable("end") Integer end) {
        logger.info("selectIndustryPage");
        Assist assist = new Assist();
        assist.setStartRow(start);
        assist.setRowSize(end-start);
        List<Industry> industryList = industryService.selectIndustry(assist);
        return ResponseUtil.success(industryList,(long)industryList.size());
    }

    /**
     * 更新一个行业类别
     * @param Industry
     * @return
     */
    @ApiOperation(value="更新行业类别详细信息", notes="根据url的industryid来指定更新对象，并根据传过来的Industry信息来更新行业类别详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "行业类别ID", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "industry", value = "行业类别实体Industry", required = true, dataType = "Industry")
    })
    @PutMapping(value = "/industrys/{id}")
    public Result updateIndustryById(@ApiParam(name = "id", required = true, value = "行业类别Id") @PathVariable("id") String id,@RequestBody Industry Industry) {
        logger.info("updateIndustryById");
        if (!id.equals(Industry.getIndustryid())){
            return ResponseUtil.error(0,"要更新的industryid与更新的Industry不匹配");
        }
        industryService.updateIndustryById(Industry);
        return ResponseUtil.success();
    }


    @ApiOperation(value="删除行业类别", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "行业类别ID", required = true, dataType = "String",paramType="query")
    //删除@DeleteMapping(value = "/Industrys/{id}")
    @DeleteMapping(value = "/industrys/{id}")
    public Result deleteIndustryById(@ApiParam(name = "id", required = true, value = "行业类别Id") @PathVariable("id") String id) {
        logger.info("deleteIndustryById");
        industryService.deleteIndustryById(id);
        return ResponseUtil.success();
    }

}
