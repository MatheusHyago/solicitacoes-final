
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.lemontech.selfbooking.wsselfbooking.beans.expense package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.lemontech.selfbooking.wsselfbooking.beans.expense
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Expense }
     * 
     */
    public Expense createExpense() {
        return new Expense();
    }

    /**
     * Create an instance of {@link Adiantamento }
     * 
     */
    public Adiantamento createAdiantamento() {
        return new Adiantamento();
    }

    /**
     * Create an instance of {@link AdiantamentoItens }
     * 
     */
    public AdiantamentoItens createAdiantamentoItens() {
        return new AdiantamentoItens();
    }

    /**
     * Create an instance of {@link AdiantamentoItem }
     * 
     */
    public AdiantamentoItem createAdiantamentoItem() {
        return new AdiantamentoItem();
    }

    /**
     * Create an instance of {@link ContaBancariaAdiantamento }
     * 
     */
    public ContaBancariaAdiantamento createContaBancariaAdiantamento() {
        return new ContaBancariaAdiantamento();
    }

    /**
     * Create an instance of {@link PrestacaoContas }
     * 
     */
    public PrestacaoContas createPrestacaoContas() {
        return new PrestacaoContas();
    }

    /**
     * Create an instance of {@link PrestacaoContaItens }
     * 
     */
    public PrestacaoContaItens createPrestacaoContaItens() {
        return new PrestacaoContaItens();
    }

    /**
     * Create an instance of {@link PrestacaoContaItem }
     * 
     */
    public PrestacaoContaItem createPrestacaoContaItem() {
        return new PrestacaoContaItem();
    }

    /**
     * Create an instance of {@link Fluxo }
     * 
     */
    public Fluxo createFluxo() {
        return new Fluxo();
    }

    /**
     * Create an instance of {@link Fluxos }
     * 
     */
    public Fluxos createFluxos() {
        return new Fluxos();
    }

    /**
     * Create an instance of {@link Imagem }
     * 
     */
    public Imagem createImagem() {
        return new Imagem();
    }

    /**
     * Create an instance of {@link Imagens }
     * 
     */
    public Imagens createImagens() {
        return new Imagens();
    }

}
