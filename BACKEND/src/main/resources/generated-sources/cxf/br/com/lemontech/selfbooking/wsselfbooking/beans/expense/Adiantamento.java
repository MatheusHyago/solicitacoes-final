
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.AdiantamentoStatus;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoCredito;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de adiantamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="adiantamento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="matriculaAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeAutorizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tipoCredito" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCredito" minOccurs="0"/&gt;
 *         &lt;element name="numeroAutorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacaoSolicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacaoFinanceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}adiantamentoStatus" minOccurs="0"/&gt;
 *         &lt;element name="dataLiberacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="matriculaCancelador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeCancelador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="itens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}adiantamentoItens" minOccurs="0"/&gt;
 *         &lt;element name="dataPagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contaBancaria" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}contaBancariaAdiantamento" minOccurs="0"/&gt;
 *         &lt;element name="justificativaCartaoCorporativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adiantamento", propOrder = {
    "id",
    "matriculaAutorizador",
    "nomeAutorizador",
    "dataInicial",
    "dataFinal",
    "tipoCredito",
    "numeroAutorizacao",
    "observacaoSolicitante",
    "observacaoFinanceiro",
    "status",
    "dataLiberacao",
    "matriculaCancelador",
    "nomeCancelador",
    "dataCancelamento",
    "itens",
    "dataPagamento",
    "origem",
    "destino",
    "contaBancaria",
    "justificativaCartaoCorporativo"
})
public class Adiantamento {

    protected int id;
    protected String matriculaAutorizador;
    protected String nomeAutorizador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinal;
    @XmlSchemaType(name = "string")
    protected TipoCredito tipoCredito;
    protected String numeroAutorizacao;
    protected String observacaoSolicitante;
    protected String observacaoFinanceiro;
    @XmlSchemaType(name = "string")
    protected AdiantamentoStatus status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataLiberacao;
    protected String matriculaCancelador;
    protected String nomeCancelador;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCancelamento;
    protected AdiantamentoItens itens;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPagamento;
    protected String origem;
    protected String destino;
    protected ContaBancariaAdiantamento contaBancaria;
    protected String justificativaCartaoCorporativo;

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
     * Obtém o valor da propriedade dataInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicial() {
        return dataInicial;
    }

    /**
     * Define o valor da propriedade dataInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicial(XMLGregorianCalendar value) {
        this.dataInicial = value;
    }

    /**
     * Obtém o valor da propriedade dataFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinal() {
        return dataFinal;
    }

    /**
     * Define o valor da propriedade dataFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinal(XMLGregorianCalendar value) {
        this.dataFinal = value;
    }

    /**
     * Obtém o valor da propriedade tipoCredito.
     * 
     * @return
     *     possible object is
     *     {@link TipoCredito }
     *     
     */
    public TipoCredito getTipoCredito() {
        return tipoCredito;
    }

    /**
     * Define o valor da propriedade tipoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCredito }
     *     
     */
    public void setTipoCredito(TipoCredito value) {
        this.tipoCredito = value;
    }

    /**
     * Obtém o valor da propriedade numeroAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroAutorizacao() {
        return numeroAutorizacao;
    }

    /**
     * Define o valor da propriedade numeroAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroAutorizacao(String value) {
        this.numeroAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade observacaoSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacaoSolicitante() {
        return observacaoSolicitante;
    }

    /**
     * Define o valor da propriedade observacaoSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacaoSolicitante(String value) {
        this.observacaoSolicitante = value;
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
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link AdiantamentoStatus }
     *     
     */
    public AdiantamentoStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link AdiantamentoStatus }
     *     
     */
    public void setStatus(AdiantamentoStatus value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade dataLiberacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataLiberacao() {
        return dataLiberacao;
    }

    /**
     * Define o valor da propriedade dataLiberacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataLiberacao(XMLGregorianCalendar value) {
        this.dataLiberacao = value;
    }

    /**
     * Obtém o valor da propriedade matriculaCancelador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaCancelador() {
        return matriculaCancelador;
    }

    /**
     * Define o valor da propriedade matriculaCancelador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaCancelador(String value) {
        this.matriculaCancelador = value;
    }

    /**
     * Obtém o valor da propriedade nomeCancelador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCancelador() {
        return nomeCancelador;
    }

    /**
     * Define o valor da propriedade nomeCancelador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCancelador(String value) {
        this.nomeCancelador = value;
    }

    /**
     * Obtém o valor da propriedade dataCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCancelamento() {
        return dataCancelamento;
    }

    /**
     * Define o valor da propriedade dataCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCancelamento(XMLGregorianCalendar value) {
        this.dataCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade itens.
     * 
     * @return
     *     possible object is
     *     {@link AdiantamentoItens }
     *     
     */
    public AdiantamentoItens getItens() {
        return itens;
    }

    /**
     * Define o valor da propriedade itens.
     * 
     * @param value
     *     allowed object is
     *     {@link AdiantamentoItens }
     *     
     */
    public void setItens(AdiantamentoItens value) {
        this.itens = value;
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

    /**
     * Obtém o valor da propriedade justificativaCartaoCorporativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaCartaoCorporativo() {
        return justificativaCartaoCorporativo;
    }

    /**
     * Define o valor da propriedade justificativaCartaoCorporativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaCartaoCorporativo(String value) {
        this.justificativaCartaoCorporativo = value;
    }

}
