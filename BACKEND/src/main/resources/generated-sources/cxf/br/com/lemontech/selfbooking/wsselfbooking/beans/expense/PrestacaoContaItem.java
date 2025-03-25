
package br.com.lemontech.selfbooking.wsselfbooking.beans.expense;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.DeslocamentoTerrestre;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Rateios;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de prestacaoContaItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="prestacaoContaItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/&gt;
 *         &lt;element name="urlImagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificadorExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="deslocamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}deslocamentoTerrestre" minOccurs="0"/&gt;
 *         &lt;element name="codigoDespesa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reembolsavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="custoCliente" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nomeClienteCusto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="formaPagamentoPrestacaoContaItem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}formaPagamentoPrestacaoContaItem" minOccurs="0"/&gt;
 *         &lt;element name="classificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="moedaCambio" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/&gt;
 *         &lt;element name="valorMoedaCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorMoedaCambioTesouraria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalConvertido" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="statusEstorno" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}statusEstorno" minOccurs="0"/&gt;
 *         &lt;element name="rateios" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}rateios" minOccurs="0"/&gt;
 *         &lt;element name="enumTipoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}enumTipoCartao" minOccurs="0"/&gt;
 *         &lt;element name="dataDespesa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataVencimentoFatura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="enumQualificadorTransacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}enumQualificadorTransacao" minOccurs="0"/&gt;
 *         &lt;element name="codigoDespesaCredito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imagens" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}imagens" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementoCombo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="numeroCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementoValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementoComboValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaInicial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="horaFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/expense}enumRelatorioDespesasItemStatus" minOccurs="0"/&gt;
 *         &lt;element name="idTipoViagem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="totalConversaoTesouraria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prestacaoContaItem", propOrder = {
    "tipoDespesa",
    "valor",
    "moeda",
    "urlImagem",
    "observacao",
    "identificadorExterno",
    "deslocamento",
    "codigoDespesa",
    "reembolsavel",
    "custoCliente",
    "nomeClienteCusto",
    "formaPagamentoPrestacaoContaItem",
    "classificacao",
    "id",
    "moedaCambio",
    "valorMoedaCambio",
    "valorMoedaCambioTesouraria",
    "totalConvertido",
    "statusEstorno",
    "rateios",
    "enumTipoCartao",
    "dataDespesa",
    "dataFim",
    "dataVencimentoFatura",
    "enumQualificadorTransacao",
    "codigoDespesaCredito",
    "imagens",
    "complemento",
    "complementoCombo",
    "descricao",
    "dataInicio",
    "numeroCartao",
    "complementoValor",
    "complementoComboValor",
    "nomeCidade",
    "horaInicial",
    "horaFinal",
    "status",
    "idTipoViagem",
    "totalConversaoTesouraria"
})
public class PrestacaoContaItem {

    protected String tipoDespesa;
    protected Double valor;
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected String urlImagem;
    protected String observacao;
    protected String identificadorExterno;
    protected DeslocamentoTerrestre deslocamento;
    protected String codigoDespesa;
    protected Boolean reembolsavel;
    protected Boolean custoCliente;
    protected String nomeClienteCusto;
    @XmlSchemaType(name = "string")
    protected FormaPagamentoPrestacaoContaItem formaPagamentoPrestacaoContaItem;
    protected String classificacao;
    protected int id;
    @XmlSchemaType(name = "string")
    protected Moeda moedaCambio;
    protected Double valorMoedaCambio;
    protected Double valorMoedaCambioTesouraria;
    protected Double totalConvertido;
    @XmlSchemaType(name = "string")
    protected StatusEstorno statusEstorno;
    protected Rateios rateios;
    @XmlSchemaType(name = "string")
    protected EnumTipoCartao enumTipoCartao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDespesa;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFim;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimentoFatura;
    @XmlSchemaType(name = "string")
    protected EnumQualificadorTransacao enumQualificadorTransacao;
    protected String codigoDespesaCredito;
    @XmlElement(nillable = true)
    protected List<Imagens> imagens;
    protected String complemento;
    protected String complementoCombo;
    protected String descricao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicio;
    protected String numeroCartao;
    protected String complementoValor;
    protected String complementoComboValor;
    protected String nomeCidade;
    protected String horaInicial;
    protected String horaFinal;
    @XmlSchemaType(name = "string")
    protected EnumRelatorioDespesasItemStatus status;
    @XmlElement(required = true)
    protected String idTipoViagem;
    protected Double totalConversaoTesouraria;

