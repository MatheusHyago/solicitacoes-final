
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.FuncionarioRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.QualificadorDespesa;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de importarDespesaRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="importarDespesaRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="funcionario" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}funcionarioRef"/&gt;
 *         &lt;element name="dataTransacao" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda"/&gt;
 *         &lt;element name="valorTransacao" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="moedaOriginal" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda" minOccurs="0"/&gt;
 *         &lt;element name="valorTransacaoOriginal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="estabelecimento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/&gt;
 *         &lt;element name="codigoAutorizacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/&gt;
 *         &lt;element name="qualificadorDespesa" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}qualificadorDespesa" minOccurs="0"/&gt;
 *         &lt;element name="enderecoPartida" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/&gt;
 *         &lt;element name="horaPartida" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="enderecoChegada" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento" minOccurs="0"/&gt;
 *         &lt;element name="horaChegada" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataContabil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="codigoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/&gt;
 *         &lt;element name="cidade" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/&gt;
 *         &lt;element name="paisOrigem" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}codigoElemento50" minOccurs="0"/&gt;
 *         &lt;element name="numeroIdentificador" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dataVencimentoFatura" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="qualificadorTransacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}qualificadorTransacao" minOccurs="0"/&gt;
 *         &lt;element name="valorTotalFatura" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="numeroCartaoMascarado6d" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}numeroCartaoMascarado" minOccurs="0"/&gt;
 *         &lt;element name="idTipoCartao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoCartao" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "importarDespesaRequest", propOrder = {
    "funcionario",
    "dataTransacao",
    "moeda",
    "valorTransacao",
    "moedaOriginal",
    "valorTransacaoOriginal",
    "estabelecimento",
    "codigoAutorizacao",
    "qualificadorDespesa",
    "enderecoPartida",
    "horaPartida",
    "enderecoChegada",
    "horaChegada",
    "distancia",
    "dataContabil",
    "codigoCartao",
    "cidade",
    "paisOrigem",
    "numeroIdentificador",
    "dataVencimentoFatura",
    "qualificadorTransacao",
    "valorTotalFatura",
    "numeroCartaoMascarado6D",
    "idTipoCartao"
})
public class ImportarDespesaRequest {

    @XmlElement(required = true)
    protected FuncionarioRef funcionario;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataTransacao;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected Moeda moeda;
    protected double valorTransacao;
    @XmlSchemaType(name = "string")
    protected Moeda moedaOriginal;
    protected Double valorTransacaoOriginal;
    protected String estabelecimento;
    protected String codigoAutorizacao;
    @XmlSchemaType(name = "string")
    protected QualificadorDespesa qualificadorDespesa;
    protected String enderecoPartida;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaPartida;
    protected String enderecoChegada;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaChegada;
    protected Double distancia;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataContabil;
    protected String codigoCartao;
    protected String cidade;
    protected String paisOrigem;
    protected Long numeroIdentificador;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataVencimentoFatura;
    protected String qualificadorTransacao;
    protected Double valorTotalFatura;
    @XmlElement(name = "numeroCartaoMascarado6d")
    protected String numeroCartaoMascarado6D;
    protected String idTipoCartao;

    /**
     * Obtém o valor da propriedade funcionario.
     * 
     * @return
     *     possible object is
     *     {@link FuncionarioRef }
     *     
     */
    public FuncionarioRef getFuncionario() {
        return funcionario;
    }

    /**
     * Define o valor da propriedade funcionario.
     * 
     * @param value
     *     allowed object is
     *     {@link FuncionarioRef }
     *     
     */
    public void setFuncionario(FuncionarioRef value) {
        this.funcionario = value;
    }

    /**
     * Obtém o valor da propriedade dataTransacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTransacao() {
        return dataTransacao;
    }

    /**
     * Define o valor da propriedade dataTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTransacao(XMLGregorianCalendar value) {
        this.dataTransacao = value;
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
     * Obtém o valor da propriedade valorTransacao.
     * 
     */
    public double getValorTransacao() {
        return valorTransacao;
    }

    /**
     * Define o valor da propriedade valorTransacao.
     * 
     */
    public void setValorTransacao(double value) {
        this.valorTransacao = value;
    }

