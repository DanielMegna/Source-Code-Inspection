package br.test.machine;
import br.calebe.ticketmachine.core.PapelMoeda;
import org.junit.Assert;
import org.junit.Test;
public class PapelMoedaUnit {
    private PapelMoeda pm;
    public PapelMoedaUnit() {
        pm = new PapelMoeda(5,2);
    }
    
    @Test
    public void pegarValor(){
        Assert.assertEquals(5, pm.getValor());
    }
    @Test
    public void pegarQuantidade(){
        Assert.assertEquals(2, pm.getQuantidade());
    }
}
