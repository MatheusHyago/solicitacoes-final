
package br.com.lemontech.selfbooking.wsselfbooking.beans.carro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Agente;
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
 * <p>Classe Java de carro complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="carro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeLocadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localRetirada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataRetirada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="localDevolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataDevolucao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="localizador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeReservador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="diaria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxa" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="taxaservico" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="formaPagamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}formaPagamento" minOccurs="0"/&gt;
 *         &lt;element name="idPassageiroRef" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="justificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complementoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoFornecedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoJustificativaMaiorTarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificadorIntegracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificadorBackOfficeTipoProduto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="autorizacaoCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remarks" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}remarks" minOccurs="0"/&gt;
 *         &lt;element name="statusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="taxaCancelamento" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="dataModificacaoStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nomeEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorHoraExtra" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="valorDiariaExtra" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="totalCarro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="cancelado" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="identificadoresIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}identificadoresIntegracao" minOccurs="0"/&gt;
 *         &lt;element name="taxaFee" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="selfbook" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="consolidadora" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}consolidadora" minOccurs="0"/&gt;
 *         &lt;element name="moeda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoLojaReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeDiaria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataVencReserva" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="pontoVenda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}pontoVendaOrcamento" minOccurs="0"/&gt;
 *         &lt;element name="emailEmissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codigoLocadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iataCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localizadorPreTrip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cidadeDevolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoDevolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iataCidadeDevolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomePais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomePaisDevolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="condutorAdicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="valorMenorTarifaSaving" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="online" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="agenteCotacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}agente" minOccurs="0"/&gt;
 *         &lt;element name="agenteEmissao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}agente" minOccurs="0"/&gt;
 *         &lt;element name="codigoLocaliza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacoesGerais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="condutorAdicional2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idOperador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomeUsuarioModificouStatusCancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeHoraExtra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="quantidadeDiaExtra" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="idCartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cartaoCp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fonePax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rgPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cpfPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataNascimentoPax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carro", propOrder = {
    "id",
    "modelo",
    "nomeLocadora",
    "localRetirada",
    "dataRetirada",
    "localDevolucao",
    "dataDevolucao",
    "localizador",
    "codigoEmissor",
    "codigoReservador",
    "nomeReservador",
    "source",
    "dataReserva",
    "diaria",
    "taxa",
    "taxaservico",
    "formaPagamento",
    "idPassageiroRef",
    "justificativaMaiorTarifa",
    "complementoJustificativaMaiorTarifa",
    "cidade",
    "codigoFornecedor",
    "nacional",
    "observacao",
    "voucher",
    "codigoReserva",
    "codigoJustificativaMaiorTarifa",
    "identificadorIntegracao",
    "identificadorBackOfficeTipoProduto",
    "autorizacaoCartao",
    "remarks",
    "statusCancelamento",
    "taxaCancelamento",
    "dataModificacaoStatusCancelamento",
    "usuarioModificouStatusCancelamento",
    "nomeEmissor",
    "valorHoraExtra",
    "valorDiariaExtra",
    "totalCarro",
    "cancelado",
    "identificadoresIntegracao",
    "taxaFee",
    "selfbook",
    "consolidadora",
    "moeda",
    "codigoLojaReserva",
    "quantidadeDiaria",
    "pais",
    "estado",
    "dataVencReserva",
    "pontoVenda",
    "emailEmissor",
    "codigoLocadora",
    "iataCidade",
    "localizadorPreTrip",
    "cidadeDevolucao",
    "estadoDevolucao",
    "iataCidadeDevolucao",
    "nomePais",
    "nomePaisDevolucao",
    "condutorAdicional",
    "valorMenorTarifaSaving",
    "online",
    "agenteCotacao",
    "agenteEmissao",
    "codigoLocaliza",
    "observacoesGerais",
    "condutorAdicional2",
    "idOperador",
    "nomeUsuarioModificouStatusCancelamento",
    "quantidadeHoraExtra",
    "quantidadeDiaExtra",
    "idCartao",
    "cartaoCp",
    "emailPax",
    "fonePax",
    "rgPax",
    "cpfPax",
    "dataNascimentoPax"
})
public class Carro {