    /**
     * Obtém o valor da propriedade moedaOriginal.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoedaOriginal() {
        return moedaOriginal;
    }

    /**
     * Define o valor da propriedade moedaOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoedaOriginal(Moeda value) {
        this.moedaOriginal = value;
    }

    /**
     * Obtém o valor da propriedade valorTransacaoOriginal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTransacaoOriginal() {
        return valorTransacaoOriginal;
    }

    /**
     * Define o valor da propriedade valorTransacaoOriginal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTransacaoOriginal(Double value) {
        this.valorTransacaoOriginal = value;
    }

    /**
     * Obtém o valor da propriedade estabelecimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * Define o valor da propriedade estabelecimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstabelecimento(String value) {
        this.estabelecimento = value;
    }

    /**
     * Obtém o valor da propriedade codigoAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAutorizacao() {
        return codigoAutorizacao;
    }

    /**
     * Define o valor da propriedade codigoAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAutorizacao(String value) {
        this.codigoAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade qualificadorDespesa.
     * 
     * @return
     *     possible object is
     *     {@link QualificadorDespesa }
     *     
     */
    public QualificadorDespesa getQualificadorDespesa() {
        return qualificadorDespesa;
    }

    /**
     * Define o valor da propriedade qualificadorDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link QualificadorDespesa }
     *     
     */
    public void setQualificadorDespesa(QualificadorDespesa value) {
        this.qualificadorDespesa = value;
    }

    /**
     * Obtém o valor da propriedade enderecoPartida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoPartida() {
        return enderecoPartida;
    }

    /**
     * Define o valor da propriedade enderecoPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoPartida(String value) {
        this.enderecoPartida = value;
    }

    /**
     * Obtém o valor da propriedade horaPartida.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraPartida() {
        return horaPartida;
    }

    /**
     * Define o valor da propriedade horaPartida.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraPartida(XMLGregorianCalendar value) {
        this.horaPartida = value;
    }

    /**
     * Obtém o valor da propriedade enderecoChegada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoChegada() {
        return enderecoChegada;
    }

    /**
     * Define o valor da propriedade enderecoChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoChegada(String value) {
        this.enderecoChegada = value;
    }

    /**
     * Obtém o valor da propriedade horaChegada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraChegada() {
        return horaChegada;
    }

    /**
     * Define o valor da propriedade horaChegada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraChegada(XMLGregorianCalendar value) {
        this.horaChegada = value;
    }

    /**
     * Obtém o valor da propriedade distancia.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistancia() {
        return distancia;
    }

    /**
     * Define o valor da propriedade distancia.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistancia(Double value) {
        this.distancia = value;
    }

    /**
     * Obtém o valor da propriedade dataContabil.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataContabil() {
        return dataContabil;
    }

    /**
     * Define o valor da propriedade dataContabil.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataContabil(XMLGregorianCalendar value) {
        this.dataContabil = value;
    }

    /**
     * Obtém o valor da propriedade codigoCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCartao() {
        return codigoCartao;
    }

    /**
     * Define o valor da propriedade codigoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCartao(String value) {
        this.codigoCartao = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Obtém o valor da propriedade paisOrigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisOrigem() {
        return paisOrigem;
    }

    /**
     * Define o valor da propriedade paisOrigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisOrigem(String value) {
        this.paisOrigem = value;
    }

    /**
     * Obtém o valor da propriedade numeroIdentificador.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroIdentificador() {
        return numeroIdentificador;
    }

    /**
     * Define o valor da propriedade numeroIdentificador.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroIdentificador(Long value) {
        this.numeroIdentificador = value;
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
     * Obtém o valor da propriedade qualificadorTransacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificadorTransacao() {
        return qualificadorTransacao;
    }

    /**
     * Define o valor da propriedade qualificadorTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificadorTransacao(String value) {
        this.qualificadorTransacao = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalFatura.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTotalFatura() {
        return valorTotalFatura;
    }

    /**
     * Define o valor da propriedade valorTotalFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTotalFatura(Double value) {
        this.valorTotalFatura = value;
    }

    /**
     * Obtém o valor da propriedade numeroCartaoMascarado6D.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCartaoMascarado6D() {
        return numeroCartaoMascarado6D;
    }

    /**
     * Define o valor da propriedade numeroCartaoMascarado6D.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCartaoMascarado6D(String value) {
        this.numeroCartaoMascarado6D = value;
    }

    /**
     * Obtém o valor da propriedade idTipoCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTipoCartao() {
        return idTipoCartao;
    }

    /**
     * Define o valor da propriedade idTipoCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTipoCartao(String value) {
        this.idTipoCartao = value;
    }

}
