
package br.com.lemontech.selfbooking.wsselfbooking.beans.outro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Consolidadora;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.FormaPagamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.IdentificadoresIntegracao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PontoVendaOrcamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Remarks;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de outro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="outro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codigoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataInicial" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataFinal" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="codigoFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obsEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maiorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="menorTarifa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="formaPagamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}formaPagamento" minOccurs="0"/&gt;
 *         &lt;element name="idPassageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="justificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="taxaCancelamento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataModificacaoStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codigoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificadorIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificadorBackOfficeTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autorizacaoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}remarks" minOccurs="0"/&gt;
 *         &lt;element name="totalOutro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cancelado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="identificadoresIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}identificadoresIntegracao" minOccurs="0"/&gt;
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="consolidadora" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}consolidadora" minOccurs="0"/&gt;
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pontoVenda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}pontoVendaOrcamento" minOccurs="0"/&gt;
 *         &lt;element name="emailEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeUsuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeViajante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroBilhete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoCia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reembolso" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="nacional" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "outro", propOrder = {
    "id",
    "codigoEmissor",
    "nomeEmissor",
    "codigoReservador",
    "nomeReservador",
    "descricao",
    "valor",
    "dataInicial",
    "dataFinal",
    "dataReserva",
    "codigoFornecedor",
    "obsEmissor",
    "maiorTarifa",
    "menorTarifa",
    "formaPagamento",
    "idPassageiroRef",
    "justificativaMaiorTarifa",
    "complementoJustificativaMaiorTarifa",
    "statusCancelamento",
    "taxaCancelamento",
    "dataModificacaoStatusCancelamento",
    "usuarioModificouStatusCancelamento",
    "codigoJustificativaMaiorTarifa",
    "identificadorIntegracao",
    "identificador",
    "categoria",
    "identificadorBackOfficeTipoProduto",
    "autorizacaoCartao",
    "taxa",
    "remarks",
    "totalOutro",
    "cancelado",
    "identificadoresIntegracao",
    "taxaFee",
    "consolidadora",
    "moeda",
    "pontoVenda",
    "emailEmissor",
    "descricaoTipoProduto",
    "nomeUsuarioModificouStatusCancelamento",
    "nomeViajante",
    "numeroBilhete",
    "codigoCia",
    "localizador",
    "observacao",
    "reembolso",
    "nacional"
})
public class Outro {

    protected int id;
    protected String codigoEmissor;
    protected String nomeEmissor;
    protected String codigoReservador;
    protected String nomeReservador;
    protected String descricao;
    protected Double valor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicial;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFinal;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReserva;
    protected String codigoFornecedor;
    protected String obsEmissor;
    protected Double maiorTarifa;
    protected Double menorTarifa;
    protected FormaPagamento formaPagamento;
    @XmlElement(nillable = true)
    protected List<Integer> idPassageiroRef;
    protected String justificativaMaiorTarifa;
    protected String complementoJustificativaMaiorTarifa;
    protected Integer statusCancelamento;
    protected Double taxaCancelamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataModificacaoStatusCancelamento;
    protected Integer usuarioModificouStatusCancelamento;
    protected String codigoJustificativaMaiorTarifa;
    protected String identificadorIntegracao;
    protected String identificador;
    protected String categoria;
    protected String identificadorBackOfficeTipoProduto;
    protected String autorizacaoCartao;
    protected Double taxa;
    protected Remarks remarks;
    protected Double totalOutro;
    protected boolean cancelado;
    protected IdentificadoresIntegracao identificadoresIntegracao;
    protected Double taxaFee;
    protected Consolidadora consolidadora;
    protected String moeda;
    protected PontoVendaOrcamento pontoVenda;
    protected String emailEmissor;
    protected String descricaoTipoProduto;
    protected String nomeUsuarioModificouStatusCancelamento;
    protected String nomeViajante;
    protected String numeroBilhete;
    protected String codigoCia;
    protected String localizador;
    protected String observacao;
    protected boolean reembolso;
    protected boolean nacional;

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
     * Obtém o valor da propriedade codigoEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoEmissor() {
        return codigoEmissor;
    }