    protected int id;
    protected String modelo;
    protected String nomeLocadora;
    protected String localRetirada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataRetirada;
    protected String localDevolucao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDevolucao;
    protected String localizador;
    protected String codigoEmissor;
    protected String codigoReservador;
    protected String nomeReservador;
    protected String source;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataReserva;
    protected Double diaria;
    protected Double taxa;
    protected Double taxaservico;
    protected FormaPagamento formaPagamento;
    @XmlElement(nillable = true)
    protected List<Integer> idPassageiroRef;
    protected String justificativaMaiorTarifa;
    protected String complementoJustificativaMaiorTarifa;
    protected String cidade;
    protected String codigoFornecedor;
    protected Boolean nacional;
    protected String observacao;
    protected String voucher;
    protected String codigoReserva;
    protected String codigoJustificativaMaiorTarifa;
    protected String identificadorIntegracao;
    protected String identificadorBackOfficeTipoProduto;
    protected String autorizacaoCartao;
    protected Remarks remarks;
    protected Integer statusCancelamento;
    protected Double taxaCancelamento;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataModificacaoStatusCancelamento;
    protected Integer usuarioModificouStatusCancelamento;
    protected String nomeEmissor;
    protected Double valorHoraExtra;
    protected Double valorDiariaExtra;
    protected Double totalCarro;
    protected boolean cancelado;
    protected IdentificadoresIntegracao identificadoresIntegracao;
    protected Double taxaFee;
    protected boolean selfbook;
    protected Consolidadora consolidadora;
    protected String moeda;
    protected String codigoLojaReserva;
    protected Integer quantidadeDiaria;
    protected String pais;
    protected String estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencReserva;
    protected PontoVendaOrcamento pontoVenda;
    protected String emailEmissor;
    protected String codigoLocadora;
    protected String iataCidade;
    protected String localizadorPreTrip;
    protected String cidadeDevolucao;
    protected String estadoDevolucao;
    protected String iataCidadeDevolucao;
    protected String nomePais;
    protected String nomePaisDevolucao;
    protected String condutorAdicional;
    protected Double valorMenorTarifaSaving;
    protected boolean online;
    @XmlSchemaType(name = "string")
    protected Agente agenteCotacao;
    @XmlSchemaType(name = "string")
    protected Agente agenteEmissao;
    protected String codigoLocaliza;
    protected String observacoesGerais;
    protected String condutorAdicional2;
    protected String idOperador;
    protected String nomeUsuarioModificouStatusCancelamento;
    protected Integer quantidadeHoraExtra;
    protected Integer quantidadeDiaExtra;
    protected String idCartao;
    protected String cartaoCp;
    protected String emailPax;
    protected String fonePax;
    protected String rgPax;
    protected String cpfPax;
    protected String dataNascimentoPax;

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
     * Obtém o valor da propriedade modelo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o valor da propriedade modelo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Obtém o valor da propriedade nomeLocadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLocadora() {
        return nomeLocadora;
    }

    /**
     * Define o valor da propriedade nomeLocadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLocadora(String value) {
        this.nomeLocadora = value;
    }

    /**
     * Obtém o valor da propriedade localRetirada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalRetirada() {
        return localRetirada;
    }

    /**
     * Define o valor da propriedade localRetirada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalRetirada(String value) {
        this.localRetirada = value;
    }

    /**
     * Obtém o valor da propriedade dataRetirada.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRetirada() {
        return dataRetirada;
    }

    /**
     * Define o valor da propriedade dataRetirada.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRetirada(XMLGregorianCalendar value) {
        this.dataRetirada = value;
    }

    /**
     * Obtém o valor da propriedade localDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDevolucao() {
        return localDevolucao;
    }

    /**
     * Define o valor da propriedade localDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDevolucao(String value) {
        this.localDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade dataDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * Define o valor da propriedade dataDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDevolucao(XMLGregorianCalendar value) {
        this.dataDevolucao = value;
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
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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
     * Obtém o valor da propriedade diaria.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiaria() {
        return diaria;
    }

    /**
     * Define o valor da propriedade diaria.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiaria(Double value) {
        this.diaria = value;
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
     * Obtém o valor da propriedade taxaservico.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTaxaservico() {
        return taxaservico;
    }

    /**
     * Define o valor da propriedade taxaservico.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTaxaservico(Double value) {
        this.taxaservico = value;
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
     * Obtém o valor da propriedade nacional.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNacional() {
        return nacional;
    }

    /**
     * Define o valor da propriedade nacional.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNacional(Boolean value) {
        this.nacional = value;
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
     * Obtém o valor da propriedade voucher.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucher() {
        return voucher;
    }

    /**
     * Define o valor da propriedade voucher.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucher(String value) {
        this.voucher = value;
    }

    /**
     * Obtém o valor da propriedade codigoReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReserva() {
        return codigoReserva;
    }

    /**
     * Define o valor da propriedade codigoReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReserva(String value) {
        this.codigoReserva = value;
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
     * Obtém o valor da propriedade valorHoraExtra.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }

    /**
     * Define o valor da propriedade valorHoraExtra.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorHoraExtra(Double value) {
        this.valorHoraExtra = value;
    }

    /**
     * Obtém o valor da propriedade valorDiariaExtra.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorDiariaExtra() {
        return valorDiariaExtra;
    }

    /**
     * Define o valor da propriedade valorDiariaExtra.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorDiariaExtra(Double value) {
        this.valorDiariaExtra = value;
    }

    /**
     * Obtém o valor da propriedade totalCarro.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCarro() {
        return totalCarro;
    }

    /**
     * Define o valor da propriedade totalCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCarro(Double value) {
        this.totalCarro = value;
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
     * Obtém o valor da propriedade selfbook.
     * 
     */
    public boolean isSelfbook() {
        return selfbook;
    }

