package ohjelmisto.bean;

import javax.validation.constraints.Size;

/**
 * Created by Iiro on 17.5.2017.
 */
public class VaihtoehtoVastausImpl implements VaihtoehtoVastaus {

    private int vaihtoehto_id;

    private int vastaus_id;

    public int getVaihtoehto_id(){return vaihtoehto_id;}

    public void setVaihtoehto_id(int vaihtoehto_id){this.vaihtoehto_id = vaihtoehto_id;}

    public int getVastaus_id(){return vastaus_id;}

    public void setVastaus_id(int vastaus_id){this.vastaus_id = vastaus_id;}

    @Override
    public String toString() {
        return "VaihtoehtoVastausImpl{" +
                "Vaihtoehto_id=" + vaihtoehto_id +
                ", Vastaus_id='" + vastaus_id + '\'' +
                '}';
    }
}
