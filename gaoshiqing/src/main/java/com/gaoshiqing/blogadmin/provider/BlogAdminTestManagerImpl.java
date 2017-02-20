package com.gaoshiqing.blogadmin.provider;

import com.gaoshiqing.blogadmin.service.test.BlogAdminTestService;
import com.gaoshiqing.blogadmin.service.test.impl.BlogAdminTestServiceImpl;
import com.gaoshiqing.test.BlogAdminTestManagerSevice;
//import com.gaoshiqing.test.BlogAdminTestManagerSevice;

/**
 * Created by wqkenqing on 2017/2/20.
 */
public class BlogAdminTestManagerImpl  implements BlogAdminTestManagerSevice {
    BlogAdminTestService blogAdminTestService=new BlogAdminTestServiceImpl();
    public String saveBlog(){
        blogAdminTestService.blogTest();
        return "ok";
    }
}
