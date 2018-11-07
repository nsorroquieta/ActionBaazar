package uy.com.antel.actionBaazar;
import uy.com.antel.actionBaazar.entities.Bid;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class PlaceBidBean implements IPlaceBid {

    @PostConstruct
    public void initialize(){
        System.out.printf("PostConstruct");
    }

    public void placeBid(Bid pojoBid) {
        System.out.println(pojoBid.getAmount());
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy");
    }

}
