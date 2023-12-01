package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.util.*;

public class MyTagHandler extends TagSupport
{

    @Override
    public int doStartTag() throws JspException {
        
        try{
            //task....tag
            
            JspWriter out=pageContext.getOut();
            out.println("<h1>this is my custom tag.</h1>");
            out.println("<p>this is custom paragraph.");
            out.println("<br>");
            out.println(new Date().toString());
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
    
}