    /**
     * Define o valor da propriedade selfbook.
     * 
     */
    public void setSelfbook(boolean value) {
        this.selfbook = value;
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
     * Obtém o valor da propriedade codigoLojaReserva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLojaReserva() {
        return codigoLojaReserva;
    }

    /**
     * Define o valor da propriedade codigoLojaReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLojaReserva(String value) {
        this.codigoLojaReserva = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeDiaria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeDiaria() {
        return quantidadeDiaria;
    }

    /**
     * Define o valor da propriedade quantidadeDiaria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeDiaria(Integer value) {
        this.quantidadeDiaria = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define o valor da propriedade estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Obtém o valor da propriedade dataVencReserva.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencReserva() {
        return dataVencReserva;
    }

    /**
     * Define o valor da propriedade dataVencReserva.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencReserva(XMLGregorianCalendar value) {
        this.dataVencReserva = value;
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
     * Obtém o valor da propriedade codigoLocadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLocadora() {
        return codigoLocadora;
    }

    /**
     * Define o valor da propriedade codigoLocadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLocadora(String value) {
        this.codigoLocadora = value;
    }

    /**
     * Obtém o valor da propriedade iataCidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataCidade() {
        return iataCidade;
    }

    /**
     * Define o valor da propriedade iataCidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataCidade(String value) {
        this.iataCidade = value;
    }

    /**
     * Obtém o valor da propriedade localizadorPreTrip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalizadorPreTrip() {
        return localizadorPreTrip;
    }

    /**
     * Define o valor da propriedade localizadorPreTrip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalizadorPreTrip(String value) {
        this.localizadorPreTrip = value;
    }

    /**
     * Obtém o valor da propriedade cidadeDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeDevolucao() {
        return cidadeDevolucao;
    }

    /**
     * Define o valor da propriedade cidadeDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeDevolucao(String value) {
        this.cidadeDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade estadoDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoDevolucao() {
        return estadoDevolucao;
    }

    /**
     * Define o valor da propriedade estadoDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoDevolucao(String value) {
        this.estadoDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade iataCidadeDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataCidadeDevolucao() {
        return iataCidadeDevolucao;
    }

    /**
     * Define o valor da propriedade iataCidadeDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataCidadeDevolucao(String value) {
        this.iataCidadeDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade nomePais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePais() {
        return nomePais;
    }

    /**
     * Define o valor da propriedade nomePais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePais(String value) {
        this.nomePais = value;
    }

    /**
     * Obtém o valor da propriedade nomePaisDevolucao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePaisDevolucao() {
        return nomePaisDevolucao;
    }

    /**
     * Define o valor da propriedade nomePaisDevolucao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePaisDevolucao(String value) {
        this.nomePaisDevolucao = value;
    }

    /**
     * Obtém o valor da propriedade condutorAdicional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondutorAdicional() {
        return condutorAdicional;
    }

    /**
     * Define o valor da propriedade condutorAdicional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondutorAdicional(String value) {
        this.condutorAdicional = value;
    }

    /**
     * Obtém o valor da propriedade valorMenorTarifaSaving.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorMenorTarifaSaving() {
        return valorMenorTarifaSaving;
    }

    /**
     * Define o valor da propriedade valorMenorTarifaSaving.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorMenorTarifaSaving(Double value) {
        this.valorMenorTarifaSaving = value;
    }

    /**
     * Obtém o valor da propriedade online.
     * 
     */
    public boolean isOnline() {
        return online;
    }

    /**
     * Define o valor da propriedade online.
     * 
     */
    public void setOnline(boolean value) {
        this.online = value;
    }

    /**
     * Obtém o valor da propriedade agenteCotacao.
     * 
     * @return
     *     possible object is
     *     {@link Agente }
     *     
     */
    public Agente getAgenteCotacao() {
        return agenteCotacao;
    }

    /**
     * Define o valor da propriedade agenteCotacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Agente }
     *     
     */
    public void setAgenteCotacao(Agente value) {
        this.agenteCotacao = value;
    }

    /**
     * Obtém o valor da propriedade agenteEmissao.
     * 
     * @return
     *     possible object is
     *     {@link Agente }
     *     
     */
    public Agente getAgenteEmissao() {
        return agenteEmissao;
    }

    /**
     * Define o valor da propriedade agenteEmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link Agente }
     *     
     */
    public void setAgenteEmissao(Agente value) {
        this.agenteEmissao = value;
    }

    /**
     * Obtém o valor da propriedade codigoLocaliza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLocaliza() {
        return codigoLocaliza;
    }

    /**
     * Define o valor da propriedade codigoLocaliza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLocaliza(String value) {
        this.codigoLocaliza = value;
    }

    /**
     * Obtém o valor da propriedade observacoesGerais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacoesGerais() {
        return observacoesGerais;
    }

    /**
     * Define o valor da propriedade observacoesGerais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacoesGerais(String value) {
        this.observacoesGerais = value;
    }

    /**
     * Obtém o valor da propriedade condutorAdicional2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondutorAdicional2() {
        return condutorAdicional2;
    }

    /**
     * Define o valor da propriedade condutorAdicional2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondutorAdicional2(String value) {
        this.condutorAdicional2 = value;
    }

    /**
     * Obtém o valor da propriedade idOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOperador() {
        return idOperador;
    }

    /**
     * Define o valor da propriedade idOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOperador(String value) {
        this.idOperador = value;
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
     * Obtém o valor da propriedade quantidadeHoraExtra.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeHoraExtra() {
        return quantidadeHoraExtra;
    }

    /**
     * Define o valor da propriedade quantidadeHoraExtra.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeHoraExtra(Integer value) {
        this.quantidadeHoraExtra = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeDiaExtra.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQuantidadeDiaExtra() {
        return quantidadeDiaExtra;
    }

    /**
     * Define o valor da propriedade quantidadeDiaExtra.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQuantidadeDiaExtra(Integer value) {
        this.quantidadeDiaExtra = value;
    }

    /**
     * Obtém o valor da propriedade idCartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCartao() {
        return idCartao;
    }

    /**
     * Define o valor da propriedade idCartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCartao(String value) {
        this.idCartao = value;
    }

    /**
     * Obtém o valor da propriedade cartaoCp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartaoCp() {
        return cartaoCp;
    }

    /**
     * Define o valor da propriedade cartaoCp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartaoCp(String value) {
        this.cartaoCp = value;
    }

    /**
     * Obtém o valor da propriedade emailPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPax() {
        return emailPax;
    }

    /**
     * Define o valor da propriedade emailPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPax(String value) {
        this.emailPax = value;
    }

    /**
     * Obtém o valor da propriedade fonePax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFonePax() {
        return fonePax;
    }

    /**
     * Define o valor da propriedade fonePax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFonePax(String value) {
        this.fonePax = value;
    }

    /**
     * Obtém o valor da propriedade rgPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgPax() {
        return rgPax;
    }

    /**
     * Define o valor da propriedade rgPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgPax(String value) {
        this.rgPax = value;
    }

    /**
     * Obtém o valor da propriedade cpfPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfPax() {
        return cpfPax;
    }

    /**
     * Define o valor da propriedade cpfPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfPax(String value) {
        this.cpfPax = value;
    }

    /**
     * Obtém o valor da propriedade dataNascimentoPax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataNascimentoPax() {
        return dataNascimentoPax;
    }

    /**
     * Define o valor da propriedade dataNascimentoPax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataNascimentoPax(String value) {
        this.dataNascimentoPax = value;
    }

}
