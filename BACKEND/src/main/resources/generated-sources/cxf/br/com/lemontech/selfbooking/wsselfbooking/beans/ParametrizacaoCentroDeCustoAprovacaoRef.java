
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ProdutoAprovacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoDeSolicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoPassageiro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoViagem;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de parametrizacaoCentroDeCustoAprovacaoRef complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametrizacaoCentroDeCustoAprovacaoRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funcionarioRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="centroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}centroDeCustoRef"/&gt;
 *           &lt;element name="subCentroDeCustoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}subCentroDeCustoRef"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="nivelDeAprovacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoDeViagemDaAprocacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoViagem" minOccurs="0"/&gt;
 *         &lt;element name="tipoDePassageiro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoPassageiro" minOccurs="0"/&gt;
 *         &lt;element name="aprovaSomenteAprovador" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="aprovaSomenteDentroDaPolitica" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="periodoViagemInicial" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="tipoDeSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoDeSolicitacao" minOccurs="0"/&gt;
 *         &lt;element name="produtoAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}produtoAprovacao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametrizacaoCentroDeCustoAprovacaoRef", propOrder = {
    "funcionarioRef",
    "centroDeCustoRef",
    "subCentroDeCustoRef",
    "nivelDeAprovacao",
    "tipoDeViagemDaAprocacao",
    "tipoDePassageiro",
    "aprovaSomenteAprovador",
    "aprovaSomenteDentroDaPolitica",
    "periodoViagemInicial",
    "tipoDeSolicitacao",
    "produtoAprovacao"
})
@XmlSeeAlso({
    ParametrizacaoCentroDeCustoAprovacao.class
})
public class ParametrizacaoCentroDeCustoAprovacaoRef {

    protected FuncionarioRef funcionarioRef;
    protected CentroDeCustoRef centroDeCustoRef;
    protected SubCentroDeCustoRef subCentroDeCustoRef;
    @XmlElement(defaultValue = "0")
    protected Integer nivelDeAprovacao;
    @XmlElement(defaultValue = "TODOS")
    @XmlSchemaType(name = "string")
    protected TipoViagem tipoDeViagemDaAprocacao;
    @XmlElement(defaultValue = "TODOS")
    @XmlSchemaType(name = "string")
    protected TipoPassageiro tipoDePassageiro;
    @XmlElement(defaultValue = "false")
    protected Boolean aprovaSomenteAprovador;
    @XmlElement(defaultValue = "false")
    protected Boolean aprovaSomenteDentroDaPolitica;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar periodoViagemInicial;
    @XmlElement(defaultValue = "TODOS")
    @XmlSchemaType(name = "string")
    protected TipoDeSolicitacao tipoDeSolicitacao;
    @XmlElement(defaultValue = "TODOS")
    @XmlSchemaType(name = "string")
    protected ProdutoAprovacao produtoAprovacao;

    /**
     * Obtém o valor da propriedade funcionarioRef.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionarioRef() {
        return funcionarioRef;
    }

    /**
     * Define o valor da propriedade funcionarioRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionarioRef(FuncionarioRef value) {
        this.funcionarioRef = value;
    }

    /**
     * Obtém o valor da propriedade centroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public CentroDeCustoRef getCentroDeCustoRef() {
        return centroDeCustoRef;
    }

    /**
     * Define o valor da propriedade centroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link CentroDeCustoRef }
     *     
     */
    public void setCentroDeCustoRef(CentroDeCustoRef value) {
        this.centroDeCustoRef = value;
    }

    /**
     * Obtém o valor da propriedade subCentroDeCustoRef.
     * 
     * @return
     *     possible object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public SubCentroDeCustoRef getSubCentroDeCustoRef() {
        return subCentroDeCustoRef;
    }

    /**
     * Define o valor da propriedade subCentroDeCustoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link SubCentroDeCustoRef }
     *     
     */
    public void setSubCentroDeCustoRef(SubCentroDeCustoRef value) {
        this.subCentroDeCustoRef = value;
    }

    /**
     * Obtém o valor da propriedade nivelDeAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNivelDeAprovacao() {
        return nivelDeAprovacao;
    }

    /**
     * Define o valor da propriedade nivelDeAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNivelDeAprovacao(Integer value) {
        this.nivelDeAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoDeViagemDaAprocacao.
     * 
     * @return
     *     possible object is
     *     {@link TipoViagem }
     *     
     */
    public TipoViagem getTipoDeViagemDaAprocacao() {
        return tipoDeViagemDaAprocacao;
    }

    /**
     * Define o valor da propriedade tipoDeViagemDaAprocacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoViagem }
     *     
     */
    public void setTipoDeViagemDaAprocacao(TipoViagem value) {
        this.tipoDeViagemDaAprocacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoDePassageiro.
     * 
     * @return
     *     possible object is
     *     {@link TipoPassageiro }
     *     
     */
    public TipoPassageiro getTipoDePassageiro() {
        return tipoDePassageiro;
    }

    /**
     * Define o valor da propriedade tipoDePassageiro.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPassageiro }
     *     
     */
    public void setTipoDePassageiro(TipoPassageiro value) {
        this.tipoDePassageiro = value;
    }

    /**
     * Obtém o valor da propriedade aprovaSomenteAprovador.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAprovaSomenteAprovador() {
        return aprovaSomenteAprovador;
    }

    /**
     * Define o valor da propriedade aprovaSomenteAprovador.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAprovaSomenteAprovador(Boolean value) {
        this.aprovaSomenteAprovador = value;
    }

    /**
     * Obtém o valor da propriedade aprovaSomenteDentroDaPolitica.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAprovaSomenteDentroDaPolitica() {
        return aprovaSomenteDentroDaPolitica;
    }

    /**
     * Define o valor da propriedade aprovaSomenteDentroDaPolitica.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAprovaSomenteDentroDaPolitica(Boolean value) {
        this.aprovaSomenteDentroDaPolitica = value;
    }

    /**
     * Obtém o valor da propriedade periodoViagemInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriodoViagemInicial() {
        return periodoViagemInicial;
    }

    /**
     * Define o valor da propriedade periodoViagemInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriodoViagemInicial(XMLGregorianCalendar value) {
        this.periodoViagemInicial = value;
    }

    /**
     * Obtém o valor da propriedade tipoDeSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link TipoDeSolicitacao }
     *     
     */
    public TipoDeSolicitacao getTipoDeSolicitacao() {
        return tipoDeSolicitacao;
    }

    /**
     * Define o valor da propriedade tipoDeSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDeSolicitacao }
     *     
     */
    public void setTipoDeSolicitacao(TipoDeSolicitacao value) {
        this.tipoDeSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade produtoAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link ProdutoAprovacao }
     *     
     */
    public ProdutoAprovacao getProdutoAprovacao() {
        return produtoAprovacao;
    }

    /**
     * Define o valor da propriedade produtoAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdutoAprovacao }
     *     
     */
    public void setProdutoAprovacao(ProdutoAprovacao value) {
        this.produtoAprovacao = value;
    }

}
