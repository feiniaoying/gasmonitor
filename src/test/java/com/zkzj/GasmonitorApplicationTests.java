package com.zkzj;

import com.zkzj.common.Assist;
import com.zkzj.entity.EpsmActor;
import com.zkzj.entity.Industry;
import com.zkzj.service.EpsmActorService;
import com.zkzj.service.IndustryService;
import com.zkzj.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GasmonitorApplicationTests {

	@Autowired
	private UserService userService;
	@Autowired
	private EpsmActorService epsmActorService;
	@Test
	public void contextLoads() {
		//userService.findByName("test");
		EpsmActor epsmActor = epsmActorService.selectEpsmActorById("1");
		Assist assist = new Assist();
		assist.setRequires(Assist.and_eq("t_epsm_actor.actorname","陈文韬"));
		List<EpsmActor> epsmActors = epsmActorService.selectEpsmActor(assist);
		System.out.println("epsmActor =="+epsmActor.toString());
		System.out.println("epsmActors ==="+epsmActors);
	}


	@Autowired
	private IndustryService industryService;
	@Test
	public void t_industry() {
		//userService.findByName("test");
//		 epsmActor = epsmActorService.selectEpsmActorById("1");
//		Assist assist = new Assist();
//		assist.setRequires(Assist.and_eq("t_epsm_actor.actorname","陈文韬"));
//		List<EpsmActor> epsmActors = epsmActorService.selectEpsmActor(assist);
//		System.out.println("epsmActor =="+epsmActor.toString());
//		System.out.println("epsmActors ==="+epsmActors);
		Industry industry = new Industry();
		industry.setCreatetime(new Date());
		industry.setCreatorid("1111");
		industry.setDeleteflag("0");
		industry.setIndustrycode("2222");
		industry.setIndustryid("0000");
		industry.setName("chenwt");
		industry.setRemark("陈文韬");
		industry.setUpdaterid("33333");
		industry.setUpdatetime(new Date());
		int i = industryService.insertIndustry(industry);
		System.out.println("i ==="+i);
	}

}