    /**
     * Define o valor da propriedade codigoEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoEmissor(String value) {
        this.codigoEmissor = value;
    }

    /**
     * Obtém o valor da propriedade nomeEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEmissor() {
        return nomeEmissor;
    }

    /**
     * Define o valor da propriedade nomeEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEmissor(String value) {
        this.nomeEmissor = value;
    }

    /**
     * Obtém o valor da propriedade codigoReservador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReservador() {
        return codigoReservador;
    }

    /**
     * Define o valor da propriedade codigoReservador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReservador(String value) {
        this.codigoReservador = value;
    }

    /**
     * Obtém o valor da propriedade nomeReservador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeReservador() {
        return nomeReservador;
    }

    /**
     * Define o valor da propriedade nomeReservador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeReservador(String value) {
        this.nomeReservador = value;
    }

    /**
     * Obtém o valor da propriedade descricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define o valor da propriedade descricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Obtém o valor da propriedade valor.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Define o valor da propriedade valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
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
     * Obtém o valor da propriedade dataReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataReserva() {
        return dataReserva;
    }

    /**
     * Define o valor da propriedade dataReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataReserva(XMLGregorianCalendar value) {
        this.dataReserva = value;
    }

    /**
     * Obtém o valor da propriedade codigoFornecedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    /**
     * Define o valor da propriedade codigoFornecedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFornecedor(String value) {
        this.codigoFornecedor = value;
    }

    /**
     * Obtém o valor da propriedade obsEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsEmissor() {
        return obsEmissor;
    }

    /**
     * Define o valor da propriedade obsEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsEmissor(String value) {
        this.obsEmissor = value;
    }

    /**
     * Obtém o valor da propriedade maiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaiorTarifa() {
        return maiorTarifa;
    }

    /**
     * Define o valor da propriedade maiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaiorTarifa(Double value) {
        this.maiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade menorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMenorTarifa() {
        return menorTarifa;
    }

    /**
     * Define o valor da propriedade menorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMenorTarifa(Double value) {
        this.menorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade formaPagamento.
     * 
     * @return
     *     possible object is
     *     {@link FormaPagamento }
     *     
     */
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Define o valor da propriedade formaPagamento.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaPagamento }
     *     
     */
    public void setFormaPagamento(FormaPagamento value) {
        this.formaPagamento = value;
    }

    /**
     * Gets the value of the idPassageiroRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the idPassageiroRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdPassageiroRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIdPassageiroRef() {
        if (idPassageiroRef == null) {
            idPassageiroRef = new ArrayList<Integer>();
        }
        return this.idPassageiroRef;
    }

    /**
     * Obtém o valor da propriedade justificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaMaiorTarifa() {
        return justificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade justificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaMaiorTarifa(String value) {
        this.justificativaMaiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade complementoJustificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoJustificativaMaiorTarifa() {
        return complementoJustificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade complementoJustificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoJustificativaMaiorTarifa(String value) {
        this.complementoJustificativaMaiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade statusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatusCancelamento() {
        return statusCancelamento;
    }

    /**
     * Define o valor da propriedade statusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatusCancelamento(Integer value) {
        this.statusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade taxaCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaCancelamento() {
        return taxaCancelamento;
    }

    /**
     * Define o valor da propriedade taxaCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaCancelamento(Double value) {
        this.taxaCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataModificacaoStatusCancelamento() {
        return dataModificacaoStatusCancelamento;
    }

    /**
     * Define o valor da propriedade dataModificacaoStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataModificacaoStatusCancelamento(XMLGregorianCalendar value) {
        this.dataModificacaoStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsuarioModificouStatusCancelamento() {
        return usuarioModificouStatusCancelamento;
    }

    /**
     * Define o valor da propriedade usuarioModificouStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsuarioModificouStatusCancelamento(Integer value) {
        this.usuarioModificouStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoJustificativaMaiorTarifa() {
        return codigoJustificativaMaiorTarifa;
    }

    /**
     * Define o valor da propriedade codigoJustificativaMaiorTarifa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoJustificativaMaiorTarifa(String value) {
        this.codigoJustificativaMaiorTarifa = value;
    }

    /**
     * Obtém o valor da propriedade identificadorIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorIntegracao() {
        return identificadorIntegracao;
    }

    /**
     * Define o valor da propriedade identificadorIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorIntegracao(String value) {
        this.identificadorIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade identificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Define o valor da propriedade identificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificador(String value) {
        this.identificador = value;
    }

    /**
     * Obtém o valor da propriedade categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define o valor da propriedade categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtém o valor da propriedade identificadorBackOfficeTipoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackOfficeTipoProduto() {
        return identificadorBackOfficeTipoProduto;
    }

    /**
     * Define o valor da propriedade identificadorBackOfficeTipoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackOfficeTipoProduto(String value) {
        this.identificadorBackOfficeTipoProduto = value;
    }

    /**
     * Obtém o valor da propriedade autorizacaoCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutorizacaoCartao() {
        return autorizacaoCartao;
    }

    /**
     * Define o valor da propriedade autorizacaoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutorizacaoCartao(String value) {
        this.autorizacaoCartao = value;
    }

    /**
     * Obtém o valor da propriedade taxa.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxa() {
        return taxa;
    }

    /**
     * Define o valor da propriedade taxa.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxa(Double value) {
        this.taxa = value;
    }

    /**
     * Obtém o valor da propriedade remarks.
     * 
     * @return
     *     possible object is
     *     {@link Remarks }
     *     
     */
    public Remarks getRemarks() {
        return remarks;
    }

    /**
     * Define o valor da propriedade remarks.
     * 
     * @param value
     *     allowed object is
     *     {@link Remarks }
     *     
     */
    public void setRemarks(Remarks value) {
        this.remarks = value;
    }

    /**
     * Obtém o valor da propriedade totalOutro.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalOutro() {
        return totalOutro;
    }

    /**
     * Define o valor da propriedade totalOutro.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalOutro(Double value) {
        this.totalOutro = value;
    }

    /**
     * Obtém o valor da propriedade cancelado.
     * 
     */
    public boolean isCancelado() {
        return cancelado;
    }

    /**
     * Define o valor da propriedade cancelado.
     * 
     */
    public void setCancelado(boolean value) {
        this.cancelado = value;
    }

    /**
     * Obtém o valor da propriedade identificadoresIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public IdentificadoresIntegracao getIdentificadoresIntegracao() {
        return identificadoresIntegracao;
    }

    /**
     * Define o valor da propriedade identificadoresIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadoresIntegracao }
     *     
     */
    public void setIdentificadoresIntegracao(IdentificadoresIntegracao value) {
        this.identificadoresIntegracao = value;
    }

    /**
     * Obtém o valor da propriedade taxaFee.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaFee() {
        return taxaFee;
    }

    /**
     * Define o valor da propriedade taxaFee.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaFee(Double value) {
        this.taxaFee = value;
    }

    /**
     * Obtém o valor da propriedade consolidadora.
     * 
     * @return
     *     possible object is
     *     {@link Consolidadora }
     *     
     */
    public Consolidadora getConsolidadora() {
        return consolidadora;
    }

    /**
     * Define o valor da propriedade consolidadora.
     * 
     * @param value
     *     allowed object is
     *     {@link Consolidadora }
     *     
     */
    public void setConsolidadora(Consolidadora value) {
        this.consolidadora = value;
    }

    /**
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoeda(String value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade pontoVenda.
     * 
     * @return
     *     possible object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public PontoVendaOrcamento getPontoVenda() {
        return pontoVenda;
    }

    /**
     * Define o valor da propriedade pontoVenda.
     * 
     * @param value
     *     allowed object is
     *     {@link PontoVendaOrcamento }
     *     
     */
    public void setPontoVenda(PontoVendaOrcamento value) {
        this.pontoVenda = value;
    }

    /**
     * Obtém o valor da propriedade emailEmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailEmissor() {
        return emailEmissor;
    }

    /**
     * Define o valor da propriedade emailEmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailEmissor(String value) {
        this.emailEmissor = value;
    }

    /**
     * Obtém o valor da propriedade descricaoTipoProduto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTipoProduto() {
        return descricaoTipoProduto;
    }

    /**
     * Define o valor da propriedade descricaoTipoProduto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTipoProduto(String value) {
        this.descricaoTipoProduto = value;
    }

    /**
     * Obtém o valor da propriedade nomeUsuarioModificouStatusCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeUsuarioModificouStatusCancelamento() {
        return nomeUsuarioModificouStatusCancelamento;
    }

    /**
     * Define o valor da propriedade nomeUsuarioModificouStatusCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeUsuarioModificouStatusCancelamento(String value) {
        this.nomeUsuarioModificouStatusCancelamento = value;
    }

    /**
     * Obtém o valor da propriedade nomeViajante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeViajante() {
        return nomeViajante;
    }

    /**
     * Define o valor da propriedade nomeViajante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeViajante(String value) {
        this.nomeViajante = value;
    }

    /**
     * Obtém o valor da propriedade numeroBilhete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBilhete() {
        return numeroBilhete;
    }

    /**
     * Define o valor da propriedade numeroBilhete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBilhete(String value) {
        this.numeroBilhete = value;
    }

    /**
     * Obtém o valor da propriedade codigoCia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCia() {
        return codigoCia;
    }

    /**
     * Define o valor da propriedade codigoCia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCia(String value) {
        this.codigoCia = value;
    }

    /**
     * Obtém o valor da propriedade localizador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizador() {
        return localizador;
    }

    /**
     * Define o valor da propriedade localizador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizador(String value) {
        this.localizador = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
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
     * Obtém o valor da propriedade nacional.
     * 
     */
    public boolean isNacional() {
        return nacional;
    }

    /**
     * Define o valor da propriedade nacional.
     * 
     */
    public void setNacional(boolean value) {
        this.nacional = value;
    }

}
