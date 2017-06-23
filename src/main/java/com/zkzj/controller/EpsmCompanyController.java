package com.zkzj.controller;

import com.zkzj.common.Assist;
import com.zkzj.common.ResponseUtil;
import com.zkzj.entity.EpsmCompany;
import com.zkzj.entity.Result;
import com.zkzj.service.EpsmCompanyService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 工厂信息控制层
 * Created by chenwt on 2017/6/22.
 */
@Api(value = "EpsmCompanyController控制器")
@RestController
@RequestMapping("/api")
public class EpsmCompanyController extends BaseController {

    @Resource
    private EpsmCompanyService epsmCompanyService;

    /**
     * 查询工厂信息列表
     * @return
     */
    @ApiOperation(value="查询工厂信息列表", notes="查询工厂信息列表接口")
    @GetMapping(value = "/epsmCompanys")
    public Result epsmCompanyList() {
        logger.info("epsmCompanyList");
        //Long total =  epsmCompanyService.getEpsmCompanyRowCount(new Assist());
        List<EpsmCompany> epsmCompanyList = epsmCompanyService.selectEpsmCompany(new Assist());
        return ResponseUtil.success(epsmCompanyList,(long)epsmCompanyList.size());
    }

    /**
     * 添加一个工厂信息
     * @return
     */
    @ApiOperation(value="创建工厂信息", notes="根据EpsmCompany对象工厂信息")
    @ApiImplicitParam(name = "epsmCompany", value = "工厂信息实体EpsmCompany", required = true, dataType = "EpsmCompany")
    @PostMapping(value = "/epsmCompanys")
    public Result<EpsmCompany> addEpsmCompany(@RequestBody EpsmCompany EpsmCompany) {
        logger.info("addEpsmCompany");
        epsmCompanyService.insertNonEmptyEpsmCompany(EpsmCompany);
        return ResponseUtil.success();
    }

    /**
     * 查询一个工厂信息
     * @param id
     * @return
     */
    @ApiOperation(value="获取工厂信息详细信息", notes="根据url的id来获取工厂信息详细信息")
    @ApiImplicitParam(name = "id", value = "工厂信息Id", required = true, dataType = "String",paramType = "query")
    @GetMapping(value = "/epsmCompanys/{id}")
    public Result selectEpsmCompanyById(@ApiParam(name = "id", required = true, value = "工厂信息Id")@PathVariable("id") String id) {
        logger.info("selectEpsmCompanyById");
        EpsmCompany epsmCompany = epsmCompanyService.selectEpsmCompanyById(id);
        return ResponseUtil.success(epsmCompany);
    }


    /**
     * 查询工厂信息(分页使用)
     * @param start
     * @param end
     * @return
     */
    @ApiOperation(value="获取工厂信息(分页)", notes="根据url的start来获取从第start条开始，每次取end-start条")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "start", value = "第start条记录", required = true, dataType = "Integer ",paramType = "query"),
            @ApiImplicitParam(name = "end", value = "第end条记录", required = true, dataType = "Integer",paramType = "query")
    })
    @GetMapping(value = "/epsmCompanys/from/{start}/to/{end}")
    public Result selectEpsmCompanyPage(@ApiParam(name = "start", required = true, value = "第start条记录")@PathVariable("start") Integer start,@ApiParam(name = "end", required = true, value = "第end条记录")@PathVariable("end") Integer end) {
        logger.info("selectEpsmCompanyPage");
        Assist assist = new Assist();
        assist.setStartRow(start);
        assist.setRowSize(end-start);
        List<EpsmCompany> epsmCompanyList = epsmCompanyService.selectEpsmCompany(assist);
        return ResponseUtil.success(epsmCompanyList,(long)epsmCompanyList.size());
    }

    /**
     * 更新一个工厂信息
     * @param EpsmCompany
     * @return
     */
    @ApiOperation(value="更新工厂信息详细信息", notes="根据url的companyid来指定更新对象，并根据传过来的EpsmCompany信息来更新工厂信息详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "工厂信息ID", required = true, dataType = "String",paramType="query"),
            @ApiImplicitParam(name = "epsmCompany", value = "工厂信息实体EpsmCompany", required = true, dataType = "EpsmCompany")
    })
    @PutMapping(value = "/epsmCompanys/{id}")
    public Result updateEpsmCompanyById(@ApiParam(name = "id", required = true, value = "工厂信息Id") @PathVariable("id") String id,@RequestBody EpsmCompany EpsmCompany) {
        logger.info("updateEpsmCompanyById");
        if (!id.equals(EpsmCompany.getCompanyid())){
            return ResponseUtil.error(0,"要更新的companyid与更新的EpsmCompany不匹配");
        }
        epsmCompanyService.updateEpsmCompanyById(EpsmCompany);
        return ResponseUtil.success();
    }


    @ApiOperation(value="删除工厂信息", notes="根据url的id来指定删除对象")
    @ApiImplicitParam(name = "id", value = "工厂信息ID", required = true, dataType = "String",paramType="query")
    //删除@DeleteMapping(value = "/epsmCompanys/{id}")
    @DeleteMapping(value = "/epsmCompanys/{id}")
    public Result deleteEpsmCompanyById(@ApiParam(name = "id", required = true, value = "工厂信息Id") @PathVariable("id") String id) {
        logger.info("deleteEpsmCompanyById");
        epsmCompanyService.deleteEpsmCompanyById(id);
        return ResponseUtil.success();
    }

}