    /**
     * Obtém o valor da propriedade tipoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Define o valor da propriedade tipoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDespesa(String value) {
        this.tipoDespesa = value;
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
     * Obtém o valor da propriedade moeda.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Define o valor da propriedade moeda.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Obtém o valor da propriedade urlImagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagem() {
        return urlImagem;
    }

    /**
     * Define o valor da propriedade urlImagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagem(String value) {
        this.urlImagem = value;
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
     * Obtém o valor da propriedade identificadorExterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorExterno() {
        return identificadorExterno;
    }

    /**
     * Define o valor da propriedade identificadorExterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorExterno(String value) {
        this.identificadorExterno = value;
    }

    /**
     * Obtém o valor da propriedade deslocamento.
     * 
     * @return
     *     possible object is
     *     {@link DeslocamentoTerrestre }
     *     
     */
    public DeslocamentoTerrestre getDeslocamento() {
        return deslocamento;
    }

    /**
     * Define o valor da propriedade deslocamento.
     * 
     * @param value
     *     allowed object is
     *     {@link DeslocamentoTerrestre }
     *     
     */
    public void setDeslocamento(DeslocamentoTerrestre value) {
        this.deslocamento = value;
    }

    /**
     * Obtém o valor da propriedade codigoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDespesa() {
        return codigoDespesa;
    }

    /**
     * Define o valor da propriedade codigoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDespesa(String value) {
        this.codigoDespesa = value;
    }

    /**
     * Obtém o valor da propriedade reembolsavel.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReembolsavel() {
        return reembolsavel;
    }

    /**
     * Define o valor da propriedade reembolsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReembolsavel(Boolean value) {
        this.reembolsavel = value;
    }

    /**
     * Obtém o valor da propriedade custoCliente.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustoCliente() {
        return custoCliente;
    }

    /**
     * Define o valor da propriedade custoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustoCliente(Boolean value) {
        this.custoCliente = value;
    }

    /**
     * Obtém o valor da propriedade nomeClienteCusto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeClienteCusto() {
        return nomeClienteCusto;
    }

    /**
     * Define o valor da propriedade nomeClienteCusto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeClienteCusto(String value) {
        this.nomeClienteCusto = value;
    }

    /**
     * Obtém o valor da propriedade formaPagamentoPrestacaoContaItem.
     * 
     * @return
     *     possible object is
     *     {@link FormaPagamentoPrestacaoContaItem }
     *     
     */
    public FormaPagamentoPrestacaoContaItem getFormaPagamentoPrestacaoContaItem() {
        return formaPagamentoPrestacaoContaItem;
    }

    /**
     * Define o valor da propriedade formaPagamentoPrestacaoContaItem.
     * 
     * @param value
     *     allowed object is
     *     {@link FormaPagamentoPrestacaoContaItem }
     *     
     */
    public void setFormaPagamentoPrestacaoContaItem(FormaPagamentoPrestacaoContaItem value) {
        this.formaPagamentoPrestacaoContaItem = value;
    }

    /**
     * Obtém o valor da propriedade classificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * Define o valor da propriedade classificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificacao(String value) {
        this.classificacao = value;
    }

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
     * Obtém o valor da propriedade moedaCambio.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoedaCambio() {
        return moedaCambio;
    }

    /**
     * Define o valor da propriedade moedaCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoedaCambio(Moeda value) {
        this.moedaCambio = value;
    }

    /**
     * Obtém o valor da propriedade valorMoedaCambio.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMoedaCambio() {
        return valorMoedaCambio;
    }

    /**
     * Define o valor da propriedade valorMoedaCambio.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMoedaCambio(Double value) {
        this.valorMoedaCambio = value;
    }

    /**
     * Obtém o valor da propriedade valorMoedaCambioTesouraria.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMoedaCambioTesouraria() {
        return valorMoedaCambioTesouraria;
    }

    /**
     * Define o valor da propriedade valorMoedaCambioTesouraria.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMoedaCambioTesouraria(Double value) {
        this.valorMoedaCambioTesouraria = value;
    }

    /**
     * Obtém o valor da propriedade totalConvertido.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConvertido() {
        return totalConvertido;
    }

    /**
     * Define o valor da propriedade totalConvertido.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConvertido(Double value) {
        this.totalConvertido = value;
    }

    /**
     * Obtém o valor da propriedade statusEstorno.
     * 
     * @return
     *     possible object is
     *     {@link StatusEstorno }
     *     
     */
    public StatusEstorno getStatusEstorno() {
        return statusEstorno;
    }

    /**
     * Define o valor da propriedade statusEstorno.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEstorno }
     *     
     */
    public void setStatusEstorno(StatusEstorno value) {
        this.statusEstorno = value;
    }

    /**
     * Obtém o valor da propriedade rateios.
     * 
     * @return
     *     possible object is
     *     {@link Rateios }
     *     
     */
    public Rateios getRateios() {
        return rateios;
    }

    /**
     * Define o valor da propriedade rateios.
     * 
     * @param value
     *     allowed object is
     *     {@link Rateios }
     *     
     */
    public void setRateios(Rateios value) {
        this.rateios = value;
    }

    /**
     * Obtém o valor da propriedade enumTipoCartao.
     * 
     * @return
     *     possible object is
     *     {@link EnumTipoCartao }
     *     
     */
    public EnumTipoCartao getEnumTipoCartao() {
        return enumTipoCartao;
    }

