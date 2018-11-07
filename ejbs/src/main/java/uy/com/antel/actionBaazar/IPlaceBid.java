package uy.com.antel.actionBaazar;

import uy.com.antel.actionBaazar.entities.Bid;
import javax.ejb.Local;

@Local
public interface IPlaceBid {

    public void placeBid(Bid pojoBid);
}
