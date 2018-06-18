package hello;
import java.util.*;
import org.json.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.*;
import java.io.Serializable;
import java.lang.Object;
import java.io.*;

@RestController
@RequestMapping("/plash")
public class Naren {

    @Autowired
    private TestService testService;

    @RequestMapping(value="/naren/{id}",method=RequestMethod.GET)
    public String index1(@PathVariable("id") Integer id)
    {
        return(testService.getdata(id));

    }
    @RequestMapping(value="/naren",method=RequestMethod.POST)
    public String index2(@RequestBody Map<String,String>paramaters)
    {
        String fname=paramaters.get("fname");
        String lname=paramaters.get("lname");
        String email=paramaters.get("email");
        return(testService.postdata(fname,lname,email));
    }
    @RequestMapping(value="/naren",method=RequestMethod.PUT)
    public String index4(@RequestBody Map<String,String>paramaters)
    {
        String fname=paramaters.get("fname");
        String lname=paramaters.get("lname");
        String email=paramaters.get("email");
        return(testService.putdata(fname,lname,email));
    }
    @RequestMapping(value="/naren/{id}",method=RequestMethod.DELETE)
    public String index3(@PathVariable("id") int id)

    {
        return (testService.deletedata(id));
    }

}
