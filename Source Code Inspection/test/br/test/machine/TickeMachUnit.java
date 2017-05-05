/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.test.machine;

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sandro Morita
 */
public class TickeMachUnit {
    @Test
    public void pegarSaldo() throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(4);
        tm.inserir(5);
        Assert.assertEquals(5,tm.getSaldo());
    }
    
    @Test
    public void pegarTroco() throws PapelMoedaInvalidaException {
        TicketMachine tm = new TicketMachine(4);
        tm.inserir(5);
        Assert.assertEquals(1,tm.getTroco());
    }
}
