<!DOCTYPE html>  
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"  
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">  
    <head>  
        <title>Hello World!</title>  
    </head>  
    <body>  
       <p>    这个是freemarket的取值
           welcome ${name}  to freemarker!  
       </p>        
        
        
       <p>性别：   这个是freemarket的if判断
           <#if gender==0>  
              女  
           <#elseif gender==1>  
              男  
           <#else>  
              保密     
           </#if>  
        </p>  
        
        
       <h4>我的好友：</h4>   这个freemarker的 list遍历 
       <#list friends as item>  
           姓名：${item.name} , 年龄${item.age}  
           <br>  
       </#list>  
        
    </body>  
</html>  