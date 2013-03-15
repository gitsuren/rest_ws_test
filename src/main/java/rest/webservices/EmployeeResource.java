package rest.webservices;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by IntelliJ IDEA.
 * User: sshres1
 * Date: 2/14/12
 * Time: 11:49 AM
 * To change this template use File | Settings | File Templates.
 */
@Path("/employee/{empno}")   // make this class process this url. empno is a variable that represents employee number.
public class EmployeeResource {
    public EmployeeResource() {
    }
    @GET   // this method process GET request from client
    @Produces("application/json")   // sends JSON
    public String getJson( @PathParam("empno") int empno) {  // empno represents the empno sent from client
        System.out.println("Inside");
        switch(empno) {
          case 1 :
              return "{'name':'George Koch', 'age':58}";
          case 2:
              return "{'name':'Peter Norton', 'age':50}";
          default:
              return "{'name':'unknown', 'age':-1}";
      } // end of switch
   } // end of
}
