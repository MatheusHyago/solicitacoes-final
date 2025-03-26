
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.DelegarTodasParametrizacoes;
import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacoesEspecificas;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de importarDelegacaoParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="importarDelegacaoParametrizacaoCentroDeCustoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funcionarioRefOrigem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="funcionarioRefDestino" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="vencimentoDelegacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="delegarTodasParametrizacoes" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}delegarTodasParametrizacoes"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="parametrizacoesEspecificas" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacoesEspecificas"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importarDelegacaoParametrizacaoCentroDeCustoRequest", propOrder = {
    "funcionarioRefOrigem",
    "funcionarioRefDestino",
    "vencimentoDelegacao",
    "delegarTodasParametrizacoes",
    "parametrizacoesEspecificas"
})
public class ImportarDelegacaoParametrizacaoCentroDeCustoRequest {

    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRefOrigem;
    @XmlElement(required = true)
    protected FuncionarioRef funcionarioRefDestino;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimentoDelegacao;
    protected DelegarTodasParametrizacoes delegarTodasParametrizacoes;
    protected ParametrizacoesEspecificas parametrizacoesEspecificas;

    /**
     * Obtém o valor da propriedade funcionarioRefOrigem.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRefOrigem() {
        return funcionarioRefOrigem;
    }

    /**
     * Define o valor da propriedade funcionarioRefOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRefOrigem(FuncionarioRef value) {
        this.funcionarioRefOrigem = value;
    }

    /**
     * Obtém o valor da propriedade funcionarioRefDestino.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRefDestino() {
        return funcionarioRefDestino;
    }

    /**
     * Define o valor da propriedade funcionarioRefDestino.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRefDestino(FuncionarioRef value) {
        this.funcionarioRefDestino = value;
    }

    /**
     * Obtém o valor da propriedade vencimentoDelegacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimentoDelegacao() {
        return vencimentoDelegacao;
    }

    /**
     * Define o valor da propriedade vencimentoDelegacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimentoDelegacao(XMLGregorianCalendar value) {
        this.vencimentoDelegacao = value;
    }

    /**
     * Obtém o valor da propriedade delegarTodasParametrizacoes.
     * 
     * @return
     *     possible object is
     *     {@link DelegarTodasParametrizacoes }
     *     
     */
    public DelegarTodasParametrizacoes getDelegarTodasParametrizacoes() {
        return delegarTodasParametrizacoes;
    }

    /**
     * Define o valor da propriedade delegarTodasParametrizacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link DelegarTodasParametrizacoes }
     *     
     */
    public void setDelegarTodasParametrizacoes(DelegarTodasParametrizacoes value) {
        this.delegarTodasParametrizacoes = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacoesEspecificas.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacoesEspecificas }
     *     
     */
    public ParametrizacoesEspecificas getParametrizacoesEspecificas() {
        return parametrizacoesEspecificas;
    }

    /**
     * Define o valor da propriedade parametrizacoesEspecificas.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacoesEspecificas }
     *     
     */
    public void setParametrizacoesEspecificas(ParametrizacoesEspecificas value) {
        this.parametrizacoesEspecificas = value;
    }

}
