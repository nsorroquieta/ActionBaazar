package uy.com.antel.actionBaazar.GUI;

import uy.com.antel.actionBaazar.entities.Bid;
import uy.com.antel.actionBaazar.IPlaceBid;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/PlaceBid", loadOnStartup = 1)
public class ActionBaazarGui extends HttpServlet {

    @EJB
    IPlaceBid placeBidLocal;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        Bid bid = new Bid();
        bid.setAmount(200f);
        placeBidLocal.placeBid(bid);
    }
}
