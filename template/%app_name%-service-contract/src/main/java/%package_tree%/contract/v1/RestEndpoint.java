package <%= base_package %>.contract.v1;

import <%= base_package %>.contract.v1.mapper.LiberadorBinder;
import <%= base_package %>.contract.v1.model.Liberador;
import <%= base_package %>.contract.v1.model.LiberadorContract;
import <%= base_package %>.contract.v1.model.ValidaAlcadaContract;
import <%= base_package %>.contract.v1.model.ValidaLiberadorContract;
import <%= base_package %>.impl.LiberadorService;
import <%= base_package %>.model.ValidaAlcadaModel;
import <%= base_package %>.model.ValidaLiberadorModel;
import com.wordnik.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.math.BigDecimal;
import java.util.List;

@Path("/v1")
@Api(tags = "<%= app_name %>")
public class RestEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(RestEndpoint.class);

    @Autowired
    LiberadorService liberadorService;

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public String home() {
        return "Hello World.";
    }

}

