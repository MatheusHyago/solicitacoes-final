
package br.com.lemontech.selfbooking.wsselfbooking.beans.solicitacaotolistarparametrizacaocentrodecusto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de solicitacaoListarParametrizacaoCentroDeCusto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="solicitacaoListarParametrizacaoCentroDeCusto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="centroDeCusto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="subCentroDeCusto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="regional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aprovadorNome" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="matricula" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nivelDeAprovacao" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipoDeViagemDaAprocacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aprovaSomenteAprovador" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="aprovaSomenteDentroDaPolitica" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipoDePassageiro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="tipoDeSolicitacao" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="periodoViagemInicial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="periodoViagemFinal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="valorAlcadaInicial" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="valorAlcadaFinal" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitacaoListarParametrizacaoCentroDeCusto", propOrder = {
    "centroDeCusto",
    "subCentroDeCusto",
    "regional",
    "aprovadorNome",
    "matricula",
    "nivelDeAprovacao",
    "tipoDeViagemDaAprocacao",
    "aprovaSomenteAprovador",
    "aprovaSomenteDentroDaPolitica",
    "tipoDePassageiro",
    "tipoDeSolicitacao",
    "vencimento",
    "periodoViagemInicial",
    "periodoViagemFinal",
    "valorAlcadaInicial",
    "valorAlcadaFinal"
})
public class SolicitacaoListarParametrizacaoCentroDeCusto {

    @XmlElement(required = true)
    protected String centroDeCusto;
    @XmlElement(required = true)
    protected String subCentroDeCusto;
    @XmlElement(required = true)
    protected String regional;
    @XmlElement(required = true)
    protected String aprovadorNome;
    @XmlElement(required = true)
    protected String matricula;
    protected int nivelDeAprovacao;
    @XmlElement(required = true)
    protected String tipoDeViagemDaAprocacao;
    protected boolean aprovaSomenteAprovador;
    protected boolean aprovaSomenteDentroDaPolitica;
    @XmlElement(required = true)
    protected String tipoDePassageiro;
    @XmlElement(required = true)
    protected String tipoDeSolicitacao;
    @XmlElement(required = true)
    protected String vencimento;
    @XmlElement(required = true)
    protected String periodoViagemInicial;
    @XmlElement(required = true)
    protected String periodoViagemFinal;
    protected double valorAlcadaInicial;
    protected double valorAlcadaFinal;

    /**
     * Obtém o valor da propriedade centroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentroDeCusto() {
        return centroDeCusto;
    }

    /**
     * Define o valor da propriedade centroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentroDeCusto(String value) {
        this.centroDeCusto = value;
    }

    /**
     * Obtém o valor da propriedade subCentroDeCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCentroDeCusto() {
        return subCentroDeCusto;
    }

    /**
     * Define o valor da propriedade subCentroDeCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCentroDeCusto(String value) {
        this.subCentroDeCusto = value;
    }

    /**
     * Obtém o valor da propriedade regional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegional() {
        return regional;
    }

    /**
     * Define o valor da propriedade regional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegional(String value) {
        this.regional = value;
    }

    /**
     * Obtém o valor da propriedade aprovadorNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAprovadorNome() {
        return aprovadorNome;
    }

    /**
     * Define o valor da propriedade aprovadorNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAprovadorNome(String value) {
        this.aprovadorNome = value;
    }

    /**
     * Obtém o valor da propriedade matricula.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define o valor da propriedade matricula.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricula(String value) {
        this.matricula = value;
    }

    /**
     * Obtém o valor da propriedade nivelDeAprovacao.
     * 
     */
    public int getNivelDeAprovacao() {
        return nivelDeAprovacao;
    }

    /**
     * Define o valor da propriedade nivelDeAprovacao.
     * 
     */
    public void setNivelDeAprovacao(int value) {
        this.nivelDeAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoDeViagemDaAprocacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeViagemDaAprocacao() {
        return tipoDeViagemDaAprocacao;
    }

    /**
     * Define o valor da propriedade tipoDeViagemDaAprocacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeViagemDaAprocacao(String value) {
        this.tipoDeViagemDaAprocacao = value;
    }

    /**
     * Obtém o valor da propriedade aprovaSomenteAprovador.
     * 
     */
    public boolean isAprovaSomenteAprovador() {
        return aprovaSomenteAprovador;
    }

    /**
     * Define o valor da propriedade aprovaSomenteAprovador.
     * 
     */
    public void setAprovaSomenteAprovador(boolean value) {
        this.aprovaSomenteAprovador = value;
    }

    /**
     * Obtém o valor da propriedade aprovaSomenteDentroDaPolitica.
     * 
     */
    public boolean isAprovaSomenteDentroDaPolitica() {
        return aprovaSomenteDentroDaPolitica;
    }

    /**
     * Define o valor da propriedade aprovaSomenteDentroDaPolitica.
     * 
     */
    public void setAprovaSomenteDentroDaPolitica(boolean value) {
        this.aprovaSomenteDentroDaPolitica = value;
    }

    /**
     * Obtém o valor da propriedade tipoDePassageiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDePassageiro() {
        return tipoDePassageiro;
    }

    /**
     * Define o valor da propriedade tipoDePassageiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDePassageiro(String value) {
        this.tipoDePassageiro = value;
    }

    /**
     * Obtém o valor da propriedade tipoDeSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDeSolicitacao() {
        return tipoDeSolicitacao;
    }

    /**
     * Define o valor da propriedade tipoDeSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDeSolicitacao(String value) {
        this.tipoDeSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade vencimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVencimento() {
        return vencimento;
    }

    /**
     * Define o valor da propriedade vencimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVencimento(String value) {
        this.vencimento = value;
    }

    /**
     * Obtém o valor da propriedade periodoViagemInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoViagemInicial() {
        return periodoViagemInicial;
    }

    /**
     * Define o valor da propriedade periodoViagemInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoViagemInicial(String value) {
        this.periodoViagemInicial = value;
    }

    /**
     * Obtém o valor da propriedade periodoViagemFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodoViagemFinal() {
        return periodoViagemFinal;
    }

    /**
     * Define o valor da propriedade periodoViagemFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodoViagemFinal(String value) {
        this.periodoViagemFinal = value;
    }

    /**
     * Obtém o valor da propriedade valorAlcadaInicial.
     * 
     */
    public double getValorAlcadaInicial() {
        return valorAlcadaInicial;
    }

    /**
     * Define o valor da propriedade valorAlcadaInicial.
     * 
     */
    public void setValorAlcadaInicial(double value) {
        this.valorAlcadaInicial = value;
    }

    /**
     * Obtém o valor da propriedade valorAlcadaFinal.
     * 
     */
    public double getValorAlcadaFinal() {
        return valorAlcadaFinal;
    }

    /**
     * Define o valor da propriedade valorAlcadaFinal.
     * 
     */
    public void setValorAlcadaFinal(double value) {
        this.valorAlcadaFinal = value;
    }

}
