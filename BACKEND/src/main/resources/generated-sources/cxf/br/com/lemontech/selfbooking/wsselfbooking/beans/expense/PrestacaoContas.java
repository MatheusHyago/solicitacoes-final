
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PresacaoContasStatus;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de prestacaoContas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="prestacaoContas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="matriculaAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}presacaoContasStatus" minOccurs="0"/&gt;
 *         &lt;element name="observacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="justificativaReprovacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reembolso" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="itens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}prestacaoContaItens" minOccurs="0"/&gt;
 *         &lt;element name="fluxos" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}fluxos" minOccurs="0"/&gt;
 *         &lt;element name="tipoViagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contaBancaria" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}contaBancariaAdiantamento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestacaoContas", propOrder = {
    "id",
    "matriculaAutorizador",
    "nomeAutorizador",
    "status",
    "observacaoFinanceiro",
    "justificativaReprovacao",
    "reembolso",
    "itens",
    "fluxos",
    "tipoViagem",
    "dataPagamento",
    "origem",
    "destino",
    "contaBancaria"
})
public class PrestacaoContas {

    protected int id;
    protected String matriculaAutorizador;
    protected String nomeAutorizador;
    @XmlSchemaType(name = "string")
    protected PresacaoContasStatus status;
    protected String observacaoFinanceiro;
    protected String justificativaReprovacao;
    protected boolean reembolso;
    protected PrestacaoContaItens itens;
    protected Fluxos fluxos;
    protected String tipoViagem;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPagamento;
    protected String origem;
    protected String destino;
    protected ContaBancariaAdiantamento contaBancaria;

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade matriculaAutorizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaAutorizador() {
        return matriculaAutorizador;
    }

    /**
     * Define o valor da propriedade matriculaAutorizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaAutorizador(String value) {
        this.matriculaAutorizador = value;
    }

    /**
     * Obtém o valor da propriedade nomeAutorizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeAutorizador() {
        return nomeAutorizador;
    }

    /**
     * Define o valor da propriedade nomeAutorizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeAutorizador(String value) {
        this.nomeAutorizador = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link PresacaoContasStatus }
     *     
     */
    public PresacaoContasStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link PresacaoContasStatus }
     *     
     */
    public void setStatus(PresacaoContasStatus value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade observacaoFinanceiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoFinanceiro() {
        return observacaoFinanceiro;
    }

    /**
     * Define o valor da propriedade observacaoFinanceiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoFinanceiro(String value) {
        this.observacaoFinanceiro = value;
    }

    /**
     * Obtém o valor da propriedade justificativaReprovacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaReprovacao() {
        return justificativaReprovacao;
    }

    /**
     * Define o valor da propriedade justificativaReprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaReprovacao(String value) {
        this.justificativaReprovacao = value;
    }

    /**
     * Obtém o valor da propriedade reembolso.
     * 
     */
    public boolean isReembolso() {
        return reembolso;
    }

    /**
     * Define o valor da propriedade reembolso.
     * 
     */
    public void setReembolso(boolean value) {
        this.reembolso = value;
    }

    /**
     * Obtém o valor da propriedade itens.
     * 
     * @return
     *     possible object is
     *     {@link PrestacaoContaItens }
     *     
     */
    public PrestacaoContaItens getItens() {
        return itens;
    }

    /**
     * Define o valor da propriedade itens.
     * 
     * @param value
     *     allowed object is
     *     {@link PrestacaoContaItens }
     *     
     */
    public void setItens(PrestacaoContaItens value) {
        this.itens = value;
    }

    /**
     * Obtém o valor da propriedade fluxos.
     * 
     * @return
     *     possible object is
     *     {@link Fluxos }
     *     
     */
    public Fluxos getFluxos() {
        return fluxos;
    }

    /**
     * Define o valor da propriedade fluxos.
     * 
     * @param value
     *     allowed object is
     *     {@link Fluxos }
     *     
     */
    public void setFluxos(Fluxos value) {
        this.fluxos = value;
    }

    /**
     * Obtém o valor da propriedade tipoViagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoViagem() {
        return tipoViagem;
    }

    /**
     * Define o valor da propriedade tipoViagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoViagem(String value) {
        this.tipoViagem = value;
    }

    /**
     * Obtém o valor da propriedade dataPagamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Define o valor da propriedade dataPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
    }

    /**
     * Obtém o valor da propriedade origem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * Define o valor da propriedade origem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigem(String value) {
        this.origem = value;
    }

    /**
     * Obtém o valor da propriedade destino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Define o valor da propriedade destino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestino(String value) {
        this.destino = value;
    }

    /**
     * Obtém o valor da propriedade contaBancaria.
     * 
     * @return
     *     possible object is
     *     {@link ContaBancariaAdiantamento }
     *     
     */
    public ContaBancariaAdiantamento getContaBancaria() {
        return contaBancaria;
    }

    /**
     * Define o valor da propriedade contaBancaria.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaBancariaAdiantamento }
     *     
     */
    public void setContaBancaria(ContaBancariaAdiantamento value) {
        this.contaBancaria = value;
    }

}