    /**
     * Define o valor da propriedade enumTipoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTipoCartao }
     *     
     */
    public void setEnumTipoCartao(EnumTipoCartao value) {
        this.enumTipoCartao = value;
    }

    /**
     * Obtém o valor da propriedade dataDespesa.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDespesa() {
        return dataDespesa;
    }

    /**
     * Define o valor da propriedade dataDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDespesa(XMLGregorianCalendar value) {
        this.dataDespesa = value;
    }

    /**
     * Obtém o valor da propriedade dataFim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFim() {
        return dataFim;
    }

    /**
     * Define o valor da propriedade dataFim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFim(XMLGregorianCalendar value) {
        this.dataFim = value;
    }

    /**
     * Obtém o valor da propriedade dataVencimentoFatura.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimentoFatura() {
        return dataVencimentoFatura;
    }

    /**
     * Define o valor da propriedade dataVencimentoFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimentoFatura(XMLGregorianCalendar value) {
        this.dataVencimentoFatura = value;
    }

    /**
     * Obtém o valor da propriedade enumQualificadorTransacao.
     * 
     * @return
     *     possible object is
     *     {@link EnumQualificadorTransacao }
     *     
     */
    public EnumQualificadorTransacao getEnumQualificadorTransacao() {
        return enumQualificadorTransacao;
    }

    /**
     * Define o valor da propriedade enumQualificadorTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumQualificadorTransacao }
     *     
     */
    public void setEnumQualificadorTransacao(EnumQualificadorTransacao value) {
        this.enumQualificadorTransacao = value;
    }

    /**
     * Obtém o valor da propriedade codigoDespesaCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDespesaCredito() {
        return codigoDespesaCredito;
    }

    /**
     * Define o valor da propriedade codigoDespesaCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDespesaCredito(String value) {
        this.codigoDespesaCredito = value;
    }

    /**
     * Gets the value of the imagens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the imagens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Imagens }
     * 
     * 
     */
    public List<Imagens> getImagens() {
        if (imagens == null) {
            imagens = new ArrayList<Imagens>();
        }
        return this.imagens;
    }

    /**
     * Obtém o valor da propriedade complemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Define o valor da propriedade complemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Obtém o valor da propriedade complementoCombo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoCombo() {
        return complementoCombo;
    }

    /**
     * Define o valor da propriedade complementoCombo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoCombo(String value) {
        this.complementoCombo = value;
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
     * Obtém o valor da propriedade dataInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicio() {
        return dataInicio;
    }

    /**
     * Define o valor da propriedade dataInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicio(XMLGregorianCalendar value) {
        this.dataInicio = value;
    }

    /**
     * Obtém o valor da propriedade numeroCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * Define o valor da propriedade numeroCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartao(String value) {
        this.numeroCartao = value;
    }

    /**
     * Obtém o valor da propriedade complementoValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoValor() {
        return complementoValor;
    }

    /**
     * Define o valor da propriedade complementoValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoValor(String value) {
        this.complementoValor = value;
    }

    /**
     * Obtém o valor da propriedade complementoComboValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementoComboValor() {
        return complementoComboValor;
    }

    /**
     * Define o valor da propriedade complementoComboValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementoComboValor(String value) {
        this.complementoComboValor = value;
    }

    /**
     * Obtém o valor da propriedade nomeCidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCidade() {
        return nomeCidade;
    }

    /**
     * Define o valor da propriedade nomeCidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCidade(String value) {
        this.nomeCidade = value;
    }

    /**
     * Obtém o valor da propriedade horaInicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraInicial() {
        return horaInicial;
    }

    /**
     * Define o valor da propriedade horaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraInicial(String value) {
        this.horaInicial = value;
    }

    /**
     * Obtém o valor da propriedade horaFinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoraFinal() {
        return horaFinal;
    }

    /**
     * Define o valor da propriedade horaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraFinal(String value) {
        this.horaFinal = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link EnumRelatorioDespesasItemStatus }
     *     
     */
    public EnumRelatorioDespesasItemStatus getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumRelatorioDespesasItemStatus }
     *     
     */
    public void setStatus(EnumRelatorioDespesasItemStatus value) {
        this.status = value;
    }

    /**
     * Obtém o valor da propriedade idTipoViagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoViagem() {
        return idTipoViagem;
    }

    /**
     * Define o valor da propriedade idTipoViagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoViagem(String value) {
        this.idTipoViagem = value;
    }

    /**
     * Obtém o valor da propriedade totalConversaoTesouraria.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalConversaoTesouraria() {
        return totalConversaoTesouraria;
    }

    /**
     * Define o valor da propriedade totalConversaoTesouraria.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalConversaoTesouraria(Double value) {
        this.totalConversaoTesouraria = value;
    }

}
